package VIEW;

import CONEXAO.Conexao;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Relatorio extends javax.swing.JPanel {

    private DefaultTableModel model;
    private JTable tabela;
    private String nome, cpf, celular;
    private int gasto;

    Connection conn;
    Statement st;
    ResultSet rs;

    public Relatorio() {
        this.conn = new Conexao().conectaBD();

        initComponents();
        Data();
        Hora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblData.setFont(new java.awt.Font("Brush Script MT", 1, 70)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data");
        add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 360, 220));

        lblHora.setFont(new java.awt.Font("Brush Script MT", 3, 100)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 440, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\C#\\Tecnolz.png")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 770));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    // End of variables declaration//GEN-END:variables
    public Relatorio Cliente() {
        model = new DefaultTableModel();
        tabela = new JTable(model);

        model.addColumn("Nome");
        model.addColumn("CPF");
        model.addColumn("Telefone");
        model.addColumn("Débito");

        setTitle("Relatório de Cliente em Débito");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        try {

            st = conn.createStatement();

            rs = st.executeQuery("SELECT * FROM tbl_cliente");

            while (rs.next()) {
                nome = rs.getString("cli_nome");
                cpf = rs.getString("cli_cpf");
                celular = rs.getString("cli_celular");
                gasto = rs.getInt("cli_debito");

                if (gasto > 0) {

                    model.addRow(new Object[]{nome, cpf, celular, gasto});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        tabela.setPreferredScrollableViewportSize(
                new Dimension(700, 400));
        Container c = getContentPane();

        c.setLayout(
                new FlowLayout());
        JScrollPane scarollPane = new JScrollPane(tabela);

        c.add(scarollPane);

        setSize(
                800, 500);
        setVisible(
                true);

        JButton btnConsultar = new JButton("Fechar");

        btnConsultar.setFont(
                new Font("Tahoma", Font.PLAIN, 16));
        btnConsultar.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e
            ) {
                dispose();
            }

            private void dispose() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        }
        );
        return null;

    }

    private void setTitle(String relatório_de_Cliente_em_Débito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void Data() {
        /* Substituição da Label Data para a data atual do sistema */
                Date data = new Date();
                SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
                lblData.setText(s.format(data));

    }

    private void Hora() 
    {
       new Timer(0, new ActionListener()
       {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Date data = new Date();
                SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                lblHora.setText(s.format(data));
            }
        }).start();

    }

}
