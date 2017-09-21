/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Airplane.Airplane;
import Airplane.AirplaneCatalog;
import javax.swing.JOptionPane;

/**
 *
 * @author Menita Koonani
 */
public class AddAirplaneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addAirplaneJPanel
     */
    private AirplaneCatalog airplaneCatalog;

    public AddAirplaneJPanel(AirplaneCatalog airplaneCatalog) {
        initComponents();
        this.airplaneCatalog = airplaneCatalog;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airplaneAvailability = new javax.swing.ButtonGroup();
        addPanelHeader = new javax.swing.JLabel();
        serialNumberLabel = new javax.swing.JLabel();
        serialNumberField = new javax.swing.JTextField();
        modelNumberLabel = new javax.swing.JLabel();
        modelNumberField = new javax.swing.JTextField();
        airplaneNameLabel = new javax.swing.JLabel();
        airplaneNameField = new javax.swing.JTextField();
        airplaneAvailableLabel = new javax.swing.JLabel();
        planeAvailable = new javax.swing.JCheckBox();
        planeUnavailable = new javax.swing.JCheckBox();
        manufacturerNameLabel = new javax.swing.JLabel();
        manufacturerNameField = new javax.swing.JTextField();
        yearManuLabel = new javax.swing.JLabel();
        yearManuChooser = new com.toedter.calendar.JYearChooser();
        seatsAvailLabel = new javax.swing.JLabel();
        seatsAvailField = new com.toedter.components.JSpinField();
        airportNameLabel = new javax.swing.JLabel();
        airportNameField = new javax.swing.JTextField();
        addAirplaneBtn = new javax.swing.JButton();

        addPanelHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addPanelHeader.setText("Add Airplane Details");

        serialNumberLabel.setText("Enter Airplane Serial  Number:");

        serialNumberField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        serialNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumberFieldActionPerformed(evt);
            }
        });

        modelNumberLabel.setText("Enter Airplane Model Number:");

        airplaneNameLabel.setText("Enter Airplane Name:");

        airplaneAvailableLabel.setText("Is it Available:");

        airplaneAvailability.add(planeAvailable);
        planeAvailable.setSelected(true);
        planeAvailable.setText("Yes");

        airplaneAvailability.add(planeUnavailable);
        planeUnavailable.setText("No");

        manufacturerNameLabel.setText("Enter Airplane manufacturer name:");

        yearManuLabel.setText("Enter year of manufacture:");

        yearManuChooser.setEndYear(2017);
        yearManuChooser.setMinimum(1990);
        yearManuChooser.setName("yearOfManu"); // NOI18N

        seatsAvailLabel.setText("Enter number of seats available:");

        seatsAvailField.setMaximum(550);
        seatsAvailField.setMinimum(0);
        seatsAvailField.setName("seatsAvailable"); // NOI18N
        seatsAvailField.setValue(550);

        airportNameLabel.setText("Enter Airport Name:");

        addAirplaneBtn.setText("Add Airplane");
        addAirplaneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAirplaneBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modelNumberLabel)
                                .addGap(125, 125, 125)
                                .addComponent(modelNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(serialNumberLabel)
                                .addGap(125, 125, 125)
                                .addComponent(serialNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(yearManuLabel)
                                    .addComponent(manufacturerNameLabel)
                                    .addComponent(seatsAvailLabel))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manufacturerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(seatsAvailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(yearManuChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(airplaneNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(airplaneAvailableLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(planeAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(planeUnavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(airplaneNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(airportNameLabel)
                                .addGap(125, 125, 125)
                                .addComponent(airportNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(addPanelHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(addAirplaneBtn)))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(addPanelHeader)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialNumberLabel)
                    .addComponent(serialNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelNumberLabel)
                    .addComponent(modelNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airplaneNameLabel)
                    .addComponent(airplaneNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airplaneAvailableLabel)
                    .addComponent(planeAvailable)
                    .addComponent(planeUnavailable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturerNameLabel)
                    .addComponent(manufacturerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearManuLabel)
                    .addComponent(yearManuChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatsAvailLabel)
                    .addComponent(seatsAvailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airportNameLabel)
                    .addComponent(airportNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(addAirplaneBtn)
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addAirplaneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAirplaneBtnActionPerformed
        // TODO add your handling code here:
        getAddFieldsFromPanel();
        JOptionPane.showMessageDialog(null, "Airplane added successfully!");
        resetAddFields();
    }//GEN-LAST:event_addAirplaneBtnActionPerformed
    
    public void resetAddFields() {
        serialNumberField.setText("");
        modelNumberField.setText("");
        airplaneNameField.setText("");
        planeAvailable.setSelected(true);
        manufacturerNameField.setText("");
        yearManuChooser.setYear(2017);
        seatsAvailField.setValue(550);
        airportNameField.setText("");
    }

    public void getAddFieldsFromPanel() {
        try {
            Long serialNumber = Long.parseLong(serialNumberField.getText());
            String modelNumber = modelNumberField.getText();
            String airplaneName = airplaneNameField.getText();
            boolean isAvailable = planeAvailable.isSelected();
            String manufacturerName = manufacturerNameField.getText();
            int yearManu = yearManuChooser.getYear();
            int seatsAvailable = seatsAvailField.getValue();
            String airportName = airportNameField.getText();

            Airplane airplane = airplaneCatalog.addNewAirplane();
            airplane.setSerialNumber(serialNumber);
            airplane.setModelNumber(modelNumber);
            airplane.setAirplaneName(airplaneName);
            airplane.setIsAvailable(isAvailable);
            airplane.setManufacturerName(manufacturerName);
            airplane.setYearOfManufacture(yearManu);
            airplane.setSeatsAvailable(seatsAvailable);
            airplane.setAirportName(airportName);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Serial Number : Serial Number field can contian only numbers!! Please try again!");
            serialNumberField.requestFocus();
        }
    }
    private void serialNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumberFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAirplaneBtn;
    private javax.swing.JLabel addPanelHeader;
    private javax.swing.ButtonGroup airplaneAvailability;
    private javax.swing.JLabel airplaneAvailableLabel;
    private javax.swing.JTextField airplaneNameField;
    private javax.swing.JLabel airplaneNameLabel;
    private javax.swing.JTextField airportNameField;
    private javax.swing.JLabel airportNameLabel;
    private javax.swing.JTextField manufacturerNameField;
    private javax.swing.JLabel manufacturerNameLabel;
    private javax.swing.JTextField modelNumberField;
    private javax.swing.JLabel modelNumberLabel;
    private javax.swing.JCheckBox planeAvailable;
    private javax.swing.JCheckBox planeUnavailable;
    private com.toedter.components.JSpinField seatsAvailField;
    private javax.swing.JLabel seatsAvailLabel;
    private javax.swing.JTextField serialNumberField;
    private javax.swing.JLabel serialNumberLabel;
    private com.toedter.calendar.JYearChooser yearManuChooser;
    private javax.swing.JLabel yearManuLabel;
    // End of variables declaration//GEN-END:variables
}
