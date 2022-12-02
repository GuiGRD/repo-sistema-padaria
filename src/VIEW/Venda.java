package VIEW;

import CONEXAO.Conexao;
import DAO.CompraDAO;
import DAO.ProdutoDAO;
import DTO.CompraDTO;
import DTO.ProdutoDTO;
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

    CompraDTO dtocompra = new CompraDTO();
    ProdutoDTO dtoproduto = new ProdutoDTO();
    ProdutoDAO daoproduto = new ProdutoDAO();

    double total, preco, subtotal, ex;
    int qtd;

    DefaultTableModel itensvenda;

    Connection conn; //Cria a Conexão
    PreparedStatement pst; // Prepara a Conexão
    ResultSet rs;

    public Venda() {
        conn = new Conexao().conectaBD();
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPDV = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        painelDados = new javax.swing.JPanel();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        btnBuscarProdutoVenda = new javax.swing.JButton();
        btnExcluirItem = new javax.swing.JButton();
        btnAdcionarProduto = new javax.swing.JButton();
        txtQtd = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnPagamento = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        txtExcluido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JFormattedTextField();

        jPDV.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jPDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPDV.setText("PDV");
        jPDV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel34.setText("ID");

        painelDados.setBackground(new java.awt.Color(255, 255, 255));

        txtCodigoProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyPressed(evt);
            }
        });

        jLabel17.setText("Produto:");

        jLabel18.setText("Preço:");

        jLabel19.setText("Qtd:");

        txtPreco.setEditable(false);
        txtPreco.setBackground(java.awt.SystemColor.controlHighlight);
        txtPreco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtNomeProduto.setEditable(false);
        txtNomeProduto.setBackground(java.awt.SystemColor.controlHighlight);
        txtNomeProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnBuscarProdutoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscarProdutoVenda.setText("Pesquisar Produto");
        btnBuscarProdutoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoVendaActionPerformed(evt);
            }
        });

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

        txtQtd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQtdStateChanged(evt);
            }
        });

        javax.swing.GroupLayout painelDadosLayout = new javax.swing.GroupLayout(painelDados);
        painelDados.setLayout(painelDadosLayout);
        painelDadosLayout.setHorizontalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel19)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, Short.MAX_VALUE)
                        .addComponent(btnExcluirItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdcionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelDadosLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtCodigoProduto)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelDadosLayout.setVerticalGroup(
            painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProdutoVenda))
                .addGap(10, 10, 10)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(10, 10, 10)
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdcionarProduto)
                            .addComponent(btnExcluirItem))
                        .addGap(10, 10, 10))))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Valor Total:");

        txtTotal.setEditable(false);
        txtTotal.setBackground(java.awt.SystemColor.controlHighlight);
        txtTotal.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        btnPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnPagamento.setText("Pagamento");
        btnPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
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

        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "CÓD. BARRA", "PRODUTO", "QNT", "R$ UNI.", "SUBTOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVendasMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tabelaVendas);

        txtExcluido.setEditable(false);

        jLabel22.setText("Data da Venda");

        txtDataVenda.setEditable(false);
        txtDataVenda.setBackground(java.awt.SystemColor.controlHighlight);
        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)))
                .addGap(16, 16, 16)
                .addComponent(painelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtExcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagamento)
                    .addComponent(btnCancelar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txtExcluido.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPDV, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtDataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataVendaActionPerformed
        Data();
    }//GEN-LAST:event_txtDataVendaActionPerformed

    private void txtCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            //int pcode = Integer.parseInt(txtCodigoProduto.getText());
            String pcode = txtCodigoProduto.getText();

            try {
                /*
                       String sql = ""
                        + "SELECT "
                        + "c.id_compra, "
                        + "c.compra_data, "
                        + "c.compra_preco_venda, "
                        + "p.pro_cod_barra, "
                        + "p.pro_nome, "
                        + "p.pro_estoque "
                        + "FROM tbl_compra as c "
                        + "INNER JOIN tbl_produto as p "
                        + "ON (c.fk_produto = p.id_produto)"
                        + "WHERE id_compra = ?";
*/
                       String sql = ""
                               + "SELECT * "
                               + "FROM tbl_produto"
                               + "WHERE pro_cod_barra = ?";
                               //+ "WHERE id_produto = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, pcode);
                rs = pst.executeQuery();
                
                if (rs.next() == false) 
                {
                    JOptionPane.showMessageDialog(this, "Produto não Encontrado");
                } 
                else 
                {
                   
                    
                    String pnome = rs.getString("pro_nome");
                    //String ppreco = rs.getString("c.compra_preco_venda");

                    txtNomeProduto.setText(pnome.trim());
                    //txtPreco.setText(ppreco.trim());

                }
            } catch (SQLException ex)
            {
                Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_txtCodigoProdutoKeyPressed
    
    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        Pagamento();
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tabelaVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVendasMouseClicked
        TabelaVendas();
    }//GEN-LAST:event_tabelaVendasMouseClicked

    private void btnAdcionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcionarProdutoActionPerformed
        AdcionarItem();
    }//GEN-LAST:event_btnAdcionarProdutoActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        ExcluirItem();
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void btnBuscarProdutoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoVendaActionPerformed
        //Busca Produto por código.

        BuscarCodProduto();

    }//GEN-LAST:event_btnBuscarProdutoVendaActionPerformed

    private void txtQtdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQtdStateChanged
     int qnt = Integer.parseInt(txtQtd.getValue().toString());
    }//GEN-LAST:event_txtQtdStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdcionarProduto;
    javax.swing.JButton btnBuscarProdutoVenda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jPDV;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel painelDados;
    private javax.swing.JTable tabelaVendas;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtExcluido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JSpinner txtQtd;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void Data() {
        Date data = new Date();
        SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy");
        String dataformat = dataAtual.format(data);
        txtDataVenda.setText(dataformat);
    }

    private void BuscarCodProduto() {

        CompraDTO obj = new CompraDTO();
        CompraDAO dao = new CompraDAO();

        obj = dao.buscarCompraProduto(Integer.parseInt(txtCodigoProduto.getText()));
        txtNomeProduto.setText(obj.getProduto().getNomeProduto());
        txtPreco.setText(String.valueOf(obj.getCompraPrecoVenda()));

    }

    private void Pagamento() {

        if (txtTotal.getText().equals("") || txtTotal.getText().equals("R$ 0.0")) {
            JOptionPane.showMessageDialog(null, "Falta adicionar produtos");
            txtCodigoProduto.requestFocus();
        } else {
            Pagamento pg = new Pagamento();
            pg.txtTotal.setText(String.valueOf(total));
            pg.itenstabelavenda = itensvenda;
            pg.setVisible(true);
            this.dispose();
        }
    }

    private void Limpar() {
        txtCodigoProduto.setText("");
        //txtQtd.setText("");
    }

    private void AdcionarItem() {
        dtoproduto = daoproduto.pesquisarCodigoProduto(Integer.parseInt(txtCodigoProduto.getText()));
        //qtd = Integer.parseInt(txtQtd.getText());
        if (qtd > 0) {
            if (dtoproduto.getEstoqueProduto() > 0 && dtoproduto.getEstoqueProduto() >= qtd) {
                preco = Double.parseDouble(txtPreco.getText());

                subtotal = qtd * preco;

                total += subtotal;
                txtTotal.setText("R$ " + String.valueOf(total));

                //Adicionar o produto no carrinho
                itensvenda = (DefaultTableModel) tabelaVendas.getModel();

                itensvenda.addRow(new Object[]{
                    txtCodigoProduto.getText(),
                    txtNomeProduto.getText(),
                    //txtQtd.getText(),
                    txtPreco.getText(),
                    subtotal

                });

            } else {
                JOptionPane.showMessageDialog(null, "Quantidade maior. O estoque = " + dtoproduto.getEstoqueProduto());
                //txtQtd.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantidade deve ser maior que 0 ");
            //txtQtd.setText("");
        }

    }

    private void ExcluirItem() {

        itensvenda = (DefaultTableModel) tabelaVendas.getModel();

        itensvenda.removeRow(tabelaVendas.getSelectedRow());
        tabelaVendas.setModel(itensvenda);

        ex = Double.parseDouble(txtExcluido.getText());

        total = total - ex;
        txtTotal.setText("R$ " + String.valueOf(total));
        txtExcluido.setText("");
    }

    private void TabelaVendas() {
        txtExcluido.setText(tabelaVendas.getValueAt(tabelaVendas.getSelectedRow(), 6).toString());
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
