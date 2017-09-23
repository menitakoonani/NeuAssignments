/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Airplane.Airplane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Menita Koonani
 */
public class AirplaneManufactureList extends javax.swing.JPanel {

    /**
     * Creates new form airplaneManufactureList
     */
    public AirplaneManufactureList() {
        initComponents();
    }
    public void populateManufactureTable(String airplaneName){
        ArrayList<Airplane> airplaneList = MainJFrame.airplaneCatalog.getAirplaneByName(airplaneName);
        DefaultTableModel airplaneTable = (DefaultTableModel) manuTable.getModel();
        airplaneTable.setNumRows(0);
        //starting the population form row 0
        airplaneTable.setRowCount(0);
        for (Airplane eachAirplane : airplaneList) {
            Object row[] = new Object[3];
            //setting the object to the first row as we need to access all the other attributes of that particular object
            row[0] = eachAirplane;
            row[1] = eachAirplane.getManufacturerName();
            airplaneTable.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        manuTable = new javax.swing.JTable();
        manuListPanelHeader = new javax.swing.JLabel();
        airplaneNameSearchLabel = new javax.swing.JLabel();
        airplaneNameSearchField = new javax.swing.JTextField();
        searchManuBtn = new javax.swing.JButton();

        manuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airplane Serial Number", "Manufacturer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manuTable);

        manuListPanelHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        manuListPanelHeader.setText("Airplane - Manufacturer Details");

        airplaneNameSearchLabel.setText("Enter airplane name to search:");

        searchManuBtn.setText("Search");
        searchManuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchManuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(airplaneNameSearchLabel)
                        .addGap(26, 26, 26)
                        .addComponent(airplaneNameSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(searchManuBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(manuListPanelHeader)))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airplaneNameSearchLabel)
                    .addComponent(airplaneNameSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchManuBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manuListPanelHeader)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchManuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchManuBtnActionPerformed
        // TODO add your handling code here:
        populateManufactureTable(airplaneNameSearchField.getText());
    }//GEN-LAST:event_searchManuBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airplaneNameSearchField;
    private javax.swing.JLabel airplaneNameSearchLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manuListPanelHeader;
    private javax.swing.JTable manuTable;
    private javax.swing.JButton searchManuBtn;
    // End of variables declaration//GEN-END:variables
}
