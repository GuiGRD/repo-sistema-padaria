package VIEW;

import CONTROLE.LimparCampos;
import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Funcionario extends javax.swing.JPanel {

    public Funcionario() {
        initComponents();
        Listar();
        Limpar();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        JTPainelFuncionario = new javax.swing.JTabbedPane();
        painelCadFuncionario = new javax.swing.JPanel();
        painelDadosPessoais = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel57 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel59 = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        jLabel61 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtAdmissao = new javax.swing.JFormattedTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel67 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtNasc = new javax.swing.JFormattedTextField();
        txtId = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        painelConFuncionario = new javax.swing.JPanel();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscaNome = new javax.swing.JButton();
        Tabela = new javax.swing.JScrollPane();
        tabelaConFuncionario = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jNome = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(735, 586));

        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel.setOpaque(false);
        jPanel.setPreferredSize(new java.awt.Dimension(728, 633));

        painelCadFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        painelCadFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelCadFuncionario.setForeground(new java.awt.Color(51, 153, 255));
        painelCadFuncionario.setToolTipText("");
        painelCadFuncionario.setAutoscrolls(true);
        painelCadFuncionario.setPreferredSize(new java.awt.Dimension(1209, 616));

        painelDadosPessoais.setBackground(new java.awt.Color(255, 255, 255));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("*CPF");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("*Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("*Telefone/Celular:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("*Nascimento:");

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("*RG");

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("*Cargo");

        try {
            txtAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("*Admissão:");

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel65.setText("*Cidade:");

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel66.setText("*CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("*Rua:");

        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel68.setText("*Número:");

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel69.setText("*Estado:");

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "AC", "AL", "AP", "AM", "BA", "CA", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel70.setText("*Bairro:");

        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel72.setText("ID");

        javax.swing.GroupLayout painelDadosPessoaisLayout = new javax.swing.GroupLayout(painelDadosPessoais);
        painelDadosPessoais.setLayout(painelDadosPessoaisLayout);
        painelDadosPessoaisLayout.setHorizontalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(20, 20, 20)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNasc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdmissao)
                            .addComponent(txtCargo)))
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(txtRua)
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosPessoaisLayout.setVerticalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addGap(18, 18, 18)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61))
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58))
                        .addGap(10, 10, 10)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66)))
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(txtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel.setForeground(new java.awt.Color(204, 0, 0));
        jLabel.setText("(*) Campos obrigatórios para preenchimento");

        javax.swing.GroupLayout painelCadFuncionarioLayout = new javax.swing.GroupLayout(painelCadFuncionario);
        painelCadFuncionario.setLayout(painelCadFuncionarioLayout);
        painelCadFuncionarioLayout.setHorizontalGroup(
            painelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadFuncionarioLayout.createSequentialGroup()
                .addGroup(painelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadFuncionarioLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(painelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCadFuncionarioLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel)))
                .addContainerGap())
        );
        painelCadFuncionarioLayout.setVerticalGroup(
            painelCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadFuncionarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(painelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel)
                .addGap(5, 5, 5))
        );

        JTPainelFuncionario.addTab("Cadastrar", painelCadFuncionario);

        painelConFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyPressed(evt);
            }
        });

        jLabel1.setText("Buscar por Nome");

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

        tabelaConFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "RG", "NASCIMENTO", "CELULAR", "CARGO", "ADMISSÃO", "CEP", "RUA", "Nº", "BAIRRO", "CIDADE", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConFuncionarioMouseClicked(evt);
            }
        });
        Tabela.setViewportView(tabelaConFuncionario);

        javax.swing.GroupLayout painelConFuncionarioLayout = new javax.swing.GroupLayout(painelConFuncionario);
        painelConFuncionario.setLayout(painelConFuncionarioLayout);
        painelConFuncionarioLayout.setHorizontalGroup(
            painelConFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConFuncionarioLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConFuncionarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Tabela)
                .addGap(15, 15, 15))
        );
        painelConFuncionarioLayout.setVerticalGroup(
            painelConFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConFuncionarioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelConFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscaNome))
                .addGap(16, 16, 16)
                .addComponent(Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        JTPainelFuncionario.addTab("Consulta", painelConFuncionario);

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

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTPainelFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(0, 305, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addComponent(JTPainelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar))
                .addGap(30, 30, 30))
        );

        jNome.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome.setText("FUNCIONÁRIO");
        jNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Comando para excluir dados da tabela e do banco;
        Excluir();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Comando para editar os dados do funcionario;
        Editar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Comando para salvar os dados no banco de dados;
        Cadastrar();
        Limpar();
        Listar();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaConFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConFuncionarioMouseClicked
        CarregarCampos();
    }//GEN-LAST:event_tabelaConFuncionarioMouseClicked

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        // Comando para fazer uma busca no banco por nome;
        Pesquisar();
        LimparBusca();
    }//GEN-LAST:event_btnBuscaNomeActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtBuscaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Pesquisar();
            LimparBusca();
        }
    }//GEN-LAST:event_txtBuscaNomeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPainelFuncionario;
    private javax.swing.JScrollPane Tabela;
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel painelCadFuncionario;
    private javax.swing.JPanel painelConFuncionario;
    private javax.swing.JPanel painelDadosPessoais;
    private javax.swing.JTable tabelaConFuncionario;
    private javax.swing.JFormattedTextField txtAdmissao;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JFormattedTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
 int id, numero;
    String nome, cpf, rg, celular, nascimento, cargo, admissao;
    String cep, rua, bairro, cidade, estado;

    private void Cadastrar() {
        
        nome = txtNome.getText();
        cpf = txtCPF.getText();
        rg = txtRg.getText();
        nascimento = txtNasc.getText();
        celular = txtCelular.getText();
        admissao = txtAdmissao.getText();
        cargo = txtCargo.getText();
        cep = txtCep.getText();
        rua = txtRua.getText();
        numero = Integer.parseInt(txtNumero.getText());
        bairro = txtCidade.getText();
        cidade = txtBairro.getText();
        estado = txtEstado.getSelectedItem().toString();

        if (nome.isEmpty()
                || cpf.equals("   .   .   -  ")
                || rg.equals("  .   .   - ")
                || celular.isEmpty()
                || nascimento.equals("   /  /   ")
                || cargo.isEmpty()
                || admissao.equals("   /  /   ")
                || cep.equals("      -    ")
                || rua.isEmpty()
                || txtNumero.getText().equals("")
                || bairro.isEmpty()
                || cidade.isEmpty()
                || estado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");

        } else {
            FuncionarioDTO obj = new FuncionarioDTO();
            obj.setNomeFuncionario(nome);
            obj.setCpfFuncionario(cpf);
            obj.setRgFuncionario(rg);
            obj.setNascimentoFucionario(nascimento);
            obj.setCelularFuncionario(celular);
            obj.setCargoFuncionario(cargo);
            obj.setAdmissaoFuncionario(admissao);
            obj.setCepFuncionario(cep);
            obj.setRuaFuncionario(rua);
            obj.setNumeroFuncionario(numero);
            obj.setBairroFuncionario(bairro);
            obj.setCidadeFuncionario(cidade);
            obj.setEstadoFuncionario(estado);

            FuncionarioDAO objdao = new FuncionarioDAO();
            objdao.cadastrarFuncionario(obj);

        }
    }

    private void Editar() 
    {
        id = Integer.parseInt(txtId.getText());
        nome = txtNome.getText();
        cpf = txtCPF.getText();
        rg = txtRg.getText();
        nascimento = txtNasc.getText();
        celular = txtCelular.getText();
        admissao = txtAdmissao.getText();
        cargo = txtCargo.getText();
        cep = txtCep.getText();
        rua = txtRua.getText();
        numero = Integer.parseInt(txtNumero.getText());
        bairro = txtCidade.getText();
        cidade = txtBairro.getText();
        estado = txtEstado.getSelectedItem().toString();

        if (
                nome.isEmpty()
                || cpf.equals("   .   .   -  ")
                || rg.equals("  .   .   - ")
                || celular.equals("(  )        -     ")
                || nascimento.equals("   /  /   ")
                || cargo.isEmpty()
                || admissao.equals("   /  /   ")
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
            op = JOptionPane.showOptionDialog(null, "Deseja realmente editar?", "Atençao", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                FuncionarioDTO obj = new FuncionarioDTO();
                
                obj.setIdFuncionario(id);
                obj.setNomeFuncionario(nome);
                obj.setCpfFuncionario(cpf);
                obj.setRgFuncionario(rg);
                obj.setNascimentoFucionario(nascimento);
                obj.setCelularFuncionario(celular);
                obj.setCargoFuncionario(cargo);
                obj.setAdmissaoFuncionario(admissao);
                obj.setCepFuncionario(cep);
                obj.setRuaFuncionario(rua);
                obj.setNumeroFuncionario(numero);
                obj.setBairroFuncionario(bairro);
                obj.setCidadeFuncionario(cidade);
                obj.setEstadoFuncionario(estado);

                

                FuncionarioDAO objdao = new FuncionarioDAO();
                objdao.editarFuncionario(obj);
            }
        }
    }

    private void Limpar() {

        new LimparCampos().Limpar(painelDadosPessoais);
       
    }

    private void LimparBusca() {
        txtBuscaNome.setText("");
    }
//mostra as informacoes do banco na tabela
    private void Listar()
    {
        FuncionarioDAO objdao = new FuncionarioDAO();
        List<FuncionarioDTO> lista = objdao.listarFuncionario();
        DefaultTableModel model = (DefaultTableModel) tabelaConFuncionario.getModel();
        model.setNumRows(0);

        for (FuncionarioDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdFuncionario(),
                cont.getNomeFuncionario(),
                cont.getCpfFuncionario(),
                cont.getRgFuncionario(),
                cont.getNascimentoFucionario(),
                cont.getCelularFuncionario(),
                cont.getCargoFuncionario(),
                cont.getAdmissaoFuncionario(),
                cont.getCepFuncionario(),
                cont.getRuaFuncionario(),
                cont.getNumeroFuncionario(),
                cont.getBairroFuncionario(),
                cont.getCidadeFuncionario(),
                cont.getEstadoFuncionario()
            });
        }
    }

    private void Excluir() {
        id = Integer.parseInt(txtId.getText());
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há Funcionario selecionado para exclusão");
        } else {
        int op;
        Object[] options = {"Cancelar", "Confirmar"};
        op = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "Atenção", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[1]);
        if (op == 1) {

            FuncionarioDTO obj = new FuncionarioDTO();

            obj.setIdFuncionario(Integer.parseInt(txtId.getText()));

            FuncionarioDAO dao = new FuncionarioDAO();
            dao.excluirFuncionario(obj);
        }
    }
    }
    private void Pesquisar() {
        String nome;
                nome = "%" + txtBuscaNome.getText() + "%";

        FuncionarioDAO objdao = new FuncionarioDAO();
        List<FuncionarioDTO> lista = objdao.buscarFuncionario(nome);
        DefaultTableModel model = (DefaultTableModel) tabelaConFuncionario.getModel();
        model.setNumRows(0);

        for (FuncionarioDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdFuncionario(),
                cont.getNomeFuncionario(),
                cont.getCpfFuncionario(),
                cont.getRgFuncionario(),
                cont.getNascimentoFucionario(),
                cont.getCelularFuncionario(),
                cont.getCargoFuncionario(),
                cont.getAdmissaoFuncionario(),
                cont.getCepFuncionario(),
                cont.getRuaFuncionario(),
                cont.getNumeroFuncionario(),
                cont.getBairroFuncionario(),
                cont.getCidadeFuncionario(),
                cont.getEstadoFuncionario()
            });
        }
    }

    private void CarregarCampos() 
    {
        JTPainelFuncionario.setSelectedIndex(0);
        
        txtId.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 1).toString());
        txtCPF.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 2).toString());
        txtRg.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 3).toString());
        txtNasc.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 4).toString());
        txtCelular.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 5).toString());
        txtCargo.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 6).toString());
        txtAdmissao.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 7).toString());
        txtCep.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 8).toString());
        txtRua.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 9).toString());
        txtNumero.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 10).toString());
        txtBairro.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 11).toString());
        txtCidade.setText(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 12).toString());
        txtEstado.setSelectedItem(tabelaConFuncionario.getValueAt(tabelaConFuncionario.getSelectedRow(), 13).toString());
    }

}
