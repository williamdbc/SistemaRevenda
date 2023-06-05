package DAO;

import DOMINIO.Cliente;
import DOMINIO.Fornecedor;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class FornecedorDAO extends GenericDAO{
    private final int ID_FORNECEDOR = 0;
    private final int NOME = 1;
    private final int CIDADE = 2;
    private final int TELEFONE = 3;
      
    private List<Fornecedor> pesquisar(String pesquisa, int tipoPesquisa) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Fornecedor.class );
            Root tabela = consulta.from(Fornecedor.class);
            
            Expression expressaoPesquisada = null;
            Predicate restricoes = null;

            switch (tipoPesquisa) {
                case ID_FORNECEDOR: 
                    expressaoPesquisada = tabela.get("id_cli_forn");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case NOME: 
                    expressaoPesquisada = tabela.get("nome_cli_forn");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;
                case CIDADE: 
                    expressaoPesquisada = tabela.get("cidade_cli_forn");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" ); 
                    break;
                case TELEFONE: 
                    expressaoPesquisada = tabela.get("telefone_cli_forn");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;                    
            }
                        
            consulta.where(restricoes);
            
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
    }
            
    public List<Fornecedor> pesquisarID(String id_fornecedor){
        return pesquisar(id_fornecedor, ID_FORNECEDOR);
    }
    
    public List<Fornecedor> pesquisarNome(String nome_fornecedor){
        return pesquisar(nome_fornecedor, NOME);
    }
    
    public List<Fornecedor> pesquisarCidade(String cidade_fornecedor){
        return pesquisar(cidade_fornecedor, CIDADE);
    }

    public List<Fornecedor> pesquisarTelefone(String telefone_fornecedor){
        return pesquisar(telefone_fornecedor, TELEFONE);
    }
}
