/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Menita Koonani
 */
public class LastTimeFleetUpdated extends javax.swing.JPanel {

    /**
     * Creates new form LastTimeFleetUpdated
     */
    public LastTimeFleetUpdated() {
        initComponents();
        fleetUpdateField.setEditable(false);
        fleetUpdateField.setText(MainJFrame.airplaneCatalog.getLastFleetUpdatedTime()!=null?MainJFrame.airplaneCatalog.getLastFleetUpdatedTime():"Empty airplane catalog!!");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fleetUpdateLabel = new javax.swing.JLabel();
        fleetUpdateField = new javax.swing.JTextField();

        fleetUpdateLabel.setText("The last time fleet was updated : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(fleetUpdateLabel)
                .addGap(18, 18, 18)
                .addComponent(fleetUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fleetUpdateLabel)
                    .addComponent(fleetUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(409, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fleetUpdateField;
    private javax.swing.JLabel fleetUpdateLabel;
    // End of variables declaration//GEN-END:variables
}
