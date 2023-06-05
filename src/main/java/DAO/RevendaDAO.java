package DAO;

import CONTROL.FuncoesUteis;
import DOMINIO.Revenda;
import DOMINIO.Veiculo;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class RevendaDAO extends GenericDAO{
    private final int ID_REVENDA = 0;
    private final int MARCA = 1;
    private final int MODELO = 2;
    private final int VERSAO = 3;
    private final int ANO = 4;
    private final int COR = 5;
    private final int QUILOMETRAGEM = 6;
    private final int PLACA = 7;
    private final int FORNECEDOR = 8;
    private final int VALOR_COMPRA = 9;
    private final int DATA_COMPRA = 10;
    private final int DESPESA = 11;
    private final int CLIENTE = 12;
    private final int VALOR_VENDA = 13;
    private final int DATA_VENDA = 14;
    private final int LUCRO = 15;
    
    
    private List<Revenda> pesquisar(String pesquisa, int tipoPesquisa) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Revenda.class );
            Root tabela = consulta.from(Revenda.class);
            
            Expression expressaoPesquisada = null;
            Predicate restricoes = null;

            
            switch (tipoPesquisa) {
                case ID_REVENDA: 
                    expressaoPesquisada = tabela.get("id_revenda");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case MARCA: 
                    expressaoPesquisada = tabela.get("veiculo").get("versao").get("modelo").get("marca").get("nome_marca");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;
                case MODELO: 
                    expressaoPesquisada = tabela.get("veiculo").get("versao").get("modelo").get("nome_modelo");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" ); 
                    break;
                case VERSAO: 
                    expressaoPesquisada = tabela.get("veiculo").get("versao").get("nome_versao");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;    
                case ANO: 
                    expressaoPesquisada = tabela.get("veiculo").get("ano");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;              
                case COR: 
                    expressaoPesquisada = tabela.get("cor");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;   
                case QUILOMETRAGEM: 
                    expressaoPesquisada = tabela.get("quilometragem");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;      
                case PLACA: 
                    expressaoPesquisada = tabela.get("placa");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;    
                case FORNECEDOR: 
                    expressaoPesquisada = tabela.get("fornecedor").get("nome_cli_forn");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;   
                case VALOR_COMPRA: 
                    expressaoPesquisada = tabela.get("valor_compra");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case DATA_COMPRA:
                    expressaoPesquisada = tabela.get("data_compra");
                    restricoes = builder.equal(expressaoPesquisada, FuncoesUteis.stringToDate(pesquisa));      
                    break;
                /*case DESPESA: //ACERTAR
                    expressaoPesquisada = tabela.get("data_compra");
                    restricoes = builder.equal(expressaoPesquisada, FuncoesUteis.stringToDate(pesquisa));      
                    break;*/
                case CLIENTE:
                    expressaoPesquisada = tabela.get("cliente").get("nome_cli_forn");
                    restricoes = builder.like(expressaoPesquisada, pesquisa + "%" );
                    break;
                case VALOR_VENDA: 
                    expressaoPesquisada = tabela.get("valor_venda");
                    restricoes = builder.equal(expressaoPesquisada, pesquisa);
                    break;
                case DATA_VENDA:
                    expressaoPesquisada = tabela.get("data_venda");
                    restricoes = builder.equal(expressaoPesquisada, FuncoesUteis.stringToDate(pesquisa));      
                    break;
                case LUCRO: //ACERTAR
                    expressaoPesquisada = tabela.get("id_revenda");
                    String select = "(select id_revenda from revenda where valor_venda - valor_compra = " + pesquisa + ")";
                    restricoes = builder.like(expressaoPesquisada, select);      
                    break;
                
            }
                        
            consulta.where(restricoes);
            
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException | ParseException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
    }
            
    public List<Revenda> pesquisarID(String id_revenda){
        return pesquisar(id_revenda, ID_REVENDA);
    }
    
    public List<Revenda> pesquisarMarca(String nome_marca){
        return pesquisar(nome_marca, MARCA);
    }
    
    public List<Revenda> pesquisarModelo(String nome_modelo){
        return pesquisar(nome_modelo, MODELO);
    }

    public List<Revenda> pesquisarVersao(String nome_versao){
        return pesquisar(nome_versao, VERSAO);
    }
    
    public List<Revenda> pesquisarAno(String ano){
        return pesquisar(ano, 4);
    }
    
    public List<Revenda> pesquisarCor(String cor){
        return pesquisar(cor, COR);
    }
    
    public List<Revenda> pesquisarQuilometragem(String quilometragem){
        return pesquisar(quilometragem, QUILOMETRAGEM);
    }
    
    public List<Revenda> pesquisarPlaca(String placa){
        return pesquisar(placa, PLACA);
    }
            
    public List<Revenda> pesquisarFornecedor(String fornecedor){
        return pesquisar(fornecedor, FORNECEDOR);
    }
       
    public List<Revenda> pesquisarValorCompra(String valor_compra){
        return pesquisar(valor_compra, VALOR_COMPRA);
    }
       
    public List<Revenda> pesquisarDataCompra(String data_compra){
        return pesquisar(data_compra, DATA_COMPRA);
    }
       
    public List<Revenda> pesquisarDespesa(String despesa){
        return pesquisar(despesa, DESPESA);
    }
       
    public List<Revenda> pesquisarCliente(String cliente){
        return pesquisar(cliente, CLIENTE);
    }
       
    public List<Revenda> pesquisarValorVenda(String valor_venda){
        return pesquisar(valor_venda, VALOR_VENDA);
    }
       
    public List<Revenda> pesquisarDataVenda(String data_venda){
        return pesquisar(data_venda, DATA_VENDA);
    }
       
    public List<Revenda> pesquisarLucro(String lucro){
        return pesquisar(lucro, LUCRO);
    }
}
