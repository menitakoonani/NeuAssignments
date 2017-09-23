/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Airplane.Airplane;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Menita Koonani
 */
public class SearchAirplaneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchAirplaneJPanel
     */
    private int searchCriteria;

    public int getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(int searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public SearchAirplaneJPanel(int searchCriteria) {
        initComponents();
        this.searchCriteria = searchCriteria;
        noSearchStringCalls();
    }

    public void noSearchStringCalls() {
        ArrayList<Airplane> airplaneList = new ArrayList();
        minSeatsField.setVisible(false);
        minSeatsQueryLabel.setVisible(false);
        maxSeatsField.setVisible(false);
        maxSeatsQueryLabel.setVisible(false);
        switch (searchCriteria) {
            // all the airplanes
            case -1:
                searchAirplaneQueryField.setVisible(false);
                searchBtn.setVisible(false);
                searchAirplaneQueryLabel.setVisible(false);
                airplaneList = MainJFrame.airplaneCatalog.getAirplanesList();
                break;
            // first available airplane
            case 1:
                searchAirplaneQueryField.setVisible(false);
                searchBtn.setVisible(false);
                searchAirplaneQueryLabel.setVisible(false);
                airplaneList = MainJFrame.airplaneCatalog.getFirstAvailableAirplane();
                break;
            // available airplanes
            case 2:
                searchAirplaneQueryField.setVisible(false);
                searchBtn.setVisible(false);
                searchAirplaneQueryLabel.setVisible(false);
                searchPanelHeader.setText("List of available airplanes!");
                airplaneList = MainJFrame.airplaneCatalog.getAvailableAirplanes();
                break;
            // seat range availabilty
            case 5:
                searchAirplaneQueryField.setVisible(false);
                searchAirplaneQueryLabel.setVisible(false);
                minSeatsField.setVisible(true);
                minSeatsQueryLabel.setVisible(true);
                maxSeatsField.setVisible(true);
                maxSeatsQueryLabel.setVisible(true);
                searchPanelHeader.setText("List of airplanes in the specified seat range!");
                break;
            // certificates expired airplanes
            case 11:
                searchAirplaneQueryField.setVisible(false);
                searchBtn.setVisible(false);
                searchAirplaneQueryLabel.setVisible(false);
                searchPanelHeader.setText("List of airplanes having valid certificates!");
                airplaneList = MainJFrame.airplaneCatalog.getValidCertiAirplanes();
                break;

        }
        if (airplaneList != null) {
            populateTable(airplaneList);
            searchResultCountField.setText(String.valueOf(airplaneList.size()));
        }
    }

    public ArrayList<Airplane> searchByCriteria() {
        try {

            ArrayList<Airplane> airplaneList = new ArrayList();
            switch (searchCriteria) {
                // by manufacture name
                case 3:
                    String findManufacturer = searchAirplaneQueryField.getText();
                    searchPanelHeader.setText("List of airplanes manufactured by " + findManufacturer);
                    airplaneList = MainJFrame.airplaneCatalog.getAirplaneManufacturer(findManufacturer);
                    break;
                // by manufactured year
                case 4:
                    int findYear = Integer.parseInt(searchAirplaneQueryField.getText());
                    searchPanelHeader.setText("List of airplanes manufactured  " + findYear);
                    airplaneList = MainJFrame.airplaneCatalog.getAiplaneByManuYear(findYear);
                    break;
                // by seat availability
                case 5:
                    int minSeats = minSeatsField.getValue();
                    int maxSeats = maxSeatsField.getValue();
                    airplaneList = MainJFrame.airplaneCatalog.getAirplanesBySeatRange(minSeats, maxSeats);
                    break;
                // by serial number
                case 6:
                    Long findSerialNum = Long.parseLong(searchAirplaneQueryField.getText());
                    airplaneList = MainJFrame.airplaneCatalog.getAirplaneBySerialNum(findSerialNum);
                    break;
                // by model number
                case 7:
                    String findModelNum = searchAirplaneQueryField.getText();
                    searchPanelHeader.setText("List of airplanes whose model number is  " + findModelNum);
                    airplaneList = MainJFrame.airplaneCatalog.getAirplaneByModelNum(findModelNum);
                    break;
                // by airplane name
                case 8:
                    String findAirplaneName = searchAirplaneQueryField.getText();
                    searchPanelHeader.setText("List of " + findAirplaneName + "airplanes");
                    airplaneList = MainJFrame.airplaneCatalog.getAirplaneByName(findAirplaneName);
                    break;
                // by airport name
                case 10:
                    String findAirport = searchAirplaneQueryField.getText();
                    searchPanelHeader.setText("List of airplanes in " + findAirport);
                    airplaneList = MainJFrame.airplaneCatalog.getAirplaneByAirport(findAirport);
                    break;
            }
            if (airplaneList == null || airplaneList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No airplanes matched this search!");
            } else {
                searchResultCountField.setText(String.valueOf(airplaneList.size()));
            }
            return airplaneList;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter only numbers!!");
        }
        return null;
    }

    public void populateTable(ArrayList<Airplane> airplaneList) {
        DefaultTableModel airplaneTable = (DefaultTableModel) searchAirplaneTable.getModel();
        airplaneTable.setNumRows(0);
        //starting the population form row 0
        airplaneTable.setRowCount(0);
        for (Airplane eachAirplane : airplaneList) {
            Object row[] = new Object[3];
            //setting the object to the first row as we need to access all the other attributes of that particular object
            row[0] = eachAirplane;
            row[1] = eachAirplane.getAirplaneName();
            row[2] = eachAirplane.getSeatsAvailable();
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

        availBtnGroup = new javax.swing.ButtonGroup();
        expiryBtnGroup = new javax.swing.ButtonGroup();
        searchAirplaneQueryField = new javax.swing.JTextField();
        searchAirplaneQueryLabel = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        searchPanelHeader = new javax.swing.JLabel();
        searchScrollPane = new javax.swing.JScrollPane();
        searchAirplaneTable = new javax.swing.JTable();
        viewDetailsBtn = new javax.swing.JButton();
        searchResultCountLabel = new javax.swing.JLabel();
        searchResultCountField = new javax.swing.JTextField();
        serialNumberLabel = new javax.swing.JLabel();
        serailNumberField = new javax.swing.JTextField();
        modelNumberLabel = new javax.swing.JLabel();
        modelNumberField = new javax.swing.JTextField();
        airplaneNameLabel = new javax.swing.JLabel();
        airplaneNameField = new javax.swing.JTextField();
        airplaneAvailableLabel = new javax.swing.JLabel();
        manufacturerNameLabel = new javax.swing.JLabel();
        manufacturerNameField = new javax.swing.JTextField();
        yearManuLabel = new javax.swing.JLabel();
        seatsAvailLabel = new javax.swing.JLabel();
        airportNameLabel = new javax.swing.JLabel();
        airportNameField = new javax.swing.JTextField();
        updateAirplaneBtn = new javax.swing.JButton();
        planeAvailable = new javax.swing.JCheckBox();
        planeUnavailable = new javax.swing.JCheckBox();
        yearManuChooser = new com.toedter.calendar.JYearChooser();
        seatsAvailChooser = new com.toedter.components.JSpinField();
        updateChangesBtn = new javax.swing.JButton();
        airplaneAvailableLabel1 = new javax.swing.JLabel();
        invalidCertificate = new javax.swing.JRadioButton();
        validCertificate = new javax.swing.JRadioButton();
        minSeatsQueryLabel = new javax.swing.JLabel();
        minSeatsField = new com.toedter.components.JSpinField();
        maxSeatsField = new com.toedter.components.JSpinField();
        maxSeatsQueryLabel = new javax.swing.JLabel();
        nextAvailFlightLabel = new javax.swing.JLabel();
        nextAvailFlightChooser = new com.toedter.calendar.JDateChooser();

        searchAirplaneQueryLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchAirplaneQueryLabel.setText("Enter search query:");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        searchPanelHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        searchPanelHeader.setText("Airplane Details");

        searchAirplaneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airplane Serial Number", "Airplane Name", "Seats available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchScrollPane.setViewportView(searchAirplaneTable);

        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        searchResultCountLabel.setText("Number of Airplanes found: ");

        searchResultCountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchResultCountFieldActionPerformed(evt);
            }
        });

        serialNumberLabel.setText("Airplane Serial  Number:");

        serailNumberField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        modelNumberLabel.setText("Airplane Model Number:");

        airplaneNameLabel.setText("Airplane Name:");

        airplaneAvailableLabel.setText("Is the airplane available:");

        manufacturerNameLabel.setText("Airplane manufacturer name:");

        manufacturerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerNameFieldActionPerformed(evt);
            }
        });

        yearManuLabel.setText("Year of manufacture:");

        seatsAvailLabel.setText("Number of seats available:");

        airportNameLabel.setText("Airport Name:");

        updateAirplaneBtn.setText("Update");
        updateAirplaneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAirplaneBtnActionPerformed(evt);
            }
        });

        availBtnGroup.add(planeAvailable);
        planeAvailable.setSelected(true);
        planeAvailable.setText("Yes");
        planeAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planeAvailableActionPerformed(evt);
            }
        });

        availBtnGroup.add(planeUnavailable);
        planeUnavailable.setText("No");

        yearManuChooser.setEndYear(2017);
        yearManuChooser.setMinimum(1990);
        yearManuChooser.setName("yearOfManu"); // NOI18N

        seatsAvailChooser.setMaximum(550);
        seatsAvailChooser.setMinimum(0);
        seatsAvailChooser.setName("seatsAvailable"); // NOI18N
        seatsAvailChooser.setValue(550);

        updateChangesBtn.setText("Update changes");
        updateChangesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateChangesBtnActionPerformed(evt);
            }
        });

        airplaneAvailableLabel1.setText("Certificate expired:");

        expiryBtnGroup.add(invalidCertificate);
        invalidCertificate.setText("Yes");

        expiryBtnGroup.add(validCertificate);
        validCertificate.setSelected(true);
        validCertificate.setText("No");
        validCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validCertificateActionPerformed(evt);
            }
        });

        minSeatsQueryLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        minSeatsQueryLabel.setText("Enter minimum seats:");
        minSeatsQueryLabel.setName("minSeatsLabel"); // NOI18N

        minSeatsField.setMaximum(550);
        minSeatsField.setMinimum(1);
        minSeatsField.setName("minSeatsField"); // NOI18N
        minSeatsField.setOpaque(false);
        minSeatsField.setValue(1);
        minSeatsField.setVerifyInputWhenFocusTarget(false);

        maxSeatsField.setMaximum(550);
        maxSeatsField.setMinimum(1);
        maxSeatsField.setName("maxSeatsField"); // NOI18N
        maxSeatsField.setOpaque(false);
        maxSeatsField.setValue(550);

        maxSeatsQueryLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        maxSeatsQueryLabel.setText("Enter maximum seats:");
        maxSeatsQueryLabel.setName("maxSeatsLabel"); // NOI18N

        nextAvailFlightLabel.setText("Next available Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(updateChangesBtn)
                .addGap(311, 311, 311))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(serialNumberLabel)
                                    .addComponent(modelNumberLabel)
                                    .addComponent(airplaneNameLabel)
                                    .addComponent(manufacturerNameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(airplaneNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelNumberField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serailNumberField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manufacturerNameField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(airportNameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(airportNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yearManuLabel)
                            .addComponent(seatsAvailLabel)
                            .addComponent(airplaneAvailableLabel1)
                            .addComponent(airplaneAvailableLabel)
                            .addComponent(nextAvailFlightLabel))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearManuChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatsAvailChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invalidCertificate)
                                .addGap(18, 18, 18)
                                .addComponent(validCertificate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(planeAvailable)
                                .addGap(18, 18, 18)
                                .addComponent(planeUnavailable))
                            .addComponent(nextAvailFlightChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchAirplaneQueryLabel)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchPanelHeader)
                                    .addComponent(searchAirplaneQueryField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(searchResultCountLabel)
                                .addGap(18, 18, 18)
                                .addComponent(searchResultCountField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(viewDetailsBtn)
                                .addGap(18, 18, 18)
                                .addComponent(updateAirplaneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(minSeatsQueryLabel)
                            .addComponent(maxSeatsQueryLabel))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(minSeatsField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maxSeatsField, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(searchBtn)))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchAirplaneQueryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchAirplaneQueryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minSeatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(minSeatsQueryLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxSeatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxSeatsQueryLabel))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchBtn)
                        .addGap(18, 18, 18)))
                .addComponent(searchPanelHeader)
                .addGap(18, 18, 18)
                .addComponent(searchScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsBtn)
                    .addComponent(updateAirplaneBtn)
                    .addComponent(searchResultCountLabel)
                    .addComponent(searchResultCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serailNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialNumberLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNumberLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airplaneNameLabel))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airportNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameLabel)
                            .addComponent(airplaneAvailableLabel)
                            .addComponent(planeAvailable)
                            .addComponent(planeUnavailable)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yearManuChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearManuLabel))
                                .addGap(15, 15, 15)
                                .addComponent(seatsAvailChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(seatsAvailLabel))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airplaneAvailableLabel1)
                            .addComponent(invalidCertificate)
                            .addComponent(validCertificate))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(manufacturerNameLabel)
                        .addComponent(manufacturerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nextAvailFlightLabel))
                    .addComponent(nextAvailFlightChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(updateChangesBtn)
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<Airplane> searchResultList = searchByCriteria();
        populateTable(searchResultList);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here
        updateChangesBtn.setVisible(false);
        fillIntoFields();
        isEditable(false);
    }//GEN-LAST:event_viewDetailsBtnActionPerformed
    public void fillIntoFields() {
        int selectedRow = searchAirplaneTable.getSelectedRow();
//        selectedRow = selectedRow >= 0 ? selectedRow : (searchAirplaneTable.getRowCount() == 1 ? 0 : -1);
        if (selectedRow >= 0) {
            Airplane airplane = (Airplane) searchAirplaneTable.getValueAt(selectedRow, 0);
            serailNumberField.setText(String.valueOf(airplane.getSerialNumber()));
            modelNumberField.setText(String.valueOf(airplane.getModelNumber()));
            airplaneNameField.setText(String.valueOf(airplane.getAirplaneName()));
            if (airplane.isAvailable()) {
                planeAvailable.setSelected(true);
            } else {
                planeUnavailable.setSelected(true);
            }
            manufacturerNameField.setText(String.valueOf(airplane.getManufacturerName()));
            yearManuChooser.setYear(airplane.getYearOfManufacture());
            seatsAvailChooser.setValue(airplane.getSeatsAvailable());
            airportNameField.setText(String.valueOf(airplane.getAirportName()));
            validCertificate.setSelected(airplane.isCertitficateValid());
            invalidCertificate.setSelected(!airplane.isCertitficateValid());
            nextAvailFlightChooser.setDate(airplane.getNextAvailableDate());

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!!");
        }
    }

    public void isEditable(boolean isEditable) {
        serailNumberField.setEditable(isEditable);
        modelNumberField.setEditable(isEditable);
        airplaneNameField.setEditable(isEditable);
        serailNumberField.setEditable(isEditable);
        airportNameField.setEditable(isEditable);
        manufacturerNameField.setEditable(isEditable);

        planeAvailable.setEnabled(isEditable);
        planeUnavailable.setEnabled(isEditable);
        yearManuChooser.setEnabled(isEditable);
        seatsAvailChooser.setEnabled(isEditable);
        validCertificate.setEnabled(isEditable);
        invalidCertificate.setEnabled(isEditable);
        nextAvailFlightChooser.setEnabled(isEditable);
    }

    private void searchResultCountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchResultCountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchResultCountFieldActionPerformed

    private void updateAirplaneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAirplaneBtnActionPerformed
        // TODO add your handling code here:
        updateChangesBtn.setVisible(true);
        fillIntoFields();
        isEditable(true);
    }//GEN-LAST:event_updateAirplaneBtnActionPerformed

    private void updateChangesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateChangesBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = searchAirplaneTable.getSelectedRow();
        if (selectedRow >= 0) {
            Airplane airplane = (Airplane) searchAirplaneTable.getValueAt(selectedRow, 0);
            getViewFieldsFromPanel(airplane);
//            ArrayList<Airplane> searchResultList = searchByCriteria();
//            populateTable(searchResultList);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!!");
        }
    }//GEN-LAST:event_updateChangesBtnActionPerformed

    private void manufacturerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerNameFieldActionPerformed

    private void planeAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planeAvailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planeAvailableActionPerformed

    private void validCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validCertificateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validCertificateActionPerformed

    public void getViewFieldsFromPanel(Airplane airplane) {
        try {
            Long serialNumber = Long.parseLong(serailNumberField.getText());
            String modelNumber = modelNumberField.getText();
            String airplaneName = airplaneNameField.getText();
            boolean isAvailable = planeAvailable.isSelected();
            String manufacturerName = manufacturerNameField.getText();
            int yearManu = yearManuChooser.getYear();
            int seatsAvailable = seatsAvailChooser.getValue();
            String airportName = airportNameField.getText();
            boolean isValidCertificate = validCertificate.isSelected();
            Date nextAvailDate = nextAvailFlightChooser.getDate();

            airplane.setSerialNumber(serialNumber);
            airplane.setModelNumber(modelNumber);
            airplane.setAirplaneName(airplaneName);
            airplane.setIsAvailable(isAvailable);
            airplane.setManufacturerName(manufacturerName);
            airplane.setYearOfManufacture(yearManu);
            airplane.setSeatsAvailable(seatsAvailable);
            airplane.setAirportName(airportName);
            airplane.setIsCertificateValid(isValidCertificate);
            airplane.setNextAvailableDate(nextAvailDate);

            JOptionPane.showMessageDialog(null, "Updated!!");
            resetViewFields();
            isEditable(false);
            populateTable();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Serial Number : Serial Number field can contian only numbers!! Please try again!");
            serailNumberField.requestFocus();
        }
    }

    public void populateTable() {
        ArrayList<Airplane> airplaneList = MainJFrame.airplaneCatalog.getAirplanesList();
        DefaultTableModel airplaneTable = (DefaultTableModel) searchAirplaneTable.getModel();
        airplaneTable.setNumRows(0);
        //starting the population form row 0
        airplaneTable.setRowCount(0);
        for (Airplane eachAirplane : airplaneList) {
            Object row[] = new Object[3];
            //setting the object to the first row as we need to access all the other attributes of that particular object
            row[0] = eachAirplane;
            row[1] = eachAirplane.getAirplaneName();
            row[2] = eachAirplane.getSeatsAvailable();
            airplaneTable.addRow(row);
        }

    }

    public void resetViewFields() {
        serailNumberField.setText("");
        modelNumberField.setText("");
        airplaneNameField.setText("");
        planeAvailable.setSelected(true);
        manufacturerNameField.setText("");
        yearManuChooser.setYear(2017);
        seatsAvailChooser.setValue(550);
        airportNameField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airplaneAvailableLabel;
    private javax.swing.JLabel airplaneAvailableLabel1;
    private javax.swing.JTextField airplaneNameField;
    private javax.swing.JLabel airplaneNameLabel;
    private javax.swing.JTextField airportNameField;
    private javax.swing.JLabel airportNameLabel;
    private javax.swing.ButtonGroup availBtnGroup;
    private javax.swing.ButtonGroup expiryBtnGroup;
    private javax.swing.JRadioButton invalidCertificate;
    private javax.swing.JTextField manufacturerNameField;
    private javax.swing.JLabel manufacturerNameLabel;
    private com.toedter.components.JSpinField maxSeatsField;
    private javax.swing.JLabel maxSeatsQueryLabel;
    private com.toedter.components.JSpinField minSeatsField;
    private javax.swing.JLabel minSeatsQueryLabel;
    private javax.swing.JTextField modelNumberField;
    private javax.swing.JLabel modelNumberLabel;
    private com.toedter.calendar.JDateChooser nextAvailFlightChooser;
    private javax.swing.JLabel nextAvailFlightLabel;
    private javax.swing.JCheckBox planeAvailable;
    private javax.swing.JCheckBox planeUnavailable;
    private javax.swing.JTextField searchAirplaneQueryField;
    private javax.swing.JLabel searchAirplaneQueryLabel;
    private javax.swing.JTable searchAirplaneTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel searchPanelHeader;
    private javax.swing.JTextField searchResultCountField;
    private javax.swing.JLabel searchResultCountLabel;
    private javax.swing.JScrollPane searchScrollPane;
    private com.toedter.components.JSpinField seatsAvailChooser;
    private javax.swing.JLabel seatsAvailLabel;
    private javax.swing.JTextField serailNumberField;
    private javax.swing.JLabel serialNumberLabel;
    private javax.swing.JButton updateAirplaneBtn;
    private javax.swing.JButton updateChangesBtn;
    private javax.swing.JRadioButton validCertificate;
    private javax.swing.JButton viewDetailsBtn;
    private com.toedter.calendar.JYearChooser yearManuChooser;
    private javax.swing.JLabel yearManuLabel;
    // End of variables declaration//GEN-END:variables
}
