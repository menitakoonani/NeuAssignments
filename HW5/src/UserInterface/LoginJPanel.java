/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Business;
import Business.Person;
import Business.User;
import UserInterface.PersonDirectory.PersonWorkAreaJPanel;
import UserInterface.UserDirectory.ManageUserAccountDirectory;
import UserInterface.UserDirectory.UserWorkAreaJPanel;
import UserInterface.UserDirectory.UserWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Menita Koonani
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    JPanel UserProcessContainer;
    Business business;
    
    public LoginJPanel(JPanel UserProcessContainer, Business business) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.business = business;
        renderLoginPage();
    }
    
    public void renderLoginPage() {
        usernameField.setText("");
        passwordField.setText("");
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
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPageHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginPageHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginPageHeader.setText("Login Page");
        add(loginPageHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 24, 760, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter Password : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enter Username : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, 30));
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 190, 30));

        loginBtn.setBackground(new java.awt.Color(0, 153, 153));
        loginBtn.setText("Log In");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 100, 30));
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String userName = usernameField.getText();
        char[] password = passwordField.getPassword();
        
        if (userName.isEmpty() || password.length <= 0) {
            String warningMsg = userName.isEmpty() ? "The username field cannot by empty!" : "The password field cannot be empty!";
            JOptionPane.showMessageDialog(null, warningMsg, "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        User validUser = business.getUserDirectory().isValidUser(userName, password);
        if (validUser == null) {
            JOptionPane.showMessageDialog(null, "The credentials provided are incorrect! Please try again!", "Warning", JOptionPane.WARNING_MESSAGE);
            usernameField.requestFocus();
            return;
        }
        if (!validUser.isActive()) {
            JOptionPane.showMessageDialog(null, "The user is disabled!", "Warning", JOptionPane.WARNING_MESSAGE);
            usernameField.requestFocus();
            return;
        }
        if (validUser.getUserRole().equalsIgnoreCase("System Admin")) {
            UserWorkAreaJPanel userWorkAreaPanel = new UserWorkAreaJPanel(UserProcessContainer, business, validUser);
            UserProcessContainer.add("UserWorkAreaPanel", userWorkAreaPanel);
        } else if (validUser.getUserRole().equalsIgnoreCase("HR Admin")) {
            PersonWorkAreaJPanel personWorkAreaPanel = new PersonWorkAreaJPanel(UserProcessContainer, business, validUser);
            UserProcessContainer.add("PersonWorkAreaPanel", personWorkAreaPanel);
        } else {
            JOptionPane.showMessageDialog(null, validUser.getPerson().getFirstName() + " " + validUser.getPerson().getLastName() + " has the role of a user!");
        }
        CardLayout cardLayout = (CardLayout) UserProcessContainer.getLayout();
        cardLayout.next(UserProcessContainer);

    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginPageHeader;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
