package VIEW;

import CONEXAO.Conexao;
import CONTROLE.LimparCampos;
import java.sql.ResultSet;
import java.sql.SQLException;
import DAO.CompraDAO;
import DAO.FornecedorDAO;
import DAO.ProdutoDAO;
import DTO.CompraDTO;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import java.awt.event.KeyEvent;
import static java.lang.Integer.max;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Compra extends javax.swing.JPanel {

    int qnt;
    int total;
    int preco;
    int precosub;
    int ex;
    int i;
    String forn;
    DefaultTableModel itenscompra;
    DefaultTableModel limpartabela;

    Connection conn; //Cria a Conexão
    PreparedStatement pst; // Prepara a Conexão
    ResultSet rs;

    public Compra() {

        conn = new Conexao().conectaBD();
        initComponents();
        Data();

        AutoCompleteDecorator.decorate(cbxFornecedor);
        FornecedorCbx();

        Listar();
        Limpar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNome = new javax.swing.JLabel();
        JTPainelCompra = new javax.swing.JTabbedPane();
        painelCadCompra = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtvalorCompra = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabelaCompra = new javax.swing.JTable();
        btnSalvarCompra = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtPrecoSub = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExcluirItem = new javax.swing.JButton();
        cbxFornecedor = new javax.swing.JComboBox<>();
        txtPrecoVenda = new javax.swing.JTextField();
        txtvalorVenda = new javax.swing.JLabel();
        txtItemExcluido = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JSpinner();
        txtPreco = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCodigoProduto = new javax.swing.JTextField();
        btnBuscarProdutoVenda = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        painelConFuncionario = new javax.swing.JPanel();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscaNome = new javax.swing.JButton();
        TblConCompra = new javax.swing.JScrollPane();
        tabelaConCompra = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(180, 155));
        setPreferredSize(new java.awt.Dimension(800, 658));

        jNome.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome.setText("COMPRA");
        jNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        painelCadCompra.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setText("*Produto:");

        txtvalorCompra.setText("*Preço Compra R$:");

        jLabel25.setText("*Qtd:");

        txtNomeProduto.setEditable(false);
        txtNomeProduto.setBackground(java.awt.SystemColor.controlHighlight);
        txtNomeProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnAdicionar.setLabel("Adicionar Item");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_excluir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tabelaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓD. BARRA", "PRODUTO", "QNT", "R$ COMPRA", "R$ VENDA", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tabelaCompra);

        btnSalvarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnSalvarCompra.setText("Salvar");
        btnSalvarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCompraActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Valor Total:");

        txtTotal.setEditable(false);
        txtTotal.setBackground(java.awt.SystemColor.controlHighlight);
        txtTotal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtTotal.setBorder(null);

        txtPrecoSub.setEditable(false);
        txtPrecoSub.setBackground(java.awt.SystemColor.controlHighlight);
        txtPrecoSub.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel35.setText("ID");

        jLabel28.setText("Data da Compra");

        jLabel29.setText("*Fornecedor");

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("(*) Campos obrigatórios para preenchimento");

        btnExcluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_excluir.png"))); // NOI18N
        btnExcluirItem.setText("Excluir Item");
        btnExcluirItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });

        cbxFornecedor.setEditable(true);
        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbxFornecedor.setAutoscrolls(true);
        cbxFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxFornecedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFornecedorItemStateChanged(evt);
            }
        });
        cbxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFornecedorActionPerformed(evt);
            }
        });
        cbxFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxFornecedorKeyPressed(evt);
            }
        });

        txtPrecoVenda.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPrecoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoVendaKeyPressed(evt);
            }
        });

        txtvalorVenda.setText("*Preço Venda R$:");

        txtItemExcluido.setEditable(false);

        jLabel24.setText("*Código:");

        txtQtd.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtQtd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQtdStateChanged(evt);
            }
        });

        txtPreco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoKeyPressed(evt);
            }
        });

        jLabel26.setText("Subtotal:");

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtCodigoProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyPressed(evt);
            }
        });

        btnBuscarProdutoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscarProdutoVenda.setText("Pesquisar Produto");
        btnBuscarProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoVendaActionPerformed(evt);
            }
        });

        txtData.setEditable(false);
        txtData.setBackground(new java.awt.Color(255, 255, 255));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelCadCompraLayout = new javax.swing.GroupLayout(painelCadCompra);
        painelCadCompra.setLayout(painelCadCompraLayout);
        painelCadCompraLayout.setHorizontalGroup(
            painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadCompraLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(painelCadCompraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadCompraLayout.createSequentialGroup()
                        .addComponent(txtItemExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadCompraLayout.createSequentialGroup()
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadCompraLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                                        .addComponent(txtvalorCompra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39))
                                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                                        .addComponent(txtvalorVenda)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))
                                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrecoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)))
                                .addComponent(btnExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadCompraLayout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadCompraLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(0, 194, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadCompraLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadCompraLayout.createSequentialGroup()
                                .addComponent(txtCodigoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(283, 283, 283))
                            .addGroup(painelCadCompraLayout.createSequentialGroup()
                                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(29, 29, 29))
        );
        painelCadCompraLayout.setVerticalGroup(
            painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadCompraLayout.createSequentialGroup()
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(7, 7, 7)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProdutoVenda)
                    .addComponent(jLabel24))
                .addGap(8, 8, 8)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalorCompra)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicionar)
                            .addComponent(btnExcluirItem)
                            .addComponent(jLabel26)
                            .addComponent(txtPrecoSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtvalorVenda)))
                .addGap(22, 22, 22)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(txtItemExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadCompraLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTotal)
                        .addComponent(btnSalvarCompra)
                        .addComponent(btnCancelar))
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        txtItemExcluido.setVisible(false);

        JTPainelCompra.addTab("Cadastro", painelCadCompra);

        painelConFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Buscar ");

        btnBuscaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscaNome.setText("Buscar");
        btnBuscaNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNomeActionPerformed(evt);
            }
        });

        TblConCompra.setBackground(new java.awt.Color(255, 255, 255));
        TblConCompra.setToolTipText("");

        tabelaConCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DATA COMPRA", "FORNECEDOR", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblConCompra.setViewportView(tabelaConCompra);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_bot_editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(91, 29));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConFuncionarioLayout = new javax.swing.GroupLayout(painelConFuncionario);
        painelConFuncionario.setLayout(painelConFuncionarioLayout);
        painelConFuncionarioLayout.setHorizontalGroup(
            painelConFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConFuncionarioLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConFuncionarioLayout.createSequentialGroup()
                .addGroup(painelConFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelConFuncionarioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConFuncionarioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TblConCompra)))
                .addGap(20, 20, 20))
        );
        painelConFuncionarioLayout.setVerticalGroup(
            painelConFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConFuncionarioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelConFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscaNome))
                .addGap(16, 16, 16)
                .addComponent(TblConCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addGroup(painelConFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        JTPainelCompra.addTab("Consulta", painelConFuncionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTPainelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTPainelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 608, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //tabelaItemCompra();
        AdicionarItens();
        //Limpar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        CancelarCompra();
        LimparTabela();
        Limpar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCompraActionPerformed
        Cadastrar();
    }//GEN-LAST:event_btnSalvarCompraActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        ExcluirItem();
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        Listar();
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Comando para excluir dados no BD;
        ExcluirCompra();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Comando para editar os dados no BD;
        Editar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtQtdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQtdStateChanged
        // Pega os dados e envia para aba Cadastro
        qnt = 0;
        preco = 0;
        precosub = 0;

        qnt = Integer.parseInt(txtQtd.getValue().toString());
        preco = Integer.parseInt(txtPreco.getText());

        precosub = qnt * preco;
        txtPrecoSub.setText(String.valueOf(precosub));

    }//GEN-LAST:event_txtQtdStateChanged

    private void btnBuscarProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoVendaActionPerformed
        PesquisaCodProd();
    }//GEN-LAST:event_btnBuscarProdutoVendaActionPerformed

    private void txtCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PesquisaCodProd();

        }
    }//GEN-LAST:event_txtCodigoProdutoKeyPressed

    private void txtPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPrecoVenda.requestFocus();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoKeyPressed

    private void txtPrecoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoVendaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtQtd.requestFocus();

        }
    }//GEN-LAST:event_txtPrecoVendaKeyPressed

    private void cbxFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxFornecedorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCodigoProduto.requestFocus();
        }
    }//GEN-LAST:event_cbxFornecedorKeyPressed

    private void cbxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFornecedorActionPerformed

    }//GEN-LAST:event_cbxFornecedorActionPerformed

    private void cbxFornecedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFornecedorItemStateChanged



    }//GEN-LAST:event_cbxFornecedorItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPainelCompra;
    private javax.swing.JScrollPane TblConCompra;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscaNome;
    javax.swing.JButton btnBuscarProdutoVenda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnSalvarCompra;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jNome;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel painelCadCompra;
    private javax.swing.JPanel painelConFuncionario;
    private javax.swing.JTable tabelaCompra;
    private javax.swing.JTable tabelaConCompra;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtItemExcluido;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtPrecoSub;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JSpinner txtQtd;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtvalorCompra;
    private javax.swing.JLabel txtvalorVenda;
    // End of variables declaration//GEN-END:variables

    int id;

    CompraDTO dtocompra = new CompraDTO();
    FornecedorDTO fdto = new FornecedorDTO();
    FornecedorDAO fdao = new FornecedorDAO();

    ProdutoDTO dtoproduto = new ProdutoDTO();
    ProdutoDAO daoproduto = new ProdutoDAO();

    public void Listar() {

        CompraDAO dao = new CompraDAO();
        ArrayList<CompraDTO> lista = dao.listarCompra();
        DefaultTableModel model = (DefaultTableModel) tabelaConCompra.getModel();
        model.setNumRows(0);

        for (CompraDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdCompra(),
                cont.getDataCompra(),
                cont.getFornecedor().getNomeFornecedor(),
                cont.getCompraValorTotal()});
        }
    }

    private void Limpar() {
        new LimparCampos().Limpar(painelCadCompra);
        cbxFornecedor.setSelectedIndex(0);
        txtQtd.setValue(0);

    }

    private void LimparTabela() {
        limpartabela = (DefaultTableModel) tabelaCompra.getModel();
        while (limpartabela.getRowCount() > 0) {
            limpartabela.removeRow(0);
        }
    }

    private void CancelarCompra() {

        int op;
        Object[] options = {"Cancelar", "Confirmar"};
        op = JOptionPane.showOptionDialog(null, "Deseja realmente Cancelar a Compra?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (op == 1) {
            CompraDTO obj = new CompraDTO();

            obj.setIdCompra(Integer.parseInt(txtPrecoSub.getText()));

            CompraDAO dao = new CompraDAO();
            dao.excluirCompra(obj);

        }
    }

    private void Cadastrar() {

        if (cbxFornecedor.getSelectedItem().toString().isEmpty()
                || txtCodigoProduto.getText().equals("")
                || txtPreco.getText().isEmpty() //|| txtQtd.getValue().equals("")
                ) {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");

        } else {

            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente Cadastrar a Compra?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                CompraDTO cdto = new CompraDTO();

                cdto.setDataCompra(txtData.getText());
                cdto.setCompraQnt(Integer.parseInt(txtQtd.getValue().toString()));
                cdto.setCompraPreco(Integer.parseInt(txtPreco.getText()));
                cdto.setCompraPrecoVenda(Integer.parseInt(txtPrecoVenda.getText()));
                cdto.setCompraValorTotal(Integer.parseInt(txtPrecoSub.getText()));
                
                
                //Cria um obj de produto para poder inserir o ID
                ProdutoDTO pdto = new ProdutoDTO();
                pdto.setCodbarraProduto(Integer.parseInt(txtCodigoProduto.getText().toString()));
                pdto.setNomeProduto(txtNomeProduto.getText());
                

                //Cria um obj de fornecedor para poder inserir o ID
                //FornecedorDTO fdto = new FornecedorDTO();
                //fdto.setNomeFornecedor(cbxFornecedor.getSelectedItem().toString());
                //fdto = (FornecedorDTO) cbxFornecedor.getSelectedItem();
                //fdto.setIdFornecedor(fdto);
                
                
                //Cria um obj de fornecedor para poder inserir o ID
                FornecedorDTO fdto = new FornecedorDTO();
                fdto = (FornecedorDTO) cbxFornecedor.getSelectedItem();
                //fdto.setIdFornecedor(fdto);

                //fdto.setIdFornecedor(idForn);
                //fdto.setIdFornecedor(Integer.parseInt(cbxFornecedor.getSelectedItem().toString()));
                //fdto.setIdFornecedor(cbxFornecedor.selectedValue());
                                
                cdto.setFornecedor(fdto);
                cdto.setProduto(pdto);

                CompraDAO dao = new CompraDAO();
                dao.cadastrarCompra(cdto);
            }
        }
    }

    private void Editar() {

        if (cbxFornecedor.getSelectedItem().toString().isEmpty()
                || txtCodigoProduto.getText().equals("")
                || txtPreco.getText().isEmpty()
                || txtQtd.getValue().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");

        } else {

            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente Cadastrar a Compra?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                CompraDTO cdto = new CompraDTO();
                cdto.setIdCompra(Integer.parseInt(txtId.getText().toString()));
                cdto.setDataCompra(txtData.getText());
                cdto.setCompraQnt(Integer.parseInt(txtQtd.getValue().toString()));
                cdto.setCompraPreco(Integer.parseInt(txtPreco.getText()));
                cdto.setCompraPrecoVenda(Integer.parseInt(txtPrecoVenda.getText()));
                cdto.setCompraValorTotal(Integer.parseInt(txtPrecoSub.getText()));

                ProdutoDTO pdto = new ProdutoDTO();
                pdto.setCodbarraProduto(Integer.parseInt(txtCodigoProduto.getText()));
                pdto.setNomeProduto(txtNomeProduto.getText());

                FornecedorDTO fdto = new FornecedorDTO();
                fdto.setNomeFornecedor(cbxFornecedor.getSelectedItem().toString());

                cdto.setFornecedor(fdto);
                cdto.setProduto(pdto);

                CompraDAO dao = new CompraDAO();
                dao.cadastrarCompra(cdto);
            }
        }
    }

    private void AdicionarItens() {
        //Adicionar os  produtos na tabela de compra
        itenscompra = (DefaultTableModel) tabelaCompra.getModel();

        itenscompra.addRow(new Object[]{
            txtCodigoProduto.getText(),
            txtNomeProduto.getText(),
            txtQtd.getValue().toString(),
            txtPreco.getText(),
            txtPrecoVenda.getText(),
            txtPrecoSub.getText()
        });

        total = 0;
        for (i = 0; i < tabelaCompra.getRowCount(); i++) {

            total = total + Integer.parseInt(tabelaCompra.getValueAt(i, 5).toString());
        }

        //txtTotal.setText("R$ " + String.valueOf(total));
        txtTotal.setText(Integer.toString(total));

    }

    //Pega com o vetor a chava primaria para adicionar a informação nesse caso o nome dos fornecedores e nao o id na combobox
    Vector<Integer> idForn = new Vector<Integer>();

    public void FornecedorCbx() {
        try {
            FornecedorDAO obj = new FornecedorDAO();
            ResultSet rs = obj.CBXlistarNomeFornecedor();

            while (rs.next()) {
                idForn.addElement(rs.getInt(1));//Armazenando o 1 elemento do sql no id, Na minha chave primaria
                cbxFornecedor.addItem(rs.getString(2));// Armazenando o 2 elemento do sql que é o nome do fornecedor
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar Compra");
        }

    }

    private void Data() {
        Date data = new Date();
        SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy  ");
        String dataformat = dataAtual.format(data);
        txtData.setText(dataformat);
    }

    private void ExcluirItem() {
        itenscompra = (DefaultTableModel) tabelaCompra.getModel();
        txtItemExcluido.setText(tabelaCompra.getValueAt(tabelaCompra.getSelectedRow(), 5).toString());

        itenscompra.removeRow(tabelaCompra.getSelectedRow());
        tabelaCompra.setModel(itenscompra);

        ex = Integer.parseInt(txtItemExcluido.getText());

        total = total - ex;
        txtTotal.setText("R$ " + String.valueOf(total));
        txtItemExcluido.setText("");
    }

    private void ExcluirCompra() {
        id = Integer.parseInt(txtPrecoSub.getText());

        if (txtPrecoSub.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há Compra selecionada para exclusão");
        } else {
            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                CompraDTO obj = new CompraDTO();

                obj.setIdCompra(id);

                CompraDAO dao = new CompraDAO();
                dao.excluirCompra(obj);
            }
        }
    }

    private void PesquisaCodProd() {

        int pcode = Integer.parseInt(txtCodigoProduto.getText());

        String sql = ""
                + "SELECT * "
                + "FROM tbl_produto "
                + "WHERE (pro_cod_barra) = ?";

        try {

            pst = conn.prepareStatement(sql);
            pst.setInt(1, pcode);
            rs = pst.executeQuery();
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(this, "Produto não Encontrado");
            } else {
                String pnome = rs.getString("pro_nome");

                txtNomeProduto.setText(pnome.trim());
                txtPreco.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
