 package VIEW;

import CONTROLE.LimparCampos;
import java.sql.ResultSet;
import java.sql.SQLException;
import DAO.CompraDAO;
import DAO.FornecedorDAO;
import DAO.ProdutoDAO;
import DTO.CompraDTO;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO; 
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import java.util.Vector;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Compra extends javax.swing.JPanel {

    DefaultTableModel itenscompra;
    double total, preco, subtotal, ex;
    int qtd;

    public Compra() {
        initComponents();
        AutoCompleteDecorator.decorate(cbxFornecedor);
        AutoCompleteDecorator.decorate(cbxCodigoProduto);

        FornecedorCbx();
        //ProdutoCbx();
        ProdutoCodCbx();
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
        txtPreco = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabelaCompra = new javax.swing.JTable();
        btnSalvarCompra = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExcluirItem = new javax.swing.JButton();
        cbxFornecedor = new javax.swing.JComboBox<>();
        cbxCodigoProduto = new javax.swing.JComboBox<>();
        txtPrecoVenda = new javax.swing.JTextField();
        txtvalorVenda = new javax.swing.JLabel();
        txtItemExcluido = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JSpinner();
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

        txtPreco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtNomeProduto.setEditable(false);
        txtNomeProduto.setBackground(java.awt.SystemColor.controlHighlight);
        txtNomeProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnAdicionar.setLabel("Adicionar Item");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel26.setText("Validade");

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                "CÓD. BARRA", "PRODUTO", "QNT", "VALIDADE", "R$ COMPRA", "R$ VENDA", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCompraMouseClicked(evt);
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
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel35.setText("ID");

        jLabel28.setText("Data da Compra");

        txtDataCompra.setEditable(false);
        txtDataCompra.setBackground(java.awt.SystemColor.controlHighlight);
        try {
            txtDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataCompraActionPerformed(evt);
            }
        });

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
        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxFornecedor.setAutoscrolls(true);
        cbxFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFornecedorActionPerformed(evt);
            }
        });

        cbxCodigoProduto.setEditable(true);
        cbxCodigoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar Produto" }));

        txtPrecoVenda.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtvalorVenda.setText("*Preço Venda R$:");

        txtItemExcluido.setEditable(false);

        jLabel24.setText("*Código:");

        javax.swing.GroupLayout painelCadCompraLayout = new javax.swing.GroupLayout(painelCadCompra);
        painelCadCompra.setLayout(painelCadCompraLayout);
        painelCadCompraLayout.setHorizontalGroup(
            painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadCompraLayout.createSequentialGroup()
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadCompraLayout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadCompraLayout.createSequentialGroup()
                                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                                        .addComponent(txtvalorCompra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))
                                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                                        .addComponent(txtvalorVenda)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addComponent(btnExcluirItem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadCompraLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnSalvarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItemExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCadCompraLayout.createSequentialGroup()
                                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painelCadCompraLayout.createSequentialGroup()
                                            .addComponent(cbxCodigoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(123, 123, 123))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadCompraLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadCompraLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane))))
                .addGap(20, 20, 20))
        );
        painelCadCompraLayout.setVerticalGroup(
            painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadCompraLayout.createSequentialGroup()
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadCompraLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel35))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadCompraLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel28))
                            .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(10, 10, 10)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(10, 10, 10)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(10, 10, 10)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalorCompra)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalorVenda)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel26))
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar)
                            .addComponent(btnExcluirItem))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtItemExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnSalvarCompra))
                    .addGroup(painelCadCompraLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelCadCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotal)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(114, 114, 114))
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
        tabelaConCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConCompraMouseClicked(evt);
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
                .addContainerGap(170, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTPainelCompra))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTPainelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        tabelaItemCompra();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        CancelarCompra() ;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tabelaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaCompraMouseClicked

    private void btnSalvarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCompraActionPerformed
       Cadastrar();
    }//GEN-LAST:event_btnSalvarCompraActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtDataCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataCompraActionPerformed
        Data();
    }//GEN-LAST:event_txtDataCompraActionPerformed
 
    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        ExcluirItem();
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
       Listar();
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void tabelaConCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaConCompraMouseClicked

    private void cbxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFornecedorActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPainelCompra;
    private javax.swing.JScrollPane TblConCompra;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnSalvarCompra;
    private javax.swing.JComboBox<String> cbxCodigoProduto;
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
    private javax.swing.JFormattedTextField txtDataCompra;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtItemExcluido;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JSpinner txtQtd;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JFormattedTextField txtValidade;
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
    }

    private void CancelarCompra() {

        int op;
        Object[] options = {"Cancelar", "Confirmar"};
        op = JOptionPane.showOptionDialog(null, "Deseja realmente Cancelar a Compra?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (op == 1) {
            CompraDTO obj = new CompraDTO();

            obj.setIdCompra(Integer.parseInt(txtId.getText()));

            CompraDAO dao = new CompraDAO();
            dao.excluirCompra(obj);

        }
    }

    private void Cadastrar() {

        if (cbxFornecedor.getSelectedItem().toString().isEmpty()
                || cbxCodigoProduto.getSelectedItem().equals("")
                || txtPreco.getText().isEmpty()
                || txtQtd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");

        } else {

            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente Cadastrar a Compra?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                CompraDTO cdto = new CompraDTO();
                cdto.setCompraPreco(Double.parseDouble(txtPreco.getText()));
                cdto.setCompraPrecoVenda(Double.parseDouble(txtPrecoVenda.getText()));

                ProdutoDTO pdto = new ProdutoDTO();
                pdto.setCodbarraProduto(Integer.parseInt(cbxCodigoProduto.getSelectedItem().toString()));
                pdto.setNomeProduto(txtNomeProduto.getText());
                pdto.setEstoqueProduto(Integer.parseInt(txtQtd.getText()));

                FornecedorDTO fdto = new FornecedorDTO();
                fdto.setNomeFornecedor(cbxFornecedor.getSelectedItem().toString());

                cdto.setFornecedor(fdto);
                cdto.setProduto(pdto);

                CompraDAO dao = new CompraDAO();
                dao.cadastrarCompra(cdto);
            }
        }
    }

    private void Editar() {

        if (cbxFornecedor.getSelectedItem().toString().isEmpty()
                || cbxCodigoProduto.getSelectedItem().equals("")
                || txtPreco.getText().isEmpty()
                || txtQtd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");

        } else {

            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente Cadastrar a Compra?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                CompraDTO cdto = new CompraDTO();
                cdto.setCompraPreco(Double.parseDouble(txtPreco.getText()));
                cdto.setCompraPrecoVenda(Double.parseDouble(txtPrecoVenda.getText()));
                cdto.setIdCompra(Integer.parseInt(txtId.getText()));

                ProdutoDTO pdto = new ProdutoDTO();
                pdto.setCodbarraProduto(Integer.parseInt(cbxCodigoProduto.getSelectedItem().toString()));
                pdto.setNomeProduto(txtNomeProduto.getText());
                pdto.setEstoqueProduto(Integer.parseInt(txtQtd.getText()));

                FornecedorDTO fdto = new FornecedorDTO();
                fdto.setNomeFornecedor(cbxFornecedor.getSelectedItem().toString());

                cdto.setFornecedor(fdto);
                cdto.setProduto(pdto);

                CompraDAO dao = new CompraDAO();
                dao.cadastrarCompra(cdto);
            }
        }
    }



    private void tabelaItemCompra() {
        // Pega os dados e envia para aba Cadastro

        dtoproduto = daoproduto.pesquisarCodigoProduto(Integer.parseInt(cbxCodigoProduto.getSelectedItem().toString()));
        dtoproduto = daoproduto.pesquisarNomeProduto(txtNomeProduto.getText());
        qtd = Integer.parseInt(txtQtd.getText());

        if (qtd > 0) {
            if (dtoproduto.getEstoqueProduto() > 0 && dtoproduto.getEstoqueProduto() >= qtd) {
                preco = Double.parseDouble(txtPreco.getText());

                subtotal = qtd * preco;

                total += subtotal;
                txtTotal.setText("R$ " + String.valueOf(total));

                //Adicionar o produto no carrinho
                itenscompra = (DefaultTableModel) tabelaCompra.getModel();

                itenscompra.addRow(new Object[]{
                    cbxCodigoProduto.getSelectedItem(),
                    txtNomeProduto.getText(),
                    txtQtd.getText(),
                    txtValidade.getText(),
                    txtPreco.getText(),
                    txtPrecoVenda.getText(),
                    subtotal

                });

            }
        }
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

    Vector<Integer> idPro = new Vector<Integer>();

    public void ProdutoCbx() {
        try {
            ProdutoDTO obj = new ProdutoDTO();
            ProdutoDAO dao = new ProdutoDAO();
            ResultSet rs = dao.CBXlistarNomeProduto();
            //obj = dao.pesquisarNomeProduto(txtNomeProduto.getText());
            
            

            while (rs.next()) {
                idPro.addElement(rs.getInt(1));//Armazenando o 1 elemento do sql no id, Na minha chave primaria
                cbxCodigoProduto.addItem(rs.getString(2));// Armazenando o 2 elemento do sql que é o codigo 
                txtNomeProduto.setText(obj.getNomeProduto());
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar");
        }

    }
    Vector<Integer> idCodProd = new Vector<Integer>();
    public void ProdutoCodCbx() {
        try {
            ProdutoDAO obj = new ProdutoDAO();

            ResultSet rs = obj.CBXlistarCodigoProduto();

            while (rs.next()) {
                idCodProd.addElement(rs.getInt(1));//Armazenando o 1 elemento do sql no id, Na minha chave primaria
                cbxCodigoProduto.addItem(rs.getString(2));// Armazenando o 3 elemento do sql que é o codigo de barra
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar");
        }

    }

    private void Data() {
        Date data = new Date();
        SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy");
        String dataformat = dataAtual.format(data);
        txtDataCompra.setText(dataformat);
    }

    private void ExcluirItem() {

        itenscompra = (DefaultTableModel) tabelaCompra.getModel();

        itenscompra.removeRow(tabelaCompra.getSelectedRow());
        tabelaCompra.setModel(itenscompra);

        ex = Double.parseDouble(txtItemExcluido.getText());

        total = total - ex;
        txtTotal.setText("R$ " + String.valueOf(total));
        txtItemExcluido.setText("");
    }

    private void ExcluirCompra()
    {
        id = Integer.parseInt(txtId.getText());

        if (txtId.getText().isEmpty()) {
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
    
}
