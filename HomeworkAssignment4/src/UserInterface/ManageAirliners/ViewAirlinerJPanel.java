/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Menita Koonani
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirlinerJPanel
     */
    private javax.swing.JPanel CardSequenceJPanel;
    private Airliner airliner;
    private AirlinerDirectory airlinerDirectory;

    public ViewAirlinerJPanel(javax.swing.JPanel CardSequenceJPanel, Airliner airliner, AirlinerDirectory airlinerDirectory) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airliner = airliner;
        this.airlinerDirectory = airlinerDirectory;
        populateViewAirliner();
    }

    public void populateViewAirliner() {
        isEditable(false);
        airlinerIdField.setText(String.valueOf(airliner.getAirlinerId()));
        airlinerNameField.setText(airliner.getAirlinerName());
        airlinerAddressField.setText(airliner.getAirlinerAddress());
    }

    public void isEditable(boolean isEditable) {
        saveAirlinerBtn.setEnabled(isEditable);
        updateAirlinerBtn.setEnabled(!isEditable);
        cancelUpdateBtn.setEnabled(isEditable);
        airlinerIdField.setEditable(isEditable);
        airlinerNameField.setEditable(isEditable);
        airlinerAddressField.setEditable(isEditable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateAirlinerBtn = new javax.swing.JButton();
        viewBackBtn = new javax.swing.JButton();
        viewAirlinerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        airlinerIdField = new javax.swing.JTextField();
        airlinerAddressField = new javax.swing.JTextField();
        airlinerNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        saveAirlinerBtn = new javax.swing.JButton();
        cancelUpdateBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateAirlinerBtn.setBackground(new java.awt.Color(0, 153, 153));
        updateAirlinerBtn.setText("Update");
        updateAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAirlinerBtnActionPerformed(evt);
            }
        });
        add(updateAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        viewBackBtn.setBackground(new java.awt.Color(0, 153, 153));
        viewBackBtn.setText("<< Back");
        viewBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBackBtnActionPerformed(evt);
            }
        });
        add(viewBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        viewAirlinerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewAirlinerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewAirlinerLabel.setText("View Airliner Details");
        viewAirlinerLabel.setToolTipText("");
        add(viewAirlinerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 720, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Airliner ID : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 157, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Airliner Name : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 157, 28));

        airlinerIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerIdFieldActionPerformed(evt);
            }
        });
        add(airlinerIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 136, 32));
        add(airlinerAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 136, 32));
        add(airlinerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 136, 32));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Airliner Address : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 157, 28));

        saveAirlinerBtn.setBackground(new java.awt.Color(0, 153, 153));
        saveAirlinerBtn.setText("Save");
        saveAirlinerBtn.setEnabled(false);
        saveAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAirlinerBtnActionPerformed(evt);
            }
        });
        add(saveAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        cancelUpdateBtn.setBackground(new java.awt.Color(0, 153, 153));
        cancelUpdateBtn.setText("Cancel");
        cancelUpdateBtn.setEnabled(false);
        cancelUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelUpdateBtnActionPerformed(evt);
            }
        });
        add(cancelUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBackBtnActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinersJPanel manageAirlinerPanel = (ManageAirlinersJPanel) component;
        manageAirlinerPanel.populateManageAirlinerTable();
        CardLayout cardLayout = (CardLayout) CardSequenceJPanel.getLayout();
        cardLayout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_viewBackBtnActionPerformed

    private void airlinerIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerIdFieldActionPerformed

    private void saveAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAirlinerBtnActionPerformed
        // TODO add your handling code here:
        Long airlinerId = Long.parseLong(String.valueOf(airlinerIdField.getText()));
        String airlinerName = airlinerNameField.getText();
        String airlinerAddress = airlinerAddressField.getText();

        if (airlinerId <= 0 || airlinerName.isEmpty() || airlinerAddress.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All the fields are mandatory!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Airliner updateAirliner = airlinerDirectory.getAirlinerById(airlinerId);
            updateAirliner.setAirlinerName(airlinerName);
            updateAirliner.setAirlinerAddress(airlinerAddress);

            JOptionPane.showMessageDialog(null, "Airliner updated successfully!!");
            isEditable(false);
        }
    }//GEN-LAST:event_saveAirlinerBtnActionPerformed

    private void updateAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAirlinerBtnActionPerformed
        // TODO add your handling code here:
        isEditable(true);
        airlinerIdField.setEditable(false);
    }//GEN-LAST:event_updateAirlinerBtnActionPerformed

    private void cancelUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelUpdateBtnActionPerformed
        // TODO add your handling code here:
        isEditable(false);
        populateViewAirliner();
    }//GEN-LAST:event_cancelUpdateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerAddressField;
    private javax.swing.JTextField airlinerIdField;
    private javax.swing.JTextField airlinerNameField;
    private javax.swing.JButton cancelUpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton saveAirlinerBtn;
    private javax.swing.JButton updateAirlinerBtn;
    private javax.swing.JLabel viewAirlinerLabel;
    private javax.swing.JButton viewBackBtn;
    // End of variables declaration//GEN-END:variables
}
