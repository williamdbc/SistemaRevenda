package VIEW;

import CONTROL.*;
import DOMINIO.*;
import java.text.ParseException;
import java.util.List;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;

public class CadVeiculoComprado extends javax.swing.JDialog {
    private GerenciadorVIEW gerenciadorVIEW;
    private Revenda revendaSelecionada;
    
    public CadVeiculoComprado(java.awt.Frame parent, boolean modal, GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;
        revendaSelecionada = null;  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCadVeiculoCmp = new javax.swing.JPanel();
        lblCadVeiculoCmp = new javax.swing.JLabel();
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
        lblVersao = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        cmbModelo = new javax.swing.JComboBox<>();
        cmbVersao = new javax.swing.JComboBox<>();
        btnAddVersao = new javax.swing.JButton();
        btnAddModelo = new javax.swing.JButton();
        btnAddMarca = new javax.swing.JButton();
        cmbAno = new javax.swing.JComboBox<>();
        pnlInformacoes = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        lblKM = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        txtKM = new javax.swing.JFormattedTextField();
        txtPlaca = new javax.swing.JFormattedTextField();
        pnlDadosCompra = new javax.swing.JPanel();
        lblFornecedor = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        cmbFornecedor = new javax.swing.JComboBox<>();
        lblEditando = new javax.swing.JLabel();
        pnlBotoes = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditarOK = new javax.swing.JButton();
        pnlListVeiculoCmp = new javax.swing.JPanel();
        cmbPesquisar = new javax.swing.JComboBox<>();
        cmbFiltrarOrdem = new javax.swing.JComboBox<>();
        txtPesquisar = new javax.swing.JTextField();
        cmbFiltrar = new javax.swing.JComboBox<>();
        lblListVeiculoCmp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculoCmp = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        btnDespesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblCadVeiculoCmp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadVeiculoCmp.setText("CADASTRO DE VEÍCULO COMPRADO");

        pnlFichaTecnica.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficha Técnica"));

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblAno.setText("Ano");

        lblMotor.setText("Motor");

        lblCombustivel.setText("Combustível");

        lblDirecao.setText("Direção");

        lblCambio.setText("Câmbio");

        cmbCombustivel.setEditable(true);
        cmbCombustivel.setEnabled(false);

        cmbCambio.setEditable(true);
        cmbCambio.setEnabled(false);

        cmbDirecao.setEditable(true);
        cmbDirecao.setEnabled(false);

        spnMotor.setModel(new javax.swing.SpinnerNumberModel(1.0f, null, null, 1.0f));
        spnMotor.setEnabled(false);

        lblVersao.setText("Versão");

        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        cmbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbModeloActionPerformed(evt);
            }
        });

        cmbVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVersaoActionPerformed(evt);
            }
        });

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

        btnAddMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/adicionar2.png"))); // NOI18N
        btnAddMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMarcaActionPerformed(evt);
            }
        });

        cmbAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFichaTecnicaLayout = new javax.swing.GroupLayout(pnlFichaTecnica);
        pnlFichaTecnica.setLayout(pnlFichaTecnicaLayout);
        pnlFichaTecnicaLayout.setHorizontalGroup(
            pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAno)
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModelo)
                                    .addComponent(lblMarca))
                                .addGap(10, 10, 10)
                                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblVersao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCombustivel)
                    .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMotor)
                            .addComponent(lblDirecao)
                            .addComponent(lblCambio))))
                .addGap(10, 10, 10)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbCombustivel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCambio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMotor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDirecao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFichaTecnicaLayout.setVerticalGroup(
            pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFichaTecnicaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMarca)
                        .addComponent(cmbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCombustivel)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblModelo)
                        .addComponent(lblCambio)
                        .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDirecao)
                        .addComponent(cmbDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVersao))
                    .addComponent(cmbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFichaTecnicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAno)
                        .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMotor))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlInformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        lblPlaca.setText("Placa do carro");

        lblCor.setText("Cor");

        lblKM.setText("KM");

        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        txtKM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKMActionPerformed(evt);
            }
        });

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***-****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlInformacoesLayout = new javax.swing.GroupLayout(pnlInformacoes);
        pnlInformacoes.setLayout(pnlInformacoesLayout);
        pnlInformacoesLayout.setHorizontalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKM))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addComponent(lblPlaca)
                        .addGap(12, 12, 12)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlInformacoesLayout.setVerticalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor))
                .addGap(15, 15, 15)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKM))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlDadosCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da compra"));

        lblFornecedor.setText("Fornecedor");

        lblValor.setText("Valor (R$)");

        lblData.setText("Data");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlDadosCompraLayout = new javax.swing.GroupLayout(pnlDadosCompra);
        pnlDadosCompra.setLayout(pnlDadosCompraLayout);
        pnlDadosCompraLayout.setHorizontalGroup(
            pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                        .addComponent(lblFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                        .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                                .addComponent(lblData)
                                .addGap(48, 48, 48)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                                .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68))))
        );
        pnlDadosCompraLayout.setVerticalGroup(
            pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFornecedor)
                    .addComponent(cmbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor))
                .addGap(15, 15, 15)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lblEditando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/alerta.png"))); // NOI18N
        lblEditando.setText("Você está editando um veiculo comprado nesse momento.");

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

        javax.swing.GroupLayout pnlCadVeiculoCmpLayout = new javax.swing.GroupLayout(pnlCadVeiculoCmp);
        pnlCadVeiculoCmp.setLayout(pnlCadVeiculoCmpLayout);
        pnlCadVeiculoCmpLayout.setHorizontalGroup(
            pnlCadVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadVeiculoCmpLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCadVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFichaTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCadVeiculoCmp)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditando))
                .addGap(18, 18, 18)
                .addGroup(pnlCadVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        pnlCadVeiculoCmpLayout.setVerticalGroup(
            pnlCadVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadVeiculoCmpLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCadVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadVeiculoCmpLayout.createSequentialGroup()
                        .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlDadosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadVeiculoCmpLayout.createSequentialGroup()
                        .addComponent(lblCadVeiculoCmp)
                        .addGap(15, 15, 15)
                        .addComponent(pnlFichaTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEditando)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", pnlCadVeiculoCmp);

        cmbPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo", "Versão", "Ano", "Cor", "KM", "Placa", "Fornecedor", "Valor compra", "Data compra" }));

        cmbFiltrarOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crescente", "Descrescente" }));

        cmbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo", "Versão", "Ano", "Cor", "KM", "Placa", "Fornecedor", "Valor compra", "Data compra" }));

        lblListVeiculoCmp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListVeiculoCmp.setText("LISTA DE VEÍCULOS COMPRADOS");

        tblVeiculoCmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Versão", "Ano", "Cor", "KM", "Placa", "Fornecedor", "Valor compra", "Data compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVeiculoCmp);

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

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/procurar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/filtrar2.png"))); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/venda.png"))); // NOI18N
        btnVender.setText("Vender");
        btnVender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/venda.png"))); // NOI18N
        btnDespesa.setText("Despesa");
        btnDespesa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListVeiculoCmpLayout = new javax.swing.GroupLayout(pnlListVeiculoCmp);
        pnlListVeiculoCmp.setLayout(pnlListVeiculoCmpLayout);
        pnlListVeiculoCmpLayout.setHorizontalGroup(
            pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                        .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListVeiculoCmpLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                        .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblListVeiculoCmp)
                            .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                                .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                                        .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                                        .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlListVeiculoCmpLayout.setVerticalGroup(
            pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblListVeiculoCmp)
                .addGap(14, 14, 14)
                .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                        .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(pnlListVeiculoCmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListVeiculoCmpLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Lista", pnlListVeiculoCmp);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private SortOrder tipoOrdem;
    
    private void cleanFields(){
        JComboBox[] listaComboBox = new JComboBox[]{cmbMarca, cmbModelo, cmbVersao, cmbAno, cmbCombustivel, cmbCambio, cmbDirecao, cmbFornecedor};
        JTextField[] listaTextField = new JTextField[]{txtPlaca, txtCor, txtKM, txtValor, txtData};
        
        FuncoesUteis.cleanComboBoxs(listaComboBox);
        FuncoesUteis.cleanTextFields(listaTextField);
        
        spnMotor.setValue(1);
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
        
        if(cmbModelo.getSelectedIndex() == -1){
            msgErro += "O campo 'Modelo' não pode estar vazio.\n";
        }
        
        if(cmbVersao.getSelectedIndex() == -1){
             msgErro += "O campo 'Versão' não pode estar vazio.\n";
        }
       
        if(cmbAno.getSelectedIndex() == -1){
             msgErro += "O campo 'Ano' não pode estar vazio.\n";
        }
        
        if(txtPlaca.getText().isBlank()){
             msgErro += "O campo 'Placa' não pode estar vazio.\n";
        }
        
        if(!FuncoesUteis.isPlaca(txtPlaca.getText())){
            msgErro += "O campo 'Placa' não é valido.\n";
        }

        if(txtCor.getText().isBlank()){
             msgErro += "O campo 'Cor' não pode estar vazio.\n";
        }
        
        if(FuncoesUteis.isInteger(txtCor.getText())){
             msgErro += "O campo 'Cor' não pode ser um número inteiro.\n";
        }

        if(txtKM.getText().isBlank()){
             msgErro += "O campo 'KM' não pode estar vazio.\n";
        }

        if(txtValor.getText().isBlank()){
             msgErro += "O campo 'Valor' não pode estar vazio.\n";
        } 
        
        if(!FuncoesUteis.isFloat(txtValor.getText())){
            msgErro += "O campo 'Valor' não é válido.\n";
        };
          
        if(cmbFornecedor.getSelectedIndex() == -1){
             msgErro += "O campo 'Fornecedor' não pode estar vazio.\n";
        }
        
        if(txtData.getText().isBlank()){
             msgErro += "O campo 'Data' não pode estar vazio.\n";
        }
        
        if(!msgErro.isBlank()){
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos.", JOptionPane.ERROR_MESSAGE);
            return false;
        } return true;  
    }
    
    private void carregarTabela(List<Revenda> listaVeiculosCmp){
        ((DefaultTableModel) tblVeiculoCmp.getModel()).setNumRows(0);
            
        for (Revenda revenda : listaVeiculosCmp ) {
            if(revenda.getValor_venda() == 0){
                ((DefaultTableModel)tblVeiculoCmp.getModel()).addRow(revenda.toArray_Compra());    
            }
        }
    }
    
    private boolean pesquisaValida(String pesquisa){
        if(cmbPesquisar.getSelectedIndex() == 0 && !FuncoesUteis.isInteger(pesquisa)){
            JOptionPane.showMessageDialog(this, "ID informado possui caracteres não permitidos.", "Erro ao pesquisar revenda", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        if(cmbPesquisar.getSelectedIndex() == 4 && !FuncoesUteis.isInteger(pesquisa)){
            JOptionPane.showMessageDialog(this, "Ano informado possui caracteres não permitidos.", "Erro ao pesquisar revenda", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        
        if(cmbPesquisar.getSelectedIndex() == 6 && !FuncoesUteis.isInteger(pesquisa)){
            JOptionPane.showMessageDialog(this, "Quilometragem informada possui caracteres não permitidos.", "Erro ao pesquisar revenda", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        
        if(cmbPesquisar.getSelectedIndex() == 9 && !FuncoesUteis.isFloat(pesquisa)){
            JOptionPane.showMessageDialog(this, "Valor informado possui caracteres não permitidos.", "Erro ao pesquisar revenda", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        
        if(cmbPesquisar.getSelectedIndex() == 10){
            if(!FuncoesUteis.isData(pesquisa)){
                JOptionPane.showMessageDialog(this, "Data informada é inválida. O formato deve ser 'XX/XX/XXXX'.", "Erro ao pesquisar data", JOptionPane.ERROR_MESSAGE  );
                return false;
            } else {
                try {
                pesquisa = FuncoesUteis.stringToStringSQL(pesquisa);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, ex, "Erro ao tentar converter data.", JOptionPane.ERROR_MESSAGE);
                return false;  
            }
            }
        }
        return true;
    }
    
    private void setFields(){
        cmbMarca.setSelectedItem(revendaSelecionada.getVeiculo().getVersao().getModelo().getMarca());
        cmbModelo.setSelectedItem(revendaSelecionada.getVeiculo().getVersao().getModelo());
        cmbVersao.setSelectedItem(revendaSelecionada.getVeiculo().getVersao());
        cmbAno.setSelectedItem(revendaSelecionada.getVeiculo());

        cmbCombustivel.setSelectedItem(revendaSelecionada.getVeiculo().getCombustivel());
        cmbCambio.setSelectedItem(revendaSelecionada.getVeiculo().getCambio());
        cmbDirecao.setSelectedItem(revendaSelecionada.getVeiculo().getDirecao());
        spnMotor.setValue(revendaSelecionada.getVeiculo().getMotor());

        txtPlaca.setText(revendaSelecionada.getPlaca());
        txtCor.setText(revendaSelecionada.getCor());
        txtKM.setText(String.valueOf(revendaSelecionada.getQuilometragem()));
        cmbFornecedor.setSelectedItem(revendaSelecionada.getFornecedor());
        txtValor.setText(String.valueOf(revendaSelecionada.getValor_compra()));
        txtData.setText(FuncoesUteis.dateToString(revendaSelecionada.getData_compra()));
    }
    

    private void updateFields(Veiculo objetoVeiculo, Fornecedor fornecedor, String placa, String cor, int km, 
                                Date data_compra, float valor_compra) throws ParseException{
        
        revendaSelecionada.setVeiculo(objetoVeiculo);
        revendaSelecionada.setFornecedor(fornecedor);
        revendaSelecionada.setPlaca(placa);
        revendaSelecionada.setCor(cor);
        revendaSelecionada.setQuilometragem(km);
        revendaSelecionada.setData_compra(data_compra);
        revendaSelecionada.setValor_compra(valor_compra);
    }
    
    
/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    private void btnAddVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVersaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddVersaoActionPerformed

    private void btnAddModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddModeloActionPerformed

    private void btnAddMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMarcaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tblVeiculoCmp.getSelectedRow();
        if(linha >= 0){
            jTabbedPane1.setSelectedIndex(0);
            botaoEditar();
       
            revendaSelecionada = (Revenda) tblVeiculoCmp.getValueAt(linha, 7);
            setFields();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String pesquisa = txtPesquisar.getText();

            if(pesquisa.isBlank()){
                carregarTabela(gerenciadorVIEW.getGerDominio().listar(Revenda.class));
            } else if(!pesquisaValida(pesquisa)){
                return;
            } else{
                carregarTabela(gerenciadorVIEW.getGerDominio().revendaPesquisar(pesquisa, cmbPesquisar.getSelectedIndex()));
            }
            
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "Erro ao pesquisar compra de veiculo", JOptionPane.ERROR_MESSAGE  );
        }    
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        switch(cmbFiltrarOrdem.getSelectedIndex()){
            case 0 -> tipoOrdem = SortOrder.ASCENDING;
            case 1 -> tipoOrdem = SortOrder.DESCENDING;
        }
        
        FuncoesUteis.ordenarTabela(tblVeiculoCmp, cmbFiltrar.getSelectedIndex(), tipoOrdem);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        int linha = tblVeiculoCmp.getSelectedRow();
        if ( linha >= 0 ) {
            revendaSelecionada = (Revenda) tblVeiculoCmp.getValueAt(linha, 7);
            gerenciadorVIEW.setRevenda(revendaSelecionada);
            gerenciadorVIEW.janelaCadVeiculoVendido();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        botaoCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarOKComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEditarOKComponentShown

    }//GEN-LAST:event_btnEditarOKComponentShown

    private void btnDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespesaActionPerformed
        int linha = tblVeiculoCmp.getSelectedRow();
        if ( linha >= 0 ) {
            revendaSelecionada = (Revenda) tblVeiculoCmp.getValueAt(linha, 7);
            gerenciadorVIEW.setRevenda(revendaSelecionada);
            gerenciadorVIEW.janelaListaDespesa();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnDespesaActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        Marca objetoMarca = (Marca) cmbMarca.getSelectedItem();
        if(objetoMarca != null){
            List <Modelo> listaModelos = objetoMarca.getModelos();
            gerenciadorVIEW.carregarGenerico(cmbModelo, listaModelos);
            cmbModelo.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void cmbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbModeloActionPerformed
        Modelo objetoModelo = (Modelo) cmbModelo.getSelectedItem();
        if(objetoModelo != null){
            List <Versao> listaVersoes = objetoModelo.getVersoes();
            gerenciadorVIEW.carregarGenerico(cmbVersao, listaVersoes);
            cmbVersao.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_cmbModeloActionPerformed

    private void cmbVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVersaoActionPerformed
        Versao objetoVersao = (Versao) cmbVersao.getSelectedItem();
        if(objetoVersao != null){
            List <Veiculo> listaVeiculos = objetoVersao.getVeiculos();
            gerenciadorVIEW.carregarGenerico(cmbAno, listaVeiculos);
            cmbAno.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_cmbVersaoActionPerformed

    private void cmbAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnoActionPerformed
        Veiculo objetoVeiculo = (Veiculo) cmbAno.getSelectedItem();
        if(objetoVeiculo != null){
            cmbCombustivel.setSelectedItem(objetoVeiculo.getCombustivel());
            cmbCambio.setSelectedItem(objetoVeiculo.getCambio());
            cmbDirecao.setSelectedItem(objetoVeiculo.getDirecao());
            spnMotor.setValue(objetoVeiculo.getMotor());   
        }
    }//GEN-LAST:event_cmbAnoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerenciadorVIEW.carregarComboBox(cmbMarca, Marca.class);
        gerenciadorVIEW.carregarComboBox(cmbFornecedor, Fornecedor.class);
        botaoCancelar();
    }//GEN-LAST:event_formComponentShown

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(checkFields()){
            try{
                Veiculo objetoVeiculo = (Veiculo) cmbAno.getSelectedItem();
                String placa = txtPlaca.getText();
                String cor = txtCor.getText();
                int km = Integer.parseInt(txtKM.getText());
                Fornecedor fornecedor = (Fornecedor) cmbFornecedor.getSelectedItem();
                Date data_compra = null;
                float valor_compra = Float.valueOf(txtValor.getText());
                data_compra = FuncoesUteis.stringToDate(txtData.getText());
                
                if(JOptionPane.showConfirmDialog(this, "Desejar realmente cadastrar essa compra?", "Cadastrar compra", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    gerenciadorVIEW.getGerDominio().inserirVeiculoComprado(objetoVeiculo, fornecedor, placa, cor, km, data_compra, valor_compra);
                    JOptionPane.showMessageDialog(this, "Veículo comprado inserido com sucesso.", "Cadastrar compra", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                }
            } catch (HibernateException | ParseException ex) {
                JOptionPane.showMessageDialog(this, ex, "Erro ao cadastrar a compra de um veículo.", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKMActionPerformed

    }//GEN-LAST:event_txtKMActionPerformed

    private void btnEditarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarOKActionPerformed
        if(checkFields()){
            try {
                Veiculo objetoVeiculo = (Veiculo) cmbAno.getSelectedItem();
                String placa = txtPlaca.getText();
                String cor = txtCor.getText();
                int km = Integer.parseInt(txtKM.getText());
                Fornecedor fornecedor = (Fornecedor) cmbFornecedor.getSelectedItem();
                Date data_compra = null;
                float valor_compra = Float.valueOf(txtValor.getText());
                data_compra = FuncoesUteis.stringToDate(txtData.getText());

                if(JOptionPane.showConfirmDialog(this, "Desejar realmente editar?\nTodos os itens relacionados a essa compra também serão editados.", "Confirmar edição", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    updateFields(objetoVeiculo, fornecedor, placa, cor, km, data_compra, valor_compra);


                    gerenciadorVIEW.getGerDominio().revendaAlterar(revendaSelecionada);  
                    JOptionPane.showMessageDialog(this, "Compra alterada com sucesso.", "Alterar compra", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                }
            }   catch (HibernateException | ParseException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Erro ao alterar compra.", JOptionPane.ERROR_MESSAGE);
            }
        }              
    }//GEN-LAST:event_btnEditarOKActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblVeiculoCmp.getSelectedRow();
        if(linha >= 0){
            revendaSelecionada = (Revenda) tblVeiculoCmp.getValueAt(linha, 7);
            if(JOptionPane.showConfirmDialog(this, "Desejar realmente excluir?\nTodos os itens relacionados a essa compra também serão excluídos.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                ((DefaultTableModel) tblVeiculoCmp.getModel()).removeRow(linha);
                gerenciadorVIEW.getGerDominio().revendaExcluir(revendaSelecionada);  
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

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
    private javax.swing.JButton btnDespesa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarOK;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cmbAno;
    private javax.swing.JComboBox<String> cmbCambio;
    private javax.swing.JComboBox<String> cmbCombustivel;
    private javax.swing.JComboBox<String> cmbDirecao;
    private javax.swing.JComboBox<String> cmbFiltrar;
    private javax.swing.JComboBox<String> cmbFiltrarOrdem;
    private javax.swing.JComboBox<String> cmbFornecedor;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbPesquisar;
    private javax.swing.JComboBox<String> cmbVersao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCadVeiculoCmp;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDirecao;
    private javax.swing.JLabel lblEditando;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblKM;
    private javax.swing.JLabel lblListVeiculoCmp;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCadVeiculoCmp;
    private javax.swing.JPanel pnlDadosCompra;
    private javax.swing.JPanel pnlFichaTecnica;
    private javax.swing.JPanel pnlInformacoes;
    private javax.swing.JPanel pnlListVeiculoCmp;
    private javax.swing.JSpinner spnMotor;
    private javax.swing.JTable tblVeiculoCmp;
    private javax.swing.JTextField txtCor;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtKM;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
