package mib1;

import java.text.ParseException;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesper
 */
public class agentAlien extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Creates new form agentAlien
     */
    public agentAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        lblRasSpec.setVisible(true);
        lblRasSpec.setText("Ange antal boogies:");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddAlien = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblPlats = new javax.swing.JLabel();
        txtPlats = new javax.swing.JTextField();
        lblChef = new javax.swing.JLabel();
        txtChef = new javax.swing.JTextField();
        saveBTN = new javax.swing.JButton();
        tbxBTN = new javax.swing.JButton();
        lblDate2 = new javax.swing.JLabel();
        lblChef2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        comboBoxRas = new javax.swing.JComboBox<>();
        lblRas = new javax.swing.JLabel();
        lblRasSpec = new javax.swing.JLabel();
        txtRasSpec = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAddAlien.setText("L�gg till Alien:");

        lblDate.setText("Registreringsdatum");

        lblName.setText("Namn");

        lblPassword.setText("L�senord");

        lblPhone.setText("Telefon");

        lblPlats.setText("Plats (ID)");

        lblChef.setText("Ansvarig agent ");

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

        lblDate2.setText("(YYYY-MM-DD)");

        lblChef2.setText("(ID)");

        txtPassword.setText("jPasswordField1");

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
                        .addGap(67, 67, 67)
                        .addComponent(saveBTN)
                        .addGap(92, 92, 92)
                        .addComponent(tbxBTN))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblRas)
                                .addComponent(lblAddAlien)
                                .addComponent(lblPassword)
                                .addComponent(lblDate2)
                                .addComponent(txtDate)
                                .addComponent(txtNamn)
                                .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(comboBoxRas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPhone)
                            .addComponent(lblPlats)
                            .addComponent(lblChef)
                            .addComponent(lblChef2)
                            .addComponent(txtChef, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtPlats)
                            .addComponent(txtPhone)
                            .addComponent(txtRasSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(lblRasSpec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddAlien)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(lblChef))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate2)
                            .addComponent(lblChef2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(lblPlats))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(lblPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lblRasSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRasSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBTN)
                    .addComponent(tbxBTN))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // Valideringsklass som kontrollerar att anv�ndaren matat in ett l�senord som �r kortare �n 6 tecken. 
        if (valideringsklass.longPassword(txtPassword)) {
            // Valideringsklass som kontrollerar att anv�ndaren matat in data i alla f�lt.
            if (valideringsklass.tomtFalt(txtNamn) && valideringsklass.tomtFalt(txtPassword) && valideringsklass.tomtFalt(txtPhone) && valideringsklass.tomtFalt(txtDate) && valideringsklass.tomtFalt(txtChef) && valideringsklass.tomtFalt(txtPlats)) {
                //Valideringsklass som kontrollerar att anv�ndaren matat in data i comboboxen.
                if (valideringsklass.tomCombo(comboBoxRas)) {
                    // Valideringsklass som kontrollerar att anv�ndaren inte matat in ett f�r l�ngt namn.
                    if (valideringsklass.longName(txtNamn)) {
                        // Valideringsklass som kontrollerar att anv�ndaren inte matat in ett f�r l�ngt telefonnummer. 
                        if (valideringsklass.longPhone(txtPhone)) {

                            try {
                                //getText-metod som h�mtar det anv�ndaren matat in i gr�nssnittet. 
                                String name = txtNamn.getText();
                                String password = txtPassword.getText();
                                String phone = txtPhone.getText();
                                String date = txtDate.getText();
                                String RasSpec = txtRasSpec.getText();

                                // Konvertering fr�n String till Integer.
                                int chef = Integer.parseInt(txtChef.getText());
                                int plats = Integer.parseInt(txtPlats.getText());

                                //Konvertering fr�n JavaDate till SQLdate.
                                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                                Date parsedate = format.parse(date);
                                java.sql.Date daydate = new java.sql.Date(parsedate.getTime());

                                // Konvertering fr�n ComboBox till String.
                                String val = comboBoxRas.getSelectedItem().toString();

                                try {
                                    int convertID;
                                    // AutoIncrement som g�r att Alien-ID inkrementeras. 
                                    String add = idb.getAutoIncrement("Alien", "Alien_ID");
                                      if (add == null) {
                                       convertID = 1; 
                                      }
                                      else {
                                     convertID = Integer.parseInt(add);
                                      }
                                    // SQL-fr�gan. 
                                    idb.insert("insert into ALIEN (ALIEN_ID, REGISTRERINGSDATUM, LOSENORD, NAMN, TELEFON, PLATS, ANSVARIG_AGENT)"
                                            + " values ('" + convertID + "','" + daydate + "','" + password + "','" + name + "','" + phone + "','" + plats + "','" + chef + "')");

                                    // Messagedialog som meddelar anv�ndaren om att en ny alien har registrerats. 
                                    JOptionPane.showMessageDialog(null, "En ny alien har registrerats med Alien-ID: " + convertID);

                                    // Beroende p� vad man valt i comboboxUtrustning l�ggs det till i r�tt tabell
                                    if (val.equals("Boglodite")) {
                                        idb.insert("Insert into BOGLODITE (ALIEN_ID, ANTAL_BOOGIES) values ('" + convertID+ "','" + RasSpec + "')");
                                    } else if (val.equals("Squid")) {
                                        idb.insert("Insert into SQUID (ALIEN_ID, ANTAL_ARMAR) values ('" + convertID + "','" + RasSpec + "')");

                                    } else {
                                        idb.insert("Insert into WORM (ALIEN_ID) values ('" + convertID + "')");
                                    }

                                } catch (InfException e) {
                                    JOptionPane.showMessageDialog(null, "N�got gick fel, f�rs�k igen");
                                    System.out.println(e.getMessage());

                                }

                            } catch (ParseException ex) {
                                Logger.getLogger(agentAlien.class.getName()).log(Level.SEVERE, null, ex);

                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_saveBTNActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        String test = huvudFonster.hamtaAnvandare();
        //Om agenten �r admin s� kommer man till adminsidan via knappen annars s� kommer man till vanliga agentsidan
        try {
            // H�r h�mtar den id p� den inloggade agenten
            String id = idb.fetchSingle("Select agent_id from agent where namn = " + "'" + test + "'");
            // Konverterar till int
            int convertId = Integer.parseInt(id);
            //If agenten �r admin 
            String om = idb.fetchSingle("select agent.ADMINISTRATOR from agent where agent_id = " + "'" + convertId + "'");
            //Om villkoret uppfylls(en agent �r admin om det st�r J i administrator kolumnen)
            if (om.equals("J")) {
                AdminFonster tbxAdmin = new AdminFonster(idb);
                tbxAdmin.setVisible(true);
                this.dispose();
            } // Annars �r det vanliga agentsidan man kommer till
            else {
                AgentInloggad tbx = new AgentInloggad(idb);
                tbx.setVisible(true);
                this.dispose();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "N�got gick fel");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tbxBTNActionPerformed

    private void comboBoxRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRasActionPerformed
        // S�tter r�tt v�rde p� labeln �t h�ger beroende p� vad anv�ndaren v�ljer i comboboxen. 
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
            java.util.logging.Logger.getLogger(agentAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agentAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agentAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agentAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxRas;
    private javax.swing.JLabel lblAddAlien;
    private javax.swing.JLabel lblChef;
    private javax.swing.JLabel lblChef2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDate2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasSpec;
    private javax.swing.JButton saveBTN;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JTextField txtChef;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtRasSpec;
    // End of variables declaration//GEN-END:variables
}
