package VIEW;

import CONTROL.*;
import DOMINIO.*;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;


public class CadVeiculoVendido extends javax.swing.JDialog {
    private GerenciadorVIEW gerenciadorVIEW;
    private Revenda revendaSelecionada;
 
    public CadVeiculoVendido(java.awt.Frame parent, boolean modal, GerenciadorVIEW gerVIEW) {
        initComponents();
        this.gerenciadorVIEW = gerVIEW;
        revendaSelecionada = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlCadVeiculoVnd = new javax.swing.JPanel();
        kbkCadVeiculoVnd = new javax.swing.JLabel();
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
        txtPlaca = new javax.swing.JTextField();
        txtKM = new javax.swing.JFormattedTextField();
        pnlDadosCompra = new javax.swing.JPanel();
        lblFornecedor4 = new javax.swing.JLabel();
        lblValor4 = new javax.swing.JLabel();
        lblData4 = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        ftxtData_compra = new javax.swing.JFormattedTextField();
        lblEditando = new javax.swing.JLabel();
        pnlCliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblValorVenda = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        lblDataVenda = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        txtDataVenda = new javax.swing.JFormattedTextField();
        pnlBotoes = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEditarOK = new javax.swing.JButton();
        pnlListVeiculoVnd = new javax.swing.JPanel();
        cmbPesquisar = new javax.swing.JComboBox<>();
        cmbFiltrarOrdem = new javax.swing.JComboBox<>();
        txtPesquisar = new javax.swing.JTextField();
        cmbFiltrar = new javax.swing.JComboBox<>();
        lblListVeiculoVnd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculoVnd = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPane1ComponentShown(evt);
            }
        });

        kbkCadVeiculoVnd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kbkCadVeiculoVnd.setText("CADASTRO DE VEÍCULO VENDIDO");

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

        cmbMarca.setEditable(true);
        cmbMarca.setEnabled(false);

        cmbModelo.setEditable(true);
        cmbModelo.setEnabled(false);

        cmbVersao.setEditable(true);
        cmbVersao.setEnabled(false);

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

        cmbAno.setEditable(true);
        cmbAno.setEnabled(false);

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

        lblPlaca.setText("Placa");

        lblCor.setText("Cor");

        lblKM.setText("KM");

        txtCor.setEnabled(false);

        txtPlaca.setEnabled(false);

        txtKM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtKM.setEnabled(false);

        javax.swing.GroupLayout pnlInformacoesLayout = new javax.swing.GroupLayout(pnlInformacoes);
        pnlInformacoes.setLayout(pnlInformacoesLayout);
        pnlInformacoesLayout.setHorizontalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInformacoesLayout.createSequentialGroup()
                        .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKM)
                            .addComponent(lblPlaca))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtKM))
                .addGap(20, 20, 20))
        );
        pnlInformacoesLayout.setVerticalGroup(
            pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlaca))
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

        lblFornecedor4.setText("Fornecedor");

        lblValor4.setText("Valor (R$)");

        lblData4.setText("Data");

        txtValorCompra.setEnabled(false);

        txtFornecedor.setEnabled(false);

        try {
            ftxtData_compra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtData_compra.setEnabled(false);

        javax.swing.GroupLayout pnlDadosCompraLayout = new javax.swing.GroupLayout(pnlDadosCompra);
        pnlDadosCompra.setLayout(pnlDadosCompraLayout);
        pnlDadosCompraLayout.setHorizontalGroup(
            pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                        .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData4)
                            .addComponent(lblFornecedor4))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtData_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlDadosCompraLayout.setVerticalGroup(
            pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosCompraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFornecedor4))
                .addGap(15, 15, 15)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor4))
                .addGap(15, 15, 15)
                .addGroup(pnlDadosCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtData_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lblEditando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/16px/alerta.png"))); // NOI18N
        lblEditando.setText("Você está editando um veiculo comprado nesse momento.");

        pnlCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        lblCliente.setText("Cliente");

        lblValorVenda.setText("Valor venda");

        txtValorVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorVendaActionPerformed(evt);
            }
        });

        lblDataVenda.setText("Data");

        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente)
                    .addComponent(lblValorVenda)
                    .addComponent(lblDataVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorVenda)
                    .addGroup(pnlClienteLayout.createSequentialGroup()
                        .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDataVenda)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pnlCadVeiculoVndLayout = new javax.swing.GroupLayout(pnlCadVeiculoVnd);
        pnlCadVeiculoVnd.setLayout(pnlCadVeiculoVndLayout);
        pnlCadVeiculoVndLayout.setHorizontalGroup(
            pnlCadVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadVeiculoVndLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCadVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kbkCadVeiculoVnd)
                    .addGroup(pnlCadVeiculoVndLayout.createSequentialGroup()
                        .addGroup(pnlCadVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlCadVeiculoVndLayout.createSequentialGroup()
                                .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlDadosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlFichaTecnica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(pnlCadVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEditando)
                            .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlCadVeiculoVndLayout.setVerticalGroup(
            pnlCadVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadVeiculoVndLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(kbkCadVeiculoVnd)
                .addGap(15, 15, 15)
                .addGroup(pnlCadVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadVeiculoVndLayout.createSequentialGroup()
                        .addComponent(pnlFichaTecnica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlCadVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlCadVeiculoVndLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlCadVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlDadosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCadVeiculoVndLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblEditando)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", pnlCadVeiculoVnd);

        pnlListVeiculoVnd.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlListVeiculoVndComponentShown(evt);
            }
        });

        cmbPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo", "Versão", "Ano", "Cor", "Placa", "Fornecedor", "Valor compra", "Data compra", "Despesas", "Cliente", "Valor venda", "Data venda", "Lucro" }));
        cmbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPesquisarActionPerformed(evt);
            }
        });

        cmbFiltrarOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crescente", "Decrescente" }));

        cmbFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Marca", "Modelo", "Versão", "Ano", "Cor", "Placa", "Fornecedor", "Valor compra", "Data compra", "Despesas", "Valor venda", "Data venda", "Lucro" }));

        lblListVeiculoVnd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblListVeiculoVnd.setText("LISTA DE VEÍCULOS VENDIDOS");

        tblVeiculoVnd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Versão", "Ano", "Cor", "Placa", "Fornecedor", "Valor compra", "Data compra", "Despesas", "Cliente", "Valor venda", "Data venda", "Lucro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVeiculoVnd);

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

        javax.swing.GroupLayout pnlListVeiculoVndLayout = new javax.swing.GroupLayout(pnlListVeiculoVnd);
        pnlListVeiculoVnd.setLayout(pnlListVeiculoVndLayout);
        pnlListVeiculoVndLayout.setHorizontalGroup(
            pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                        .addComponent(lblListVeiculoVnd)
                        .addGap(274, 274, 274))
                    .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                        .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlListVeiculoVndLayout.createSequentialGroup()
                                .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                                        .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                                        .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 365, Short.MAX_VALUE)))
                        .addGap(15, 15, 15)
                        .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))))
        );
        pnlListVeiculoVndLayout.setVerticalGroup(
            pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblListVeiculoVnd)
                .addGap(15, 15, 15)
                .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                        .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFiltrarOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(pnlListVeiculoVndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListVeiculoVndLayout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Lista", pnlListVeiculoVnd);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

/*                                                                                                                         */
/*                                                                                                                         */
/*                                                                                                                         */
    
    private SortOrder tipoOrdem;
    
    private void cleanFields(){
        cmbCliente.setSelectedIndex(-1);
        txtValorVenda.setText("");
        txtDataVenda.setText("");
    }
    
    private void cleanFieldsVeiculo(){
        cmbMarca.setSelectedIndex(-1);
        cmbModelo.setSelectedIndex(-1);
        cmbVersao.setSelectedIndex(-1);
        cmbAno.setSelectedIndex(-1);
        cmbCombustivel.setSelectedIndex(-1);
        cmbCambio.setSelectedIndex(-1);
        cmbDirecao.setSelectedIndex(-1);
        spnMotor.setValue(1);
        
        txtPlaca.setText("");
        txtCor.setText("");
        txtKM.setText("");
        txtFornecedor.setText("");
        txtValorCompra.setText("");
        ftxtData_compra.setText("");
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
        if(cmbCliente.getSelectedIndex() == -1){
            msgErro += "O campo 'Cliente' não pode estar vazio.\n";
        }
        
         if(txtValorCompra.getText().isBlank()){
             msgErro += "O campo 'Valor' não pode estar vazio.\n";
        } 
        
        if(!FuncoesUteis.isFloat(txtValorCompra.getText())){
            msgErro += "O campo 'Valor' não é válido.\n";
        };
        
        if(ftxtData_compra.getText().isBlank()){
             msgErro += "O campo 'Data compra' não pode estar vazio.\n";
        }

        if(!msgErro.isBlank()){
            JOptionPane.showMessageDialog(this, msgErro, "Verifique os campos.", JOptionPane.ERROR_MESSAGE);
            return false;
        } return true;  
    }
    
    private void carregarTabela(List<Revenda> listaVeiculosCmp){
        ((DefaultTableModel) tblVeiculoVnd.getModel()).setNumRows(0);
            
        for (Revenda revenda : listaVeiculosCmp ) {
            if(revenda.getValor_venda() != 0){
                ((DefaultTableModel)tblVeiculoVnd.getModel()).addRow(revenda.toArray_Venda());    
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
      
        if((cmbPesquisar.getSelectedIndex() == 8 ||  cmbPesquisar.getSelectedIndex() == 12) && !FuncoesUteis.isFloat(pesquisa)){
            JOptionPane.showMessageDialog(this, "Valor informado possui caracteres não permitidos.", "Erro ao pesquisar revenda", JOptionPane.ERROR_MESSAGE  );
            return false;
        }
        
        if(cmbPesquisar.getSelectedIndex() == 9 || cmbPesquisar.getSelectedIndex() == 13){
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
        
        txtFornecedor.setText(revendaSelecionada.getFornecedor().toString());
        txtValorCompra.setText(String.valueOf(revendaSelecionada.getValor_compra()));
        ftxtData_compra.setText(FuncoesUteis.dateToString(revendaSelecionada.getData_compra()));
    }
    
    private void updateFields(Cliente cliente, float valor_venda, Date data_venda){
        revendaSelecionada.setCliente(cliente);
        revendaSelecionada.setValor_venda(valor_venda);
        revendaSelecionada.setData_venda(data_venda);
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
        int linha = tblVeiculoVnd.getSelectedRow();
        if(linha >= 0){
            jTabbedPane1.setSelectedIndex(0);
            botaoEditar();
       
            revendaSelecionada = (Revenda) tblVeiculoVnd.getValueAt(linha, 6);
            setFields();
            cmbCliente.setSelectedItem(revendaSelecionada.getCliente());
            txtValorVenda.setText(String.valueOf(revendaSelecionada.getValor_venda()));
            txtDataVenda.setText(FuncoesUteis.dateToString(revendaSelecionada.getData_venda()));
                    
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(this, "Função indisponível no momento.", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            String pesquisa = txtPesquisar.getText();

            if(pesquisa.isBlank()){
                carregarTabela(gerenciadorVIEW.getGerDominio().listar(Revenda.class));
            } else if(!pesquisaValida(pesquisa)){
                return;
            } else{
                if(cmbPesquisar.getSelectedIndex() >= 6){
                    carregarTabela(gerenciadorVIEW.getGerDominio().revendaPesquisar(pesquisa, cmbPesquisar.getSelectedIndex() + 1));
                } else {    
                    carregarTabela(gerenciadorVIEW.getGerDominio().revendaPesquisar(pesquisa, cmbPesquisar.getSelectedIndex()));
                }
            }
            
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(this, ex, "Erro ao pesquisar venda de veiculo", JOptionPane.ERROR_MESSAGE  );
        } 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        switch(cmbFiltrarOrdem.getSelectedIndex()) {
            case 0: tipoOrdem = SortOrder.ASCENDING; break;
            case 1: tipoOrdem = SortOrder.DESCENDING; break;
            default: break;
        }
        
        FuncoesUteis.ordenarTabela(tblVeiculoVnd, cmbFiltrar.getSelectedIndex(), tipoOrdem);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        botaoCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarOKComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnEditarOKComponentShown
        jTabbedPane1.setSelectedIndex(0);
        botaoEditar();
    }//GEN-LAST:event_btnEditarOKComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerenciadorVIEW.carregarComboBox(cmbCliente, Cliente.class);
        revendaSelecionada = gerenciadorVIEW.getRevenda();
        botaoCancelar();
        
        if(revendaSelecionada != null){
            setFields();
        } else {
            botaoCancelar();
            cleanFieldsVeiculo();
        }
    }//GEN-LAST:event_formComponentShown

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(revendaSelecionada != null){
            if(checkFields()){
                try {
                    Cliente cliente = (Cliente) cmbCliente.getSelectedItem();
                    float valor_venda = Float.valueOf(txtValorVenda.getText());
                    Date data_venda = FuncoesUteis.stringToDate(txtDataVenda.getText());

                if(JOptionPane.showConfirmDialog(this, "Desejar realmente cadastrar essa venda?", "Cadastrar venda", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                        updateFields(cliente, valor_venda, data_venda);
                        gerenciadorVIEW.getGerDominio().inserirVeiculoVendido(revendaSelecionada);
                        JOptionPane.showMessageDialog(this, "Veículo vendido cadastrado com sucesso.", "Cadastrar venda", JOptionPane.INFORMATION_MESSAGE);
                        botaoCancelar();
                        carregarTabela(gerenciadorVIEW.getGerDominio().listar(Revenda.class));
                    }
                } catch (HibernateException | ParseException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Erro ao cadastrar a venda de um veículo.", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
             JOptionPane.showMessageDialog(this, "Você deve selecionar um veículo para vender.", "Erro ao vender veículo", JOptionPane.ERROR_MESSAGE  );
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtValorVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorVendaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        cleanFields();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jTabbedPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentShown
    }//GEN-LAST:event_jTabbedPane1ComponentShown

    private void pnlListVeiculoVndComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlListVeiculoVndComponentShown
        pnlListVeiculoVnd.setSize( 1200, 459);
        this.pack();
    }//GEN-LAST:event_pnlListVeiculoVndComponentShown

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if(jTabbedPane1.getSelectedIndex() == 0){
            pnlListVeiculoVnd.setPreferredSize(new Dimension(871, 459));
        } else if(jTabbedPane1.getSelectedIndex() == 1){
            pnlListVeiculoVnd.setPreferredSize(new Dimension(1200, 459));
        }
        this.pack();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void cmbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblVeiculoVnd.getSelectedRow();
        if(linha >= 0){
            revendaSelecionada = (Revenda) tblVeiculoVnd.getValueAt(linha, 6);
            if(JOptionPane.showConfirmDialog(this, "Desejar realmente excluir?\nTodos os itens relacionados a essa venda também serão excluídos.", "Confirmar exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                ((DefaultTableModel) tblVeiculoVnd.getModel()).removeRow(linha);
                gerenciadorVIEW.getGerDominio().revendaExcluir(revendaSelecionada);  
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Linha inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarOKActionPerformed
        if(checkFields()){
            try {
                Cliente cliente = (Cliente) cmbCliente.getSelectedItem();
                float valor_venda = Float.valueOf(txtValorVenda.getText());
                Date data_venda = FuncoesUteis.stringToDate(txtDataVenda.getText());

                if(JOptionPane.showConfirmDialog(this, "Desejar realmente editar?\nTodos os itens relacionados a essa venda também serão editados.", "Confirmar edição", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    updateFields(cliente, valor_venda, data_venda);

                    gerenciadorVIEW.getGerDominio().revendaAlterar(revendaSelecionada);  
                    JOptionPane.showMessageDialog(this, "Venda alterada com sucesso.", "Alterar venda", JOptionPane.INFORMATION_MESSAGE);
                    botaoCancelar();
                    carregarTabela(gerenciadorVIEW.getGerDominio().listar(Revenda.class));
                }
            }   catch (HibernateException | ParseException ex) {
                    JOptionPane.showMessageDialog(this, ex, "Erro ao alterar venda.", JOptionPane.ERROR_MESSAGE);
            }
        }              
    }//GEN-LAST:event_btnEditarOKActionPerformed


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
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cmbAno;
    private javax.swing.JComboBox<String> cmbCambio;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbCombustivel;
    private javax.swing.JComboBox<String> cmbDirecao;
    private javax.swing.JComboBox<String> cmbFiltrar;
    private javax.swing.JComboBox<String> cmbFiltrarOrdem;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbModelo;
    private javax.swing.JComboBox<String> cmbPesquisar;
    private javax.swing.JComboBox<String> cmbVersao;
    private javax.swing.JFormattedTextField ftxtData_compra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel kbkCadVeiculoVnd;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblData4;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblDirecao;
    private javax.swing.JLabel lblEditando;
    private javax.swing.JLabel lblFornecedor4;
    private javax.swing.JLabel lblKM;
    private javax.swing.JLabel lblListVeiculoVnd;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblValor4;
    private javax.swing.JLabel lblValorVenda;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCadVeiculoVnd;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlDadosCompra;
    private javax.swing.JPanel pnlFichaTecnica;
    private javax.swing.JPanel pnlInformacoes;
    private javax.swing.JPanel pnlListVeiculoVnd;
    private javax.swing.JSpinner spnMotor;
    private javax.swing.JTable tblVeiculoVnd;
    private javax.swing.JTextField txtCor;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JFormattedTextField txtKM;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValorCompra;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
