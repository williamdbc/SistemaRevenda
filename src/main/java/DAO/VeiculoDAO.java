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
    private final int ID_VEICULO = 0;
    private final int MARCA = 1; 
    private final int MODELO = 2;
    private final int VERSAO = 3;
    private final int ANO = 4;
    private final int COMBUSTIVEL = 5;
    private final int CAMBIO = 6;
    private final int DIRECAO  = 7;
    private final int MOTOR  = 8;
    
    
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
                case ID_VEICULO: 
                    expressaoPesquisada = tabela.get("id_veiculo");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case MARCA: 
                    expressaoPesquisada = tabela.get("versao").get("modelo").get("marca").get("nome_marca");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;
                case MODELO: 
                    expressaoPesquisada = tabela.get("versao").get("modelo").get("nome_modelo");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" ); 
                    break;
                case VERSAO: 
                    expressaoPesquisada = tabela.get("versao").get("nome_versao");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;    
                case ANO: 
                    expressaoPesquisada = tabela.get("ano");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;              
                case COMBUSTIVEL: 
                    expressaoPesquisada = tabela.get("combustivel");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break; 
                case CAMBIO: 
                    expressaoPesquisada = tabela.get("cambio");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;   
                case DIRECAO: 
                    expressaoPesquisada = tabela.get("direcao");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;    
                case MOTOR: 
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
            
    public List<Veiculo> pesquisarID(String id_veiculo){
        return pesquisar(id_veiculo, ID_VEICULO);
    }
    
    public List<Veiculo> pesquisarMarca(String nome_marca){
        return pesquisar(nome_marca, MARCA);
    }
    
    public List<Veiculo> pesquisarModelo(String nome_modelo){
        return pesquisar(nome_modelo, MODELO);
    }

    public List<Veiculo> pesquisarVersao(String nome_versao){
        return pesquisar(nome_versao, VERSAO);
    }
    
    public List<Veiculo> pesquisarAno(String ano){
        return pesquisar(ano, ANO);
    }
    
    public List<Veiculo> pesquisarCombustivel(String combustivel){
        return pesquisar(combustivel, COMBUSTIVEL);
    }
    
    public List<Veiculo> pesquisarCambio(String cambio){
        return pesquisar(cambio, CAMBIO);
    }
    
    public List<Veiculo> pesquisarDirecao(String direcao){
        return pesquisar(direcao, DIRECAO);
    }
            
    public List<Veiculo> pesquisarMotor(String motor){
        return pesquisar(motor, MOTOR);
    }
                

    
    
    
}
