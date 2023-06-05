package DAO;

import DOMINIO.Versao;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class VersaoDAO extends GenericDAO{
    private final int ID_VERSAO = 0;
    private final int MARCA = 1;
    private final int MODELO = 2;
    private final int VERSAO = 3;
      
    private List<Versao> pesquisar(String pesquisa, int tipoPesquisa) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Versao.class );
            Root tabela = consulta.from(Versao.class);
            
            Expression expressaoPesquisada = null;
            Predicate restricoes = null;

            
            switch (tipoPesquisa) {
                case ID_VERSAO: 
                    expressaoPesquisada = tabela.get("id_versao");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case MARCA: 
                    expressaoPesquisada = tabela.get("modelo").get("marca").get("nome_marca");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;
                case MODELO: 
                    expressaoPesquisada = tabela.get("modelo").get("nome_modelo");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" ); 
                    break;
                case VERSAO: 
                    expressaoPesquisada = tabela.get("nome_versao");
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
            
    public List<Versao> pesquisarID(String id_versao){
        return pesquisar(id_versao, ID_VERSAO);
    }
    
    public List<Versao> pesquisarMarca(String nome_marca){
        return pesquisar(nome_marca, MARCA);
    }
    
    public List<Versao> pesquisarModelo(String nome_modelo){
        return pesquisar(nome_modelo, MODELO);
    }

    public List<Versao> pesquisarVersao(String nome_versao){
        return pesquisar(nome_versao, VERSAO);
    }
    
    
    
}
