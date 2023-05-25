package CONTROL;

import DAO.ClienteDAO;
import DAO.ConexaoHibernate;
import DAO.*;
import DOMINIO.*;
import java.util.ArrayList;
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
    

    
    
    
    /*public void inserirVersao(String nomeModelo){
        Marca objetoMarca = new Marca(nomeMarca);
        marcaDAO.inserir(objetoMarca);
    }
    */
    
    
    
    
    
    
    
    
    
    
    
    /*
        public void pesquisarMarca(String nome){
        List <Marca> listaMarca = listar(Marca.class);
        List <Marca> auxiliar = new ArrayList<>();  
    }
    */
    public List listar(Class classe){
        return genericDAO.listar(classe); 
    }
    
    
    
    
    
    
}
