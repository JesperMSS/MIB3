/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import java.sql.SQLException;
import oru.inf.InfException;

/**
 *
 * @author Jesper
 */
public class AgentUppdateraAlienB extends javax.swing.JFrame {

    private static InfDB idb;
    String alienNamn;

    /**
     * Creates new form AgentUppdateraAlienB
     */
    public AgentUppdateraAlienB(InfDB idb, String pAlienNamn) {
        initComponents();
        this.idb = idb;
        alienNamn = pAlienNamn;
        lblRasSpec.setVisible(true);
        lblRasSpec.setText("Ange antal boogies:");
    }

    AgentUppdateraAlienB() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUpdAlien = new javax.swing.JLabel();
        lblDateHead = new javax.swing.JLabel();
        lblDateHead2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblNameHead = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblPasswordHead = new javax.swing.JLabel();
        passwordVal = new javax.swing.JPasswordField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblChef = new javax.swing.JLabel();
        lblChef2 = new javax.swing.JLabel();
        txtChef = new javax.swing.JTextField();
        txtPlats = new javax.swing.JLabel();
        lblPlats = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();
        tbxBTN = new javax.swing.JButton();
        comboBoxRas = new javax.swing.JComboBox<>();
        lblRas = new javax.swing.JLabel();
        txtRasSpec = new javax.swing.JTextField();
        lblRasSpec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUpdAlien.setText("Uppdatera Alien");

        lblDateHead.setText("Registreringsdatum");

        lblDateHead2.setText("(YYYY-MM-DD)");

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lblNameHead.setText("Alien-ID");

        lblPasswordHead.setText("L�senord");

        lblPhone.setText("Telefonnummer");

        lblChef.setText("Ansvarig Agent");

        lblChef2.setText("(ID)");

        txtPlats.setText("Plats (ID)");

        saveBTN.setText("Spara");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
            }
        });

        comboBoxRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        comboBoxRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRasActionPerformed(evt);
            }
        });

        lblRas.setText("Ras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUpdAlien)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordVal, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDateHead, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDateHead2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNameHead, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblPasswordHead)
                                    .addComponent(lblRas)
                                    .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblChef)
                                    .addComponent(lblChef2)
                                    .addComponent(txtChef, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlats)
                                    .addComponent(lblPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPhone)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRasSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRasSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(saveBTN)
                        .addGap(18, 18, 18)
                        .addComponent(tbxBTN)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpdAlien)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateHead)
                    .addComponent(lblChef))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChef2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDateHead2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNameHead)
                        .addGap(2, 2, 2)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPasswordHead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblRas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPlats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRasSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRasSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBTN)
                    .addComponent(tbxBTN))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // Validering som kontrollerar att inga f�lt �r tomma. 
        if (valideringsklass.tomtFalt(txtDate) && valideringsklass.tomtFalt(txtChef) && valideringsklass.tomtFalt(txtID) && valideringsklass.tomtFalt(lblPlats) && valideringsklass.tomtFalt(passwordVal) && valideringsklass.tomtFalt(txtPhone) && valideringsklass.tomtFalt(txtRasSpec)) {
            try {
                String RasSpec = txtRasSpec.getText();
                String val = comboBoxRas.getSelectedItem().toString();
                String textSQL;
                String textSQLboglodite;
                String textSQLsquid;
                String textSQLsquidDEL1;
                String textSQLsquidDEL2;
                String textSQLworm;
                String textSQLwormDEL1;
                String textSQLwormDEL2;
                String textSQLbogloditeDEL1;
                String textSQLbogloditeDEL2;
                String name = txtID.getText();
                String password = passwordVal.getText();
                String phone = txtPhone.getText();
                String date = txtDate.getText();
              

                // Konvertering fr�n String till Integer.
                int chef = Integer.parseInt(txtChef.getText());
                int plats = Integer.parseInt(lblPlats.getText());
                int alienID = Integer.parseInt(txtID.getText());

                // Konvertering fr�n JavaDate till SQLdate.
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date parsedate = format.parse(date);
                java.sql.Date daydate = new java.sql.Date(parsedate.getTime());

                String add = idb.getAutoIncrement("Alien", "Alien_ID");

                // Uppdaterar databasen med de nya v�rderna som anv�ndaren matat in.
                textSQL = ("update ALIEN set REGISTRERINGSDATUM=" + "'" + daydate + "'" + ",LOSENORD =" + "'" + password + "'" + ",NAMN=" + "'" + name + "'" + ",TELEFON=" + "'" + phone + "'" + ",PLATS=" + plats + ",ANSVARIG_AGENT=" + chef + ",ALIEN_ID=" + alienID + "WHERE NAMN=" + "'" + alienNamn + "'");
                System.out.println(textSQL);
                idb.update(textSQL);

                // Beroende p� vilken ras man valt i Combobox l�ggs det till i r�tt tabell.
                if (val.equals("Boglodite")) {
                    textSQLboglodite = ("Insert into BOGLODITE (ALIEN_ID, ANTAL_BOOGIES) values ('" + alienID + "','" + RasSpec + "')");
                    textSQLbogloditeDEL1 = ("DELETE from SQUID where ALIEN_ID=" + alienID);
                    textSQLbogloditeDEL2 = ("DELETE from WORM where ALIEN_ID=" + alienID);
                    idb.insert(textSQLboglodite);
                    idb.delete(textSQLbogloditeDEL1);
                    idb.delete(textSQLbogloditeDEL2);
                    System.out.println(textSQLboglodite);
                    System.out.println(textSQLbogloditeDEL1);
                    System.out.println(textSQLbogloditeDEL2);

                } else if (val.equals("Squid")) {
                    textSQLsquid = ("Insert into SQUID (ALIEN_ID, ANTAL_ARMAR) values ('" + alienID + "','" + RasSpec + "')");
                    textSQLsquidDEL1 = ("DELETE from BOGLODITE where ALIEN_ID=" + alienID);
                    textSQLsquidDEL2 = ("DELETE from WORM where ALIEN_ID=" + alienID);
                    idb.insert(textSQLsquid);
                    idb.delete(textSQLsquidDEL1);
                    idb.delete(textSQLsquidDEL2);
                    System.out.println(textSQLsquid);
                    System.out.println(textSQLsquidDEL1);
                    System.out.println(textSQLsquidDEL2);

                } else {
                    textSQLworm = ("Insert into WORM (ALIEN_ID) values ('" + alienID + "')");
                    textSQLwormDEL1 = ("DELETE from BOGLODITE where ALIEN_ID=" + alienID);
                    textSQLwormDEL2 = ("DELETE from SQUID where ALIEN_ID=" + alienID);
                    idb.insert(textSQLworm);
                    idb.delete(textSQLwormDEL1);
                    idb.delete(textSQLwormDEL2);
                    System.out.println(textSQLworm);
                    System.out.println(textSQLwormDEL1);
                    System.out.println(textSQLwormDEL2);
                }

                JOptionPane.showMessageDialog(null, "Alien med namn " + alienNamn + " har nu uppdaterats");

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Fel");

                // Catch f�r date
            } catch (ParseException ex) {
                Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Fel");
            }
    }//GEN-LAST:event_saveBTNActionPerformed
    }
    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        AgentUppdateraAlienA tbxTillA = new AgentUppdateraAlienA(idb);
        tbxTillA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbxBTNActionPerformed

    private void comboBoxRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRasActionPerformed

        String val = comboBoxRas.getSelectedItem().toString();
        String fr�ga = txtRasSpec.getText();
        if (val.equals("Squid")) {
            lblRasSpec.setVisible(true);
            lblRasSpec.setText("Ange antal armar:");
            txtRasSpec.setVisible(true);
        } else if (val.equals("Boglodite")) {
            lblRasSpec.setVisible(true);
            lblRasSpec.setText("Ange antal boogies:");
            txtRasSpec.setVisible(true);
        } else {
            lblRasSpec.setVisible(false);
            lblRasSpec.setText("-");
            txtRasSpec.setVisible(false);
        }
    }//GEN-LAST:event_comboBoxRasActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

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
            java.util.logging.Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentUppdateraAlienB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentUppdateraAlienB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxRas;
    private javax.swing.JLabel lblChef;
    private javax.swing.JLabel lblChef2;
    private javax.swing.JLabel lblDateHead;
    private javax.swing.JLabel lblDateHead2;
    private javax.swing.JLabel lblNameHead;
    private javax.swing.JLabel lblPasswordHead;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasSpec;
    private javax.swing.JLabel lblUpdAlien;
    private javax.swing.JPasswordField passwordVal;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JTextField txtChef;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JLabel txtPlats;
    private javax.swing.JTextField txtRasSpec;
    // End of variables declaration//GEN-END:variables

}
