package VIEW;

import CONTROL.*;
import DOMINIO.*;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class CadVeiculo extends javax.swing.JDialog {
    private GerenciadorVIEW gerenciadorVIEW;
    private Veiculo veiculoSelecionado;
    
    public CadVeiculo(java.awt.Frame parent, boolean modal, GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;
        veiculoSelecionado = null;
        btnEditarOK.setVisible(false);
        btnCancelar.setVisible(false);
        lblEditando.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCadVeiculo = new javax.swing.JPanel();
        pnlOutros = new javax.swing.JPanel();
        chkAirbag = new javax.swing.JCheckBox();
        chkAlarme = new javax.swing.JCheckBox();
        chkFreiosABS = new javax.swing.JCheckBox();
        chkArCondicionado = new javax.swing.JCheckBox();
        chkVidroEletrico = new javax.swing.JCheckBox();
        chkTravaEletrica = new javax.swing.JCheckBox();
        lblCadVeiculo = new javax.swing.JLabel();
        pnlFichaTecnica = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblMotor = new javax.swing.JLabel();
        lblCombustivel = new javax.swing.JLabel();
        lblDirecao = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        cmbCombustivel = new javax.swing.JComboBox<>();
        cmbCambio = new javax.swing.JComboBox<>();
        cmbDirecao = new javax.swing.JComboBox<>();
        spnMotor = new javax.swing.JSpinner();
        cmbModelo = new javax.swing.JComboBox<>();
        cmbMarca = new javax.swing.JComboBox<>();
        spnAno = new javax.swing.JSpinner();
        btnAddVersao = new javax.swing.JButton();
        btnAddModelo = new javax.swing.JButton();
        cmbVersao = new javax.swing.JComboBox<>();
        lblVersao = new javax.swing.JLabel();
        btnAddMarca = new javax.swing.JButton();
        lblEditando = new javax.swing.JLabel();
        pnlBotoes = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditarOK = new javax.swing.JButton();
        pnlListVeiculo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();
        cmbFiltrar = new javax.swing.JComboBox<>();
        cmbFiltrarOrdem = new javax.swing.JComboBox<>();
        txtPesquisar = new javax.swing.JTextField();
        cmbPesquisar = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblListVeiculo = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTabbedPane1.setName(""); // NOI18N

        pnlOutros.setBorder(javax.swing.BorderFactory.createTitledBorder("Outros"));

        chkAirbag.setText("Airbag");

        chkAlarme.setText("Alarme");

        chkFreiosABS.setText("Freios ABS");

        chkArCondicionado.setText("Ar-condicionado");

        chkVidroEletrico.setText("Vidro elétrico");

        chkTravaEletrica.setText("Trava elétrica");

        javax.swing.GroupLayout pnlOutrosLayout = new javax.swing.GroupLayout(pnlOutros);
        pnlOutros.setLayout(pnlOutrosLayout);
        pnlOutrosLayout.setHorizontalGroup(
            pnlOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutrosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOutrosLayout.createSequentialGroup()
                        .addGroup(pnlOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkFreiosABS)
                            .addComponent(chkAlarme))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOutrosLayout.createSequentialGroup()
                        .addComponent(chkAirbag)
                        .addGap(52, 52, 52)))
                .addGroup(pnlOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkVidroEletrico)
                    .addComponent(chkTravaEletrica)
                    .addComponent(chkArCondicionado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOutrosLayout.setVerticalGroup(
            pnlOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutrosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAirbag)
                    .addComponent(chkArCondicionado))
                .addGap(15, 15, 15)
                .addGroup(pnlOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAlarme)
                    .addComponent(chkVidroEletrico))
                .addGap(15, 15, 15)
                .addGroup(pnlOutrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFreiosABS)
                    .addComponent(chkTravaEletrica))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lblCadVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadVeiculo.setText("CADASTRO DE VEÍCULO");

        pnlFichaTecnica.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha Técnica"));

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblAno.setText("Ano");

        lblMotor.setText("Motor");

        lblCombustivel.setText("Combustível");

        lblDirecao.setText("Direção");

        lblCambio.setText("Câmbio");

        cmbCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Álcool", "Diesel", "Flex", "Gasolina", "Hibrído", "Elétrico" }));
        cmbCombustivel.setSelectedIndex(3);

        cmbCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automático", "Manual", "Semi-automático" }));
        cmbCambio.setSelectedIndex(1);

        cmbDirecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assistida", "Elétrica", "Hidraulica", "Mecânica" }));
        cmbDirecao.setSelectedIndex(3);

        spnMotor.setModel(new javax.swing.SpinnerNumberModel(1.0f, null, null, 0.1f));

        cmbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModeloActionPerformed(evt);
            }
        });

        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        spnAno.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2023, 1));

        btnAddVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/adicionar2.png"))); // NOI18N
        btnAddVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVersaoActionPerformed(evt);
            }
        });

        btnAddModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/adicionar2.png"))); // NOI18N
        btnAddModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddModeloActionPerformed(evt);
            }
        });

        lblVersao.setText("Versão");
        lblVersao.setMaximumSize(new java.awt.Dimension(32, 16));

        btnAddMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/adicionar2.png"))); // NOI18N
        btnAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFichaTecnicaLayout = new javax.swing.GroupLayout(pnlFichaTecnica);
        pnlFichaTecnica.setLayout(pnlFichaTecnicaLayout);
        pnlFichaTecnicaLayout.setHorizontalGroup(
            pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo)
                            .addComponent(lblMarca)
                            .addComponent(lblAno))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFichaTecnicaLayout.createSequentialGroup()
                        .addComponent(lblVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addComponent(cmbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMotor)
                            .addComponent(lblCambio)
                            .addComponent(lblDirecao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbCambio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbDirecao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addComponent(lblCombustivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(cmbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        pnlFichaTecnicaLayout.setVerticalGroup(
            pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarca)
                            .addComponent(cmbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCombustivel)
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelo)
                            .addComponent(lblCambio)
                            .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addComponent(btnAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDirecao)
                    .addComponent(btnAddVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMotor)
                        .addComponent(spnMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAno)
                        .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblEditando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/alerta.png"))); // NOI18N
        lblEditando.setText("Você está editando um veículo nesse momento.");

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

        javax.swing.GroupLayout pnlCadVeiculoLayout = new javax.swing.GroupLayout(pnlCadVeiculo);
        pnlCadVeiculo.setLayout(pnlCadVeiculoLayout);
        pnlCadVeiculoLayout.setHorizontalGroup(
            pnlCadVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadVeiculoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCadVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadVeiculoLayout.createSequentialGroup()
                        .addComponent(lblCadVeiculo)
                        .addContainerGap())
                    .addGroup(pnlCadVeiculoLayout.createSequentialGroup()
                        .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCadVeiculoLayout.createSequentialGroup()
                        .addComponent(pnlFichaTecnica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlCadVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadVeiculoLayout.createSequentialGroup()
                                .addComponent(pnlOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadVeiculoLayout.createSequentialGroup()
                                .addComponent(lblEditando)
                                .addContainerGap())))))
        );
        pnlCadVeiculoLayout.setVerticalGroup(
            pnlCadVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadVeiculoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblCadVeiculo)
                .addGap(10, 10, 10)
                .addGroup(pnlCadVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFichaTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCadVeiculoLayout.createSequentialGroup()
                        .addComponent(pnlOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEditando)))
                .addGap(20, 20, 20)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", pnlCadVeiculo);

        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Versão", "Ano", "Combústivel", "Câmbio", "Direção", "Motor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVeiculo);

        cmbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo", "Versão", "Ano", "Câmbio", "Combústivel", "Direção", "Motor" }));

        cmbFiltrarOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crescente", "Decrescente" }));

        cmbPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo", "Versão", "Ano", "Combústivel", "Câmbio", "Direção", "Motor" }));

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

        lblListVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListVeiculo.setText("LISTA DE VEÍCULOS");

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

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/informacao.png"))); // NOI18N
        btnInfo.setText("Info");
        btnInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListVeiculoLayout = new javax.swing.GroupLayout(pnlListVeiculo);
        pnlListVeiculo.setLayout(pnlListVeiculoLayout);
        pnlListVeiculoLayout.setHorizontalGroup(
            pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListVeiculoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlListVeiculoLayout.createSequentialGroup()
                        .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblListVeiculo)
                            .addGroup(pnlListVeiculoLayout.createSequentialGroup()
                                .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlListVeiculoLayout.createSequentialGroup()
                                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlListVeiculoLayout.createSequentialGroup()
                                        .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlListVeiculoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(15, 15, 15)
                        .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
        pnlListVeiculoLayout.setVerticalGroup(
            pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListVeiculoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblListVeiculo)
                .addGap(10, 10, 10)
                .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlListVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlListVeiculoLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Lista", pnlListVeiculo);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
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
        JComboBox[] listaComboBox = new JComboBox[]{cmbMarca, cmbModelo, cmbVersao, cmbCambio, cmbCombustivel, cmbDirecao};
        JCheckBox[] listaCheckBox = new JCheckBox[]{chkAirbag, chkAlarme, chkArCondicionado, chkFreiosABS, chkTravaEletrica, chkVidroEletrico};
        
        FuncoesUteis.cleanComboBoxs(listaComboBox);
        FuncoesUteis.cleanCheckBoxs(listaCheckBox);
        
        spnAno.setValue(2000);
        spnMotor.setValue(1);
    } 
    
    private boolean checkFields(){
        String msgErro = "";
        if(cmbMarca.getSelectedIndex() == -1){
            msgErro += "O campo 'Marca' não pode estar vazio.\n";
        }
        
        if(cmbModelo.getSelectedIndex() == -1){
            msgErro += "O campo 'Modelo' não pode estar vazio.\n";
        }
        
        if(cmbVersao.getSelectedIndex() == -1){
             msgErro += "O campo 'Versão' não pode estar vazio.\n";
        }
        
        if(cmbCombustivel.getSelectedIndex() == -1){
            msgErro += "O campo 'Combustível' não pode estar vazio.\n";
        }
        
        if(cmbCambio.getSelectedIndex() == -1){
            msgErro += "O campo 'Câmbio' não pode estar vazio.\n";
        }
        
        if(cmbDirecao.getSelectedIndex() == -1){
             msgErro += "O campo 'Direção' não pode estar vazio.\n";
        }

        if(!msgErro.isBlank()){
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos.", JOptionPane.ERROR_MESSAGE);
            return false;
        } return true;  
    }
    
    private void carregarTabela(List<Veiculo> listaVeiculos){
        ((DefaultTableModel) tblVeiculo.getModel()).setNumRows(0);
            
        for (Veiculo veiculo : listaVeiculos ) {
            ((DefaultTableModel)tblVeiculo.getModel()).addRow(veiculo.toArray());     
        }
    }
    
    private boolean pesquisaValida(String pesquisa){
        if(cmbPesquisar.getSelectedIndex() == 0 && !FuncoesUteis.isInteger(pesquisa)){
            JOptionPane.showMessageDialog(this, "ID informado possui caracteres não permitidos.", "Erro ao pesquisar modelo", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        if(cmbPesquisar.getSelectedIndex() == 4 && !FuncoesUteis.isInteger(pesquisa)){
            JOptionPane.showMessageDialog(this, "Ano informado possui caracteres não permitidos.", "Erro ao pesquisar modelo", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        
        if(cmbPesquisar.getSelectedIndex() == 8 && !FuncoesUteis.isFloat(pesquisa)){
            JOptionPane.showMessageDialog(this, "Motor informado possui caracteres não permitidos.", "Erro ao pesquisar modelo", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        return true;
    }
    
    private void setFields(){
        cmbMarca.setSelectedItem(veiculoSelecionado.getVersao().getModelo().getMarca());
        cmbModelo.setSelectedItem(veiculoSelecionado.getVersao().getModelo());
        cmbVersao.setSelectedItem(veiculoSelecionado.getVersao());
        spnAno.setValue(veiculoSelecionado.getAno());
        
        cmbCombustivel.setSelectedItem(veiculoSelecionado.getCombustivel());
        cmbCambio.setSelectedItem(veiculoSelecionado.getCambio());
        cmbDirecao.setSelectedItem(veiculoSelecionado.getDirecao());
        spnMotor.setValue(veiculoSelecionado.getMotor());
        
        chkAirbag.setSelected(veiculoSelecionado.isAirbag());
        chkAlarme.setSelected(veiculoSelecionado.isAlarme());
        chkArCondicionado.setSelected(veiculoSelecionado.isAr_condicionado());
        chkFreiosABS.setSelected(veiculoSelecionado.isFreios_abs());
        chkTravaEletrica.setSelected(veiculoSelecionado.isTrava_eletrica());
        chkVidroEletrico.setSelected(veiculoSelecionado.isVidro_eletrico());
    }
    
    private void updateFields(Versao objetoVersao, int ano, String combustivel, String cambio, String direcao, float motor, boolean airbag, boolean alarme, 
                            boolean ar_condicionado, boolean freios_abs, boolean trava_eletrica, boolean vidro_eletrico) {
        
        veiculoSelecionado.setVersao(objetoVersao);
        veiculoSelecionado.setAno(ano);
        veiculoSelecionado.setCombustivel(combustivel);
        veiculoSelecionado.setCambio(cambio);
        veiculoSelecionado.setDirecao(direcao);
        veiculoSelecionado.setMotor(motor);
        veiculoSelecionado.setAirbag(airbag);
        veiculoSelecionado.setAlarme(alarme);
        veiculoSelecionado.setAr_condicionado(ar_condicionado);
        veiculoSelecionado.setFreios_abs(freios_abs);
        veiculoSelecionado.setTrava_eletrica(trava_eletrica);
        veiculoSelecionado.setVidro_eletrico(vidro_eletrico);
}
      
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private void btnAddVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVersaoActionPerformed
        gerenciadorVIEW.janelaCadVersao();
    }//GEN-LAST:event_btnAddVersaoActionPerformed

    private void btnAddModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddModeloActionPerformed
        gerenciadorVIEW.janelaCadModelo();
    }//GEN-LAST:event_btnAddModeloActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        switch(cmbFiltrarOrdem.getSelectedIndex()){
            case 0 -> tipoOrdem = SortOrder.ASCENDING;
            case 1 -> tipoOrdem = SortOrder.DESCENDING;
        }
        
        FuncoesUteis.ordenarTabela(tblVeiculo, cmbFiltrar.getSelectedIndex(), tipoOrdem);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String pesquisa = txtPesquisar.getText();

            if(pesquisa.isBlank()){
                carregarTabela(gerenciadorVIEW.getGerDominio().listar(Veiculo.class));
            } else if(!pesquisaValida(pesquisa)){
                return;
            } else{
                carregarTabela(gerenciadorVIEW.getGerDominio().veiculoPesquisar(pesquisa, cmbPesquisar.getSelectedIndex()));
            }
            
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "Erro ao pesquisar veículo", JOptionPane.ERROR_MESSAGE  );
        } 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tblVeiculo.getSelectedRow();
        if(linha >= 0){
            jTabbedPane1.setSelectedIndex(0);
            botaoEditar();
       
            veiculoSelecionado = (Veiculo) tblVeiculo.getValueAt(linha, 4);
            setFields();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        botaoCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarOKComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEditarOKComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarOKComponentShown

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcaActionPerformed
       gerenciadorVIEW.janelaCadMarca();
    }//GEN-LAST:event_btnAddMarcaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerenciadorVIEW.carregarComboBox(cmbMarca, Marca.class);
        botaoCancelar();
    }//GEN-LAST:event_formComponentShown

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
      if(checkFields()){
            try{
                Versao objetoVersao = (Versao) cmbVersao.getSelectedItem();
                int ano = Integer.valueOf(spnAno.getValue().toString());
                String combustivel = cmbCombustivel.getSelectedItem().toString();
                String cambio = cmbCambio.getSelectedItem().toString();
                String direcao = cmbDirecao.getSelectedItem().toString();
                float motor = Float.valueOf(spnMotor.getValue().toString());

                boolean airbag = chkAirbag.isSelected();
                boolean alarme = chkAlarme.isSelected();
                boolean ar_condicionado = chkArCondicionado.isSelected();
                boolean freios_abs = chkFreiosABS.isSelected();
                boolean trava_eletrica = chkTravaEletrica.isSelected();
                boolean vidro_eletrico = chkVidroEletrico.isSelected();
                
                if(JOptionPane.showConfirmDialog(this, "Desejar realmente cadastrar esse veículo?", "Cadastrar veículo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    gerenciadorVIEW.getGerDominio().inserirVeiculo(objetoVersao, ano, combustivel, cambio, direcao, motor, airbag, alarme, ar_condicionado, freios_abs, trava_eletrica, vidro_eletrico);
                    JOptionPane.showMessageDialog(this, "Veiculo cadastrado com sucesso.", "Cadsatrar veiculo", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                }
            } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "Erro ao cadastrar veículo.", JOptionPane.ERROR_MESSAGE);
            }  
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cmbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModeloActionPerformed
        Modelo objetoModelo = (Modelo) cmbModelo.getSelectedItem();
        if(objetoModelo != null){
            List <Versao> listaVersoes = objetoModelo.getVersoes();
            gerenciadorVIEW.carregarGenerico(cmbVersao, listaVersoes);
            cmbVersao.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_cmbModeloActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        Marca objetoMarca = (Marca) cmbMarca.getSelectedItem();
        if(objetoMarca != null){
            List <Modelo> listaModelos = objetoMarca.getModelos();
            gerenciadorVIEW.carregarGenerico(cmbModelo, listaModelos);
            cmbModelo.setSelectedIndex(-1);
        }

    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblVeiculo.getSelectedRow();
        if(linha >= 0){
            veiculoSelecionado = (Veiculo) tblVeiculo.getValueAt(linha, 4);
            if(JOptionPane.showConfirmDialog(this, "Desejar realmente excluir?\nTodos os itens relacionados a esse veículo também serão excluídos.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                ((DefaultTableModel) tblVeiculo.getModel()).removeRow(linha);
                gerenciadorVIEW.getGerDominio().veiculoExcluir(veiculoSelecionado);  
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarOKActionPerformed
        if(checkFields()){
            try {
                Versao objetoVersao = (Versao) cmbVersao.getSelectedItem();
                int ano = Integer.valueOf(spnAno.getValue().toString());
                String combustivel = cmbCombustivel.getSelectedItem().toString();
                String cambio = cmbCambio.getSelectedItem().toString();
                String direcao = cmbDirecao.getSelectedItem().toString();
                float motor = Float.valueOf(spnMotor.getValue().toString());

                boolean airbag = chkAirbag.isSelected();
                boolean alarme = chkAlarme.isSelected();
                boolean ar_condicionado = chkArCondicionado.isSelected();
                boolean freios_abs = chkFreiosABS.isSelected();
                boolean trava_eletrica = chkTravaEletrica.isSelected();
                boolean vidro_eletrico = chkVidroEletrico.isSelected();

                if(JOptionPane.showConfirmDialog(this, "Desejar realmente editar?\nTodos os itens relacionados a esse veículo também serão editados.", "Confirmar edição", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    updateFields(objetoVersao, ano, combustivel, cambio, direcao, motor, airbag, alarme, 
                            ar_condicionado, freios_abs, trava_eletrica, vidro_eletrico);


                    gerenciadorVIEW.getGerDominio().veiculoAlterar(veiculoSelecionado);  
                    JOptionPane.showMessageDialog(this, "Veículo alterado com sucesso.", "Alterar veículo", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                }
            }   catch (HibernateException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Erro ao alterar veículo.", JOptionPane.ERROR_MESSAGE);
            }
        }              
    }//GEN-LAST:event_btnEditarOKActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        botaoCancelar();
    }//GEN-LAST:event_btnNovoActionPerformed
 
    
    // <editor-fold defaultstate="collapsed" desc="Declaração de variáveis - Java Swing"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMarca;
    private javax.swing.JButton btnAddModelo;
    private javax.swing.JButton btnAddVersao;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarOK;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox chkAirbag;
    private javax.swing.JCheckBox chkAlarme;
    private javax.swing.JCheckBox chkArCondicionado;
    private javax.swing.JCheckBox chkFreiosABS;
    private javax.swing.JCheckBox chkTravaEletrica;
    private javax.swing.JCheckBox chkVidroEletrico;
    private javax.swing.JComboBox<String> cmbCambio;
    private javax.swing.JComboBox<String> cmbCombustivel;
    private javax.swing.JComboBox<String> cmbDirecao;
    private javax.swing.JComboBox<String> cmbFiltrar;
    private javax.swing.JComboBox<String> cmbFiltrarOrdem;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbPesquisar;
    private javax.swing.JComboBox<String> cmbVersao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCadVeiculo;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblDirecao;
    private javax.swing.JLabel lblEditando;
    private javax.swing.JLabel lblListVeiculo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCadVeiculo;
    private javax.swing.JPanel pnlFichaTecnica;
    private javax.swing.JPanel pnlListVeiculo;
    private javax.swing.JPanel pnlOutros;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JSpinner spnMotor;
    private javax.swing.JTable tblVeiculo;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
