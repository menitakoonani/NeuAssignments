/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import UserInterface.ManageAirliners.ManageAirlinersJPanel;
import Business.AirlinerDirectory;
import Business.TravelAgency;
import UserInterface.ManageFlights.ManageFlightsJPanel;
import java.awt.CardLayout;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Menita Koonani
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgencyMain
     */
    private TravelAgency travelAgency;

    public TravelAgencyMain() {
        initComponents();
        this.travelAgency = new TravelAgency();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        LeftPanel = new javax.swing.JPanel();
        ManageAirlinersBtn = new javax.swing.JButton();
        ManageFlightsBtn = new javax.swing.JButton();
        CardSequenceJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftPanel.setPreferredSize(new java.awt.Dimension(150, 200));
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageAirlinersBtn.setBackground(new java.awt.Color(0, 153, 153));
        ManageAirlinersBtn.setText("Manage Airliners");
        ManageAirlinersBtn.setBorder(new javax.swing.border.MatteBorder(null));
        ManageAirlinersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAirlinersBtnActionPerformed(evt);
            }
        });
        LeftPanel.add(ManageAirlinersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 50));

        ManageFlightsBtn.setBackground(new java.awt.Color(0, 153, 153));
        ManageFlightsBtn.setText("Manage Flights");
        ManageFlightsBtn.setBorder(new javax.swing.border.MatteBorder(null));
        ManageFlightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageFlightsBtnActionPerformed(evt);
            }
        });
        LeftPanel.add(ManageFlightsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 50));

        jSplitPane2.setLeftComponent(LeftPanel);

        CardSequenceJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(CardSequenceJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageAirlinersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageAirlinersBtnActionPerformed
        try {
            // TODO add your handling code here:
            travelAgency.importAirlinersDetails();
            ManageAirlinersJPanel manageAirlinerPanel = new ManageAirlinersJPanel(CardSequenceJPanel, travelAgency);
            CardLayout cardLayout = (CardLayout) CardSequenceJPanel.getLayout();
            CardSequenceJPanel.add("ManageAirlinerPanel", manageAirlinerPanel);
            cardLayout.next(CardSequenceJPanel);
        } catch (IOException ex) {
            Logger.getLogger(TravelAgencyMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TravelAgencyMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ManageAirlinersBtnActionPerformed

    private void ManageFlightsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageFlightsBtnActionPerformed
        // TODO add your handling code here:
        ManageFlightsJPanel manageFlightPanel = new ManageFlightsJPanel(CardSequenceJPanel, travelAgency.getAirlinerDirectory());
        CardLayout cardLayout = (CardLayout) CardSequenceJPanel.getLayout();
        CardSequenceJPanel.add("ManageFlightPanel", manageFlightPanel);
        cardLayout.next(CardSequenceJPanel);

    }//GEN-LAST:event_ManageFlightsBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequenceJPanel;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton ManageAirlinersBtn;
    private javax.swing.JButton ManageFlightsBtn;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}