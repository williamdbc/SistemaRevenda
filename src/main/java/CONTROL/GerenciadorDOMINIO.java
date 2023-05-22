package CONTROL;

import DAO.ConexaoHibernate;
import DAO.GenericDAO;
import DAO.MarcaDAO;
import DAO.ModeloDAO;
import DAO.VeiculoDAO;
import DAO.VersaoDAO;
import DOMINIO.Marca;
import DOMINIO.Modelo;
import DOMINIO.Veiculo;
import DOMINIO.Versao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;


public class GerenciadorDOMINIO {
    
    GenericDAO genericDAO = null;
    MarcaDAO marcaDAO = null;
    ModeloDAO modeloDAO = null;
    VersaoDAO versaoDAO = null;
    VeiculoDAO veiculoDAO = null;
    
    public GerenciadorDOMINIO() throws HibernateException {
        ConexaoHibernate.getSessionFactory();
        
        genericDAO = new GenericDAO();
        marcaDAO = new MarcaDAO();
        modeloDAO = new ModeloDAO();
        versaoDAO = new VersaoDAO();
        veiculoDAO = new VeiculoDAO();
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
