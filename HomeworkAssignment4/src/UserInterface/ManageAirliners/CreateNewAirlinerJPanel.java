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
public class CreateNewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewAirlinerJPanel
     */
    private javax.swing.JPanel CardSequenceJPanel;
    private AirlinerDirectory airlinerDirectory;
    
    public CreateNewAirlinerJPanel(javax.swing.JPanel CardSequenceJPanel, AirlinerDirectory airlinerDirectory) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlinerDirectory = airlinerDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAirlinerBtn = new javax.swing.JButton();
        createBackBtn = new javax.swing.JButton();
        viewAirlinerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        airlinerIdField = new javax.swing.JTextField();
        airlinerAddressField = new javax.swing.JTextField();
        airlinerNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        airlinerFlightCount = new javax.swing.JSpinner();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createAirlinerBtn.setBackground(new java.awt.Color(0, 153, 153));
        createAirlinerBtn.setText("Create");
        createAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirlinerBtnActionPerformed(evt);
            }
        });
        add(createAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 355, -1, -1));

        createBackBtn.setBackground(new java.awt.Color(0, 153, 153));
        createBackBtn.setText("<< Back");
        createBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBackBtnActionPerformed(evt);
            }
        });
        add(createBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 355, -1, -1));

        viewAirlinerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewAirlinerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewAirlinerLabel.setText("Create new Airliner Details");
        viewAirlinerLabel.setToolTipText("");
        add(viewAirlinerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Enter airliner Id :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 157, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter airliner name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 157, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enter number of flights : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 157, 28));

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
        jLabel4.setText("Enter airliner address :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 157, 28));
        add(airlinerFlightCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void createBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBackBtnActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinersJPanel manageAirlinerPanel = (ManageAirlinersJPanel) component;
        manageAirlinerPanel.populateManageAirlinerTable();
        CardLayout cardLayout = (CardLayout) CardSequenceJPanel.getLayout();
        cardLayout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_createBackBtnActionPerformed

    private void airlinerIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerIdFieldActionPerformed

    private void createAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirlinerBtnActionPerformed
        // TODO add your handling code here:
        Long airlinerId = Long.parseLong(String.valueOf(airlinerIdField.getText()));
        String airlinerName = airlinerNameField.getText();
        String airlinerAddress = airlinerAddressField.getText();
        int numFlight = Integer.parseInt(String.valueOf(airlinerFlightCount.getValue()));
        
        Airliner dummyAirliner = new Airliner();
        boolean isDataNotEmpty = dummyAirliner.isEmptyCheck(airlinerId, airlinerName, airlinerAddress, numFlight);
        if (isDataNotEmpty) {
            Airliner newAirliner = airlinerDirectory.addNewAirliner();
            newAirliner.setAirlinerId(airlinerId);
            newAirliner.setAirlinerName(airlinerName);
            newAirliner.setAirlinerAddress(airlinerAddress);
            newAirliner.setFlightCount(numFlight);
            
            JOptionPane.showMessageDialog(null, "New airliner successfully added!");
            emptyFields();
        } else {
            JOptionPane.showMessageDialog(null, "All the fields are mandatory!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_createAirlinerBtnActionPerformed
    public void emptyFields() {
        airlinerIdField.setText("");
        airlinerNameField.setText("");
        airlinerAddressField.setText("");
        airlinerFlightCount.setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerAddressField;
    private javax.swing.JSpinner airlinerFlightCount;
    private javax.swing.JTextField airlinerIdField;
    private javax.swing.JTextField airlinerNameField;
    private javax.swing.JButton createAirlinerBtn;
    private javax.swing.JButton createBackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel viewAirlinerLabel;
    // End of variables declaration//GEN-END:variables
}