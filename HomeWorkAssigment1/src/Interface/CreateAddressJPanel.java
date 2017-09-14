/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import UserApplication.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Menita Koonani
 */
public class CreateAddressJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAddressJPanel
     */
    private Address address;
    public CreateAddressJPanel(Person person) {
        initComponents();
        this.address = new Address();
        person.setAddress(this.address);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAddressPanel = new javax.swing.JPanel();
        createAddressLabel = new javax.swing.JLabel();
        streetLabel = new javax.swing.JLabel();
        streetTextField = new javax.swing.JTextField();
        aptNumLabel = new javax.swing.JLabel();
        aptNumTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        zipcodeLabel = new javax.swing.JLabel();
        zipcodeTextField = new javax.swing.JTextField();
        addAddressBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        createAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createAddressLabel.setText("Add Your Address");

        streetLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        streetLabel.setText("Enter your Street Name:");

        aptNumLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aptNumLabel.setText("Enter your Apartment Number:");

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cityLabel.setText("Enter your city:");

        stateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stateLabel.setText("Enter your state:");

        countryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        countryLabel.setText("Enter your country:");

        zipcodeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zipcodeLabel.setText("Enter your zipcode:");

        addAddressBtn.setText("Add Address");
        addAddressBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAddressBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createAddressPanelLayout = new javax.swing.GroupLayout(createAddressPanel);
        createAddressPanel.setLayout(createAddressPanelLayout);
        createAddressPanelLayout.setHorizontalGroup(
            createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAddressPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createAddressPanelLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(addAddressBtn)
                        .addGap(282, 282, 282))
                    .addGroup(createAddressPanelLayout.createSequentialGroup()
                        .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(streetLabel)
                            .addComponent(aptNumLabel)
                            .addComponent(cityLabel)
                            .addComponent(stateLabel)
                            .addComponent(countryLabel)
                            .addComponent(zipcodeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAddressPanelLayout.createSequentialGroup()
                                .addComponent(streetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(createAddressPanelLayout.createSequentialGroup()
                                .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aptNumTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(countryTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zipcodeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
            .addGroup(createAddressPanelLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(createAddressLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createAddressPanelLayout.setVerticalGroup(
            createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAddressPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(createAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLabel)
                    .addComponent(streetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aptNumLabel)
                    .addComponent(aptNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateLabel)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryLabel))
                .addGap(18, 18, 18)
                .addGroup(createAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcodeLabel))
                .addGap(18, 18, 18)
                .addComponent(addAddressBtn)
                .addContainerGap())
        );

        add(createAddressPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addAddressBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAddressBtnActionPerformed
        // TODO add your handling code here:
        address.setStreetName(streetTextField.getText());
        address.setApartmentNum(aptNumTextField.getText());
        address.setCity(cityTextField.getText());
        address.setState(stateTextField.getText());
        address.setCountry(countryTextField.getText());
        address.setZipCode(zipcodeTextField.getText());
        
        JOptionPane.showMessageDialog(null,"Address added successfully");
    }//GEN-LAST:event_addAddressBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAddressBtn;
    private javax.swing.JLabel aptNumLabel;
    private javax.swing.JTextField aptNumTextField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JLabel createAddressLabel;
    private javax.swing.JPanel createAddressPanel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetTextField;
    private javax.swing.JLabel zipcodeLabel;
    private javax.swing.JTextField zipcodeTextField;
    // End of variables declaration//GEN-END:variables
}
