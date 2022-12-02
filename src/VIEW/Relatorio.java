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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
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
}
