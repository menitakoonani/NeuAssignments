/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.ClinicOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorRole.ManageVaccineRequestsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Menita Koonani
 */
public class DoctorsWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HospitalEnterprise enterprise;
    private UserAccount account;
    private ClinicOrganization organization;
    private EcoSystem system;

    /**
     * Creates new form DoctorsWorkAreaJPanel
     */
    public DoctorsWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ClinicOrganization organization, HospitalEnterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.organization = organization;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageVaccinesBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        manageVaccinesCatalogBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageVaccinesBtn.setText("Manage Vaccine Requests");
        manageVaccinesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccinesBtnActionPerformed(evt);
            }
        });
        add(manageVaccinesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clinic Work Area Panel");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 320, 30));

        manageVaccinesCatalogBtn.setText("Manage Vaccine Catalog");
        manageVaccinesCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccinesCatalogBtnActionPerformed(evt);
            }
        });
        add(manageVaccinesCatalogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageVaccinesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccinesBtnActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageVaccineRequestsJPanel", new ManageVaccineRequestsJPanel(userProcessContainer, account, organization, enterprise, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVaccinesBtnActionPerformed

    private void manageVaccinesCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccinesCatalogBtnActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageVaccinesJPanel", new ManageVaccinesJPanel(userProcessContainer, (HospitalEnterprise) enterprise, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVaccinesCatalogBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton manageVaccinesBtn;
    private javax.swing.JButton manageVaccinesCatalogBtn;
    // End of variables declaration//GEN-END:variables
}