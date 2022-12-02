package VIEW;

import CONTROLE.LimparCampos;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuario extends javax.swing.JPanel {

    UsuarioDTO objdto = new UsuarioDTO();
    UsuarioDAO objdao = new UsuarioDAO();

    public Usuario() {
        initComponents();
        //Listar();
        Limpar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        JTPainelUsuario = new javax.swing.JTabbedPane();
        painelCadUsuario = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtPerfil = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        btnBuscarUsuarioCAD = new javax.swing.JButton();
        painelConUsuario = new javax.swing.JPanel();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnBuscaNome = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        tabelaConUsuario = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jNome = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JTPainelUsuario.setPreferredSize(new java.awt.Dimension(1000, 500));

        painelCadUsuario.setBackground(new java.awt.Color(255, 255, 255));
        painelCadUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelCadUsuario.setForeground(new java.awt.Color(51, 153, 255));
        painelCadUsuario.setToolTipText("");
        painelCadUsuario.setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("(*) Campos obrigatórios para preenchimento");

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel34.setText("ID");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("*Nome:");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("*Login:");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("*Senha:");

        txtSenha.setToolTipText("");
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Caixa", "Escritório" }));
        txtPerfil.setToolTipText("Selecione:"); // NOI18N
        txtPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilActionPerformed(evt);
            }
        });

        jLabel26.setText("*Perfil de Acesso:");

        txtCPF.setBackground(java.awt.SystemColor.controlHighlight);
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setEnabled(false);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("CPF");

        btnBuscarUsuarioCAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscarUsuarioCAD.setText("Pesquisar");
        btnBuscarUsuarioCAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioCADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadUsuarioLayout = new javax.swing.GroupLayout(painelCadUsuario);
        painelCadUsuario.setLayout(painelCadUsuarioLayout);
        painelCadUsuarioLayout.setHorizontalGroup(
            painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadUsuarioLayout.createSequentialGroup()
                .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadUsuarioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadUsuarioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel31))
                    .addGroup(painelCadUsuarioLayout.createSequentialGroup()
                        .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadUsuarioLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel26))
                        .addGap(25, 25, 25)
                        .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCadUsuarioLayout.createSequentialGroup()
                                .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarUsuarioCAD)))))
                .addGap(116, 116, 116))
        );
        painelCadUsuarioLayout.setVerticalGroup(
            painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(30, 30, 30)
                .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuarioCAD))
                .addGap(30, 30, 30)
                .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(35, 35, 35)
                .addGroup(painelCadUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        JTPainelUsuario.addTab("Cadastrar", painelCadUsuario);

        painelConUsuario.setBackground(new java.awt.Color(255, 255, 255));

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

        Tabela.setToolTipText("");

        tabelaConUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "LOGIN", "SENHA", "PERFIL DE ACESSO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConUsuarioMouseClicked(evt);
            }
        });
        Tabela.setViewportView(tabelaConUsuario);

        javax.swing.GroupLayout painelConUsuarioLayout = new javax.swing.GroupLayout(painelConUsuario);
        painelConUsuario.setLayout(painelConUsuarioLayout);
        painelConUsuarioLayout.setHorizontalGroup(
            painelConUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConUsuarioLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelConUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        painelConUsuarioLayout.setVerticalGroup(
            painelConUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConUsuarioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelConUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnBuscaNome))
                .addGap(16, 16, 16)
                .addComponent(Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(215, 215, 215))
        );

        JTPainelUsuario.addTab("Consulta", painelConUsuario);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TP_cad.png"))); // NOI18N
        btnSalvar.setText("Cadastrar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TP_editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(104, 26));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_usu_excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap(274, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(JTPainelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(JTPainelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addGap(15, 15, 15))
        );

        jNome.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome.setText("USUÁRIO");
        jNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilActionPerformed

    }//GEN-LAST:event_txtPerfilActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        // Comando para fazer uma busca no banco por nome;
        Pesquisar();
        LimparBusca();
        //Listar();
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void tabelaConUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConUsuarioMouseClicked
        CarregarCampos();
    }//GEN-LAST:event_tabelaConUsuarioMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Comando para salvar os dados no banco de dados;
        Cadastrar();
        Limpar();
        //Listar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Comando para editar os dados do funcionario;
        Editar();
        Limpar();
        //Listar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Comando para excluir dados da tabela e do banco;
        Excluir();
        //Listar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarUsuarioCADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioCADActionPerformed
        //Busca nome do Usuario.

        //objdto = objdao.PesquisarUsuario((txtUsuario.getText()));

        //txtCPF.setText(String.valueOf(objdto.getFuncionario().getCpfFuncionario()));

    }//GEN-LAST:event_btnBuscarUsuarioCADActionPerformed

    private void txtBuscaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //Pesquisar();
        }
    }//GEN-LAST:event_txtBuscaNomeKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_txtUsuarioKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPainelUsuario;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnBuscaNome;
    javax.swing.JButton btnBuscarUsuarioCAD;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel painelCadUsuario;
    private javax.swing.JPanel painelConUsuario;
    private javax.swing.JTable tabelaConUsuario;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JComboBox<String> txtPerfil;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
 String nome, cpf, login, senha, acesso;
    int id;

    private void Cadastrar() {
        nome = txtUsuario.getText();
        login = txtLogin.getText();
        cpf = txtCPF.getText();
        senha = txtSenha.getText();
        acesso = txtPerfil.getSelectedItem().toString();

        if (nome.isEmpty() 
                || login.isEmpty() 
                || senha.isEmpty() 
                || acesso.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");

        } else {

            //objdto.setFuncionario(nome);
            //objdto.setFuncionario(cpf);
            objdto.setLoginUsuario(login);
            objdto.setSenhaUsuario(senha);
            objdto.setPerfilUsuario(acesso);
            
            UsuarioDAO objdao = new UsuarioDAO();
            objdao.cadastrarUsuario(objdto);
        }
    }

    private void Limpar() {

        new LimparCampos().Limpar(painelCadUsuario);

    }

    private void LimparBusca() {
        txtBuscaNome.setText("");
    }

    private void Editar() {
        id = Integer.parseInt(txtId.getText());
        nome = txtUsuario.getText();
        cpf = txtCPF.getText();
        login = txtLogin.getText();
        senha = txtSenha.getText();
        acesso = txtPerfil.getSelectedItem().toString();

        if (nome.isEmpty()
                || cpf.equals("   .   .   -  ")
                || login.isEmpty()
                || senha.isEmpty()
                || acesso.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");

        } else {
            int opcao;
            Object[] confirmacao = {"Cancelar", "Confirmar"};
            opcao = JOptionPane.showOptionDialog(null, "Deseja realmente editar?", "Atenção",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, confirmacao, confirmacao[1]);
            if (opcao == 1) {

                objdto.setIdUsuario(id);
                //objdto.setFuncionario(nome);
                //objdto.setFuncionario(cpf);
                objdto.setLoginUsuario(login);
                objdto.setSenhaUsuario(senha);
                objdto.setPerfilUsuario(acesso);
                
                UsuarioDAO objdao = new UsuarioDAO();
                objdao.editarUsuario(objdto);
            }
        }
    }

    private void Excluir() {
        id = Integer.parseInt(txtId.getText());

        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há Usuário selecionado para exclusão");
        } else {
            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                objdto.setIdUsuario(id);
                
                UsuarioDAO objdao = new UsuarioDAO();
                objdao.excluirUsuario(objdto);
            }
        }
    }

    private void Listar()//mostra as informacoes do banco na tabela
    {
        UsuarioDAO objdao = new UsuarioDAO();
        List<UsuarioDTO> lista = objdao.listarUsuario();
        DefaultTableModel model = (DefaultTableModel) tabelaConUsuario.getModel();
        model.setNumRows(0);

        for (UsuarioDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdUsuario(),
                cont.getFuncionario().getNomeFuncionario(),
                cont.getFuncionario().getCpfFuncionario(),
                cont.getLoginUsuario(),
                cont.getSenhaUsuario(),
                cont.getPerfilUsuario()});
        }
    }

    private void Pesquisar() {
        nome = txtUsuario.getText();
        String nome = "%" + txtBuscaNome.getText() + "%";

        UsuarioDAO objdao = new UsuarioDAO();
        List<UsuarioDTO> lista = objdao.buscarUsuario(nome);
        DefaultTableModel model = (DefaultTableModel) tabelaConUsuario.getModel();
        model.setNumRows(0);

        for (UsuarioDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdUsuario(),
                cont.getFuncionario().getNomeFuncionario(),
                cont.getFuncionario().getCpfFuncionario(),
                cont.getLoginUsuario(),
                cont.getPerfilUsuario()});
        }
    }

    /*
        private void PesquisarCad() 
    {
    
        String nome;
        nome = "%" + txtUsuario.getText() + "%";

        UsuarioDAO objdao = new UsuarioDAO();
        List<UsuarioDTO> lista = objdao.buscarUsuario(nome);
        DefaultTableModel model = (DefaultTableModel) tabelaConUsuario.getModel();
        model.setNumRows(0);
        
        //Busca Produto por código.
        UusarioDTO objdto = new UsuarioDTO();
        UsuarioDAO objdao = new UsuarioDAO();

        //objdto = objdao.buscarUsuario(txtUsuario.getText());
        objdto = objdao.buscarUsuario(nome);
        //objdto = objdao.buscarCompraProdutoNome(txtNomeProduto.getText());

        //txtNomeProduto.setText(objdto.getProduto().getNomeProduto());
        //txtPreco.setText(Double.valueOf(objdto.getCompraPreco()));
        //txtCPF.setText(objdto.get()));
        }
     */
    private void CarregarCampos() {

        JTPainelUsuario.setSelectedIndex(0);
        txtId.setText(tabelaConUsuario.getValueAt(tabelaConUsuario.getSelectedRow(), 0).toString());
        txtUsuario.setText(tabelaConUsuario.getValueAt(tabelaConUsuario.getSelectedRow(), 1).toString());
        txtCPF.setText(tabelaConUsuario.getValueAt(tabelaConUsuario.getSelectedRow(), 2).toString());
        txtLogin.setText(tabelaConUsuario.getValueAt(tabelaConUsuario.getSelectedRow(), 3).toString());
        txtSenha.setText(tabelaConUsuario.getValueAt(tabelaConUsuario.getSelectedRow(), 4).toString());
        txtPerfil.setSelectedItem(tabelaConUsuario.getValueAt(tabelaConUsuario.getSelectedRow(), 5).toString());
    }

}
