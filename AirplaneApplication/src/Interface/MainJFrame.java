/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Airplane.Airplane;
import Airplane.AirplaneCatalog;
import Airplane.ImportIntoCatalog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Menita Koonani
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private AirplaneCatalog airplaneCatalog;
    public MainJFrame() {
        initComponents();
        airplaneCatalog = new AirplaneCatalog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainSplitPane = new javax.swing.JSplitPane();
        mainControlPanel = new javax.swing.JPanel();
        addAirplaneBtn = new javax.swing.JButton();
        viewAirplaneBtn = new javax.swing.JButton();
        availableAirplanes = new javax.swing.JButton();
        searchByManuBtn = new javax.swing.JButton();
        searchByManuYearBtn = new javax.swing.JButton();
        mainDisplayPanel = new javax.swing.JPanel();
        uploadFileBtn = new javax.swing.JButton();
        uploadFileLabel = new javax.swing.JLabel();
        uploadFilePathField = new javax.swing.JTextField();
        addAirplaneListBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addAirplaneBtn.setText("Add Airplane");
        addAirplaneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAirplaneBtnActionPerformed(evt);
            }
        });

        viewAirplaneBtn.setText("View Airplane List");
        viewAirplaneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirplaneBtnActionPerformed(evt);
            }
        });

        availableAirplanes.setText("Currently available airplanes");
        availableAirplanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableAirplanesActionPerformed(evt);
            }
        });

        searchByManuBtn.setText("Search by Manufacturer");
        searchByManuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByManuBtnActionPerformed(evt);
            }
        });

        searchByManuYearBtn.setText("Search by Manufactured Year");
        searchByManuYearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByManuYearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainControlPanelLayout = new javax.swing.GroupLayout(mainControlPanel);
        mainControlPanel.setLayout(mainControlPanelLayout);
        mainControlPanelLayout.setHorizontalGroup(
            mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availableAirplanes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(addAirplaneBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAirplaneBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchByManuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchByManuYearBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainControlPanelLayout.setVerticalGroup(
            mainControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainControlPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(addAirplaneBtn)
                .addGap(30, 30, 30)
                .addComponent(viewAirplaneBtn)
                .addGap(57, 57, 57)
                .addComponent(availableAirplanes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchByManuBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchByManuYearBtn)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        mainSplitPane.setLeftComponent(mainControlPanel);

        uploadFileBtn.setText("Browse");
        uploadFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadFileBtnActionPerformed(evt);
            }
        });

        uploadFileLabel.setText("Upload CSV File containing Airplane Data");

        addAirplaneListBtn.setText("Add Airplane List from File");
        addAirplaneListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAirplaneListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainDisplayPanelLayout = new javax.swing.GroupLayout(mainDisplayPanel);
        mainDisplayPanel.setLayout(mainDisplayPanelLayout);
        mainDisplayPanelLayout.setHorizontalGroup(
            mainDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainDisplayPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(uploadFileLabel)
                .addGap(75, 75, 75)
                .addComponent(uploadFilePathField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uploadFileBtn)
                .addGap(115, 115, 115))
            .addGroup(mainDisplayPanelLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(addAirplaneListBtn)
                .addContainerGap())
        );
        mainDisplayPanelLayout.setVerticalGroup(
            mainDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDisplayPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(mainDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadFileBtn)
                    .addComponent(uploadFileLabel)
                    .addComponent(uploadFilePathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(addAirplaneListBtn)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        mainSplitPane.setRightComponent(mainDisplayPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSplitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainSplitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAirplaneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAirplaneBtnActionPerformed
        // TODO add your handling code here:
        AddAirplaneJPanel addAirplanePanel = new AddAirplaneJPanel(airplaneCatalog);
        mainSplitPane.setRightComponent(addAirplanePanel);
    }//GEN-LAST:event_addAirplaneBtnActionPerformed

    private void viewAirplaneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirplaneBtnActionPerformed
        // TODO add your handling code here:
        ViewAirplaneJPanel viewAirplanePanel = new ViewAirplaneJPanel(airplaneCatalog, -1);
        mainSplitPane.setRightComponent(viewAirplanePanel);
    }//GEN-LAST:event_viewAirplaneBtnActionPerformed

    private void uploadFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFileBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int isFileChosen = fileChooser.showOpenDialog(uploadFileBtn);
        if (isFileChosen == JFileChooser.APPROVE_OPTION) {
            File chosenFile = fileChooser.getSelectedFile();
            String filePath = chosenFile.getAbsolutePath();
            uploadFilePathField.setText(filePath);
        } else {
            JOptionPane.showMessageDialog(null, "Please upload a file!");
        }
    }//GEN-LAST:event_uploadFileBtnActionPerformed

    private void addAirplaneListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAirplaneListBtnActionPerformed
        // TODO add your handling code here:
        String fileName = uploadFilePathField.getText().trim();
        if(!fileName.isEmpty())
        {
            try {
                File chosenFile = new File(fileName);
//                JOptionPane.showMessageDialog(null, "File : " + chosenFile.getName());
                airplaneCatalog = ImportIntoCatalog.populatingAirplaneCatalog(chosenFile);
                uploadFilePathField.setText("");
            } catch (IOException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please choose a file!");
            uploadFilePathField.requestFocus();
            return;
        }
    }//GEN-LAST:event_addAirplaneListBtnActionPerformed

    private void availableAirplanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableAirplanesActionPerformed
        // TODO add your handling code here:
        SearchAirplaneJPanel searchAirplanePanel = new SearchAirplaneJPanel(airplaneCatalog, 2);
        mainSplitPane.setRightComponent(searchAirplanePanel);
    }//GEN-LAST:event_availableAirplanesActionPerformed

    private void searchByManuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByManuBtnActionPerformed
        // TODO add your handling code here:
        SearchAirplaneJPanel searchAirplanePanel = new SearchAirplaneJPanel(airplaneCatalog, 3);
        mainSplitPane.setRightComponent(searchAirplanePanel);
    }//GEN-LAST:event_searchByManuBtnActionPerformed

    private void searchByManuYearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByManuYearBtnActionPerformed
        // TODO add your handling code here:
        SearchAirplaneJPanel searchAirplanePanel = new SearchAirplaneJPanel(airplaneCatalog, 4);
        mainSplitPane.setRightComponent(searchAirplanePanel);
    }//GEN-LAST:event_searchByManuYearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAirplaneBtn;
    private javax.swing.JButton addAirplaneListBtn;
    private javax.swing.JButton availableAirplanes;
    private javax.swing.JPanel mainControlPanel;
    private javax.swing.JPanel mainDisplayPanel;
    private javax.swing.JSplitPane mainSplitPane;
    private javax.swing.JButton searchByManuBtn;
    private javax.swing.JButton searchByManuYearBtn;
    private javax.swing.JButton uploadFileBtn;
    private javax.swing.JLabel uploadFileLabel;
    private javax.swing.JTextField uploadFilePathField;
    private javax.swing.JButton viewAirplaneBtn;
    // End of variables declaration//GEN-END:variables
}