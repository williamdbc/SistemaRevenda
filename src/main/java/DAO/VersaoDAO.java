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
    private final int marca = 0;
    private final int modelo = 1;
    private final int versao = 2;
      
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
                case marca: 
                    expressaoPesquisada = tabela.get("modelo").get("marca").get("nome_marca");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;
                case modelo: 
                    expressaoPesquisada = tabela.get("modelo").get("nome_modelo");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" ); 
                    break;
                case versao: 
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
            
    public List<Versao> pesquisarMarca(String nomeMarca){
        return pesquisar(nomeMarca, marca);
    }
    
    public List<Versao> pesquisarModelo(String nomeModelo){
        return pesquisar(nomeModelo, modelo);
    }

    public List<Versao> pesquisarVersao(String nomeVersao){
        return pesquisar(nomeVersao, versao);
    }
    
    
    
}
