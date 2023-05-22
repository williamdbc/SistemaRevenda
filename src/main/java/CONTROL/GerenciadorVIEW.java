package CONTROL;

import DOMINIO.Modelo;
import VIEW.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.hibernate.HibernateException;

public class GerenciadorVIEW {
    private FrmPrincipal janelaPrincipal = null;
    private Login janelaLogin = null;
    private CadCliente cadCliente = null;
    private CadFornecedor cadFornecedor = null;
    private CadMarca cadMarca = null;
    private CadModelo cadModelo = null;
    private CadVersao cadVersao = null;
    private CadVeiculo cadVeiculo = null;
    private CadVeiculoComprado cadVeiculoComprado = null;
    private CadVeiculoVendido cadVeiculoVendido = null;
    private ListaDespesa listaDespesa = null;
    
    GerenciadorDOMINIO gerenciadorDominio;
    
    public GerenciadorVIEW() {
        try {
            gerenciadorDominio = new GerenciadorDOMINIO();
        } catch (HibernateException  ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro de conexão com o banco. " + ex.getMessage() );
                System.exit(-1);
        } 
    }

    public GerenciadorDOMINIO getGerDominio() {
        return gerenciadorDominio;
    }
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerenciadorVIEW.class ).newInstance(parent,true,this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() );
            } 
        }        
        dlg.setLocationRelativeTo(null);
        dlg.setVisible(true); 
        return dlg;
    }
    
    
    public void janelaPrincipal() {
        janelaPrincipal = new FrmPrincipal(this);
        janelaPrincipal.setVisible(true);
    }
    
    public void janelaLogin() {
        janelaLogin = (Login) abrirJanela(null, janelaLogin, Login.class);
    }
    
    public void janelaCadCliente() {
        cadCliente = (CadCliente) abrirJanela(janelaPrincipal, cadCliente, CadCliente.class);
    }
        
    public void janelaCadFornecedor() {
        cadFornecedor = (CadFornecedor) abrirJanela(janelaPrincipal, cadFornecedor, CadFornecedor.class);
    }
    
    public void janelaCadMarca() {
        cadMarca = (CadMarca) abrirJanela(janelaPrincipal, cadMarca, CadMarca.class);
    }
    
    public void janelaCadModelo() {
        cadModelo = (CadModelo) abrirJanela(janelaPrincipal, cadModelo, CadModelo.class);
    }
    
    public void janelaCadVersao() {
        cadVersao = (CadVersao) abrirJanela(janelaPrincipal, cadVersao, CadVersao.class);
    }
    
    public void janelaCadVeiculo() {
        cadVeiculo = (CadVeiculo) abrirJanela(janelaPrincipal, cadVeiculo, CadVeiculo.class);
    }
    
    public void janelaCadVeiculoComprado() {
        cadVeiculoComprado = (CadVeiculoComprado) abrirJanela(janelaPrincipal, cadVeiculoComprado, CadVeiculoComprado.class);
    }
    
    public void janelaCadVeiculoVendido() {
        cadVeiculoVendido = (CadVeiculoVendido) abrirJanela(janelaPrincipal, cadVeiculoVendido, CadVeiculoVendido.class);
    }
    
    public void janelaListaDespesa() {
        listaDespesa = (ListaDespesa) abrirJanela(null, listaDespesa, ListaDespesa.class);
    }
    
    public void carregarComboBox(JComboBox combo, Class classe){
        try {
            List lista = getGerDominio().listar(classe);
            combo.setModel( new DefaultComboBoxModel( lista.toArray() )  );                       
        } catch (HibernateException  ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro ao carregar cidades. " + ex.getMessage() );          
        } 
    }
    
    public void carregarComboModelo(JComboBox combo, Class classe, String nomeMarca){
        
        try {
            List <Modelo> lista = gerenciadorDominio.listar(classe);
            List <Modelo> lista2 = new ArrayList<>();
            for(Modelo modelo : lista){
                if(modelo.getMarca().getNome_marca().equals(nomeMarca)){
                    lista2.add(modelo);
                }
            }
              
            
            combo.setModel( new DefaultComboBoxModel( lista2.toArray() )  );                       
        } catch (HibernateException  ex) {
            System.out.println("DEU ERRO");
        } 
    }
    
    
     public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // System.out.println( info.getName() );
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex){
            System.err.print("Falha ao iniciar tema.");
        }
        
        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim"); 
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");

        GerenciadorVIEW gerIG = new GerenciadorVIEW();
        gerIG.janelaLogin();
     }
}
        

      
