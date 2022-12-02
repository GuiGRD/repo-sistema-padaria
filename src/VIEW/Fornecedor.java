package VIEW;

import UTILIDADES.LimparCampos;
import DAO.FornecedorDAO;
import DTO.FornecedorDTO;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fornecedor extends javax.swing.JPanel {

    public Fornecedor() {
        initComponents();
        Listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane = new javax.swing.JTabbedPane();
        painelCadFornecedor = new javax.swing.JPanel();
        painelDadosPessoais = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel42 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        painelConFornecedor = new javax.swing.JPanel();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnBuscaNome = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        tabelaConFornecedor = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1280, 800));
        setPreferredSize(new java.awt.Dimension(730, 580));

        jNome.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome.setText("FORNECEDOR");
        jNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(728, 633));

        painelCadFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        painelCadFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelCadFornecedor.setForeground(new java.awt.Color(51, 153, 255));
        painelCadFornecedor.setToolTipText("");

        painelDadosPessoais.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("*CNPJ");

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("*Nome:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("*Celular:");

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Rua:");

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Nº:");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Bairro:");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Cidade:");

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Estado:");

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CA", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout painelDadosPessoaisLayout = new javax.swing.GroupLayout(painelDadosPessoais);
        painelDadosPessoais.setLayout(painelDadosPessoaisLayout);
        painelDadosPessoaisLayout.setHorizontalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDadosPessoaisLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEstado, 0, 1, Short.MAX_VALUE)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosPessoaisLayout.setVerticalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtCNPJ))
                .addGap(15, 15, 15)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(15, 15, 15)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("(*) Campos obrigatórios para preenchimento:");

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel34.setText("ID");

        javax.swing.GroupLayout painelCadFornecedorLayout = new javax.swing.GroupLayout(painelCadFornecedor);
        painelCadFornecedor.setLayout(painelCadFornecedorLayout);
        painelCadFornecedorLayout.setHorizontalGroup(
            painelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadFornecedorLayout.createSequentialGroup()
                .addGroup(painelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadFornecedorLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel31))
                    .addGroup(painelCadFornecedorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadFornecedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(139, 139, 139))
        );
        painelCadFornecedorLayout.setVerticalGroup(
            painelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadFornecedorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelCadFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(painelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        jTabbedPane.addTab("Cadastrar", painelCadFornecedor);

        painelConFornecedor.setBackground(new java.awt.Color(255, 255, 255));

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

        tabelaConFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CNPJ", "CELULAR", "CEP", "RUA", "Nº", "BAIRRO", "CIDADE", "ESTADO"
            }
        ));
        tabelaConFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConFornecedorMouseClicked(evt);
            }
        });
        Tabela.setViewportView(tabelaConFornecedor);

        javax.swing.GroupLayout painelConFornecedorLayout = new javax.swing.GroupLayout(painelConFornecedor);
        painelConFornecedor.setLayout(painelConFornecedorLayout);
        painelConFornecedorLayout.setHorizontalGroup(
            painelConFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConFornecedorLayout.createSequentialGroup()
                .addGroup(painelConFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConFornecedorLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConFornecedorLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Tabela)))
                .addGap(44, 44, 44))
        );
        painelConFornecedorLayout.setVerticalGroup(
            painelConFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConFornecedorLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelConFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnBuscaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Consulta", painelConFornecedor);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jNome)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        // Comando para fazer uma busca no banco por nome;
        Pesquisar();
        LimparBusca();

    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void tabelaConFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConFornecedorMouseClicked
        CarregarCampos();

    }//GEN-LAST:event_tabelaConFornecedorMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Comando para salvar os dados no banco de dados;
        Cadastrar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Comando para editar os dados do funcionario;
        Editar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Comando para excluir dados da tabela e do banco;
        Excluir();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtBuscaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Pesquisar();
            LimparBusca();
        }
    }//GEN-LAST:event_txtBuscaNomeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JPanel painelCadFornecedor;
    private javax.swing.JPanel painelConFornecedor;
    private javax.swing.JPanel painelDadosPessoais;
    private javax.swing.JTable tabelaConFornecedor;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JFormattedTextField txtCNPJ;
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
    String nome, cnpj, celular;
    String cep, rua, bairro, cidade, estado;

    private void Cadastrar() {

        nome = txtNome.getText();
        cnpj = txtCNPJ.getText();
        celular = txtCelular.getText();
        cep = txtCep.getText();
        rua = txtRua.getText();
        numero = (Integer.parseInt(txtNumero.getText()));
        bairro = txtBairro.getText();
        cidade = txtCidade.getText();
        estado = txtEstado.getSelectedItem().toString();

        if (nome.isEmpty()
                || cnpj.equals("  .   .   /    -  ")
                || celular.equals("(  )        -     ")) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");

        } else {
            FornecedorDTO obj = new FornecedorDTO();
            obj.setNomeFornecedor(nome);
            obj.setCnpjFornecedor(cnpj);
            obj.setCelularFornecedor(celular);
            obj.setCepFornecedor(cep);
            obj.setRuaFornecedor(rua);
            obj.setNumeroFornecedor(numero);
            obj.setBairroFornecedor(bairro);
            obj.setCidadeFornecedor(cidade);
            obj.setEstadoFornecedor(estado);

            FornecedorDAO objdao = new FornecedorDAO();
            objdao.cadastrarFornecedor(obj);

        }
    }

    private void Editar() {

        id = Integer.parseInt(txtId.getText().toString());
        nome = txtNome.getText();
        cnpj = txtCNPJ.getText();
        celular = txtCelular.getText();
        cep = txtCep.getText();
        rua = txtRua.getText();
        numero = Integer.parseInt(txtNumero.getText().toString());
        bairro = txtBairro.getText();
        cidade = txtCidade.getText();
        estado = txtEstado.getSelectedItem().toString();

        if (nome.isEmpty()
                || cnpj.equals("  .   .   /    -  ")
                || celular.equals("(  )        -     ")
                || cep.equals("      -    ")
                || rua.isEmpty()
                || txtNumero.getText().equals("")
                || bairro.isEmpty()
                || cidade.isEmpty()
                || estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");

        } else {
            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente editar?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                FornecedorDTO obj = new FornecedorDTO();

                obj.setIdFornecedor(id);
                obj.setNomeFornecedor(nome);
                obj.setCnpjFornecedor(cnpj);
                obj.setCelularFornecedor(celular);
                obj.setCepFornecedor(cep);
                obj.setRuaFornecedor(rua);
                obj.setNumeroFornecedor(numero);
                obj.setBairroFornecedor(bairro);
                obj.setCidadeFornecedor(cidade);
                obj.setEstadoFornecedor(estado);

                FornecedorDAO dao = new FornecedorDAO();
                dao.editarFornecedor(obj);
            }
        }
    }

    private void Limpar() {

        new LimparCampos().Limpar(painelCadFornecedor);
        new LimparCampos().Limpar(painelDadosPessoais);

        txtEstado.setSelectedIndex(0);
    }

    private void LimparBusca() {
        txtBuscaNome.setText("");
    }

    private void Listar()//mostra as informacoes do banco na tabela
    {
        FornecedorDAO objdao = new FornecedorDAO();
        List<FornecedorDTO> lista = objdao.listarFornecedor();
        DefaultTableModel model = (DefaultTableModel) tabelaConFornecedor.getModel();
        model.setNumRows(0);

        for (FornecedorDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdFornecedor(),
                cont.getNomeFornecedor(),
                cont.getCnpjFornecedor(),
                cont.getCelularFornecedor(),
                cont.getCepFornecedor(),
                cont.getRuaFornecedor(),
                cont.getNumeroFornecedor(),
                cont.getBairroFornecedor(),
                cont.getCidadeFornecedor(),
                cont.getEstadoFornecedor()
            });
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

                FornecedorDTO obj = new FornecedorDTO();

                obj.setIdFornecedor(id);

                FornecedorDAO dao = new FornecedorDAO();
                dao.excluirFornecedor(obj);
            }
        }
    }

    private void Pesquisar() {
        nome = txtNome.getText();
        String nome = "%" + txtBuscaNome.getText() + "%";

        FornecedorDAO objdao = new FornecedorDAO();
        List<FornecedorDTO> lista = objdao.buscarFornecedor(nome);
        DefaultTableModel model = (DefaultTableModel) tabelaConFornecedor.getModel();
        model.setNumRows(0);

        for (FornecedorDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdFornecedor(),
                cont.getNomeFornecedor(),
                cont.getCnpjFornecedor(),
                cont.getCelularFornecedor(),
                cont.getCepFornecedor(),
                cont.getRuaFornecedor(),
                cont.getRuaFornecedor(),
                cont.getBairroFornecedor(),
                cont.getEstadoFornecedor()});
        }
    }

    private void CarregarCampos() {
        jTabbedPane.setSelectedIndex(0);
        txtId.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 1).toString());
        txtCNPJ.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 2).toString());
        txtCelular.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 3).toString());
        txtCep.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 4).toString());
        txtRua.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 5).toString());
        txtNumero.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 6).toString());
        txtBairro.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 7).toString());
        txtCidade.setText(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 8).toString());
        txtEstado.setSelectedItem(tabelaConFornecedor.getValueAt(tabelaConFornecedor.getSelectedRow(), 9).toString());
    }

}
