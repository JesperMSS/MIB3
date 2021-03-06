/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author KarlJ
 */
public class NyOmradeschef extends javax.swing.JFrame {
        private static InfDB idb;
    /**
     * Creates new form nyOmr�deschef
     */
    public NyOmradeschef(InfDB idb) {
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

        nyOmr�deschefTextField = new javax.swing.JTextField();
        nyOmr�deschefBTN = new javax.swing.JButton();
        tbxBTN = new javax.swing.JButton();
        omr�denCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nyOmr�deschefBTN.setText("Ny omr�deschef");
        nyOmr�deschefBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyOmr�deschefBTNActionPerformed(evt);
            }
        });

        tbxBTN.setText("Tillbaka");
        tbxBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxBTNActionPerformed(evt);
            }
        });

        omr�denCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "G�taland", "Norrland" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(nyOmr�deschefTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(omr�denCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbxBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nyOmr�deschefBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nyOmr�deschefTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omr�denCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(nyOmr�deschefBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbxBTN)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbxBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxBTNActionPerformed
        // TODO add your handling code here:
        AdminFonster tbx = new AdminFonster(idb);
        tbx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbxBTNActionPerformed

    private void nyOmr�deschefBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyOmr�deschefBTNActionPerformed
        // TODO add your handling code here:
        if(Valideringsklass.tomtFalt(nyOmr�deschefTextField)){
            String chefNamn = nyOmr�deschefTextField.getText();
            String omr�de = omr�denCombo.getSelectedItem().toString();
            ArrayList<String> agentNamn = new ArrayList<String>();
            int inmatning = JOptionPane.showConfirmDialog(null, "Vill du �ndra omr�deschef?", "�ndra omr�deschef", 2);
            if(inmatning == 0){
            try{
                String id = idb.fetchSingle("Select agent_id from agent where namn = " + "'" + chefNamn + "'");
                int convertId = Integer.parseInt(id);
                
                
                //Fyller arraylisten med namnen fr�n agent tabellen
                agentNamn = idb.fetchColumn("Select Namn from agent where not Agent_id = " + "'" + convertId + "'");
                //G�r det till ett arrayobjekt
                Object[] agentObjekt = agentNamn.toArray();
                

                String isChef = idb.fetchSingle("Select agent_id from omradeschef where agent_id = " + "'" + convertId + "'");
                //G�r agenten till omr�deschef f�r det valda omr�det fr�n combolistan
                if(isChef == null){
                    String omr�deId = idb.fetchSingle("Select omrades_id from omrade where benamning =  " + "'" + omr�de + "'" );
                    int convertOmr�deId = Integer.parseInt(omr�deId);
                    
                idb.delete("delete from omradeschef where omrade = (select omrades_id from omrade where benamning = '" + omr�de + "')");
                    idb.insert("INSERT INTO OMRADESCHEF VALUES ('" + convertId + "','" + convertOmr�deId + "')"); 
                    JOptionPane.showMessageDialog(null, "Agenten �r nu omr�deschef f�r valt omr�de!");
            }
                // ifall agenten redan �r omr�deschef f�r ett omr�de s� f�r man v�lja en ny omr�deschef f�r det omr�det. Koden �r av samma princip som koden f�r att ta bort en agent om agenten var ansvarig f�r n�gon alien
                else if(isChef != null){
                      Object nyChef = JOptionPane.showInputDialog(null, "V�lj ny Omr�deschef", "Agenten �r omr�deschef f�r ett omr�de", JOptionPane.QUESTION_MESSAGE, null, agentObjekt, agentObjekt[0]);
                      String nyChefToString = String.valueOf(nyChef);
                      int nyChefId = Integer.parseInt(idb.fetchSingle("Select agent_id from agent where namn = " + "'" + nyChefToString + "'"));
                      String omr�deId = idb.fetchSingle("Select omrades_id from omrade where benamning =  " + "'" + omr�de + "'" );
                      int convertOmr�deId = Integer.parseInt(omr�deId);
                      
                       String Byte= idb.fetchSingle("SELECT OMRADE FROM OMRADESCHEF WHERE AGENT_ID = " + "'" + convertId + "'");
                       int Convertbyte = Integer.parseInt(Byte);
                       idb.insert("insert into omradeschef values ('" + nyChefId + "','" + Convertbyte + "')");
                       idb.delete("delete from omradeschef where agent_id = " + "'" + convertId + "'");
                       idb.delete("delete from omradeschef where omrade = (select omrades_id from omrade where benamning = '" + omr�de + "')");
                       idb.insert("insert into omradeschef values ('" + convertId + "','" + convertOmr�deId + "')");
                       
                       JOptionPane.showMessageDialog(null, "Nu �r agenterna omr�deschefer f�r nya omr�den");
                       
                       
                      
                      
                }
            
            
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Frams�kt agent kunde inte hittas, dubbelkolla stavningen!");
                System.out.println(e.getMessage());
            
            }
        
        }
        }
    }//GEN-LAST:event_nyOmr�deschefBTNActionPerformed

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
            java.util.logging.Logger.getLogger(NyOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NyOmradeschef(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton nyOmr�deschefBTN;
    private javax.swing.JTextField nyOmr�deschefTextField;
    private javax.swing.JComboBox<String> omr�denCombo;
    private javax.swing.JButton tbxBTN;
    // End of variables declaration//GEN-END:variables
}
