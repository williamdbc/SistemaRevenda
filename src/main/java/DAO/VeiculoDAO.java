package DAO;

import DOMINIO.Veiculo;
import DOMINIO.Versao;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class VeiculoDAO extends GenericDAO{
    
    private List<Veiculo> pesquisar(String pesquisa, int tipoPesquisa) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Veiculo.class );
            Root tabela = consulta.from(Veiculo.class);
            
            Expression expressaoPesquisada = null;
            Predicate restricoes = null;

            
            switch (tipoPesquisa) {
                case 0: 
                    expressaoPesquisada = tabela.get("id_veiculo");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case 1: 
                    expressaoPesquisada = tabela.get("versao").get("modelo").get("marca").get("nome_marca");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;
                case 2: 
                    expressaoPesquisada = tabela.get("versao").get("modelo").get("nome_modelo");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" ); 
                    break;
                case 3: 
                    expressaoPesquisada = tabela.get("versao").get("nome_versao");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;    
                case 4: 
                    expressaoPesquisada = tabela.get("ano");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;              
                case 5: 
                    expressaoPesquisada = tabela.get("combustivel");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break; 
                case 6: 
                    expressaoPesquisada = tabela.get("cambio");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;   
                case 7: 
                    expressaoPesquisada = tabela.get("direcao");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;    
                case 8: 
                    expressaoPesquisada = tabela.get("motor");
                    float valorMotor = Float.parseFloat(pesquisa); // Converter a string em float
                    restricoes = builder.equal(expressaoPesquisada, builder.literal(valorMotor));
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
            
    public List<Veiculo> pesquisarID(String idVeiculo){
        return pesquisar(idVeiculo, 0);
    }
    
    public List<Veiculo> pesquisarMarca(String nomeMarca){
        return pesquisar(nomeMarca, 1);
    }
    
    public List<Veiculo> pesquisarModelo(String nomeModelo){
        return pesquisar(nomeModelo, 2);
    }

    public List<Veiculo> pesquisarVersao(String nomeVersao){
        return pesquisar(nomeVersao, 3);
    }
    
    public List<Veiculo> pesquisarAno(String ano){
        return pesquisar(ano, 4);
    }
    
    public List<Veiculo> pesquisarCombustivel(String combustivel){
        return pesquisar(combustivel, 5);
    }
    
    public List<Veiculo> pesquisarCambio(String cambio){
        return pesquisar(cambio, 6);
    }
    
    public List<Veiculo> pesquisarDirecao(String direcao){
        return pesquisar(direcao, 7);
    }
            
    public List<Veiculo> pesquisarMotor(String motor){
        return pesquisar(motor, 8);
    }
                

    
    
    
}
