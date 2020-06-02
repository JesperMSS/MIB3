/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author KarlJ
 */
public class TaBortAlien extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form taBortAlien
     */
    public TaBortAlien(InfDB idb) {
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

        namnSökTextField = new javax.swing.JTextField();
        sökAlienBTN = new javax.swing.JButton();
        idAlienTextField = new javax.swing.JTextField();
        namnTextField = new javax.swing.JTextField();
        dorTextField = new javax.swing.JTextField();
        tfnAlienTextField = new javax.swing.JTextField();
        platsTextField = new javax.swing.JTextField();
        rasTextField = new javax.swing.JTextField();
        ansvarigAgentTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        removeAlienBTN = new javax.swing.JButton();
        tbxBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sökAlienBTN.setText("Sök");
        sökAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökAlienBTNActionPerformed(evt);
            }
        });

        idAlienTextField.setEnabled(false);

        namnTextField.setEnabled(false);

        dorTextField.setEnabled(false);

        tfnAlienTextField.setEnabled(false);
        tfnAlienTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnAlienTextFieldActionPerformed(evt);
            }
        });

        platsTextField.setEnabled(false);

        rasTextField.setEnabled(false);

        ansvarigAgentTextField.setEnabled(false);

        jLabel1.setText("Sök alien");

        jLabel2.setText("AlienID");

        jLabel3.setText("Namn");

        jLabel4.setText("Registreringsdatum");

        jLabel5.setText("Telefon");

        jLabel6.setText("Ras");

        jLabel7.setText("Ansvarig agent");

        jLabel8.setText("Plats");

        removeAlienBTN.setText("Ta bort");
        removeAlienBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAlienBTNActionPerformed(evt);
            }
        });

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ansvarigAgentTextField)
                    .addComponent(idAlienTextField)
                    .addComponent(namnSökTextField)
                    .addComponent(tfnAlienTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(removeAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sökAlienBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(namnTextField))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dorTextField)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(platsTextField)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(rasTextField))))
                    .addComponent(tbxBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnSökTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sökAlienBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idAlienTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnAlienTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(platsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansvarigAgentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAlienBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tbxBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sökAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökAlienBTNActionPerformed
        // TODO add your handling code here:
        if(Valideringsklass.tomtFalt(namnSökTextField)){
            String valdAlien = namnSökTextField.getText();
            try{
                String id = idb.fetchSingle("Select alien_id from alien where namn = " + "'" + valdAlien + "'");
                int convertId = Integer.parseInt(id);
                idAlienTextField.setText(id);
                
                String namn = idb.fetchSingle("Select namn from alien where namn = " + "'" + valdAlien + "'");
                namnTextField.setText(namn);
                
                String tfn = idb.fetchSingle("select telefon from alien where namn = " + "'" + valdAlien + "'");
                tfnAlienTextField.setText(tfn);
                
                String dor = idb.fetchSingle("select registreringsdatum from alien where namn = " + "'" + valdAlien + "'");
                dorTextField.setText(dor);
                
                String plats = idb.fetchSingle("select benamning from plats join alien on alien.plats = plats.plats_id where alien_id = " + "'" + convertId + "'");
                platsTextField.setText(plats);
                
                String rasBog = idb.fetchSingle("select alien.NAMN from alien join boglodite on boglodite.ALIEN_ID = alien.ALIEN_ID  where alien.alien_id = " + "'" + convertId +"'");
                String rasSquid = idb.fetchSingle("select alien.NAMN from alien join squid on squid.ALIEN_ID = alien.ALIEN_ID  where alien.alien_id = " + "'" + convertId + "'");
                String rasWorm = idb.fetchSingle("select alien.NAMN from alien join worm on worm.ALIEN_ID = alien.ALIEN_ID  where alien.alien_id =" + "'" + convertId + "'");
                
                if(rasBog != null){
                    rasTextField.setText("Boglodite");
                }
                else if(rasSquid != null){
                    rasTextField.setText("Squid");
                    
                }
                else{
                    rasTextField.setText("Worm");
                }
                String ansvarig  = idb.fetchSingle("Select agent.NAMN from agent join alien on alien.ansvarig_agent = agent.agent_id where alien_id =" + "'" + convertId + "'");
                ansvarigAgentTextField.setText(ansvarig);
                
                }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Alien hittades inte, dubbelkolla stavningen och försök igen!");
                System.out.println(e.getMessage());
            }
        
        
        
        }
    }//GEN-LAST:event_sökAlienBTNActionPerformed

    private void tfnAlienTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnAlienTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnAlienTextFieldActionPerformed

    private void removeAlienBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAlienBTNActionPerformed
        // TODO add your handling code here:
        if(Valideringsklass.tomtFalt(idAlienTextField)){
        int convertId = Integer.parseInt(idAlienTextField.getText());
        int input = JOptionPane.showConfirmDialog(null, "Vill du ta bort denna alien?", "Ta bort alien", 2);
        if(input == 0){
        try{
        idb.delete("Delete from alien where alien_id = " + "'" + convertId + "'");
        idb.delete("Delete from squid where alien_id = " + "'" + convertId + "'");
        idb.delete("Delete from worm where alien_id = " + "'" + convertId + "'");
        idb.delete("Delete from boglodite where alien_id = " + "'" + convertId + "'");
        JOptionPane.showMessageDialog(null, "Alien har tagits bort!");
        namnSökTextField.setText("");
        }
        catch(InfException e){
        JOptionPane.showMessageDialog(null, "Det gick inte att ta bort denna alien, dubbelkolla stavningen och försök igen!");
        System.out.println(e.getMessage());
        }
        }
        
        }
    }//GEN-LAST:event_removeAlienBTNActionPerformed

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        // TODO add your handling code here:
        AdminFonster tbx = new AdminFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbxBTNActionPerformed

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
            java.util.logging.Logger.getLogger(TaBortAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaBortAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ansvarigAgentTextField;
    private javax.swing.JTextField dorTextField;
    private javax.swing.JTextField idAlienTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField namnSökTextField;
    private javax.swing.JTextField namnTextField;
    private javax.swing.JTextField platsTextField;
    private javax.swing.JTextField rasTextField;
    private javax.swing.JButton removeAlienBTN;
    private javax.swing.JButton sökAlienBTN;
    private javax.swing.JButton tbxBTN;
    private javax.swing.JTextField tfnAlienTextField;
    // End of variables declaration//GEN-END:variables
}
