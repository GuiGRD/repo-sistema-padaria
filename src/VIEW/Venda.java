package VIEW;

import CONEXAO.Conexao;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Venda extends javax.swing.JPanel {

    int qnt;
    int total;
    int preco;
    int precosub;
    int ex;
    int i;

    DefaultTableModel itensvenda;

    Connection conn; //Cria a Conexão
    PreparedStatement pst; // Prepara a Conexão
    ResultSet rs;

    public Venda() {

        conn = new Conexao().conectaBD();

        initComponents();
        Data();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtId1 = new javax.swing.JTextField();
        jPDV = new javax.swing.JLabel();
        JTPainelVendas = new javax.swing.JTabbedPane();
        painelVendas = new javax.swing.JPanel();
        painelDados = new javax.swing.JPanel();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        btnExcluirItem = new javax.swing.JButton();
        btnAdcionarProduto = new javax.swing.JButton();
        txtQtd = new javax.swing.JSpinner();
        txtPrecoSub = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JFormattedTextField();
        btnBuscarProdutoVenda = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPrint = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        txtExcluido = new javax.swing.JTextField();
        txtTotalVenda = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBalanco = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        painelConVenda = new javax.swing.JPanel();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscaNome = new javax.swing.JButton();
        TblConVenda = new javax.swing.JScrollPane();
        tabelaConVenda = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        txtId1.setEditable(false);
        txtId1.setBackground(java.awt.SystemColor.controlHighlight);
        txtId1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId1ActionPerformed(evt);
            }
        });

        jPDV.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jPDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPDV.setText("PDV");
        jPDV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        painelVendas.setBackground(new java.awt.Color(255, 255, 255));

        painelDados.setBackground(new java.awt.Color(255, 255, 255));

        txtCodigoProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyPressed(evt);
            }
        });

        jLabel17.setText("Produto:");

        jLabel18.setText("Valor Un:");

        jLabel19.setText("Qtd:");

        txtPreco.setEditable(false);
        txtPreco.setBackground(java.awt.SystemColor.controlHighlight);
        txtPreco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtNomeProduto.setEditable(false);
        txtNomeProduto.setBackground(java.awt.SystemColor.controlHighlight);
        txtNomeProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnExcluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_excluir.png"))); // NOI18N
        btnExcluirItem.setText("Excluir Item");
        btnExcluirItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });

        btnAdcionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnAdcionarProduto.setText("Adicionar");
        btnAdcionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcionarProdutoActionPerformed(evt);
            }
        });

        txtQtd.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txtQtd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQtdStateChanged(evt);
            }
        });

        txtPrecoSub.setEditable(false);
        txtPrecoSub.setBackground(java.awt.SystemColor.controlHighlight);
        txtPrecoSub.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel20.setText("Valor Sub:");

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "PRODUTO", "QNT", "R$ UN.", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaVendas);

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel34.setText("ID");

        txtDataVenda.setEditable(false);
        txtDataVenda.setBackground(java.awt.SystemColor.controlHighlight);
        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnBuscarProdutoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscarProdutoVenda.setText("Pesquisar Produto");
        btnBuscarProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoVendaActionPerformed(evt);
            }
        });

        txtPrint.setColumns(20);
        txtPrint.setRows(5);
        jScrollPane4.setViewportView(txtPrint);

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnExcluirItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdcionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(btnBuscarProdutoVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(btnAdcionarProduto)
                            .addComponent(btnExcluirItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Valor Total");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtExcluido.setEditable(false);

        txtTotalVenda.setEditable(false);
        txtTotalVenda.setBackground(java.awt.SystemColor.controlHighlight);
        txtTotalVenda.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtTotalVenda.setForeground(new java.awt.Color(51, 51, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Valor Pago");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Balanço");

        txtBalanco.setEditable(false);
        txtBalanco.setBackground(java.awt.SystemColor.controlHighlight);
        txtBalanco.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtBalanco.setForeground(new java.awt.Color(51, 51, 255));

        txtPago.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPago.setPreferredSize(new java.awt.Dimension(64, 30));
        txtPago.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPagoPropertyChange(evt);
            }
        });
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPagoKeyPressed(evt);
            }
        });

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnFinalizar.setText("Finalizar e Imprimir");
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVendasLayout = new javax.swing.GroupLayout(painelVendas);
        painelVendas.setLayout(painelVendasLayout);
        painelVendasLayout.setHorizontalGroup(
            painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVendasLayout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(txtExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 60, Short.MAX_VALUE))
            .addGroup(painelVendasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVendasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBalanco, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        painelVendasLayout.setVerticalGroup(
            painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVendasLayout.createSequentialGroup()
                        .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelVendasLayout.createSequentialGroup()
                                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel22))
                                .addGap(10, 10, 10)
                                .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(painelVendasLayout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(42, 42, 42))
                                .addComponent(txtBalanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtExcluido.setVisible(false);

        JTPainelVendas.addTab("VENDA", painelVendas);

        painelConVenda.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Buscar ");

        btnBuscaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscaNome.setText("Buscar");
        btnBuscaNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNomeActionPerformed(evt);
            }
        });

        TblConVenda.setBackground(new java.awt.Color(255, 255, 255));
        TblConVenda.setToolTipText("");

        tabelaConVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "DATA", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblConVenda.setViewportView(tabelaConVenda);

        javax.swing.GroupLayout painelConVendaLayout = new javax.swing.GroupLayout(painelConVenda);
        painelConVenda.setLayout(painelConVendaLayout);
        painelConVendaLayout.setHorizontalGroup(
            painelConVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConVendaLayout.createSequentialGroup()
                .addGroup(painelConVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConVendaLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConVendaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TblConVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        painelConVendaLayout.setVerticalGroup(
            painelConVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConVendaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelConVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscaNome))
                .addGap(16, 16, 16)
                .addComponent(TblConVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        JTPainelVendas.addTab("Consulta", painelConVenda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTPainelVendas)
                    .addComponent(jPDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTPainelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PesquisaCodProd();

        }

    }//GEN-LAST:event_txtCodigoProdutoKeyPressed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
       
        Print();
        Limpar();


    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnAdcionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcionarProdutoActionPerformed

        AdicionarItens();
        Limpar();


    }//GEN-LAST:event_btnAdcionarProdutoActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        ExcluirItem();
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void txtQtdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQtdStateChanged
        Quantidade();
    }//GEN-LAST:event_txtQtdStateChanged

    private void txtId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId1ActionPerformed

    private void txtPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyPressed
     if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
     {
        Balanco();
    }
    }//GEN-LAST:event_txtPagoKeyPressed

    private void btnBuscarProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoVendaActionPerformed
        PesquisaCodProd();
    }//GEN-LAST:event_btnBuscarProdutoVendaActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        //Listar();
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void txtPagoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPagoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPainelVendas;
    private javax.swing.JScrollPane TblConVenda;
    private javax.swing.JButton btnAdcionarProduto;
    private javax.swing.JButton btnBuscaNome;
    javax.swing.JButton btnBuscarProdutoVenda;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jPDV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel painelConVenda;
    private javax.swing.JPanel painelDados;
    private javax.swing.JPanel painelVendas;
    private javax.swing.JTable tabelaConVenda;
    private javax.swing.JTable tabelaVendas;
    public static javax.swing.JTextField txtBalanco;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtExcluido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtNomeProduto;
    public static javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtPrecoSub;
    public static javax.swing.JTextArea txtPrint;
    private javax.swing.JSpinner txtQtd;
    public static javax.swing.JTextField txtTotalVenda;
    // End of variables declaration//GEN-END:variables

    /**
     * 
     */
    private void Data() {
        Date data = new Date();
        SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy  ");
        String dataformat = dataAtual.format(data);
        txtDataVenda.setText(dataformat);
    }

    /**
     * 
     */
    
    private void Limpar() {
        txtCodigoProduto.setText("");
        txtNomeProduto.setText("");
        txtPreco.setText("");
        txtPrecoSub.setText("");
        //txtQtd.getModel().setValue(0);
        //txtQtd.setValue((double)0);

    }

    public void Quantidade() {
        qnt=0;
        preco=0;
        precosub = 0;
        qnt = Integer.parseInt(txtQtd.getValue().toString());
        preco = Integer.parseInt(txtPreco.getText());
        precosub = qnt * preco;
        txtPrecoSub.setText(String.valueOf(precosub));

    }

    private void AdicionarItens() {

        itensvenda = (DefaultTableModel) tabelaVendas.getModel();

        itensvenda.addRow(new Object[]{
            txtCodigoProduto.getText(),
            txtNomeProduto.getText(),
            txtQtd.getValue(),
            txtPreco.getText(),
            txtPrecoSub.getText()
        });

        total = 0;
        for (i = 0; i < tabelaVendas.getRowCount(); i++) {

            total = total + Integer.parseInt(tabelaVendas.getValueAt(i, 4).toString());
        }

        txtTotalVenda.setText(String.valueOf(total));
    }

    private void ExcluirItem() {
        itensvenda = (DefaultTableModel) tabelaVendas.getModel();
        txtExcluido.setText(tabelaVendas.getValueAt(tabelaVendas.getSelectedRow(), 4).toString());

        itensvenda.removeRow(tabelaVendas.getSelectedRow());
        tabelaVendas.setModel(itensvenda);

        ex = Integer.parseInt(txtExcluido.getText());

        total = total - ex;
        txtTotalVenda.setText("R$ " + String.valueOf(total));
        txtExcluido.setText("");
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
                String ppreco = rs.getString("pro_preco_venda");

                txtNomeProduto.setText(pnome.trim());
                txtPreco.setText(ppreco.trim());

            }
        } catch (SQLException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Balanco() {
        int total = Integer.parseInt(txtTotalVenda.getText());
        int pg = Integer.parseInt(txtPago.getText());

        int balanco = pg - total;

        txtBalanco.setText(String.valueOf(balanco));

    }

    public void Print() {
        String total = txtTotalVenda.getText();
        String pg = txtPago.getText();
        String balanco = txtBalanco.getText();
        itensvenda = (DefaultTableModel) tabelaVendas.getModel();

        txtPrint.setText(txtPrint.getText() + "*********************************\n");
        txtPrint.setText(txtPrint.getText() + "          Impressão          \n");
        txtPrint.setText(txtPrint.getText() + "*********************************\n");
        txtPrint.setText(txtPrint.getText() + "Produto"+"\t"+"\t"+"Qnt"+" Preço"+" Subtotal"+ "\n");

        for (int i = 0; i < itensvenda.getRowCount(); i++) {
            String pnome = (String) itensvenda.getValueAt(i, 1);
            int qnt = (int) itensvenda.getValueAt(i, 2);
            String preco = (String) itensvenda.getValueAt(i, 3);
            String sub = (String) itensvenda.getValueAt(i, 4);

            txtPrint.setText(txtPrint.getText() + pnome+"\t"+qnt+"\t"+ preco+"\t"+ sub+ "\n");
        }
        txtPrint.setText(txtPrint.getText() + "\n");
        txtPrint.setText(txtPrint.getText() + "\n");

        txtPrint.setText(txtPrint.getText() + "\t" + "Total:      " + total + "\n");
        txtPrint.setText(txtPrint.getText() + "\t" + "Valor Pago: " + pg + "\n");
        txtPrint.setText(txtPrint.getText() + "\t" + "Diferença:  " + balanco + "\n");
        txtPrint.setText(txtPrint.getText() + "\n");
        txtPrint.setText(txtPrint.getText() + "*********************************\n");
        txtPrint.setText(txtPrint.getText() + "        OBRIGADO, VOLTE SEMPRE!     ");
    }

    private void Salvar()
    {
    }

}
