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
    
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
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
 
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    public List listar(Class classe){
        return genericDAO.listar(classe); 
    }

    public List pesquisarModelo(String pesquisa){
        return versaoDAO.pesquisarModelo(pesquisa);
    }
    
    public List<Marca> marcaPesquisar(String pesquisa, int tipoPesquisa){
        List<Marca> lista = null;
        switch(tipoPesquisa){
            case 0: lista = marcaDAO.pesquisarID(pesquisa); break;
            case 1: lista = marcaDAO.pesquisarMarca(pesquisa); break;
        }
        return lista; 
    }

    public List<Modelo> modeloPesquisar(String pesquisa, int tipoPesquisa){
        List<Modelo> lista = null;
         
        switch(tipoPesquisa){
            case 0: lista = modeloDAO.pesquisarID(pesquisa); break;
            case 1: lista = modeloDAO.pesquisarMarca(pesquisa); break;
            case 2: lista = modeloDAO.pesquisarModelo(pesquisa); break;
        }
        return lista;
    }
    
    public List<Versao> versaoPesquisar(String pesquisa, int tipoPesquisa){
        List<Versao> lista = null;
        
        switch(tipoPesquisa){
            case 0: lista = versaoDAO.pesquisarID(pesquisa); break;
            case 1: lista = versaoDAO.pesquisarMarca(pesquisa); break;
            case 2: lista = versaoDAO.pesquisarModelo(pesquisa); break;
            case 3: lista = versaoDAO.pesquisarVersao(pesquisa); break;
        }    
        return lista;
    }
    
    public List<Veiculo> veiculoPesquisar(String pesquisa, int tipoPesquisa){
        List<Veiculo> lista = null;
        
        switch(tipoPesquisa){
            case 0: lista = veiculoDAO.pesquisarID(pesquisa); break;
            case 1: lista = veiculoDAO.pesquisarMarca(pesquisa); break;
            case 2: lista = veiculoDAO.pesquisarModelo(pesquisa); break;
            case 3: lista = veiculoDAO.pesquisarVersao(pesquisa); break;
            case 4: lista = veiculoDAO.pesquisarAno(pesquisa); break;
            case 5: lista = veiculoDAO.pesquisarCombustivel(pesquisa); break;
            case 6: lista = veiculoDAO.pesquisarCambio(pesquisa); break;
            case 7: lista = veiculoDAO.pesquisarDirecao(pesquisa); break;
            case 8: lista = veiculoDAO.pesquisarMotor(pesquisa); break;  
        }    
        return lista;
    }
    
    public List<Revenda> revendaPesquisar(String pesquisa, int tipoPesquisa){
        List<Revenda> lista = null;
        switch(tipoPesquisa){
            case 0: lista = revendaDAO.pesquisarID(pesquisa); break;
            case 1: lista = revendaDAO.pesquisarMarca(pesquisa); break;
            case 2: lista = revendaDAO.pesquisarModelo(pesquisa); break;
            case 3: lista = revendaDAO.pesquisarVersao(pesquisa); break;
            case 4: lista = revendaDAO.pesquisarAno(pesquisa); break;
            case 5: lista = revendaDAO.pesquisarCor(pesquisa); break;
            case 6: lista = revendaDAO.pesquisarQuilometragem(pesquisa); break;
            case 7: lista = revendaDAO.pesquisarPlaca(pesquisa); break;
            case 8: lista = revendaDAO.pesquisarFornecedor(pesquisa); break;  
            case 9: lista = revendaDAO.pesquisarValorCompra(pesquisa); break;  
            case 10: lista = revendaDAO.pesquisarDataCompra(pesquisa); break;  
            case 11: lista = revendaDAO.pesquisarDespesa(pesquisa); break;  
            case 12: lista = revendaDAO.pesquisarCliente(pesquisa); break;  
            case 13: lista = revendaDAO.pesquisarValorVenda(pesquisa); break;  
            case 14: lista = revendaDAO.pesquisarDataVenda(pesquisa); break;  
            case 15: lista = revendaDAO.pesquisarLucro(pesquisa); break;  
            
        }    
        return lista;
    }
    
    public List<Cliente> clientePesquisar(String pesquisa, int tipoPesquisa){
        List<Cliente> lista = null;
        
        switch(tipoPesquisa){
            case 0: lista = clienteDAO.pesquisarID(pesquisa); break;
            case 1: lista = clienteDAO.pesquisarNome(pesquisa); break;
            case 2: lista = clienteDAO.pesquisarCidade(pesquisa); break;
            case 3: lista = clienteDAO.pesquisarTelefone(pesquisa); break;
        }    
        return lista;
    }
    
    public List<Fornecedor> fornecedorPesquisar(String pesquisa, int tipoPesquisa){
        List<Fornecedor> lista = null;
        
        switch(tipoPesquisa){
            case 0: lista = fornecedorDAO.pesquisarID(pesquisa); break;
            case 1: lista = fornecedorDAO.pesquisarNome(pesquisa); break;
            case 2: lista = fornecedorDAO.pesquisarCidade(pesquisa); break;
            case 3: lista = fornecedorDAO.pesquisarTelefone(pesquisa); break;
        }    
        return lista;
    }
    
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    public void marcaAlterar(Marca objetoMarca){
        marcaDAO.alterar(objetoMarca); 
    }
    
    public void modeloAlterar(Modelo objetoModelo){
        modeloDAO.alterar(objetoModelo); 
    }
        
    public void versaoAlterar(Versao objetoVersao){
        versaoDAO.alterar(objetoVersao); 
    }
    
    public void veiculoAlterar(Veiculo objetoVeiculo){
        veiculoDAO.alterar(objetoVeiculo); 
    }
    
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
   
    public void marcaExcluir(Marca marcaParametro){
        marcaDAO.excluir(marcaParametro); 
    }
    
    public void modeloExcluir(Modelo modeloParametro){
        modeloDAO.excluir(modeloParametro); 
    }
    
    public void versaoExcluir(Versao versaoExcluir){
        versaoDAO.excluir(versaoExcluir); 
    }
    
    public void veiculoExcluir(Veiculo veiculoParametro){
        veiculoDAO.excluir(veiculoParametro); 
    }
    
    public void revendaExcluir(Revenda revendaParametro){
        revendaDAO.excluir(revendaParametro); 
    }
    
    public void clienteExcluir(Cliente clienteParametro){
        clienteDAO.excluir(clienteParametro); 
    }
    
    public void fornecedorExcluir(Fornecedor fornecedorParametro){
        fornecedorDAO.excluir(fornecedorParametro); 
    }
    
   /* public void despesaExcluir(Despesa despesaParametro){
        despesaDAO.excluir(despesaParametro); 
    }
    */

    
}
