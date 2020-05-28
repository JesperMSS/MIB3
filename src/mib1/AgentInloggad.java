package mib1;


import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KarlJ
 */
public class AgentInloggad extends javax.swing.JFrame {
    private static InfDB idb;
    
    /**
     * Creates new form AgentInloggad
     * @param idb
     */
    public AgentInloggad(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logoutBTN = new javax.swing.JButton();
        bytlösen = new javax.swing.JButton();
        utrustningBTN = new javax.swing.JButton();
        områdeschefBTN = new javax.swing.JButton();
        läggTillAlienBTN = new javax.swing.JButton();
        uppdateraAlienBTN = new javax.swing.JButton();
        sökAlienBTN = new javax.swing.JButton();
        datumAlienBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hej du är nu inloggad som agent");

        logoutBTN.setText("Logga ut");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        bytlösen.setText("Ändra lösenord");
        bytlösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytlösenActionPerformed(evt);
            }
        });

        utrustningBTN.setText("Lägg in ny utrustning");
        utrustningBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningBTNActionPerformed(evt);
            }
        });

        områdeschefBTN.setText("Områdeschef");
        områdeschefBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeschefBTNActionPerformed(evt);
            }
        });

        läggTillAlienBTN.setText("Lägg till Alien");
        läggTillAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läggTillAlienBTNActionPerformed(evt);
            }
        });

        uppdateraAlienBTN.setText("Uppdatera Alien");
        uppdateraAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppdateraAlienBTNActionPerformed(evt);
            }
        });

        sökAlienBTN.setText("Sök Alien");
        sökAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökAlienBTNActionPerformed(evt);
            }
        });

        datumAlienBTN.setText("Intervallsök Alien");
        datumAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datumAlienBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bytlösen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(utrustningBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(områdeschefBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(läggTillAlienBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uppdateraAlienBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sökAlienBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datumAlienBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)))
                .addGap(100, 125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(datumAlienBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bytlösen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utrustningBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(områdeschefBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(läggTillAlienBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uppdateraAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sökAlienBTN)
                .addGap(18, 18, 18)
                .addComponent(logoutBTN)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
        huvudFonster tbx = new huvudFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void bytlösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytlösenActionPerformed
        // TODO add your handling code here:
        BytLösenord nyttlösen = new BytLösenord(idb);
        nyttlösen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bytlösenActionPerformed

    private void utrustningBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningBTNActionPerformed
        // TODO add your handling code here:
        agentUtrustning nyUtrustning = new agentUtrustning(idb);
        nyUtrustning.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_utrustningBTNActionPerformed

    private void områdeschefBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeschefBTNActionPerformed
        // TODO add your handling code here:
        Områdeschef chef = new Områdeschef(idb);
        chef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_områdeschefBTNActionPerformed

    private void läggTillAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läggTillAlienBTNActionPerformed
        agentAlien läggTillAlien = new agentAlien(idb);
        läggTillAlien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_läggTillAlienBTNActionPerformed

    private void uppdateraAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppdateraAlienBTNActionPerformed
        AgentUppdateraAlienA uppdateraAlien = new  AgentUppdateraAlienA(idb);
       uppdateraAlien.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_uppdateraAlienBTNActionPerformed

    private void sökAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökAlienBTNActionPerformed
      AgentSökAlien sökAlien = new AgentSökAlien(idb);
       sökAlien.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_sökAlienBTNActionPerformed

    private void datumAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datumAlienBTNActionPerformed
       AgentDatum alienDatum = new AgentDatum(idb);
       alienDatum.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_datumAlienBTNActionPerformed

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
            java.util.logging.Logger.getLogger(AgentInloggad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentInloggad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentInloggad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentInloggad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentInloggad(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bytlösen;
    private javax.swing.JButton datumAlienBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton läggTillAlienBTN;
    private javax.swing.JButton områdeschefBTN;
    private javax.swing.JButton sökAlienBTN;
    private javax.swing.JButton uppdateraAlienBTN;
    private javax.swing.JButton utrustningBTN;
    // End of variables declaration//GEN-END:variables
}
