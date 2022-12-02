package VIEW;

import CONTROLE.LimparCampos;
import DAO.FornecedorDAO;
import DAO.ProdutoDAO;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class Produto extends javax.swing.JPanel {

    public Produto() {
        initComponents();

        Listar();
        Limpar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JTPainelProduto = new javax.swing.JTabbedPane();
        painelCadProduto = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        panielConProduto = new javax.swing.JPanel();
        txtBusca = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConProduto = new javax.swing.JTable();
        btnBuscaNome = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setPreferredSize(new java.awt.Dimension(802, 755));

        jNome.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNome.setText("PRODUTO");
        jNome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 800));

        JTPainelProduto.setBackground(new java.awt.Color(255, 255, 255));

        painelCadProduto.setBackground(new java.awt.Color(255, 255, 255));
        painelCadProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelCadProduto.setForeground(new java.awt.Color(51, 153, 255));
        painelCadProduto.setToolTipText("");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("*Código de Barra");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("*Nome:");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("ID");

        txtId.setEditable(false);
        txtId.setBackground(java.awt.SystemColor.controlHighlight);
        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel31.setForeground(new java.awt.Color(204, 0, 0));
        jLabel31.setText("(*) Campos obrigatórios para preenchimento");

        javax.swing.GroupLayout painelCadProdutoLayout = new javax.swing.GroupLayout(painelCadProduto);
        painelCadProduto.setLayout(painelCadProdutoLayout);
        painelCadProdutoLayout.setHorizontalGroup(
            painelCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadProdutoLayout.createSequentialGroup()
                        .addGroup(painelCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(painelCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel31))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        painelCadProdutoLayout.setVerticalGroup(
            painelCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(painelCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(painelCadProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(48, 48, 48)
                .addComponent(jLabel31)
                .addGap(48, 48, 48))
        );

        JTPainelProduto.addTab("Cadastrar", painelCadProduto);

        panielConProduto.setBackground(new java.awt.Color(255, 255, 255));
        panielConProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
        });

        jLabel19.setText("Buscar por Nome");

        tabelaConProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "CÓDIGO DE BARRA", "NOME", "ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaConProduto.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabelaConProduto.getTableHeader().setReorderingAllowed(false);
        tabelaConProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaConProduto);

        btnBuscaNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_buscar.png"))); // NOI18N
        btnBuscaNome.setText("Buscar");
        btnBuscaNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panielConProdutoLayout = new javax.swing.GroupLayout(panielConProduto);
        panielConProduto.setLayout(panielConProdutoLayout);
        panielConProdutoLayout.setHorizontalGroup(
            panielConProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panielConProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panielConProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
                    .addGroup(panielConProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        panielConProdutoLayout.setVerticalGroup(
            panielConProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panielConProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panielConProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnBuscaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        JTPainelProduto.addTab("Consultar", panielConProduto);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_bot_editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/img_TC_salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(JTPainelProduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(JTPainelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void tabelaConProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConProdutoMouseClicked
        CarregarCampos();

    }//GEN-LAST:event_tabelaConProdutoMouseClicked

    private void btnBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaNomeActionPerformed
        // Comando para fazer uma busca no banco por nome;
        Pesquisar();
        Listar();
        LimparBusca();


    }//GEN-LAST:event_btnBuscaNomeActionPerformed

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

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Pesquisar();
            //PesquisarCod();
        }
    }//GEN-LAST:event_txtBuscaKeyPressed

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTPainelProduto;
    private javax.swing.JButton btnBuscaNome;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelCadProduto;
    private javax.swing.JPanel panielConProduto;
    public javax.swing.JTable tabelaConProduto;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
String nome ;
    int codigo, id;

    private void Cadastrar() {
        codigo = (Integer.parseInt(txtCodigo.getText()));
        nome = txtNome.getText();


        if (nome.isEmpty()
                || txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");
        } else {
            ProdutoDTO objdto = new ProdutoDTO();
            objdto.setCodbarraProduto(codigo);
            objdto.setNomeProduto(nome);


            ProdutoDAO objdao = new ProdutoDAO();
            objdao.cadastrarProduto(objdto);

        }
    }

    private void Limpar() {
        new LimparCampos().Limpar(painelCadProduto);
    }

    private void LimparBusca() {
        txtBusca.setText("");
    }

    private void Listar()//mostra as informacoes do banco na tabela
    {
        ProdutoDAO objdao = new ProdutoDAO();
        List<ProdutoDTO> lista = objdao.listarProduto();
        DefaultTableModel model = (DefaultTableModel) tabelaConProduto.getModel();
        model.setNumRows(0);

        for (ProdutoDTO cont : lista) {
            model.addRow(new Object[]{
                cont.getIdProduto(),
                cont.getCodbarraProduto(),
                cont.getNomeProduto(),
                cont.getEstoqueProduto()
            });
        }
    }

    private void Editar() {
        id = Integer.parseInt(txtId.getText());
        nome = txtNome.getText();
        codigo = Integer.parseInt(txtCodigo.getText());

        if (nome.isEmpty()

                || txtCodigo.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos obrigatórios");
        } else {
            int op;

            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente editar?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                ProdutoDTO objdto = new ProdutoDTO();

                objdto.setIdProduto(id);
                objdto.setCodbarraProduto(codigo);
                objdto.setNomeProduto(nome);


                ProdutoDAO dao = new ProdutoDAO();
                dao.editarProduto(objdto);
            }
        }
    }

    private void Excluir() {
        id = Integer.parseInt(txtId.getText());
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há Produto selecionado para exclusão");
        } else {
            int op;
            Object[] options = {"Cancelar", "Confirmar"};
            op = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (op == 1) {

                ProdutoDTO obj = new ProdutoDTO();

                obj.setIdProduto(id);

                ProdutoDAO dao = new ProdutoDAO();
                dao.excluirProduto(obj);
            }
        }
    }

    private void Pesquisar() {

        String buscanome;
        buscanome = "%" + txtBusca.getText() + "%";

        ProdutoDAO objdao = new ProdutoDAO();
        List<ProdutoDTO> lista = objdao.buscarNomeProduto(buscanome);
        DefaultTableModel dado = (DefaultTableModel) tabelaConProduto.getModel();
        dado.setNumRows(0);

        for (ProdutoDTO cont : lista) {
            dado.addRow(new Object[]{
                cont.getIdProduto(),
                cont.getCodbarraProduto(),
                cont.getNomeProduto()});
        }
    }



    private void CarregarCampos() {
        JTPainelProduto.setSelectedIndex(0);

        txtId.setText(tabelaConProduto.getValueAt(tabelaConProduto.getSelectedRow(), 0).toString());
        txtCodigo.setText(tabelaConProduto.getValueAt(tabelaConProduto.getSelectedRow(), 1).toString());
        txtNome.setText(tabelaConProduto.getValueAt(tabelaConProduto.getSelectedRow(), 2).toString());

    }

}
