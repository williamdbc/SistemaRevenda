package DAO;

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

public class ModeloDAO extends GenericDAO{
    private final int ID_MODELO = 0;
    private final int MARCA = 1;
    private final int MODELO = 2;  
    
    private List<Modelo> pesquisar(String pesquisa, int tipoPesquisa) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Modelo.class );
            Root tabela = consulta.from(Modelo.class);
            
            Expression expressaoPesquisada = null;
            Predicate restricoes = null;

            
            switch (tipoPesquisa) {
                case ID_MODELO:
                    expressaoPesquisada = tabela.get("id_modelo");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case MARCA: 
                    expressaoPesquisada = tabela.get("marca").get("nome_marca");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;
                case MODELO: 
                    expressaoPesquisada = tabela.get("nome_modelo");
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
    
    public List<Modelo> pesquisarID(String idModelo){
        return pesquisar(idModelo, ID_MODELO);
    }
    
    public List<Modelo> pesquisarMarca(String nomeMarca){
        return pesquisar(nomeMarca, MARCA);
    }
    
    public List<Modelo> pesquisarModelo(String nomeModelo){
        return pesquisar(nomeModelo, MODELO);
    }
    
    
}
