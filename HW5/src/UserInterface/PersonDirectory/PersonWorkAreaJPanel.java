/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PersonDirectory;

import Business.User;
import Business.Business;
import Business.Person;
import UserInterface.LoginJPanel;
import UserInterface.UserDirectory.ManageUserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Menita Koonani
 */
public class PersonWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserWorkAreaJPanel
     */
    JPanel UserProcessContainer;
    Business business;
    User user;

    public PersonWorkAreaJPanel(JPanel UserProcessContainer, Business business, User user) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.business = business;
        this.user = user;
        populatePersonWorkAreaPanel();
    }

    public void populatePersonWorkAreaPanel() {
        Person person = user.getPerson();
        personIDField.setText(String.valueOf(person.getPersonId()));
        nameField.setText(person.getFirstName() + " " + person.getLastName());
        userRoleField.setText(user.getUserRole());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userRoleField = new javax.swing.JLabel();
        personIDField = new javax.swing.JLabel();
        nameField = new javax.swing.JLabel();
        workAreaPanelHeader = new javax.swing.JLabel();
        managePersonsBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Role : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Person ID : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Name : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 30));

        userRoleField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(userRoleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 200, 30));

        personIDField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(personIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 200, 30));

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 200, 30));

        workAreaPanelHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        workAreaPanelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workAreaPanelHeader.setText("Person Work Area Panel");
        add(workAreaPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 24, 760, 60));

        managePersonsBtn.setBackground(new java.awt.Color(0, 153, 153));
        managePersonsBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        managePersonsBtn.setText("Manage Person Directory");
        managePersonsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonsBtnActionPerformed(evt);
            }
        });
        add(managePersonsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 230, 30));

        logoutBtn.setBackground(new java.awt.Color(0, 153, 153));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutBtn.setText("<< Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void managePersonsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonsBtnActionPerformed
        // TODO add your handling code here:
        ManagePersonDirectory managePersonDirPanel = new ManagePersonDirectory(UserProcessContainer, business);
        CardLayout cardLayout = (CardLayout) UserProcessContainer.getLayout();
        UserProcessContainer.add("ManagePersonDirPanel", managePersonDirPanel);
        cardLayout.next(UserProcessContainer);
    }//GEN-LAST:event_managePersonsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout? ", "Warning", JOptionPane.YES_NO_CANCEL_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            UserProcessContainer.remove(this);
            Component[] componentArray = UserProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            CardLayout cardLayout = (CardLayout) UserProcessContainer.getLayout();
            LoginJPanel loginPanel = (LoginJPanel) component;
            loginPanel.renderLoginPage();
            cardLayout.previous(UserProcessContainer);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton managePersonsBtn;
    private javax.swing.JLabel nameField;
    private javax.swing.JLabel personIDField;
    private javax.swing.JLabel userRoleField;
    private javax.swing.JLabel workAreaPanelHeader;
    // End of variables declaration//GEN-END:variables
}
