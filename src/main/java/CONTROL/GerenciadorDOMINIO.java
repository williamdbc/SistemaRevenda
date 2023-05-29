package CONTROL;

import DAO.*;
import DOMINIO.*;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

public class GerenciadorDOMINIO {
    GenericDAO genericDAO = null;
    MarcaDAO marcaDAO = null;
    ModeloDAO modeloDAO = null;
    VersaoDAO versaoDAO = null;
    VeiculoDAO veiculoDAO = null;
    ClienteDAO clienteDAO = null;
    FornecedorDAO fornecedorDAO = null;
    RevendaDAO revendaDAO = null;
    DespesaDAO despesaDAO = null;
    
    public GerenciadorDOMINIO() throws HibernateException {
        ConexaoHibernate.getSessionFactory();
        
        genericDAO = new GenericDAO();
        marcaDAO = new MarcaDAO();
        modeloDAO = new ModeloDAO();
        versaoDAO = new VersaoDAO();
        veiculoDAO = new VeiculoDAO();
        clienteDAO = new ClienteDAO();
        fornecedorDAO = new FornecedorDAO();
        revendaDAO = new RevendaDAO();
        despesaDAO = new DespesaDAO();
    }   
    
    public void inserirMarca(String nomeMarca){
        Marca objetoMarca = new Marca(nomeMarca);
        marcaDAO.inserir(objetoMarca);
    }

    public void inserirModelo(Marca objetoMarca, String nomeModelo){
        Modelo objetoModelo = new Modelo(objetoMarca, nomeModelo);
        modeloDAO.inserir(objetoModelo);
    }
    
    
    public void inserirVersao(Modelo objetoModelo, String nomeVersao){
        Versao objetoVersao = new Versao(objetoModelo, nomeVersao);
        versaoDAO.inserir(objetoVersao);
    }
    
    public void inserirVeiculo(Versao objetoVersao, int ano, String combustivel, String cambio, String direcao, float motor, boolean airbag, boolean alarme,  boolean ar_condicionado, boolean freios_abs, boolean trava_eletrica, boolean vidro_eletrico){
        Veiculo objetoVeiculo = new Veiculo(objetoVersao, ano, combustivel, cambio, direcao, motor, airbag,  alarme, ar_condicionado, freios_abs, trava_eletrica, vidro_eletrico);
        veiculoDAO.inserir(objetoVeiculo);
    }
    
  
    public void inserirCliente(String nome, String cidade, String telefone){
        Cliente objetoCliente = new Cliente(nome, cidade, telefone);
        clienteDAO.inserir(objetoCliente);
    }
    
    public void inserirFornecedor(String nome, String cidade, String telefone){
        Fornecedor objetoFornecedor = new Fornecedor(nome, cidade, telefone);
        fornecedorDAO.inserir(objetoFornecedor);
    }
    
    public void inserirVeiculoComprado(Veiculo veiculo, Fornecedor fornecedor, String placa, String cor, int km, Date data_compra, float valor_compra){
        Revenda objetoRevenda = new Revenda(veiculo, fornecedor, placa, cor, km, data_compra, valor_compra);
        revendaDAO.inserir(objetoRevenda); 
    }
    
     public void inserirVeiculoVendido(Revenda revendaParametro){
        revendaDAO.alterar(revendaParametro); 
    }
     
    public void inserirDespesa(Revenda revenda, String nome_despesa, float valor_despesa, Date data_despesa, String responsavel){
        Despesa objetoDespesa = new Despesa(revenda, nome_despesa, valor_despesa, data_despesa, responsavel);
        despesaDAO.inserir(objetoDespesa); 
    }
 
    public List listar(Class classe){
        return genericDAO.listar(classe); 
    }
    
 
    public List pesquisarModelo(String pesquisa){
        return versaoDAO.pesquisarModelo(pesquisa);
    }
    
    public List<Marca> marcaPesquisar(String pesquisa){
         return marcaDAO.pesquisarMarca(pesquisa);
    }
    
    public List<Modelo> modeloPesquisar(String pesquisa, int tipoPesquisa){
         List<Modelo> lista = null;
         
         switch(tipoPesquisa){
            case 0 -> lista = modeloDAO.pesquisarMarca(pesquisa);
            case 1 -> lista = modeloDAO.pesquisarModelo(pesquisa);
        }
         return lista;
    }
    
    public List<Versao> versaoPesquisar(String pesquisa, int tipoPesquisa){
        List<Versao> lista = null;
        
        switch(tipoPesquisa){
            case 0 -> lista = versaoDAO.pesquisarMarca(pesquisa);
            case 1 -> lista = versaoDAO.pesquisarModelo(pesquisa);
            case 2 -> lista = versaoDAO.pesquisarVersao(pesquisa);
        }
        
        return lista;
    }
}
