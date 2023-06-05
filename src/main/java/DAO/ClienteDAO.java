package DAO;

import DOMINIO.Cliente;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class ClienteDAO extends GenericDAO{
    private final int ID_CLIENTE = 0;
    private final int NOME = 1;
    private final int CIDADE = 2;
    private final int TELEFONE = 3;
      
    private List<Cliente> pesquisar(String pesquisa, int tipoPesquisa) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Cliente.class );
            Root tabela = consulta.from(Cliente.class);
            
            Expression expressaoPesquisada = null;
            Predicate restricoes = null;

            switch (tipoPesquisa) {
                case ID_CLIENTE: 
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
            
    public List<Cliente> pesquisarID(String id_cliente){
        return pesquisar(id_cliente, ID_CLIENTE);
    }
    
    public List<Cliente> pesquisarNome(String nome_cliente){
        return pesquisar(nome_cliente, NOME);
    }
    
    public List<Cliente> pesquisarCidade(String cidade_cliente){
        return pesquisar(cidade_cliente, CIDADE);
    }

    public List<Cliente> pesquisarTelefone(String telefone_cliente){
        return pesquisar(telefone_cliente, TELEFONE);
    }
}
