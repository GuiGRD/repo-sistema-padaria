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

        jNome = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        JTPainelCliente = new javax.swing.JTabbedPane();
        painelCadCliente = new javax.swing.JPanel();
        painelEndereco = new javax.swing.JPanel();
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
        jLabel26 = new javax.swing.JLabel();
        txtMensalista = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        painelConCliente = new javax.swing.JPanel();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnBuscaNome = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        tabelaConCliente = new javax.swing.JTable();
        btnExcluir1 = new javax.swing.JButton();
        btnEditar1 = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNome.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome.setText("CLIENTE");
        jNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 808, 39));

        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel.setPreferredSize(new java.awt.Dimension(1000, 500));

        JTPainelCliente.setBackground(new java.awt.Color(255, 255, 255));

        painelCadCliente.setBackground(new java.awt.Color(255, 255, 255));
        painelCadCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelCadCliente.setForeground(new java.awt.Color(51, 153, 255));
        painelCadCliente.setToolTipText("");
        painelCadCliente.setPreferredSize(new java.awt.Dimension(1000, 500));

        painelEndereco.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel26.setText("*Mensalista");

        txtMensalista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        txtMensalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensalistaActionPerformed(evt);
            }
        });

        jLabel1.setText("(dd/mm/aaaa)");

        javax.swing.GroupLayout painelEnderecoLayout = new javax.swing.GroupLayout(painelEndereco);
        painelEndereco.setLayout(painelEnderecoLayout);
        painelEnderecoLayout.setHorizontalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37)
                                .addComponent(jLabel36)
                                .addComponent(jLabel35)
                                .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel39)
                            .addComponent(jLabel38)
                            .addComponent(jLabel30))
                        .addGap(26, 26, 26)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelEnderecoLayout.createSequentialGroup()
                                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(txtMensalista, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelEnderecoLayout.setVerticalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMensalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(15, 15, 15)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(15, 15, 15)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(15, 15, 15)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel34.setText("ID");

        javax.swing.GroupLayout painelCadClienteLayout = new javax.swing.GroupLayout(painelCadCliente);
        painelCadCliente.setLayout(painelCadClienteLayout);
        painelCadClienteLayout.setHorizontalGroup(
            painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadClienteLayout.createSequentialGroup()
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadClienteLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(painelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadClienteLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelCadClienteLayout.setVerticalGroup(
            painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addComponent(painelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        JTPainelCliente.addTab("Cadastrar", painelCadCliente);

        painelConCliente.setBackground(new java.awt.Color(255, 255, 255));

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
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "NASCIMENTO", "CELULAR", "MENSAL", "CEP", "RUA", "Nº", "BAIRRO", "CIDADE", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
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
                .addGap(137, 137, 137)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelConClienteLayout.createSequentialGroup()
                .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        painelConClienteLayout.setVerticalGroup(
            painelConClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConClienteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelConClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnBuscaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        JTPainelCliente.addTab("Consulta", painelConCliente);

        btnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_usu_excluir.png"))); // NOI18N
        btnExcluir1.setText("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        btnEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TP_editar.png"))); // NOI18N
        btnEditar1.setText("Editar");
        btnEditar1.setPreferredSize(new java.awt.Dimension(91, 29));
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TP_cad.png"))); // NOI18N
        btnSalvar1.setText("Cadastrar");
        btnSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar1.setPreferredSize(new java.awt.Dimension(91, 29));
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("(*) Campos obrigatórios para preenchimento");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTPainelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTPainelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir1)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 808, 576));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMensalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensalistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensalistaActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        // Comando para fazer uma busca no banco por nome;
        Pesquisar();
        LimparBusca();
        Listar();
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void tabelaConClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConClienteMouseClicked
        CarregarCampos();
    }//GEN-LAST:event_tabelaConClienteMouseClicked

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        // Comando para excluir dados da tabela e do banco;
        Excluir();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        // Comando para editar os dados do funcionario;
        Editar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        // Comando para salvar os dados no banco de dados;
        Cadastrar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnSalvar1ActionPerformed

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
    }//GEN-LAST:event_txtAnoNascimentoKeyPressed
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPainelCliente;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JPanel painelEndereco;
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
    private javax.swing.JComboBox<String> txtMensalista;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
int id, numero;
    String nome, cpf, celular, nascimento, mensalista;
    String cep, rua, bairro, cidade, estado;

    private void Cadastrar() {

        nome = txtNome.getText();
        cpf = txtCPF.getText();
        celular = txtCelular.getText();
        nascimento = txtAnoNascimento.getText();
        mensalista = txtMensalista.getSelectedItem().toString();
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
                || mensalista.isEmpty()
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
            obj.setMensalCliente(mensalista);
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
        mensalista = txtMensalista.getSelectedItem().toString();
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
                || mensalista.isEmpty()
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
                obj.setMensalCliente(mensalista);
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

        new LimparCampos().Limpar(painelEndereco);
        txtMensalista.setSelectedIndex(0);
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
                cont.getMensalCliente(),
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
                cont.getMensalCliente(),
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
        txtMensalista.setSelectedItem(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 5).toString());
        txtCep.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 6).toString());
        txtRua.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 7).toString());
        txtNumero.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 8).toString());
        txtBairro.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 9).toString());
        txtCidade.setText(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 10).toString());
        txtEstado.setSelectedItem(tabelaConCliente.getValueAt(tabelaConCliente.getSelectedRow(), 11).toString());
    }

}
