package DAO;

import DOMINIO.Marca;
import DOMINIO.Modelo;
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
    private final int ID_MARCA = 0;
    private final int MARCA = 1;
    
    private List<Marca> pesquisar(String pesquisa, int tipoPesquisa) throws HibernateException {
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

            switch (tipoPesquisa) {
                case ID_MARCA:
                    expressaoPesquisada = tabela.get("id_marca");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case MARCA: 
                    expressaoPesquisada = tabela.get("nome_marca");
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
    
    public List<Marca> pesquisarID(String idModelo){
        return pesquisar(idModelo, ID_MARCA);
    }
    
     public List<Marca> pesquisarMarca(String nomeMarca){
        return pesquisar(nomeMarca, MARCA);
    }
    
    
}
