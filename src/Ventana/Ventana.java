/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Colores.Colores;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author diosl
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
    private Colores colores;
    
    public Ventana() {
        
        colores = new Colores();
        
        initComponents();
        initComponents2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents2() {
        this.setLocationRelativeTo(null);
        this.setTitle("BrunoDev Formulario Java Swing");
        this.setSize(1000, 650);
       
        jpSignIn.setVisible(true);
        jpSignUp.setVisible(false);
        home.validate();
        
       jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);
        

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSignUp = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        home = new javax.swing.JPanel();
        jpSignIn = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        texPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpSignUp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        texNombre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        texNomUsuario = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        tesPassW = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        texMail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(colores.getFondo1());
        jPanel1.setLayout(new java.awt.BorderLayout());

        menu.setBackground(new java.awt.Color(236, 236, 236));
        menu.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 60)); // NOI18N
        jLabel1.setForeground(colores.getColorPrymary());
        jLabel1.setText("System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 15, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 60)); // NOI18N
        jLabel2.setForeground(colores.getColorPrymary2());
        jLabel2.setText("System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        menu.add(jPanel2, java.awt.BorderLayout.WEST);

        jPanel3.setBackground(new java.awt.Color(102, 102, 0));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignUp.setBackground(colores.getColorPrymary());
        btnSignUp.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign up");
        btnSignUp.setBorder(null);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel3.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 32, 100, 35));

        btnSignIn.setBackground(colores.getFondo1());
        btnSignIn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnSignIn.setForeground(colores.getColorPrymary());
        btnSignIn.setText("Sign in");
        btnSignIn.setBorder(new javax.swing.border.LineBorder(colores.getColorPrymary(), 2, true));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel3.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 32, 100, 35));

        menu.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel1.add(menu, java.awt.BorderLayout.PAGE_START);

        home.setPreferredSize(new java.awt.Dimension(1000, 500));
        home.setLayout(new java.awt.CardLayout());

        jpSignIn.setBackground(colores.getFondo1());
        jpSignIn.setLayout(new java.awt.BorderLayout());

        jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 500));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciar.setBackground(colores.getColorPrymary());
        btnIniciar.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.setBorder(null);
        jPanel6.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 350, 40));

        texPass.setBackground(new java.awt.Color(255, 255, 255));
        texPass.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texPass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 130, 130), 1, true));
        jPanel6.add(texPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 350, 35));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Contraseña");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("¿Se te olvidó tu contraseña?");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        texUser.setBackground(new java.awt.Color(255, 255, 255));
        texUser.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 130, 130), 1, true));
        jPanel6.add(texUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 350, 35));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel5.setText("Iniciar sesión en System");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Usuario");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel10.setBackground(colores.getColorFaceBook());
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/facebook-logo-24.png"))); // NOI18N
        jLabel10.setOpaque(true);
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 40, 40));

        jLabel11.setBackground(colores.getColorGoogle());
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/google-logo-24.png"))); // NOI18N
        jLabel11.setOpaque(true);
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 40, 40));

        jLabel13.setBackground(colores.getColorApple());
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/apple-logo-24.png"))); // NOI18N
        jLabel13.setOpaque(true);
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 40, 40));

        jLabel14.setBackground(colores.getColorMicrosoft());
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/microsoft-logo-24.png"))); // NOI18N
        jLabel14.setOpaque(true);
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 40, 40));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 350, 5));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel4.add(jPanel6, gridBagConstraints);

        jpSignIn.add(jPanel4, java.awt.BorderLayout.CENTER);

        home.add(jpSignIn, "card2");

        jpSignUp.setBackground(new java.awt.Color(0, 0, 0));
        jpSignUp.setOpaque(false);
        jpSignUp.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 51, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 500));

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(1000, 800));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texNombre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel8.add(texNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 350, 35));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel21.setText("Registrarse en System");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("Nombre");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel23.setBackground(colores.getColorFaceBook());
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/facebook-logo-24.png"))); // NOI18N
        jLabel23.setOpaque(true);
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 40, 40));

        jLabel24.setBackground(colores.getColorGoogle());
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/google-logo-24.png"))); // NOI18N
        jLabel24.setOpaque(true);
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 40, 40));

        jLabel25.setBackground(colores.getColorApple());
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/apple-logo-24.png"))); // NOI18N
        jLabel25.setOpaque(true);
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 40, 40));

        jLabel26.setBackground(colores.getColorMicrosoft());
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/microsoft-logo-24.png"))); // NOI18N
        jLabel26.setOpaque(true);
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 40, 40));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 350, 5));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("Nombre de Usuario");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        texNomUsuario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel8.add(texNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 350, 35));

        btnRegistrar.setBackground(colores.getColorPrymary());
        btnRegistrar.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarme");
        btnRegistrar.setBorder(null);
        jPanel8.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 350, 40));

        tesPassW.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel8.add(tesPassW, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 350, 35));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Contraseña");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, -1));

        texMail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel8.add(texMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 350, 35));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Mail");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel32.setText("nuestras Condiciones de servicio, Política de privac-");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 615, -1, -1));
        jPanel8.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, -1, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel33.setText("determinada.");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 645, -1, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel34.setText("Crear una cuenta significa que está de acuerdo con");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, -1, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel36.setText("idad y nuestra  Configuración de notificaciones pre-");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel5.add(jPanel8, gridBagConstraints);

        jScrollPane1.setViewportView(jPanel5);

        jpSignUp.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        home.add(jpSignUp, "card3");

        jPanel1.add(home, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniSignIn() {
        jpSignIn.setVisible(true);
        jpSignUp.setVisible(false);
        home.validate();
    }

    private void iniSignUp() {
        jpSignUp.setVisible(true);
        jpSignIn.setVisible(false);
        home.validate();
    }
    
  


    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        iniSignIn();
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        iniSignUp();
    }//GEN-LAST:event_btnSignUpActionPerformed

    public Colores getColores() {
        return colores;
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JButton getBtnSignIn() {
        return btnSignIn;
    }

    public JButton getBtnSignUp() {
        return btnSignUp;
    }

    public JPanel getHome() {
        return home;
    }

    public JCheckBox getjCheckBox2() {
        return jCheckBox2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public JLabel getjLabel26() {
        return jLabel26;
    }

    public JLabel getjLabel27() {
        return jLabel27;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public JLabel getjLabel34() {
        return jLabel34;
    }

    public JLabel getjLabel36() {
        return jLabel36;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public JSeparator getjSeparator3() {
        return jSeparator3;
    }

    public JPanel getJpSignIn() {
        return jpSignIn;
    }

    public JPanel getJpSignUp() {
        return jpSignUp;
    }

    public JPanel getMenu() {
        return menu;
    }

    public JPasswordField getTesPassW() {
        return tesPassW;
    }

    public JTextField getTexMail() {
        return texMail;
    }

    public JTextField getTexNomUsuario() {
        return texNomUsuario;
    }

    public JTextField getTexNombre() {
        return texNombre;
    }

    public JPasswordField getTexPass() {
        return texPass;
    }

    public JTextField getTexUser() {
        return texUser;
    }

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel home;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpSignIn;
    private javax.swing.JPanel jpSignUp;
    private javax.swing.JPanel menu;
    private javax.swing.JPasswordField tesPassW;
    private javax.swing.JTextField texMail;
    private javax.swing.JTextField texNomUsuario;
    private javax.swing.JTextField texNombre;
    private javax.swing.JPasswordField texPass;
    private javax.swing.JTextField texUser;
    // End of variables declaration//GEN-END:variables
}
