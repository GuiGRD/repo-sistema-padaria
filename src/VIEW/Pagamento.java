/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import DAO.ProdutoDAO;
import DAO.VendasDAO;
import DTO.ProdutoDTO;
import DTO.VendasDTO;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class Pagamento extends javax.swing.JFrame {
    
    ClienteDTO objcliente = new ClienteDTO();
    DefaultTableModel itenstabelavenda;
    private final Venda venda;
    
    
    public Pagamento() {
        initComponents();
        venda = new Venda();

        //AutoCompleteDecorator.decorate(cbxCliente);
        //ClienteCbx();

        LimpaPag();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jNome1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        txtPix = new javax.swing.JTextField();
        txtCartao = new javax.swing.JTextField();
        txtDinheiro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtDesconto = new javax.swing.JTextField();
        btnCancelarPagamento = new javax.swing.JButton();
        btnConfirmarPagamento = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        txtClienteCpf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        txtBuscarCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jNome1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jNome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome1.setText("Finalizar Venda");
        jNome1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jNome1.setMaximumSize(new java.awt.Dimension(156, 43));
        jNome1.setMinimumSize(new java.awt.Dimension(156, 43));
        jNome1.setPreferredSize(new java.awt.Dimension(156, 43));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Dinheiro:");

        jLabel5.setText("Cartão:");

        jLabel6.setText("Pix:");

        jLabel7.setText("Troco:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("R$ TOTAL A PAGAR");

        txtSubTotal.setEditable(false);
        txtSubTotal.setBackground(java.awt.SystemColor.controlHighlight);
        txtSubTotal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtTroco.setEditable(false);
        txtTroco.setBackground(java.awt.SystemColor.controlHighlight);
        txtTroco.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txtPix.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPixKeyPressed(evt);
            }
        });

        txtCartao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCartao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCartaoKeyPressed(evt);
            }
        });

        txtDinheiro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtDinheiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDinheiroKeyPressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("R$ SUB TOTAL");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("DESCONTO");

        txtTotal.setEditable(false);
        txtTotal.setBackground(java.awt.SystemColor.controlHighlight);
        txtTotal.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        btnCancelarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_excluir.png"))); // NOI18N
        btnCancelarPagamento.setText("Cancelar");
        btnCancelarPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPagamentoActionPerformed(evt);
            }
        });

        btnConfirmarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnConfirmarPagamento.setText("Confirmar");
        btnConfirmarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPagamentoActionPerformed(evt);
            }
        });

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscarCliente.setText("Pesquisar ");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        txtCliente.setEditable(false);
        txtCliente.setBackground(java.awt.SystemColor.controlHighlight);
        txtCliente.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtClienteCpf.setEditable(false);
        txtClienteCpf.setBackground(java.awt.SystemColor.controlHighlight);
        txtClienteCpf.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtClienteCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCpfActionPerformed(evt);
            }
        });

        jLabel11.setText("Cliente:");

        jLabel12.setText("CPF do Cliente:");

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox2.setText("Convênio");
        jCheckBox2.setAlignmentX(1.9F);
        jCheckBox2.setAlignmentY(1.9F);
        jCheckBox2.setAutoscrolls(true);
        jCheckBox2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        txtBuscarCliente.setText("   .   .   -  ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPix, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSubTotal)
                                            .addComponent(txtDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(txtTotal)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                            .addComponent(txtClienteCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelarPagamento)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addComponent(txtClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDinheiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarPagamento)
                    .addComponent(btnCancelarPagamento))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(294, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(322, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPixKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PgPix();
        }
    }//GEN-LAST:event_txtPixKeyPressed

    private void txtCartaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCartaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PgCartao();
        }
    }//GEN-LAST:event_txtCartaoKeyPressed

    private void txtDinheiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDinheiroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PgDinheiro();
        }
    }//GEN-LAST:event_txtDinheiroKeyPressed

    private void btnCancelarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPagamentoActionPerformed
        CancelarPagamento();
    }//GEN-LAST:event_btnCancelarPagamentoActionPerformed

    private void btnConfirmarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPagamentoActionPerformed
        ConfirmarPagamento();
    }//GEN-LAST:event_btnConfirmarPagamentoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        BuscarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtClienteCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCpfActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelarPagamento;
    private javax.swing.JButton btnConfirmarPagamento;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jNome1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCartao;
    public javax.swing.JTextField txtCliente;
    public javax.swing.JTextField txtClienteCpf;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextField txtPix;
    public javax.swing.JTextField txtSubTotal;
    public javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTroco;
    // End of variables declaration//GEN-END:variables

    private void CancelarPagamento() 
    {
        MENU obj = new MENU();
        obj.PainelDashboard.removeAll();
        obj.PainelDashboard.add(venda);
        obj.PainelDashboard.repaint();
        obj.PainelDashboard.revalidate();
        obj.PainelDashboard.setVisible(true);


    }

    private void BuscarCliente() {

        ClienteDAO dao = new ClienteDAO();

        objcliente = dao.pesquisarCPFCliente(txtClienteCpf.getText());

        if (objcliente.getNomeCliente() == null) {
            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Cliente não encontrado. Deseja realizar o cadastro ?", "Atenção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {
                Cliente objcli = new Cliente();
                objcli.setVisible(true);
            }

        } else {
            txtCliente.setText(objcliente.getNomeCliente());
            txtClienteCpf.setText(objcliente.getCpfCliente());
            txtDesconto.requestFocus();
        }
    }

    private void PgDinheiro() {

        double pgcartao, pgdinheiro, pgpix, troco, totalpagar, totalvenda, desconto, valorsubtotal, subtotal;

        VendasDTO obj = new VendasDTO();
        valorsubtotal = obj.getTotalVenda();

        subtotal = Double.parseDouble(txtSubTotal.getText());
        txtSubTotal.setText(String.valueOf(valorsubtotal));

        desconto = Double.parseDouble(txtDesconto.getText());

        pgdinheiro = Double.parseDouble(txtDinheiro.getText());
        pgcartao = Double.parseDouble(txtCartao.getText());
        pgpix = Double.parseDouble(txtPix.getText());

        // Calculo do Valor Total
        totalvenda = subtotal - desconto;
        txtTotal.setText(String.valueOf(totalvenda));

        // Calculo do Troco
        totalpagar = pgdinheiro + pgcartao + pgpix;

        troco = totalpagar - totalvenda;
        txtTroco.setText(String.valueOf(troco));
        txtCartao.requestFocus();
    }

    private void PgCartao() {
        double pgcartao, pgdinheiro, pgpix, troco, totalpagar, totalvenda, desconto, valorsubtotal, subtotal;

        VendasDTO obj = new VendasDTO();
        valorsubtotal = obj.getTotalVenda();

        subtotal = Double.parseDouble(txtSubTotal.getText());
        txtSubTotal.setText(String.valueOf(valorsubtotal));

        desconto = Double.parseDouble(txtDesconto.getText());

        pgdinheiro = Double.parseDouble(txtDinheiro.getText());
        pgcartao = Double.parseDouble(txtCartao.getText());
        pgpix = Double.parseDouble(txtPix.getText());

        // Calculo do Valor Total
        totalvenda = subtotal - desconto;
        txtTotal.setText(String.valueOf(totalvenda));

        // Calculo do Troco
        totalpagar = pgdinheiro + pgcartao + pgpix;

        troco = totalpagar - totalvenda;
        txtTroco.setText(String.valueOf(troco));
        txtPix.requestFocus();
    }

    private void PgPix() {
        double pgcartao, pgdinheiro, pgpix, troco, totalpagar, totalvenda, desconto, valorsubtotal, subtotal;

        VendasDTO obj = new VendasDTO();
        valorsubtotal = obj.getTotalVenda();

        subtotal = Double.parseDouble(txtSubTotal.getText());
        txtSubTotal.setText(String.valueOf(valorsubtotal));

        desconto = Double.parseDouble(txtDesconto.getText());

        pgdinheiro = Double.parseDouble(txtDinheiro.getText());
        pgcartao = Double.parseDouble(txtCartao.getText());
        pgpix = Double.parseDouble(txtPix.getText());

        // Calculo do Valor Total
        totalvenda = subtotal - desconto;
        txtTotal.setText(String.valueOf(totalvenda));

        // Calculo do Troco
        totalpagar = pgdinheiro + pgcartao + pgpix;

        troco = totalpagar - totalvenda;
        txtTroco.setText(String.valueOf(troco));
    }

    private void ConfirmarPagamento() {
        int op;
        Object[] options = {"Cancelar", "Confirmar"};
        op = JOptionPane.showOptionDialog(null, "Confirma finalização do pagamento?", "Pagamento", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (op == 1) {
            double pagcartao, pagdinheiro, pagcheque, totalpago, totalvenda, troco;

            pagcartao = Double.parseDouble(txtCartao.getText());
            pagcheque = Double.parseDouble(txtPix.getText());
            pagdinheiro = Double.parseDouble(txtDinheiro.getText());
            totalvenda = Double.parseDouble(txtTotal.getText());

            // Calculo do Troco
            totalpago = pagcartao + pagcheque + pagdinheiro;

            troco = totalpago - totalvenda;
            txtTroco.setText(String.valueOf(troco));

            if (totalpago >= totalvenda) {
                VendasDTO objvenda = new VendasDTO();

                // Dados do cliente (ID)
                objvenda.setCliente(objcliente);

                // Pega data atual
                Date data = new Date();
                SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy");
                String dataformat = dataAtual.format(data);

                objvenda.setDataVenda(dataformat);

                // Total da venda
                objvenda.setTotalVenda(totalvenda);

                VendasDAO daovenda = new VendasDAO();
                daovenda.cadastrarVenda(objvenda);

                // Retorna o ID da ultima venda realizada
                objvenda.setIdVenda(daovenda.retornarVenda());

                // Cadastrando os produtos na tabela itensvendas
                for (int i = 0; i < itenstabelavenda.getRowCount(); i++) {
                    int estoque, qnt_vendida, qnt_atualizada;

                    ProdutoDTO objproduto = new ProdutoDTO();
                    ProdutoDAO produtodao = new ProdutoDAO();

                    objproduto.setIdProduto(Integer.parseInt(itenstabelavenda.getValueAt(i, 0).toString()));
                    objvenda.setProduto(objproduto);
                    objvenda.setQntVenda(Integer.parseInt(itenstabelavenda.getValueAt(i, 2).toString()));
                    objvenda.setTotalVenda(Double.parseDouble(itenstabelavenda.getValueAt(i, 4).toString()));

                    // Baixa no estoque
                    estoque = produtodao.retornaEstoqueAtual(objproduto.getIdProduto());
                    qnt_vendida = Integer.parseInt(itenstabelavenda.getValueAt(i, 2).toString());
                    qnt_atualizada = estoque - qnt_vendida;

                    produtodao.atualizarEstoque(objproduto.getIdProduto(), qnt_atualizada);

                    VendasDAO vendadao = new VendasDAO();
                    vendadao.cadastrarVenda(objvenda);
                }

                JOptionPane.showMessageDialog(null, "Venda registrada com sucesso com sucesso!");
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada: valor menor que o total da compra.");
            }

        }
    }


    private void LimpaPag() {
        txtDinheiro.setText("0");
        txtCartao.setText("0");
        txtPix.setText("0");
        txtTroco.setText("0");
    }

   
    /**
Vector<Integer> id_cliente = new Vector<Integer>();

    public void ClienteCbx() {
        try {
            ClienteDAO obj = new ClienteDAO();
            ResultSet rs = obj.CBXlistarNomeCliente();

            while (rs.next()) {
                id_cliente.addElement(rs.getInt(1));//Armazenando o 1 elemento do sql no id, Na minha chave primaria
                cbxCliente.addItem(rs.getString(2));// Armazenando o 2 elemento do sql que é o nome 

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Carregar");
        }

    }
*/


}