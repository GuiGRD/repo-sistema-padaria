package VIEW;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import UTILIDADES.Transparencia;
import DAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TelaLogin extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public TelaLogin() {
        Transparencia t = new Transparencia();
        t.aplicarTransparencia(this);

        initComponents();

        btnLogin.setBackground(new java.awt.Color(0, 0, 0, 0));
        btnSair.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtNome.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel_ImagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setBorder(null);
        btnSair.setContentAreaFilled(false);
        btnSair.setOpaque(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 60, 50));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNome.setOpaque(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 170, 50));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSenha.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtSenha.setOpaque(false);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 180, 50));

        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setBorder(null);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setOpaque(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 300, 50));

        jLabel_ImagemFundo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_ImagemFundo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ImagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/img_Login.png"))); // NOI18N
        getContentPane().add(jLabel_ImagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Logar();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Logar();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel_ImagemFundo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    
    private void Logar() 
    {

        try {

            //Declara as variaveis
            String login, senha;
            
             //recebe as informacoes do usuario
            login = txtNome.getText();
            senha = txtSenha.getText();
            
            
            //confere o que tem no banco com o que o usuario digitou 
            UsuarioDAO obj = new UsuarioDAO();
            obj.LogarUsuario(login, senha);
            

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Entrar em contato com o Suporte");
        }
    }
}
