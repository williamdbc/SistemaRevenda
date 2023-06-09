package VIEW;

import CONTROL.*;
import DOMINIO.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class CadModelo extends javax.swing.JDialog {

    private GerenciadorVIEW gerenciadorVIEW;
    private Modelo modeloSelecionado;

    public CadModelo(java.awt.Frame parent, boolean modal, GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;
        modeloSelecionado = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCadModelo = new javax.swing.JPanel();
        lblCadModelo = new javax.swing.JLabel();
        pnlModelo = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        pnlBotoes = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditarOK = new javax.swing.JButton();
        lblEditando = new javax.swing.JLabel();
        pnlListModelo = new javax.swing.JPanel();
        lblListModelo = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        cmbFiltrarOrdem = new javax.swing.JComboBox<>();
        cmbFiltrar = new javax.swing.JComboBox<>();
        cmbPesquisar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModelo = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblCadModelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadModelo.setText("CADASTRO DE MODELO");

        pnlModelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));

        lblMarca.setText("Nome da marca");

        lblModelo.setText("Nome do modelo");

        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModeloLayout = new javax.swing.GroupLayout(pnlModelo);
        pnlModelo.setLayout(pnlModeloLayout);
        pnlModeloLayout.setHorizontalGroup(
            pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModeloLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModeloLayout.createSequentialGroup()
                        .addComponent(lblModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModeloLayout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlModeloLayout.setVerticalGroup(
            pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModeloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlBotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/adicionar.png"))); // NOI18N
        btnCadastrar.setText(" Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 25));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/erro.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setAutoscrolls(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 0, -1, 25));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/apagar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 0, -1, 25));

        btnEditarOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/editar_ok.png"))); // NOI18N
        btnEditarOK.setText("Confirmar");
        btnEditarOK.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btnEditarOKComponentShown(evt);
            }
        });
        btnEditarOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarOKActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnEditarOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 0, -1, 25));

        lblEditando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/alerta.png"))); // NOI18N
        lblEditando.setText("Você está editando um modelo nesse momento.");

        javax.swing.GroupLayout pnlCadModeloLayout = new javax.swing.GroupLayout(pnlCadModelo);
        pnlCadModelo.setLayout(pnlCadModeloLayout);
        pnlCadModeloLayout.setHorizontalGroup(
            pnlCadModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadModeloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCadModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEditando)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadModelo))
                .addGap(30, 30, 30))
        );
        pnlCadModeloLayout.setVerticalGroup(
            pnlCadModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadModeloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCadModelo)
                .addGap(15, 15, 15)
                .addComponent(pnlModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEditando)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Cadastro", pnlCadModelo);

        lblListModelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListModelo.setText("LISTA DE MODELOS");

        cmbFiltrarOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crescente", "Decrescente" }));

        cmbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo" }));

        cmbPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo" }));

        tblModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblModelo);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/adicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/excluir2.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/filtrar2.png"))); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/procurar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListModeloLayout = new javax.swing.GroupLayout(pnlListModelo);
        pnlListModelo.setLayout(pnlListModeloLayout);
        pnlListModeloLayout.setHorizontalGroup(
            pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListModeloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListModelo)
                    .addGroup(pnlListModeloLayout.createSequentialGroup()
                        .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisar)
                            .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlListModeloLayout.setVerticalGroup(
            pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListModeloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblListModelo)
                .addGap(15, 15, 15)
                .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListModeloLayout.createSequentialGroup()
                        .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlListModeloLayout.createSequentialGroup()
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(pnlListModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlListModeloLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Lista", pnlListModelo);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */   
    
    private SortOrder tipoOrdem;
    
    private void cleanFields(){
        cmbMarca.setSelectedIndex(-1);
        txtModelo.setText("");
    }
    
    private void botaoEditar(){
        FuncoesUteis.isEditando(true, btnLimpar, btnEditarOK, btnCancelar, lblEditando);
    }
    
    private void botaoCancelar(){
        FuncoesUteis.isEditando(false, btnLimpar, btnEditarOK, btnCancelar, lblEditando);
        cleanFields();
    }
    
    private boolean checkFields(){
        String msgErro = "";
        if(cmbMarca.getSelectedIndex() == -1){
            msgErro += "O campo 'Marca' não pode estar vazio.\n";
        }
        
        if(txtModelo.getText().isBlank()){
            msgErro += "O campo 'Modelo' não pode estar vazio.\n";
        }
        

        if(!msgErro.isBlank()){
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos.", JOptionPane.ERROR_MESSAGE);
            return false;
        } return true;  
    }
    
    private void carregarTabela(List<Modelo> listaModelos){
        ((DefaultTableModel) tblModelo.getModel()).setNumRows(0);
            
        for (Modelo modelo : listaModelos ) {
            ((DefaultTableModel)tblModelo.getModel()).addRow(modelo.toArray());     
        }
    }
    
    private boolean pesquisaValida(String pesquisa){
        if(cmbPesquisar.getSelectedIndex() == 0 && !FuncoesUteis.isInteger(pesquisa)){
            JOptionPane.showMessageDialog(this, "ID informado possui caracteres não permitidos.", "Erro ao pesquisar modelo", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        return true;
    }
    
    private void setFields(){
        cmbMarca.setSelectedItem(modeloSelecionado.getMarca());
        txtModelo.setText(modeloSelecionado.getNome_modelo());
    }
    
    private void updateFields(Marca marca, String nome_modelo){
        modeloSelecionado.setMarca(marca);
        modeloSelecionado.setNome_modelo(nome_modelo);
    }
    
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tblModelo.getSelectedRow();
        if(linha >= 0){
            jTabbedPane1.setSelectedIndex(0);
            botaoEditar();
       
            modeloSelecionado = (Modelo) tblModelo.getValueAt(linha, 2);
            setFields();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        switch(cmbFiltrarOrdem.getSelectedIndex()) {
            case 0: tipoOrdem = SortOrder.ASCENDING; break;
            case 1: tipoOrdem = SortOrder.DESCENDING; break;
            default: break;
        }
        
        FuncoesUteis.ordenarTabela(tblModelo, cmbFiltrar.getSelectedIndex(), tipoOrdem);
    }//GEN-LAST:event_btnFiltrarActionPerformed
     
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String pesquisa = txtPesquisar.getText();
            
            if(!pesquisaValida(pesquisa)){
                return;
            }
            
            if(pesquisa.isBlank()){
                carregarTabela(gerenciadorVIEW.getGerDominio().listar(Modelo.class));
            } else {
                carregarTabela(gerenciadorVIEW.getGerDominio().modeloPesquisar(pesquisa, cmbPesquisar.getSelectedIndex()));
            }  
            
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "Erro ao pesquisar modelo", JOptionPane.ERROR_MESSAGE  );
        } 
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        botaoCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarOKComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEditarOKComponentShown
        jTabbedPane1.setSelectedIndex(0);
        botaoEditar();
    }//GEN-LAST:event_btnEditarOKComponentShown

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
       
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerenciadorVIEW.carregarComboBox(cmbMarca, Marca.class);
        botaoCancelar();
    }//GEN-LAST:event_formComponentShown

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(checkFields()){
            try {
                Marca objetoMarca = (Marca) cmbMarca.getSelectedItem();
                String nomeModelo = txtModelo.getText();
        
                if(JOptionPane.showConfirmDialog(this, "Desejar realmente cadastrar esse modelo?", "Cadastrar modelo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    gerenciadorVIEW.getGerDominio().inserirModelo(objetoMarca, nomeModelo);
                    JOptionPane.showMessageDialog(this, "Modelo cadastrado com sucesso.", "Cadastrar modelo", JOptionPane.INFORMATION_MESSAGE  );
                    botaoCancelar();
                    carregarTabela(gerenciadorVIEW.getGerDominio().listar(Modelo.class));
                }
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "Erro ao cadastrar modelo.", JOptionPane.ERROR_MESSAGE  );
            }  
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblModelo.getSelectedRow();
        if(linha >= 0){
            modeloSelecionado = (Modelo) tblModelo.getValueAt(linha, 2);
            if(JOptionPane.showConfirmDialog(this, "Desejar realmente excluir?\nTodos os itens relacionados a esse modelo também serão excluídos.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                ((DefaultTableModel) tblModelo.getModel()).removeRow(linha);
                gerenciadorVIEW.getGerDominio().modeloExcluir(modeloSelecionado);  
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarOKActionPerformed
        if(checkFields()){
            try {
                Marca marca = (Marca) cmbMarca.getSelectedItem();
                String nomeModelo = txtModelo.getText();
                
                if(JOptionPane.showConfirmDialog(this, "Desejar realmente editar?\nTodos os itens relacionados a esse modelo também serão editados.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    updateFields(marca, nomeModelo);
                    
                    gerenciadorVIEW.getGerDominio().modeloAlterar(modeloSelecionado);  
                    JOptionPane.showMessageDialog(this, "Modelo alterado com sucesso.", "Alterar modelo", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                    carregarTabela(gerenciadorVIEW.getGerDominio().listar(Modelo.class));
                }
            }   catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Erro ao alterar modelo.", JOptionPane.ERROR_MESSAGE);
            }
        }  
    }//GEN-LAST:event_btnEditarOKActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        botaoCancelar();
    }//GEN-LAST:event_btnNovoActionPerformed

  
    // <editor-fold defaultstate="collapsed" desc="Declaração de variáveis - Java Swing"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarOK;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbFiltrar;
    private javax.swing.JComboBox<String> cmbFiltrarOrdem;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCadModelo;
    private javax.swing.JLabel lblEditando;
    private javax.swing.JLabel lblListModelo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCadModelo;
    private javax.swing.JPanel pnlListModelo;
    private javax.swing.JPanel pnlModelo;
    private javax.swing.JTable tblModelo;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
