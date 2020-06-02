/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib1;
import java.text.ParseException;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author KarlJ
 */
public class RegistreraAgent extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form RegistreraAgent
     */
    public RegistreraAgent(InfDB idb) {
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

        grundPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        NamnTextField = new javax.swing.JTextField();
        lösenordLBL = new javax.swing.JLabel();
        användarNamnLBL = new javax.swing.JLabel();
        agentLösenTextField = new javax.swing.JPasswordField();
        tfnTextField = new javax.swing.JFormattedTextField();
        isAdminCombo = new javax.swing.JComboBox<>();
        agentTypCombo = new javax.swing.JComboBox<>();
        agentTypLBL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anställningsdatumLBL = new javax.swing.JLabel();
        TfnLBL = new javax.swing.JLabel();
        registreraAgentBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        områdeCombo = new javax.swing.JComboBox<>();
        doeTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lösenordLBL.setText("Lösenord");

        användarNamnLBL.setText("Användarnamn");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NamnTextField)
                    .addComponent(agentLösenTextField)
                    .addComponent(lösenordLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(användarNamnLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(användarNamnLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lösenordLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agentLösenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        try {
            tfnTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        isAdminCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nej", "Ja" }));

        agentTypCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kontorschef", "Områdeschef", "Fältagent" }));
        agentTypCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                agentTypComboItemStateChanged(evt);
            }
        });
        agentTypCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentTypComboActionPerformed(evt);
            }
        });

        agentTypLBL.setText("Agenttyp");

        jLabel2.setText("Administratör");

        anställningsdatumLBL.setText("Anställningsdatum (yyyy-MM-dd)");

        TfnLBL.setText("Telefonnummer");

        registreraAgentBTN.setText("Registrera Agent");
        registreraAgentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registreraAgentBTNActionPerformed(evt);
            }
        });

        jLabel1.setText("Arbetar i område:");

        områdeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout grundPanelLayout = new javax.swing.GroupLayout(grundPanel);
        grundPanel.setLayout(grundPanelLayout);
        grundPanelLayout.setHorizontalGroup(
            grundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grundPanelLayout.createSequentialGroup()
                .addGroup(grundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, grundPanelLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(grundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anställningsdatumLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isAdminCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agentTypLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agentTypCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TfnLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registreraAgentBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(områdeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfnTextField)
                            .addComponent(doeTextField)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        grundPanelLayout.setVerticalGroup(
            grundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grundPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfnLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anställningsdatumLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isAdminCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agentTypLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agentTypCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(områdeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registreraAgentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(grundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registreraAgentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registreraAgentBTNActionPerformed
        // TODO add your handling code here:
        
        String user = NamnTextField.getText();
        String pass = agentLösenTextField.getText();
        String tfn = tfnTextField.getSelectedText();
        String doe = doeTextField.getText();
        String admin = isAdminCombo.getSelectedItem().toString();
        String typ = agentTypCombo.getSelectedItem().toString();
        String område = områdeCombo.getSelectedItem().toString();
        
        if(Valideringsklass.tomtFalt(NamnTextField) && Valideringsklass.tomtFalt(agentLösenTextField) && Valideringsklass.tomtFalt(tfnTextField) && Valideringsklass.tomCombo(isAdminCombo) && Valideringsklass.tomCombo(agentTypCombo)){
        try{
            String Admin = "";
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedate = format.parse(doe);
            java.sql.Date daydate = new java.sql.Date(parsedate.getTime());
            
            String add = idb.getAutoIncrement("Agent","Agent_ID");
            int convertID = Integer.parseInt(add);
            String benämning = idb.fetchSingle("Select omrades_id from omrade where benamning = " +"'"+ område +"'" );
            int convertBenämning = Integer.parseInt(benämning);
            if(admin.equals("Ja")){
                Admin = "J";
            }
            else{
                Admin = "N";
            }
            idb.insert("Insert into Agent values  ('" + convertID + "','" + user + "','"+ tfn + "','" + daydate + "','" + Admin + "','" + pass + "','" + convertBenämning + "')");
           if(typ.equals("Kontorschef")){
               idb.update("Update kontorschef set agent_id = "+ convertID);
               //idb.update("Update kontorschef set kontorsbeteckning = " + "'"+ kontorsNamnTextField.getText() +"'");
           
           }
           else if(typ.equals("Fältagent")){
               idb.insert("Insert into faltagent  values ('" + convertID + "')");
           }
           else{
               idb.update("Update omradeschef set agent_ID = " + convertID + ", omrade = " + "'" + convertBenämning + "'" + " where omrade = " + "'" + convertBenämning + "'");
           }
           
           
           JOptionPane.showMessageDialog(null, "Ny agent har registrerats");
            
        
        }
        catch (ParseException e) {
            Logger.getLogger(RegistreraAgent.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Anställningsdatumet måste vara i formatet yyyy-MM-dd, försök igen!");
        }
        catch(InfException e){
        JOptionPane.showMessageDialog(null, "Något gick fel");
        System.out.println(e.getMessage());

        }
          } 
       
    }//GEN-LAST:event_registreraAgentBTNActionPerformed

    private void agentTypComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_agentTypComboItemStateChanged
        // TODO add your handling code here:
     
    }//GEN-LAST:event_agentTypComboItemStateChanged

    private void agentTypComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentTypComboActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_agentTypComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdminFonster tbx = new AdminFonster(idb);
        tbx.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraAgent(idb).setVisible(true);
                
                 
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NamnTextField;
    private javax.swing.JLabel TfnLBL;
    private javax.swing.JPasswordField agentLösenTextField;
    private javax.swing.JComboBox<String> agentTypCombo;
    private javax.swing.JLabel agentTypLBL;
    private javax.swing.JLabel anställningsdatumLBL;
    private javax.swing.JLabel användarNamnLBL;
    private javax.swing.JTextField doeTextField;
    private javax.swing.JPanel grundPanel;
    private javax.swing.JComboBox<String> isAdminCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lösenordLBL;
    private javax.swing.JComboBox<String> områdeCombo;
    private javax.swing.JButton registreraAgentBTN;
    private javax.swing.JFormattedTextField tfnTextField;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
