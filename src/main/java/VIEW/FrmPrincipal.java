package VIEW;

import CONTROL.GerenciadorVIEW;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;

public class FrmPrincipal extends javax.swing.JFrame {
    private GerenciadorVIEW gerenciadorVIEW;
    
    public FrmPrincipal(GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_Tema = new javax.swing.ButtonGroup();
        pnl_Revenda = new javax.swing.JPanel();
        lbl_IMG_Revenda = new javax.swing.JLabel();
        lbl_Revenda = new javax.swing.JLabel();
        btn_Versao = new javax.swing.JButton();
        btn_Venda = new javax.swing.JButton();
        btn_Modelo = new javax.swing.JButton();
        pnl_Veiculo = new javax.swing.JPanel();
        lbl_IMG_Veiculo = new javax.swing.JLabel();
        lbl_VeICULO = new javax.swing.JLabel();
        btn_Marca = new javax.swing.JButton();
        btn_Compra = new javax.swing.JButton();
        btn_Fornecedor = new javax.swing.JButton();
        btn_Veiculo = new javax.swing.JButton();
        btn_Cliente = new javax.swing.JButton();
        pnl_Relacao = new javax.swing.JPanel();
        lbl_IMG_Relacao = new javax.swing.JLabel();
        lbl_Relacao = new javax.swing.JLabel();
        mnuBar_Geral = new javax.swing.JMenuBar();
        mnu_Veiculo = new javax.swing.JMenu();
        mnuItem_Marca = new javax.swing.JMenuItem();
        mnuItem_Modelo = new javax.swing.JMenuItem();
        mnuItem_Versao = new javax.swing.JMenuItem();
        mnuItem_Veiculo = new javax.swing.JMenuItem();
        mnu_Revenda = new javax.swing.JMenu();
        mnuItem_Compra = new javax.swing.JMenuItem();
        mnuItem_Venda = new javax.swing.JMenuItem();
        mnu_Relacao = new javax.swing.JMenu();
        mnuItem_Cliente = new javax.swing.JMenuItem();
        mnuItem_Fornecedor = new javax.swing.JMenuItem();
        mnu_Relatorios = new javax.swing.JMenu();
        mnu_Configuracoes = new javax.swing.JMenu();
        mnuItem_Tema = new javax.swing.JMenu();
        rbtn_Claro = new javax.swing.JRadioButtonMenuItem();
        rbtn_Escuro = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_Revenda.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Revenda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbl_IMG_Revenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carro_revenda.png"))); // NOI18N

        lbl_Revenda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Revenda.setText("Revenda");

        javax.swing.GroupLayout pnl_RevendaLayout = new javax.swing.GroupLayout(pnl_Revenda);
        pnl_Revenda.setLayout(pnl_RevendaLayout);
        pnl_RevendaLayout.setHorizontalGroup(
            pnl_RevendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RevendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IMG_Revenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Revenda)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnl_RevendaLayout.setVerticalGroup(
            pnl_RevendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RevendaLayout.createSequentialGroup()
                .addGroup(pnl_RevendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_RevendaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbl_Revenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_RevendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_IMG_Revenda)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btn_Versao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Versao.setText("Versão");
        btn_Versao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_Versao.setFocusable(false);
        btn_Versao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VersaoActionPerformed(evt);
            }
        });

        btn_Venda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Venda.setText("Venda");
        btn_Venda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_Venda.setFocusable(false);
        btn_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VendaActionPerformed(evt);
            }
        });

        btn_Modelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Modelo.setMnemonic('m');
        btn_Modelo.setText("Modelo");
        btn_Modelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_Modelo.setFocusable(false);
        btn_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModeloActionPerformed(evt);
            }
        });

        pnl_Veiculo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Veiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbl_IMG_Veiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/veiculo.png"))); // NOI18N

        lbl_VeICULO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_VeICULO.setText("Veículo");

        javax.swing.GroupLayout pnl_VeiculoLayout = new javax.swing.GroupLayout(pnl_Veiculo);
        pnl_Veiculo.setLayout(pnl_VeiculoLayout);
        pnl_VeiculoLayout.setHorizontalGroup(
            pnl_VeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_VeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IMG_Veiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_VeICULO)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnl_VeiculoLayout.setVerticalGroup(
            pnl_VeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_VeiculoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnl_VeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_IMG_Veiculo)
                    .addComponent(lbl_VeICULO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btn_Marca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Marca.setMnemonic('m');
        btn_Marca.setText("Marca");
        btn_Marca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_Marca.setFocusable(false);
        btn_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MarcaActionPerformed(evt);
            }
        });

        btn_Compra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Compra.setText("Compra");
        btn_Compra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_Compra.setFocusable(false);
        btn_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CompraActionPerformed(evt);
            }
        });

        btn_Fornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Fornecedor.setText("Fornecedor");
        btn_Fornecedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_Fornecedor.setFocusable(false);
        btn_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FornecedorActionPerformed(evt);
            }
        });

        btn_Veiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Veiculo.setText("Veículo");
        btn_Veiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_Veiculo.setFocusable(false);
        btn_Veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VeiculoActionPerformed(evt);
            }
        });

        btn_Cliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Cliente.setText("Cliente");
        btn_Cliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_Cliente.setFocusable(false);
        btn_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClienteActionPerformed(evt);
            }
        });

        pnl_Relacao.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Relacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnl_Relacao.setPreferredSize(new java.awt.Dimension(140, 60));

        lbl_IMG_Relacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relacao.png"))); // NOI18N

        lbl_Relacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Relacao.setText("Relação");

        javax.swing.GroupLayout pnl_RelacaoLayout = new javax.swing.GroupLayout(pnl_Relacao);
        pnl_Relacao.setLayout(pnl_RelacaoLayout);
        pnl_RelacaoLayout.setHorizontalGroup(
            pnl_RelacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RelacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IMG_Relacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Relacao)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnl_RelacaoLayout.setVerticalGroup(
            pnl_RelacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RelacaoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_RelacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Relacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IMG_Relacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnu_Veiculo.setText("Veículo");

        mnuItem_Marca.setText("Marca");
        mnuItem_Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItem_MarcaActionPerformed(evt);
            }
        });
        mnu_Veiculo.add(mnuItem_Marca);

        mnuItem_Modelo.setText("Modelo");
        mnuItem_Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItem_ModeloActionPerformed(evt);
            }
        });
        mnu_Veiculo.add(mnuItem_Modelo);

        mnuItem_Versao.setText("Versão");
        mnuItem_Versao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItem_VersaoActionPerformed(evt);
            }
        });
        mnu_Veiculo.add(mnuItem_Versao);

        mnuItem_Veiculo.setText("Veículo");
        mnuItem_Veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItem_VeiculoActionPerformed(evt);
            }
        });
        mnu_Veiculo.add(mnuItem_Veiculo);

        mnuBar_Geral.add(mnu_Veiculo);

        mnu_Revenda.setText("Revenda");

        mnuItem_Compra.setText("Compra");
        mnuItem_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItem_CompraActionPerformed(evt);
            }
        });
        mnu_Revenda.add(mnuItem_Compra);

        mnuItem_Venda.setText("Venda");
        mnuItem_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItem_VendaActionPerformed(evt);
            }
        });
        mnu_Revenda.add(mnuItem_Venda);

        mnuBar_Geral.add(mnu_Revenda);

        mnu_Relacao.setText("Relação");

        mnuItem_Cliente.setText("Cliente");
        mnuItem_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItem_ClienteActionPerformed(evt);
            }
        });
        mnu_Relacao.add(mnuItem_Cliente);

        mnuItem_Fornecedor.setText("Fornecedor");
        mnuItem_Fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItem_FornecedorActionPerformed(evt);
            }
        });
        mnu_Relacao.add(mnuItem_Fornecedor);

        mnuBar_Geral.add(mnu_Relacao);

        mnu_Relatorios.setText("Relatórios");
        mnuBar_Geral.add(mnu_Relatorios);

        mnu_Configuracoes.setText("Configurações");

        mnuItem_Tema.setText("Tema");

        btnGroup_Tema.add(rbtn_Claro);
        rbtn_Claro.setSelected(true);
        rbtn_Claro.setText("Claro");
        rbtn_Claro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_ClaroActionPerformed(evt);
            }
        });
        mnuItem_Tema.add(rbtn_Claro);

        btnGroup_Tema.add(rbtn_Escuro);
        rbtn_Escuro.setText("Escuro");
        rbtn_Escuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_EscuroActionPerformed(evt);
            }
        });
        mnuItem_Tema.add(rbtn_Escuro);

        mnu_Configuracoes.add(mnuItem_Tema);

        mnuBar_Geral.add(mnu_Configuracoes);

        setJMenuBar(mnuBar_Geral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_Relacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_Revenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_Versao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Versao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_Veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_Revenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_Relacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private void btn_VersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VersaoActionPerformed
        gerenciadorVIEW.janelaCadVersao();
    }//GEN-LAST:event_btn_VersaoActionPerformed

    private void btn_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VendaActionPerformed
        gerenciadorVIEW.setRevenda(null);
        gerenciadorVIEW.janelaCadVeiculoVendido();
    }//GEN-LAST:event_btn_VendaActionPerformed

    private void btn_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModeloActionPerformed
        gerenciadorVIEW.janelaCadModelo();
    }//GEN-LAST:event_btn_ModeloActionPerformed

    private void btn_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MarcaActionPerformed
        gerenciadorVIEW.janelaCadMarca();
    }//GEN-LAST:event_btn_MarcaActionPerformed

    private void btn_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CompraActionPerformed
        gerenciadorVIEW.janelaCadVeiculoComprado();
    }//GEN-LAST:event_btn_CompraActionPerformed

    private void btn_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FornecedorActionPerformed
        gerenciadorVIEW.janelaCadFornecedor();
    }//GEN-LAST:event_btn_FornecedorActionPerformed

    private void btn_VeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VeiculoActionPerformed
        gerenciadorVIEW.janelaCadVeiculo();
    }//GEN-LAST:event_btn_VeiculoActionPerformed

    private void btn_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClienteActionPerformed
        gerenciadorVIEW.janelaCadCliente();
    }//GEN-LAST:event_btn_ClienteActionPerformed

    private void mnuItem_MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItem_MarcaActionPerformed
        gerenciadorVIEW.janelaCadMarca();
    }//GEN-LAST:event_mnuItem_MarcaActionPerformed

    private void mnuItem_ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItem_ModeloActionPerformed
        gerenciadorVIEW.janelaCadModelo();
    }//GEN-LAST:event_mnuItem_ModeloActionPerformed

    private void mnuItem_VersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItem_VersaoActionPerformed
        gerenciadorVIEW.janelaCadVersao();
    }//GEN-LAST:event_mnuItem_VersaoActionPerformed

    private void mnuItem_VeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItem_VeiculoActionPerformed
        gerenciadorVIEW.janelaCadVeiculo();
    }//GEN-LAST:event_mnuItem_VeiculoActionPerformed

    private void mnuItem_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItem_CompraActionPerformed
        gerenciadorVIEW.setRevenda(null);
        gerenciadorVIEW.janelaCadVeiculoComprado();
    }//GEN-LAST:event_mnuItem_CompraActionPerformed

    private void mnuItem_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItem_VendaActionPerformed
        gerenciadorVIEW.janelaCadVeiculoVendido();
    }//GEN-LAST:event_mnuItem_VendaActionPerformed

    private void mnuItem_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItem_ClienteActionPerformed
        gerenciadorVIEW.janelaCadCliente();
    }//GEN-LAST:event_mnuItem_ClienteActionPerformed

    private void mnuItem_FornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItem_FornecedorActionPerformed
        gerenciadorVIEW.janelaCadFornecedor();
    }//GEN-LAST:event_mnuItem_FornecedorActionPerformed

    private void rbtn_ClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_ClaroActionPerformed
        FlatAnimatedLafChange.showSnapshot();
        FlatLightLaf.setup();
        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }//GEN-LAST:event_rbtn_ClaroActionPerformed

    private void rbtn_EscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_EscuroActionPerformed
        FlatAnimatedLafChange.showSnapshot();
        FlatDarkLaf.setup();
        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
    }//GEN-LAST:event_rbtn_EscuroActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Declaração de variáveis - Java Swing"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup_Tema;
    private javax.swing.JButton btn_Cliente;
    private javax.swing.JButton btn_Compra;
    private javax.swing.JButton btn_Fornecedor;
    private javax.swing.JButton btn_Marca;
    private javax.swing.JButton btn_Modelo;
    private javax.swing.JButton btn_Veiculo;
    private javax.swing.JButton btn_Venda;
    private javax.swing.JButton btn_Versao;
    private javax.swing.JLabel lbl_IMG_Relacao;
    private javax.swing.JLabel lbl_IMG_Revenda;
    private javax.swing.JLabel lbl_IMG_Veiculo;
    private javax.swing.JLabel lbl_Relacao;
    private javax.swing.JLabel lbl_Revenda;
    private javax.swing.JLabel lbl_VeICULO;
    private javax.swing.JMenuBar mnuBar_Geral;
    private javax.swing.JMenuItem mnuItem_Cliente;
    private javax.swing.JMenuItem mnuItem_Compra;
    private javax.swing.JMenuItem mnuItem_Fornecedor;
    private javax.swing.JMenuItem mnuItem_Marca;
    private javax.swing.JMenuItem mnuItem_Modelo;
    private javax.swing.JMenu mnuItem_Tema;
    private javax.swing.JMenuItem mnuItem_Veiculo;
    private javax.swing.JMenuItem mnuItem_Venda;
    private javax.swing.JMenuItem mnuItem_Versao;
    private javax.swing.JMenu mnu_Configuracoes;
    private javax.swing.JMenu mnu_Relacao;
    private javax.swing.JMenu mnu_Relatorios;
    private javax.swing.JMenu mnu_Revenda;
    private javax.swing.JMenu mnu_Veiculo;
    private javax.swing.JPanel pnl_Relacao;
    private javax.swing.JPanel pnl_Revenda;
    private javax.swing.JPanel pnl_Veiculo;
    private javax.swing.JRadioButtonMenuItem rbtn_Claro;
    private javax.swing.JRadioButtonMenuItem rbtn_Escuro;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
