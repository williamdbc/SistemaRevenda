/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import CONTROL.GerenciadorVIEW;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;

/**
 *
 * @author William
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private GerenciadorVIEW gerenciadorVIEW;
    
    public FrmPrincipal(GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTema = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastros = new javax.swing.JMenu();
        mnuItemClientes = new javax.swing.JMenuItem();
        mnuItemFornecedores = new javax.swing.JMenuItem();
        mnuItemVeiculos = new javax.swing.JMenu();
        mnuItemMarca = new javax.swing.JMenuItem();
        mnuItemModelo = new javax.swing.JMenuItem();
        mnuItemVersao = new javax.swing.JMenuItem();
        mnuItemVeiculo = new javax.swing.JMenuItem();
        mnuItemRevendas = new javax.swing.JMenu();
        mnuItemVeiculoCmp = new javax.swing.JMenuItem();
        mnuItemVeiculoVnd = new javax.swing.JMenuItem();
        mnuConfiguracoes = new javax.swing.JMenu();
        menuItemTema = new javax.swing.JMenu();
        rbtnClaro = new javax.swing.JRadioButtonMenuItem();
        rbtnEscuro = new javax.swing.JRadioButtonMenuItem();
        mnuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuCadastros.setText("Cadastros");

        mnuItemClientes.setText("Clientes");
        mnuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemClientesActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuItemClientes);

        mnuItemFornecedores.setText("Fornecedores");
        mnuItemFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemFornecedoresActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuItemFornecedores);

        mnuItemVeiculos.setText("Veiculos");

        mnuItemMarca.setText("Marca");
        mnuItemMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemMarcaActionPerformed(evt);
            }
        });
        mnuItemVeiculos.add(mnuItemMarca);

        mnuItemModelo.setText("Modelo");
        mnuItemModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemModeloActionPerformed(evt);
            }
        });
        mnuItemVeiculos.add(mnuItemModelo);

        mnuItemVersao.setText("Versão");
        mnuItemVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemVersaoActionPerformed(evt);
            }
        });
        mnuItemVeiculos.add(mnuItemVersao);

        mnuItemVeiculo.setText("Veículo");
        mnuItemVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemVeiculoActionPerformed(evt);
            }
        });
        mnuItemVeiculos.add(mnuItemVeiculo);

        mnuCadastros.add(mnuItemVeiculos);

        mnuItemRevendas.setText("Revendas");

        mnuItemVeiculoCmp.setText("Veículo comprado");
        mnuItemVeiculoCmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemVeiculoCmpActionPerformed(evt);
            }
        });
        mnuItemRevendas.add(mnuItemVeiculoCmp);

        mnuItemVeiculoVnd.setText("Veículo vendido");
        mnuItemVeiculoVnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemVeiculoVndActionPerformed(evt);
            }
        });
        mnuItemRevendas.add(mnuItemVeiculoVnd);

        mnuCadastros.add(mnuItemRevendas);

        jMenuBar1.add(mnuCadastros);

        mnuConfiguracoes.setText("Configurações");

        menuItemTema.setText("Tema");

        btnGroupTema.add(rbtnClaro);
        rbtnClaro.setSelected(true);
        rbtnClaro.setText("Claro");
        rbtnClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnClaroActionPerformed(evt);
            }
        });
        menuItemTema.add(rbtnClaro);

        btnGroupTema.add(rbtnEscuro);
        rbtnEscuro.setText("Escuro");
        rbtnEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEscuroActionPerformed(evt);
            }
        });
        menuItemTema.add(rbtnEscuro);

        mnuConfiguracoes.add(menuItemTema);

        mnuItemLogout.setText("Logout");
        mnuConfiguracoes.add(mnuItemLogout);

        jMenuBar1.add(mnuConfiguracoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    
    
    
    
    private void rbtnEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEscuroActionPerformed
        FlatAnimatedLafChange.showSnapshot();
        FlatDarkLaf.setup();
        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }//GEN-LAST:event_rbtnEscuroActionPerformed

    private void mnuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemClientesActionPerformed
        gerenciadorVIEW.janelaCadCliente();
    }//GEN-LAST:event_mnuItemClientesActionPerformed

    private void mnuItemVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemVeiculoActionPerformed
        gerenciadorVIEW.janelaCadVeiculo();
    }//GEN-LAST:event_mnuItemVeiculoActionPerformed

    private void rbtnClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnClaroActionPerformed
        FlatAnimatedLafChange.showSnapshot();
        FlatLightLaf.setup();
        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }//GEN-LAST:event_rbtnClaroActionPerformed

    private void mnuItemVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemVersaoActionPerformed
        gerenciadorVIEW.janelaCadVersao();
    }//GEN-LAST:event_mnuItemVersaoActionPerformed

    private void mnuItemModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemModeloActionPerformed
        gerenciadorVIEW.janelaCadModelo();
    }//GEN-LAST:event_mnuItemModeloActionPerformed

    private void mnuItemMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemMarcaActionPerformed
        gerenciadorVIEW.janelaCadMarca();
    }//GEN-LAST:event_mnuItemMarcaActionPerformed

    private void mnuItemFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemFornecedoresActionPerformed
        gerenciadorVIEW.janelaCadFornecedor();
    }//GEN-LAST:event_mnuItemFornecedoresActionPerformed

    private void mnuItemVeiculoCmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemVeiculoCmpActionPerformed
        gerenciadorVIEW.janelaCadVeiculoComprado();
    }//GEN-LAST:event_mnuItemVeiculoCmpActionPerformed

    private void mnuItemVeiculoVndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemVeiculoVndActionPerformed
        gerenciadorVIEW.janelaCadVeiculoVendido();
    }//GEN-LAST:event_mnuItemVeiculoVndActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupTema;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuItemTema;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenu mnuConfiguracoes;
    private javax.swing.JMenuItem mnuItemClientes;
    private javax.swing.JMenuItem mnuItemFornecedores;
    private javax.swing.JMenuItem mnuItemLogout;
    private javax.swing.JMenuItem mnuItemMarca;
    private javax.swing.JMenuItem mnuItemModelo;
    private javax.swing.JMenu mnuItemRevendas;
    private javax.swing.JMenuItem mnuItemVeiculo;
    private javax.swing.JMenuItem mnuItemVeiculoCmp;
    private javax.swing.JMenuItem mnuItemVeiculoVnd;
    private javax.swing.JMenu mnuItemVeiculos;
    private javax.swing.JMenuItem mnuItemVersao;
    private javax.swing.JRadioButtonMenuItem rbtnClaro;
    private javax.swing.JRadioButtonMenuItem rbtnEscuro;
    // End of variables declaration//GEN-END:variables
}
