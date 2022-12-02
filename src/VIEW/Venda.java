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
        jPanel = new javax.swing.JPanel();
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
        jLabel16 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtExcluido = new javax.swing.JTextField();
        txtTotalVenda = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtBalanco = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPrint = new javax.swing.JTextArea();

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

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

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
        txtPreco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtNomeProduto.setEditable(false);
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
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel34.setText("ID");

        txtDataVenda.setEditable(false);
        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnExcluirItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdcionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
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
                            .addComponent(jLabel20)))
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdcionarProduto)
                            .addComponent(btnExcluirItem))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Valor Total");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseClicked(evt);
            }
        });
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_excluir.png"))); // NOI18N
        btnCancelar.setText("Cancelar Venda");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtExcluido.setEditable(false);

        txtTotalVenda.setEditable(false);
        txtTotalVenda.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtTotalVenda.setForeground(new java.awt.Color(51, 51, 255));
        txtTotalVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVendaActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Valor Pago");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Balanço");

        txtBalanco.setEditable(false);
        txtBalanco.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtBalanco.setForeground(new java.awt.Color(51, 51, 255));
        txtBalanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalancoActionPerformed(evt);
            }
        });

        txtPago.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPago.setPreferredSize(new java.awt.Dimension(64, 30));
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPagoKeyPressed(evt);
            }
        });

        txtPrint.setColumns(20);
        txtPrint.setRows(5);
        jScrollPane4.setViewportView(txtPrint);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(txtExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTotalVenda)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBalanco)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(20, 20, 20)
                                .addComponent(txtTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBalanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinalizar)
                            .addComponent(btnCancelar))
                        .addGap(61, 61, 61)))
                .addComponent(txtExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtExcluido.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PesquisaCodProd();

        }

    }//GEN-LAST:event_txtCodigoProdutoKeyPressed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        Balanco();
        Print();


    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //ExcluirItem();
        //Limpar();
        //txtPrint.setText("");


    }//GEN-LAST:event_btnCancelarActionPerformed

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

    private void txtTotalVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVendaActionPerformed

    private void txtBalancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalancoActionPerformed

    private void txtPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoKeyPressed

    private void btnFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseClicked
        Balanco();
        Print();// TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdcionarProduto;
    private javax.swing.JButton btnCancelar;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jPDV;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel painelDados;
    private javax.swing.JTable tabelaVendas;
    public static javax.swing.JTextField txtBalanco;
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

    private void Data() {
        Date data = new Date();
        SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy  ");
        String dataformat = dataAtual.format(data);
        txtDataVenda.setText(dataformat);
    }

    private void Limpar() {
        txtCodigoProduto.setText("");
        txtNomeProduto.setText("");
        txtPreco.setText("");
        txtPrecoSub.setText("");
        //txtQtd.getModel().setValue(0);
        //txtQtd.setValue((double)0);

    }

    public void Quantidade(int qnt, int preco) {
        qnt = 0;
        preco = 0;
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
                + "FROM tbl_compra as c "
                + "INNER JOIN tbl_produto as p "
                + "ON (c.fk_produto = p.id_produto)"
                + "WHERE (p.pro_cod_barra) = ?";

        try {

            pst = conn.prepareStatement(sql);
            pst.setInt(1, pcode);
            rs = pst.executeQuery();
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(this, "Produto não Encontrado");
            } else {
                String pnome = rs.getString("p.pro_nome");
                String ppreco = rs.getString("c.compra_preco_venda");

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

        txtBalanco.setText("R$" + String.valueOf(balanco));

    }

    public void Print() {
        String total = txtTotalVenda.getText();
        String pg = txtPago.getText();
        String balanco = txtBalanco.getText();
        itensvenda = (DefaultTableModel) tabelaVendas.getModel();

        txtPrint.setText(txtPrint.getText() + "****************************************************************\n");
        txtPrint.setText(txtPrint.getText() + "                          Impressão                             \n");
        txtPrint.setText(txtPrint.getText() + "****************************************************************\n");
        txtPrint.setText(txtPrint.getText() + "Produto" + "Qnt" + "Preço" + "\t" + "Subtotal" + "\n");

        for (int i = 0; i < itensvenda.getRowCount(); i++) {
            String pnome = (String) itensvenda.getValueAt(i, 1);
            String preco = (String) itensvenda.getValueAt(i, 3);
            String sub = (String) itensvenda.getValueAt(i, 4);

            txtPrint.setText(txtPrint.getText() + pnome + "\t" + preco + "\t" + sub + "\n");
        }
        txtPrint.setText(txtPrint.getText() + "\n");
        txtPrint.setText(txtPrint.getText() + "\n");

        txtPrint.setText(txtPrint.getText() + "\t" + "\t" + "Total: " + total + "\n");
        txtPrint.setText(txtPrint.getText() + "\t" + "\t" + "Valor Pago: " + pg + "\n");
        txtPrint.setText(txtPrint.getText() + "\t" + "\t" + "Diferença: " + balanco + "\n");
        txtPrint.setText(txtPrint.getText() + "\n");
        txtPrint.setText(txtPrint.getText() + "****************************************************************\n");
        txtPrint.setText(txtPrint.getText() + "                      OBRIGADO, VOLTE SEMPRE!               \n");
    }

    public Object Quantidade(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
