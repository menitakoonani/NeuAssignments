/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author Menita Koonani
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPageHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPageHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginPageHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginPageHeader.setText("Login Page");
        add(loginPageHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 24, 760, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter Password : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enter Username : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 200, 30));
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 190, 30));
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 190, 30));

        loginBtn.setBackground(new java.awt.Color(0, 153, 153));
        loginBtn.setText("Log In");
        add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 263, 100, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginPageHeader;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
