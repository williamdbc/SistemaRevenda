package CONTROL;

import VIEW.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
    
    /*public GerenciadorVIEW() {
        try {
            gerenciadorDominio = new GerenciadorDOMINIO();
        } catch (ClassNotFoundException | SQLException  ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro de conexão com o banco. " + ex.getMessage() );
                System.exit(-1);
        } 
    }

    public GerenciadorDOMINIO getGerDominio() {
        return gerenciadorDominio;
    }
    */
    
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
    
     public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                // System.out.println( info.getName() );
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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
        

      
