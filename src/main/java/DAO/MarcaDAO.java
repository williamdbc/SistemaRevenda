package DAO;

import DOMINIO.Marca;
import DOMINIO.Versao;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class MarcaDAO extends GenericDAO{
    private List<Marca> pesquisar(String pesquisa) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Marca.class );
            Root tabela = consulta.from(Marca.class);
            
            Expression expressaoPesquisada = null;
            Predicate restricoes = null;

            expressaoPesquisada = tabela.get("nome_marca");
            restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                        
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
    
     public List<Marca> pesquisarMarca(String nomeMarca){
        return pesquisar(nomeMarca);
    }
    
    
}
