package VIEW;

import CONTROL.*;
import DOMINIO.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class CadCliente extends javax.swing.JDialog {
    private GerenciadorVIEW gerenciadorVIEW;
    private Cliente clienteSelecionado;
    
    public CadCliente(java.awt.Frame parent, boolean modal, GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;
        clienteSelecionado = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCadCliente = new javax.swing.JPanel();
        lblCadCliente = new javax.swing.JLabel();
        pnlInformacoes = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        pnlBotoes = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditarOK = new javax.swing.JButton();
        lblEditando = new javax.swing.JLabel();
        pnlListCliente = new javax.swing.JPanel();
        lblListCliente = new javax.swing.JLabel();
        cmbFiltrar = new javax.swing.JComboBox<>();
        cmbPesquisar = new javax.swing.JComboBox<>();
        txtPesquisar = new javax.swing.JTextField();
        cmbFiltrarOrdem = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEscluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblCadCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadCliente.setText("CADASTRO DE CLIENTE");

        pnlInformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        lblNome.setText("Nome");

        lblCidade.setText("Cidade");

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        lblTelefone.setText("Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlInformacoesLayout = new javax.swing.GroupLayout(pnlInformacoes);
        pnlInformacoes.setLayout(pnlInformacoesLayout);
        pnlInformacoesLayout.setHorizontalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addGap(18, 18, 18)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInformacoesLayout.setVerticalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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
        lblEditando.setText("Você está editando um fornecedor nesse momento.");

        javax.swing.GroupLayout pnlCadClienteLayout = new javax.swing.GroupLayout(pnlCadCliente);
        pnlCadCliente.setLayout(pnlCadClienteLayout);
        pnlCadClienteLayout.setHorizontalGroup(
            pnlCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadClienteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadCliente)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditando))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnlCadClienteLayout.setVerticalGroup(
            pnlCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadClienteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCadCliente)
                .addGap(15, 15, 15)
                .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblEditando)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", pnlCadCliente);

        lblListCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListCliente.setText("LISTA DE CLIENTES");

        cmbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Cidade", "Telefone" }));

        cmbPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "Cidade", "Telefone" }));

        cmbFiltrarOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crescente", "Decrescente" }));

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

        btnEscluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/excluir2.png"))); // NOI18N
        btnEscluir.setText("Excluir");
        btnEscluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEscluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscluirActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cidade", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout pnlListClienteLayout = new javax.swing.GroupLayout(pnlListCliente);
        pnlListCliente.setLayout(pnlListClienteLayout);
        pnlListClienteLayout.setHorizontalGroup(
            pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListClienteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlListClienteLayout.createSequentialGroup()
                        .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisar)
                            .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblListCliente))
                .addGap(15, 15, 15)
                .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnlListClienteLayout.setVerticalGroup(
            pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListClienteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblListCliente)
                .addGap(15, 15, 15)
                .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListClienteLayout.createSequentialGroup()
                        .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlListClienteLayout.createSequentialGroup()
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(pnlListClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListClienteLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnEscluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Lista", pnlListCliente);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private SortOrder tipoOrdem;
    
    private void botaoEditar(){
        FuncoesUteis.isEditando(true, btnLimpar, btnEditarOK, btnCancelar, lblEditando);
    }
    
    private void botaoCancelar(){
        FuncoesUteis.isEditando(false, btnLimpar, btnEditarOK, btnCancelar, lblEditando);
        cleanFields();
    }
    
    private void cleanFields(){
        txtNome.setText("");
        txtCidade.setText("");
        txtTelefone.setText("");
    }
    
    private boolean checkFields(){
        String msgErro = "";
        if(txtNome.getText().isBlank()){
            msgErro += "O campo 'Nome' não pode estar vazio.\n";
        }
        
        if(txtCidade.getText().isBlank()){
            msgErro += "O campo 'Cidade' não pode estar vazio.\n";
        }
        
        if(txtTelefone.getText().isBlank()){
            msgErro += "O campo 'Telefone' não pode estar vazio.\n";
        }
        
        if(!msgErro.isBlank()){
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos.", JOptionPane.ERROR_MESSAGE);
            return false;
        } return true;  
    }
    
    private void carregarTabela(List<Cliente> listaClientes){
        ((DefaultTableModel) tblCliente.getModel()).setNumRows(0);
            
        for (Cliente cliente : listaClientes ) {
            ((DefaultTableModel)tblCliente.getModel()).addRow(cliente.toArray());     
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
        txtNome.setText(clienteSelecionado.getNome_cli_forn());
        txtCidade.setText(clienteSelecionado.getCidade_cli_forn());
        txtTelefone.setText(clienteSelecionado.getTelefone_cli_forn());
    }
    
    private void updateFields(String nome, String cidade, String telefone){
        clienteSelecionado.setNome_cli_forn(nome);
        clienteSelecionado.setCidade_cli_forn(cidade);
        clienteSelecionado.setTelefone_cli_forn(telefone);
    }
    
   
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private void btnEditarOKComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEditarOKComponentShown

    }//GEN-LAST:event_btnEditarOKComponentShown

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        botaoCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        switch(cmbFiltrarOrdem.getSelectedIndex()) {
            case 0: tipoOrdem = SortOrder.ASCENDING; break;
            case 1: tipoOrdem = SortOrder.DESCENDING; break;
            default: break;
        }
        
        FuncoesUteis.ordenarTabela(tblCliente, cmbFiltrar.getSelectedIndex(), tipoOrdem);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String pesquisa = txtPesquisar.getText();

            if(!pesquisaValida(pesquisa)){
                return;
            }
            
            if(pesquisa.isBlank()){
                carregarTabela(gerenciadorVIEW.getGerDominio().listar(Cliente.class));
            } else {
                carregarTabela(gerenciadorVIEW.getGerDominio().clientePesquisar(pesquisa, cmbPesquisar.getSelectedIndex()));
            } 
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "Erro ao pesquisar cliente", JOptionPane.ERROR_MESSAGE  );
        } 
     
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tblCliente.getSelectedRow();
        if(linha >= 0){
            jTabbedPane1.setSelectedIndex(0);
            botaoEditar();
       
            clienteSelecionado = (Cliente) tblCliente.getValueAt(linha, 1);
            setFields();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed

    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(checkFields()){
           try{
                String nome = txtNome.getText();
                String cidade = txtCidade.getText();
                String telefone = txtTelefone.getText();
            
                if(JOptionPane.showConfirmDialog(this, "Desejar realmente cadastrar esse cliente?", "Cadastrar cliente", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    gerenciadorVIEW.getGerDominio().inserirCliente(nome, cidade, telefone);
                    JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso.", "Cadastrar cliente", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                    carregarTabela(gerenciadorVIEW.getGerDominio().listar(Cliente.class));
                }      
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(this, ex, "Erro ao cadastrar cliente", JOptionPane.ERROR_MESSAGE  );
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        botaoCancelar();
    }//GEN-LAST:event_formComponentShown

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEditarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarOKActionPerformed
        if(checkFields()){
            try {
                String nome = txtNome.getText();
                String cidade = txtCidade.getText();
                String telefone = txtTelefone.getText();
                
                if(JOptionPane.showConfirmDialog(this, "Desejar realmente editar?\nTodos os itens relacionados a essa cliente também serão editados.", "Confirmar edição", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    updateFields(nome, cidade, telefone);

                    gerenciadorVIEW.getGerDominio().clienteAlterar(clienteSelecionado);  
                    JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso.", "Alterar cliente", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                    carregarTabela(gerenciadorVIEW.getGerDominio().listar(Cliente.class));
                }
            }   catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Erro ao alterar cliente.", JOptionPane.ERROR_MESSAGE);
            }
        }  
    }//GEN-LAST:event_btnEditarOKActionPerformed

    private void btnEscluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscluirActionPerformed
        int linha = tblCliente.getSelectedRow();
        if(linha >= 0){
            clienteSelecionado = (Cliente) tblCliente.getValueAt(linha, 1);
            if(JOptionPane.showConfirmDialog(this, "Desejar realmente excluir?\nTodos os itens relacionados a esse cliente também serão excluídos.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                ((DefaultTableModel) tblCliente.getModel()).removeRow(linha);
                gerenciadorVIEW.getGerDominio().clienteExcluir(clienteSelecionado);  
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEscluirActionPerformed

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
    private javax.swing.JButton btnEscluir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbFiltrar;
    private javax.swing.JComboBox<String> cmbFiltrarOrdem;
    private javax.swing.JComboBox<String> cmbPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCadCliente;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEditando;
    private javax.swing.JLabel lblListCliente;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCadCliente;
    private javax.swing.JPanel pnlInformacoes;
    private javax.swing.JPanel pnlListCliente;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
