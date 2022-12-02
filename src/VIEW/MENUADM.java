/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import CONTROLE.Transparencia;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;



/**
 *
 * @author Pri
 */
public class MENUADM extends javax.swing.JFrame {


    private final Fornecedor fornecedor;
    private final Funcionario funcionario;
    private final Produto produto;
    private final Usuario usuario;
    private final Compra compra;
    private final Venda venda;
    private final Relatorio relatorio;
    private final FluxoCaixa fluxo;

    public String LoginUsuario;

    private int sair;

    boolean a = false;
    
    public MENUADM() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {

        }


        fornecedor = new Fornecedor();
        funcionario = new Funcionario();
        usuario = new Usuario();
        produto = new Produto();
        compra = new Compra();
        venda = new Venda();
        relatorio = new Relatorio();
        fluxo = new FluxoCaixa();
        
        
        //Transparencia t = new Transparencia();
        //t.aplicarTransparencia(this);

        initComponents();
        hidemenu();
        Home();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        iconminmaxclose = new javax.swing.JPanel();
        Buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        Buttonmax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        lineseting = new javax.swing.JPanel();
        setting = new javax.swing.JPanel();
        btnConfig = new javax.swing.JLabel();
        hidemenu = new javax.swing.JPanel();
        buttonhidemenu = new javax.swing.JLabel();
        linehidemenu = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        painelMenu = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRelatorio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnFornecedor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFuncionario = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnProduto = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCompra = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnVenda = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnFluxoCaixa = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        PainelDashboard = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(200, 160));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Header.setBackground(new java.awt.Color(5, 10, 46));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconminmaxclose.setBackground(new java.awt.Color(5, 10, 46));
        iconminmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonclose.setBackground(new java.awt.Color(5, 10, 46));
        Buttonclose.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Buttonclose.add(close, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        Buttonmax.setBackground(new java.awt.Color(5, 10, 46));
        Buttonmax.setLayout(new java.awt.BorderLayout());

        fullmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/full_screen_32px.png"))); // NOI18N
        fullmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullmaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullmaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullmaxMouseExited(evt);
            }
        });
        Buttonmax.add(fullmax, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        Header.add(iconminmaxclose, java.awt.BorderLayout.LINE_END);

        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("DATA");
        Header.add(lblData, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(5, 10, 46));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lineseting.setBackground(new java.awt.Color(5, 10, 46));
        lineseting.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linesetingLayout = new javax.swing.GroupLayout(lineseting);
        lineseting.setLayout(linesetingLayout);
        linesetingLayout.setHorizontalGroup(
            linesetingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linesetingLayout.setVerticalGroup(
            linesetingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(lineseting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 5));

        setting.setBackground(new java.awt.Color(5, 10, 46));
        setting.setLayout(new java.awt.BorderLayout());

        btnConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/settings_32px.png"))); // NOI18N
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfigMouseExited(evt);
            }
        });
        setting.add(btnConfig, java.awt.BorderLayout.CENTER);

        MenuIcon.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 50));

        hidemenu.setBackground(new java.awt.Color(5, 10, 46));
        hidemenu.setLayout(new java.awt.BorderLayout());

        buttonhidemenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhidemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menu_32px.png"))); // NOI18N
        buttonhidemenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonhidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseExited(evt);
            }
        });
        hidemenu.add(buttonhidemenu, java.awt.BorderLayout.CENTER);

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        linehidemenu.setBackground(new java.awt.Color(5, 10, 46));
        linehidemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        Menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(25, 29, 74));
        menuhide.setLayout(new java.awt.BorderLayout());

        painelMenu.setBackground(new java.awt.Color(25, 29, 74));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("PADARIA");

        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnRelatorio.setBackground(new java.awt.Color(96, 101, 144));
        btnRelatorio.setEnabled(false);
        btnRelatorio.setPreferredSize(new java.awt.Dimension(228, 45));
        btnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRelatorioMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Relatórios");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/9.png"))); // NOI18N

        javax.swing.GroupLayout btnRelatorioLayout = new javax.swing.GroupLayout(btnRelatorio);
        btnRelatorio.setLayout(btnRelatorioLayout);
        btnRelatorioLayout.setHorizontalGroup(
            btnRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRelatorioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnRelatorioLayout.setVerticalGroup(
            btnRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRelatorioLayout.createSequentialGroup()
                .addGroup(btnRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(btnRelatorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, btnRelatorioLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFornecedor.setBackground(new java.awt.Color(56, 61, 103));
        btnFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFornecedorMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/8.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Fornecedor");

        javax.swing.GroupLayout btnFornecedorLayout = new javax.swing.GroupLayout(btnFornecedor);
        btnFornecedor.setLayout(btnFornecedorLayout);
        btnFornecedorLayout.setHorizontalGroup(
            btnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFornecedorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFornecedorLayout.setVerticalGroup(
            btnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFornecedorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(btnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        btnFuncionario.setBackground(new java.awt.Color(56, 61, 103));
        btnFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFuncionarioMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/6.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Funcionário");

        javax.swing.GroupLayout btnFuncionarioLayout = new javax.swing.GroupLayout(btnFuncionario);
        btnFuncionario.setLayout(btnFuncionarioLayout);
        btnFuncionarioLayout.setHorizontalGroup(
            btnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFuncionarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFuncionarioLayout.setVerticalGroup(
            btnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFuncionarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(btnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        btnProduto.setBackground(new java.awt.Color(56, 61, 103));
        btnProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProdutoMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/5.png"))); // NOI18N

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Produto");

        javax.swing.GroupLayout btnProdutoLayout = new javax.swing.GroupLayout(btnProduto);
        btnProduto.setLayout(btnProdutoLayout);
        btnProdutoLayout.setHorizontalGroup(
            btnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProdutoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProdutoLayout.setVerticalGroup(
            btnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProdutoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(btnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        btnUsuario.setBackground(new java.awt.Color(56, 61, 103));
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUsuarioMousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/4.png"))); // NOI18N

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Usuário");

        javax.swing.GroupLayout btnUsuarioLayout = new javax.swing.GroupLayout(btnUsuario);
        btnUsuario.setLayout(btnUsuarioLayout);
        btnUsuarioLayout.setHorizontalGroup(
            btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnUsuarioLayout.setVerticalGroup(
            btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUsuarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(btnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        btnCompra.setBackground(new java.awt.Color(56, 61, 103));
        btnCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCompraMousePressed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/7.png"))); // NOI18N

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Compra");

        javax.swing.GroupLayout btnCompraLayout = new javax.swing.GroupLayout(btnCompra);
        btnCompra.setLayout(btnCompraLayout);
        btnCompraLayout.setHorizontalGroup(
            btnCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCompraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCompraLayout.setVerticalGroup(
            btnCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btnCompraLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel20)
                .addGap(10, 10, 10))
        );

        btnVenda.setBackground(new java.awt.Color(56, 61, 103));
        btnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVendaMousePressed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/2.png"))); // NOI18N

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Venda");

        javax.swing.GroupLayout btnVendaLayout = new javax.swing.GroupLayout(btnVenda);
        btnVenda.setLayout(btnVendaLayout);
        btnVendaLayout.setHorizontalGroup(
            btnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVendaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addGap(15, 15, 15)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnVendaLayout.setVerticalGroup(
            btnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVendaLayout.createSequentialGroup()
                .addGroup(btnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(btnVendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, btnVendaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("TECNOLZ");

        btnFluxoCaixa.setBackground(new java.awt.Color(56, 61, 103));
        btnFluxoCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFluxoCaixaMousePressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1.png"))); // NOI18N
        jLabel22.setIconTextGap(6);

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Fluxo Caixa");

        javax.swing.GroupLayout btnFluxoCaixaLayout = new javax.swing.GroupLayout(btnFluxoCaixa);
        btnFluxoCaixa.setLayout(btnFluxoCaixaLayout);
        btnFluxoCaixaLayout.setHorizontalGroup(
            btnFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFluxoCaixaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel22)
                .addGap(20, 20, 20)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        btnFluxoCaixaLayout.setVerticalGroup(
            btnFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFluxoCaixaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(btnFluxoCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("USUARIO");

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
            .addComponent(btnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addComponent(btnFluxoCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsuario)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblUsuario)
                .addGap(10, 10, 10)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnFluxoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        menuhide.add(painelMenu, java.awt.BorderLayout.CENTER);

        Menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(Menu, java.awt.BorderLayout.LINE_START);

        PainelDashboard.setBackground(new java.awt.Color(255, 255, 255));
        PainelDashboard.setFocusable(false);
        PainelDashboard.setLayout(new java.awt.BorderLayout());
        getContentPane().add(PainelDashboard, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        confirmaSair();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(Buttonclose, new Color(25, 29, 74));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(Buttonclose, new Color(5, 10, 46));
    }//GEN-LAST:event_closeMouseExited

    private void fullmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseClicked
        if (this.getExtendedState() != MENUADM.MAXIMIZED_BOTH) {
            this.setExtendedState(MENUADM.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(MENUADM.NORMAL);
        }
    }//GEN-LAST:event_fullmaxMouseClicked

    private void fullmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseEntered
        changecolor(Buttonmax, new Color(25, 29, 74));
    }//GEN-LAST:event_fullmaxMouseEntered

    private void fullmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseExited
        changecolor(Buttonmax, new Color(5, 10, 46));
    }//GEN-LAST:event_fullmaxMouseExited

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        clickmenu(setting, hidemenu, 1);
        Config();
    }//GEN-LAST:event_btnConfigMouseClicked

    private void btnConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseEntered
        changecolor(lineseting, new Color(8, 177, 150));
    }//GEN-LAST:event_btnConfigMouseEntered

    private void btnConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseExited
        changecolor(lineseting, new Color(5, 10, 46));
    }//GEN-LAST:event_btnConfigMouseExited

    private void buttonhidemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseClicked
        clickmenu(hidemenu, setting, 1);
        //metodo para deixar visivel e oculto o painel de menu

        hidemenu();

    }//GEN-LAST:event_buttonhidemenuMouseClicked

    private void buttonhidemenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseEntered
        changecolor(linehidemenu, new Color(247, 78, 105));
    }//GEN-LAST:event_buttonhidemenuMouseEntered

    private void buttonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseExited
        changecolor(linehidemenu, new Color(5, 10, 46));
    }//GEN-LAST:event_buttonhidemenuMouseExited

    private void btnFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFornecedorMousePressed
        Fornecedor();
    }//GEN-LAST:event_btnFornecedorMousePressed

    private void btnFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncionarioMousePressed
        Funcionario();
    }//GEN-LAST:event_btnFuncionarioMousePressed

    private void btnProdutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutoMousePressed
        Produto();

    }//GEN-LAST:event_btnProdutoMousePressed

    private void btnUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMousePressed
        Usuario();
    }//GEN-LAST:event_btnUsuarioMousePressed

    private void btnCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMousePressed
        Compra();
    }//GEN-LAST:event_btnCompraMousePressed

    private void btnVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMousePressed
        Venda();
    }//GEN-LAST:event_btnVendaMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Data();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btnFluxoCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFluxoCaixaMousePressed
        FluxoCaixa();
    }//GEN-LAST:event_btnFluxoCaixaMousePressed

    private void btnRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelatorioMousePressed
        Relatorio();
    }//GEN-LAST:event_btnRelatorioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttonclose;
    private javax.swing.JPanel Buttonmax;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuIcon;
    public static javax.swing.JPanel PainelDashboard;
    public static javax.swing.JPanel btnCompra;
    public static javax.swing.JLabel btnConfig;
    private javax.swing.JPanel btnFluxoCaixa;
    public static javax.swing.JPanel btnFornecedor;
    public static javax.swing.JPanel btnFuncionario;
    public static javax.swing.JPanel btnProduto;
    private javax.swing.JPanel btnRelatorio;
    public static javax.swing.JPanel btnUsuario;
    public static javax.swing.JPanel btnVenda;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fullmax;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel lineseting;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel painelMenu;
    private javax.swing.JPanel setting;
    // End of variables declaration//GEN-END:variables

    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    public void clickmenu(JPanel h1, JPanel h2, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(25, 29, 74));
            h2.setBackground(new Color(5, 10, 46));
        } else {
            h1.setBackground(new Color(5, 10, 46));
            h2.setBackground(new Color(25, 29, 74));
        }
    }

    public void changeimage(JLabel button, String resourcheimg) {
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }

    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Icon/menu_32px.png");
        } else {
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/Icon/back_32px.png");
        }

    }

    private void hidemenu() {
        if (a == true) {
            hideshow(Menu, a, buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);

            a = false;
        } else {
            hideshow(Menu, a, buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;
        }

    }

    private void comCor(JPanel painel) {
        painel.setBackground(new Color(96, 101, 144));
    }

    void semCor(JPanel painel) {
        painel.setBackground(new Color(56, 61, 103));
    }

    private void confirmaSair() {
        Object[] opcao = {"Confirma", "Cancela"};
        sair = JOptionPane.showOptionDialog(null, "Clique em Confirmar para Sair", "Atenção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[1]);

        if (sair == 0) {
            System.exit(0);
        }
    }

    private void Data() {
        /* Substituição da Label Data para a data atual do sistema */
        Date data = new Date();
        DateFormat formata = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formata.format(data));

    }

    private void Home() {

        PainelDashboard.removeAll();
        PainelDashboard.add(relatorio);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }

    private void Usuario() {
        semCor(btnRelatorio);
        semCor(btnFornecedor);
        semCor(btnFuncionario);
        comCor(btnUsuario);
        semCor(btnProduto);
        semCor(btnCompra);
        semCor(btnVenda);
        semCor(btnFluxoCaixa);

        PainelDashboard.removeAll();
        PainelDashboard.add(usuario);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }

    private void Produto() {
        semCor(btnRelatorio);
        semCor(btnFornecedor);
        semCor(btnFuncionario);
        semCor(btnUsuario);
        comCor(btnProduto);
        semCor(btnCompra);
        semCor(btnVenda);
        semCor(btnFluxoCaixa);

        PainelDashboard.removeAll();
        PainelDashboard.add(produto);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }

    private void Compra() {
        semCor(btnRelatorio);
        semCor(btnFornecedor);
        semCor(btnFuncionario);
        semCor(btnUsuario);
        semCor(btnProduto);
        comCor(btnCompra);
        semCor(btnVenda);
        semCor(btnFluxoCaixa);

        PainelDashboard.removeAll();
        PainelDashboard.add(compra);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }

    private void FluxoCaixa() {
        semCor(btnRelatorio);
        semCor(btnFornecedor);
        semCor(btnFuncionario);
        semCor(btnUsuario);
        semCor(btnProduto);
        semCor(btnCompra);
        semCor(btnVenda);
        comCor(btnFluxoCaixa);

        PainelDashboard.removeAll();
        PainelDashboard.add(fluxo);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }

    private void Funcionario() {
        semCor(btnRelatorio);
        semCor(btnFornecedor);
        comCor(btnFuncionario);
        semCor(btnUsuario);
        semCor(btnProduto);
        semCor(btnCompra);
        semCor(btnVenda);
        semCor(btnFluxoCaixa);

        PainelDashboard.removeAll();
        PainelDashboard.add(funcionario);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }

    private void Relatorio() {
        comCor(btnRelatorio);
        semCor(btnFornecedor);
        semCor(btnFuncionario);
        semCor(btnUsuario);
        semCor(btnProduto);
        semCor(btnCompra);
        semCor(btnVenda);
        semCor(btnFluxoCaixa);

        PainelDashboard.removeAll();
        PainelDashboard.add(relatorio);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }


    private void Fornecedor() {
        semCor(btnRelatorio);
        comCor(btnFornecedor);
        semCor(btnFuncionario);
        semCor(btnUsuario);
        semCor(btnProduto);
        semCor(btnCompra);
        semCor(btnVenda);
        semCor(btnFluxoCaixa);

        PainelDashboard.removeAll();
        PainelDashboard.add(fornecedor);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }

    private void Venda() {
        semCor(btnRelatorio);
        semCor(btnFornecedor);
        semCor(btnFuncionario);
        semCor(btnUsuario);
        semCor(btnProduto);
        semCor(btnCompra);
        comCor(btnVenda);
        semCor(btnFluxoCaixa);

        PainelDashboard.removeAll();
        PainelDashboard.add(venda);
        PainelDashboard.repaint();
        PainelDashboard.revalidate();
        PainelDashboard.setVisible(true);
    }

    private void Config() {
        TelaLogin tela = new TelaLogin();
        Usuario usu = new Usuario();

        tela.setVisible(true);
        usu.setVisible(true);
    }
}
