package VIEW;

import CONTROL.FuncoesUteis;
import CONTROL.GerenciadorVIEW;
import DOMINIO.Cliente;
import DOMINIO.Despesa;
import DOMINIO.Fornecedor;
import DOMINIO.Revenda;
import DOMINIO.Veiculo;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class ListaDespesa extends javax.swing.JDialog {
    private GerenciadorVIEW gerenciadorVIEW;
    private Revenda revendaSelecionada;
    private Despesa despesaSelecionada;
    
    public ListaDespesa(java.awt.Frame parent, boolean modal, GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;
        despesaSelecionada = null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMarca = new javax.swing.JPanel();
        lblAno = new javax.swing.JLabel();
        cmbVersao = new javax.swing.JComboBox<>();
        lblCor = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        cmbModelo = new javax.swing.JComboBox<>();
        cmbMarca = new javax.swing.JComboBox<>();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblVersao = new javax.swing.JLabel();
        cmbAno = new javax.swing.JComboBox<>();
        lblListDespesa = new javax.swing.JLabel();
        pnlInformacoes = new javax.swing.JPanel();
        lblNomeDesp = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        txtNomeDesp = new javax.swing.JTextField();
        lblResponsavel = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDespesa = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pnlBotoes = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditarOK = new javax.swing.JButton();
        lblEditando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pnlMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Veículo"));

        lblAno.setText("Ano");

        cmbVersao.setEditable(true);
        cmbVersao.setEnabled(false);

        lblCor.setText("Cor");

        lblPlaca.setText("Placa");

        txtPlaca.setEnabled(false);

        txtCor.setEnabled(false);

        cmbModelo.setEditable(true);
        cmbModelo.setEnabled(false);

        cmbMarca.setEditable(true);
        cmbMarca.setEnabled(false);

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblVersao.setText("Versão");

        cmbAno.setEditable(true);
        cmbAno.setEnabled(false);

        javax.swing.GroupLayout pnlMarcaLayout = new javax.swing.GroupLayout(pnlMarca);
        pnlMarca.setLayout(pnlMarcaLayout);
        pnlMarcaLayout.setHorizontalGroup(
            pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarca)
                    .addComponent(lblModelo)
                    .addComponent(lblVersao))
                .addGap(12, 12, 12)
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCor)
                    .addComponent(lblAno))
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMarcaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMarcaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        pnlMarcaLayout.setVerticalGroup(
            pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarcaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAno)
                    .addComponent(lblMarca)
                    .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVersao))
                .addGap(10, 10, 10))
        );

        lblListDespesa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListDespesa.setText("LISTA DE DESPESAS");

        pnlInformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações despesa"));

        lblNomeDesp.setText("Nome despesa");

        lblValor.setText("Valor (R$)");

        lblData.setText("Data");

        lblResponsavel.setText("Responsável");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlInformacoesLayout = new javax.swing.GroupLayout(pnlInformacoes);
        pnlInformacoes.setLayout(pnlInformacoesLayout);
        pnlInformacoesLayout.setHorizontalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblNomeDesp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeDesp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(lblValor))
                .addGap(12, 12, 12)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlInformacoesLayout.setVerticalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeDesp)
                    .addComponent(txtNomeDesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor)
                    .addComponent(lblResponsavel)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tblDespesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Valor", "Data", "Responsável"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDespesa);

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
        btnEditarOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarOKActionPerformed(evt);
            }
        });
        pnlBotoes.add(btnEditarOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 0, -1, 25));

        lblEditando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/alerta.png"))); // NOI18N
        lblEditando.setText("Você está editando uma versão nesse momento.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblListDespesa)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblEditando)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblListDespesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEditando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private void setVeiculoFields(){
        cmbMarca.setSelectedItem(revendaSelecionada.getVeiculo().getVersao().getModelo().getMarca());
        cmbModelo.setSelectedItem(revendaSelecionada.getVeiculo().getVersao().getModelo());
        cmbVersao.setSelectedItem(revendaSelecionada.getVeiculo().getVersao());
        cmbAno.setSelectedItem(revendaSelecionada.getVeiculo());
        
        txtPlaca.setText(revendaSelecionada.getPlaca());
        txtCor.setText(revendaSelecionada.getCor());
    }
    
    private boolean checkFields(){
        String msgErro = "";
        if(txtNomeDesp.getText().isBlank()){
            msgErro += "O campo 'Despesa' não pode estar vazio.\n";
        }
        
        if(txtData.getText().isBlank()){
            msgErro += "O campo 'Data' não pode estar vazio.\n";
        }

        if(txtResponsavel.getText().isBlank()){
            msgErro += "O campo 'Responsável' não pode estar vazio.\n";
        }
        
        if(txtValor.getText().isBlank()){
            msgErro += "O campo 'Valor' não pode estar vazio.\n";
        }
        
        if(!FuncoesUteis.isFloat(txtValor.getText())){
            msgErro += "O campo 'Valor' não é válido.\n";
        };

        if(!msgErro.isBlank()){
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos.", JOptionPane.ERROR_MESSAGE);
            return false;
        } return true;  
    }
    
    private void cleanFields(){
        txtNomeDesp.setText("");
        txtResponsavel.setText("");
        txtData.setText("");
        txtValor.setText("");
    }
    
    private void carregarTabela(List<Despesa> listaDespesas){
        ((DefaultTableModel) tblDespesa.getModel()).setNumRows(0);
            
        for (Despesa despesa : listaDespesas ) {
            ((DefaultTableModel)tblDespesa.getModel()).addRow(despesa.toArray());     
        }
    }
    
    private void botaoEditar(){
        FuncoesUteis.isEditando(true, btnLimpar, btnEditarOK, btnCancelar, lblEditando);
    }
    
    private void botaoCancelar(){
        FuncoesUteis.isEditando(false, btnLimpar, btnEditarOK, btnCancelar, lblEditando);
        cleanFields();
    }

    private void setFields(){
        txtNomeDesp.setText(despesaSelecionada.getNome_despesa());
        txtResponsavel.setText(despesaSelecionada.getResponsavel());
        txtData.setText(FuncoesUteis.dateToString(despesaSelecionada.getData_despesa()));
        txtValor.setText(String.valueOf(despesaSelecionada.getValor_despesa()));
    }
    
    private void updateFields(String nome_despesa, Date data, String responsavel, float valor) throws ParseException{
        despesaSelecionada.setNome_despesa(nome_despesa);
        despesaSelecionada.setData_despesa(data);
        despesaSelecionada.setResponsavel(responsavel);
        despesaSelecionada.setValor_despesa(valor);
    }
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tblDespesa.getSelectedRow();
            if(linha >= 0){
                botaoEditar();

                despesaSelecionada = (Despesa) tblDespesa.getValueAt(linha, 0);
                setFields();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
            }   
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        botaoCancelar();
        revendaSelecionada = gerenciadorVIEW.getRevenda();
        
        if(revendaSelecionada != null){
            setVeiculoFields();
        }
        carregarTabela(revendaSelecionada.getDespesas());
    }//GEN-LAST:event_formComponentShown

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
     int linha = tblDespesa.getSelectedRow();
        if(linha >= 0){
            despesaSelecionada = (Despesa) tblDespesa.getValueAt(linha, 0);
            if(JOptionPane.showConfirmDialog(this, "Desejar realmente excluir?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                ((DefaultTableModel) tblDespesa.getModel()).removeRow(linha);
                gerenciadorVIEW.getGerDominio().despesaExcluir(despesaSelecionada);  
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(revendaSelecionada != null){
            if(checkFields()){
                try {
                    String nomeDespesa = txtNomeDesp.getText();
                    Date data_despesa = FuncoesUteis.stringToDate(txtData.getText());
                    String responsavel = txtResponsavel.getText();
                    float valor_despesa = Float.valueOf(txtValor.getText());

                    if(JOptionPane.showConfirmDialog(this, "Desejar realmente cadastrar essa despesa?", "Cadastrar despesa", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                        gerenciadorVIEW.getGerDominio().inserirDespesa(revendaSelecionada, nomeDespesa, valor_despesa, data_despesa, responsavel);
                        JOptionPane.showMessageDialog(this, "Despesa cadastrada com sucesso.", "Cadastrar despesa", JOptionPane.INFORMATION_MESSAGE);
                        botaoCancelar();
                    }
                    carregarTabela(revendaSelecionada.getDespesas());
                } catch (HibernateException | ParseException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Erro ao cadastrar despesa de um veículo.", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
             JOptionPane.showMessageDialog(this, "Você deve selecionar um veículo para vender.", "Erro ao vender veículo", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        botaoCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarOKActionPerformed
        if(checkFields()){
            try {
                String nomeDespesa = txtNomeDesp.getText();
                Date data_despesa = FuncoesUteis.stringToDate(txtData.getText());
                String responsavel = txtResponsavel.getText();
                float valor_despesa = Float.valueOf(txtValor.getText());

                if(JOptionPane.showConfirmDialog(this, "Desejar realmente editar?", "Confirmar edição", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    updateFields(nomeDespesa, data_despesa, responsavel, valor_despesa);

                    gerenciadorVIEW.getGerDominio().despesaAlterar(despesaSelecionada);  
                    JOptionPane.showMessageDialog(this, "Despesa alterada com sucesso.", "Alterar despesa", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                }
            }   catch (HibernateException | ParseException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Erro ao alterar despesa.", JOptionPane.ERROR_MESSAGE);
            }
        }              
    }//GEN-LAST:event_btnEditarOKActionPerformed

    
    // <editor-fold defaultstate="collapsed" desc="Declaração de variáveis - Java Swing"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarOK;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cmbAno;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbVersao;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEditando;
    private javax.swing.JLabel lblListDespesa;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNomeDesp;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlInformacoes;
    private javax.swing.JPanel pnlMarca;
    private javax.swing.JTable tblDespesa;
    private javax.swing.JTextField txtCor;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNomeDesp;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
