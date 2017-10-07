/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlights;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.Schedule;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Menita Koonani
 */
public class CreateNewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateFlightJPanel
     */
    private javax.swing.JPanel CardSequenceJPanel;
    private AirlinerDirectory airlinerDirectory;
    
    public CreateNewFlightJPanel(javax.swing.JPanel CardSequenceJPanel, AirlinerDirectory airlinerDirectory) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airlinerDirectory = airlinerDirectory;
        departDate.setMinSelectableDate(new Date(System.currentTimeMillis()));
        departDate.setDate(new Date(System.currentTimeMillis()));
        populateAirlinerList();
    }
    
    public void populateAirlinerList() {
        ArrayList<Airliner> airlinerList = airlinerDirectory.getAirlinerList();
        for (Airliner eachAirliner : airlinerList) {
            chooseAirliner.addItem(eachAirliner.getAirlinerName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createFlightLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        flightIdField = new javax.swing.JTextField();
        flightNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        createFlightBtn = new javax.swing.JButton();
        createFlightBackBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        chooseAirliner = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        sourceLocField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        destLocField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        departDate = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createFlightLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createFlightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createFlightLabel.setText("Create new flight in Airliner");
        createFlightLabel.setToolTipText("");
        add(createFlightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Choose airliner : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 90, 190, 28));

        flightIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightIdFieldActionPerformed(evt);
            }
        });
        add(flightIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 136, 32));
        add(flightNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 136, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enter flight name : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 210, 180, 28));

        createFlightBtn.setBackground(new java.awt.Color(0, 153, 153));
        createFlightBtn.setText("Create");
        createFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFlightBtnActionPerformed(evt);
            }
        });
        add(createFlightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 460, 90, -1));

        createFlightBackBtn.setBackground(new java.awt.Color(0, 153, 153));
        createFlightBackBtn.setText("<< Back");
        createFlightBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFlightBackBtnActionPerformed(evt);
            }
        });
        add(createFlightBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enter flight Id :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 150, 190, 28));

        add(chooseAirliner, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Enter Source Location : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 270, 190, 28));

        sourceLocField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceLocFieldActionPerformed(evt);
            }
        });
        add(sourceLocField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 136, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Choose departure date : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 190, 28));

        destLocField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destLocFieldActionPerformed(evt);
            }
        });
        add(destLocField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 136, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Enter Destination Location : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 330, 190, 28));

        departDate.setAutoscrolls(true);
        add(departDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void flightIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightIdFieldActionPerformed

    private void createFlightBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFlightBackBtnActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlightsJPanel manageFlightPanel = (ManageFlightsJPanel) component;
        manageFlightPanel.populateManageFlightPanel();
        CardLayout cardLayout = (CardLayout) CardSequenceJPanel.getLayout();
        cardLayout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_createFlightBackBtnActionPerformed

    private void createFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFlightBtnActionPerformed
        // TODO add your handling code here:
        Long flightId = Long.parseLong(String.valueOf(flightIdField.getText()));
        String flightName = flightNameField.getText();
        String sourceLoc = sourceLocField.getText();
        String destLoc = destLocField.getText();
        Date departureDate = departDate.getDate();
        
        if (flightId <= 0 || flightName.isEmpty() || sourceLoc.isEmpty() || destLoc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All the fields are mandatory!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String airlinerName = chooseAirliner.getSelectedItem().toString();
            Airliner airliner = airlinerDirectory.getAirlinerByName(airlinerName);
            Flight newFlight = airliner.getFleet().addNewFlight();
            newFlight.setFlightId(flightId);
            newFlight.setFlightName(flightName);
            
            Schedule schedule = new Schedule();
            schedule.setSourceLocation(sourceLoc);
            schedule.setDestLocation(destLoc);
            schedule.setDepartureDate(departureDate);
            newFlight.setSchedule(schedule);
            
            JOptionPane.showMessageDialog(null, "Flight successfully added in " + airlinerName + "!");
            emptyFields();
        }
    }//GEN-LAST:event_createFlightBtnActionPerformed

    private void sourceLocFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceLocFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceLocFieldActionPerformed

    private void destLocFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destLocFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destLocFieldActionPerformed
    public void emptyFields() {
        flightIdField.setText("");
        flightNameField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseAirliner;
    private javax.swing.JButton createFlightBackBtn;
    private javax.swing.JButton createFlightBtn;
    private javax.swing.JLabel createFlightLabel;
    private com.toedter.calendar.JDateChooser departDate;
    private javax.swing.JTextField destLocField;
    private javax.swing.JTextField flightIdField;
    private javax.swing.JTextField flightNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField sourceLocField;
    // End of variables declaration//GEN-END:variables
}