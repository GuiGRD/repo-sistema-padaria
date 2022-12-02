/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLE.LimparCampos;
import DAO.ClienteDAO;
import DTO.ClienteDTO;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Cliente extends javax.swing.JPanel {

    public Cliente() {
        initComponents();
        Listar();
        Limpar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel = new javax.swing.JPanel();
        JTPainelCliente = new javax.swing.JTabbedPane();
        painelCadCliente = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel39 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox<>();
        txtRua = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        txtAnoNascimento = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        painelConCliente = new javax.swing.JPanel();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnBuscaNome = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        tabelaConCliente = new javax.swing.JTable();
        jNome = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setPreferredSize(new java.awt.Dimension(728, 633));
        setLayout(new java.awt.BorderLayout());

        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel.setPreferredSize(new java.awt.Dimension(1000, 800));

        JTPainelCliente.setOpaque(true);
        JTPainelCliente.setPreferredSize(new java.awt.Dimension(728, 633));

        painelCadCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelCadCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelCadCliente.setForeground(new java.awt.Color(51, 153, 255));
        painelCadCliente.setToolTipText("");
        painelCadCliente.setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel32.setText("*Número:");

        jLabel35.setText("*Bairro:");

        jLabel36.setText("*Cidade:");

        jLabel37.setText("*Estado:");

        jLabel38.setText("*CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        jLabel39.setText("*Rua:");

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CA", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        jLabel30.setText("*Celular:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel22.setText("*Nascimento");

        try {
            txtAnoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAnoNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnoNascimentoKeyPressed(evt);
            }
        });

        jLabel25.setText("*CPF/CNPJ");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
        });

        jLabel28.setText("*Nome:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        jLabel1.setText("(dd/mm/aaaa)");

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel34.setText("ID");

        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("(*) Campos obrigatórios para preenchimento");

        javax.swing.GroupLayout painelCadClienteLayout = new javax.swing.GroupLayout(painelCadCliente);
        painelCadCliente.setLayout(painelCadClienteLayout);
        painelCadClienteLayout.setHorizontalGroup(
            painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadClienteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31)
                    .addGroup(painelCadClienteLayout.createSequentialGroup()
                        .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37)
                                .addComponent(jLabel36)
                                .addComponent(jLabel35)
                                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel39)
                            .addComponent(jLabel38)
                            .addComponent(jLabel30))
                        .addGap(26, 26, 26)
                        .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadClienteLayout.createSequentialGroup()
                        .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCadClienteLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1))
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome)))
                    .addGroup(painelCadClienteLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(177, 177, 177))
        );
        painelCadClienteLayout.setVerticalGroup(
            painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(15, 15, 15)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(15, 15, 15)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(15, 15, 15)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(72, 72, 72))
        );

        JTPainelCliente.addTab("Cadastrar", painelCadCliente);

        painelConCliente.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyPressed(evt);
            }
        });

        jLabel19.setText("Buscar por Nome");

        btnBuscaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscaNome.setText("Buscar");
        btnBuscaNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNomeActionPerformed(evt);
            }
        });

        Tabela.setBackground(new java.awt.Color(255, 255, 255));
        Tabela.setToolTipText("");

        tabelaConCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "NASCIMENTO", "CELULAR", "CEP", "RUA", "Nº", "BAIRRO", "CIDADE", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConCliente.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaConCliente.setRequestFocusEnabled(false);
        tabelaConCliente.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelaConCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConClienteMouseClicked(evt);
            }
        });
        Tabela.setViewportView(tabelaConCliente);

        javax.swing.GroupLayout painelConClienteLayout = new javax.swing.GroupLayout(painelConCliente);
        painelConCliente.setLayout(painelConClienteLayout);
        painelConClienteLayout.setHorizontalGroup(
            painelConClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConClienteLayout.createSequentialGroup()
                .addGroup(painelConClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConClienteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelConClienteLayout.setVerticalGroup(
            painelConClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConClienteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelConClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnBuscaNome))
                .addGap(18, 18, 18)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        JTPainelCliente.addTab("Consulta", painelConCliente);

        jNome.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome.setText("CLIENTE");
        jNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_usu_excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TP_editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(91, 29));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TP_cad.png"))); // NOI18N
        btnSalvar.setText("Cadastrar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setPreferredSize(new java.awt.Dimension(91, 29));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JTPainelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 709, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jNome)
                .addGap(5, 5, 5)
                .addComponent(JTPainelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        add(jPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void tabelaConClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConClienteMouseClicked
        CarregarCampos();
    }//GEN-LAST:event_tabelaConClienteMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAnoNascimento.requestFocus();
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtAnoNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoNascimentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCelular.requestFocus();
        }
    }//GEN-LAST:event_txtAnoNascimentoKeyPressed

    private void txtBuscaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Pesquisar();
            LimparBusca();
        }
    }//GEN-LAST:event_txtBuscaNomeKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Comando para salvar os dados no BD;
        Cadastrar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Comando para editar os dados no BD;
        Editar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Comando para excluir dados no BD;
        Excluir();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        Pesquisar();
        LimparBusca();
        
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPainelCliente;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel painelCadCliente;
    private javax.swing.JPanel painelConCliente;
    private javax.swing.JTable tabelaConCliente;
    private javax.swing.JFormattedTextField txtAnoNascimento;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
int id, numero;
    String nome, cpf, celular, nascimento;
    String cep, rua, bairro, cidade, estado;

    private void Cadastrar() {

        nome = txtNome.getText();
        cpf = txtCPF.getText();
        celular = txtCelular.getText();
        nascimento = txtAnoNascimento.getText();
        cep = txtCep.getText();
        rua = txtRua.getText();
        numero = Integer.parseInt(txtNumero.getText());
        bairro = txtBairro.getText();
        cidade = txtCidade.getText();
        estado = txtEstado.getSelectedItem().toString();

        if (nome.isEmpty()
                || cpf.equals("   .   .   -  ")
                || nascimento.equals("  /  /    ")
                || celular.isEmpty()
                || cep.equals("      -    ")
                || rua.isEmpty()
                || txtNumero.getText().equals("")
                || bairro.isEmpty()
                || cidade.isEmpty()
                || estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");

        } else {
            ClienteDTO obj = new ClienteDTO();
            obj.setNomeCliente(nome);
            obj.setCpfCliente(cpf);
            obj.setNascCliente(nascimento);
            obj.setCelularCliente(celular);
            obj.setCepCliente(cep);
            obj.setRuaCliente(rua);
            obj.setNumeroCliente(numero);
            obj.setBairroCliente(bairro);
            obj.setCidadeCliente(cidade);
            obj.setEstadoCliente(estado);

            ClienteDAO objdao = new ClienteDAO();
            objdao.cadastrarCliente(obj);
        }
    }

    private void Editar() {
        id = Integer.parseInt(txtId.getText().toString());
        nome = txtNome.getText();
        cpf = txtCPF.getText();
        celular = txtCelular.getText();
        nascimento = txtAnoNascimento.getText();
        cep = txtCep.getText();
        rua = txtRua.getText();
        numero = Integer.parseInt(txtNumero.getText().toString());
        bairro = txtBairro.getText();
        cidade = txtCidade.getText();
        estado = txtEstado.getSelectedItem().toString();

        if (nome.isEmpty()
                || cpf.equals("   .   .   -  ")
                || nascimento.equals("  /  /    ")
                || celular.isEmpty()
                || cep.equals("      -    ")
                || rua.isEmpty()
                || txtNumero.getText().equals("")
                || bairro.isEmpty()
                || cidade.isEmpty()
                || estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios");
        } else {
            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente editar?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                ClienteDTO obj = new ClienteDTO();

                obj.setIdCliente(id);
                obj.setNomeCliente(nome);
                obj.setCpfCliente(cpf);
                obj.setNascCliente(nascimento);
                obj.setCelularCliente(celular);
                obj.setCepCliente(cep);
                obj.setRuaCliente(rua);
                obj.setNumeroCliente(numero);
                obj.setBairroCliente(bairro);
                obj.setCidadeCliente(cidade);
                obj.setEstadoCliente(estado);

                ClienteDAO objdao = new ClienteDAO();
                objdao.editarCliente(obj);
            }
        }
    }

    private void Limpar() {
        new LimparCampos().Limpar(painelCadCliente);

        txtEstado.setSelectedIndex(0);
    }

    private void LimparBusca() {
        txtBuscaNome.setText("");
    }

    private void Listar()//mostra as informacoes do banco na tabela
    {
        ClienteDAO objdao = new ClienteDAO();
        List<ClienteDTO> lista = objdao.listarCliente();
        DefaultTableModel model = (DefaultTableModel) tabelaConCliente.getModel();
        model.setNumRows(0);

        for (ClienteDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdCliente(),
                cont.getNomeCliente(),
                cont.getCpfCliente(),
                cont.getNascCliente(),
                cont.getCelularCliente(),
                cont.getCepCliente(),
                cont.getRuaCliente(),
                cont.getNumeroCliente(),
                cont.getBairroCliente(),
                cont.getCidadeCliente(),
                cont.getEstadoCliente()});
        }
    }

    private void Excluir() {
        id = Integer.parseInt(txtId.getText());

        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há Cliente selecionado para exclusão");
        } else {
            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                ClienteDTO obj = new ClienteDTO();

                obj.setIdCliente(id);

                ClienteDAO dao = new ClienteDAO();
                dao.excluirCliente(obj);
            }
        }
    }

    private void Pesquisar() {

        nome = txtNome.getText();
        String nome = "%" + txtBuscaNome.getText() + "%";

        ClienteDAO objdao = new ClienteDAO();
        List<ClienteDTO> lista = objdao.buscarCliente(nome);
        DefaultTableModel model = (DefaultTableModel) tabelaConCliente.getModel();
        model.setNumRows(0);

        for (ClienteDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdCliente(),
                cont.getNomeCliente(),
                cont.getCpfCliente(),
                cont.getNascCliente(),
                cont.getCelularCliente(),
                cont.getCepCliente(),
                cont.getRuaCliente(),
                cont.getNumeroCliente(),
                cont.getBairroCliente(),
                cont.getCidadeCliente(),
                cont.getEstadoCliente()});
        }
    }

    private void CarregarCampos() //Carrega as informacoes para edicao na tela de cadastro 
    {
        JTPainelCliente.setSelectedIndex(0);
        txtId.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 1).toString());
        txtCPF.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 2).toString());
        txtAnoNascimento.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 3).toString());
        txtCelular.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 4).toString());
        txtCep.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 5).toString());
        txtRua.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 6).toString());
        txtNumero.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 7).toString());
        txtBairro.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 8).toString());
        txtCidade.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 9).toString());
        txtEstado.setSelectedItem(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 10).toString());
    }

}
