/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import config.PasswordHasher;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author PC
 */
public class user_settings extends javax.swing.JFrame {

    /**
     * Creates new form user_dashboard
     */
    public user_settings() {
        initComponents();
    }

    Color navcolor =  new Color(255,255,255);
    Color hovercolor =  new Color(0,92,229);
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        npass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cnpass = new javax.swing.JPasswordField();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setBackground(new java.awt.Color(51, 153, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE PASSWORD");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 401, 280, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("New password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 219, -1, -1));

        npass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        npass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npassActionPerformed(evt);
            }
        });
        jPanel1.add(npass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 280, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Confirm new password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        cpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        jPanel1.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 280, 30));

        jPanel2.setBackground(new java.awt.Color(0, 92, 229));

        jLabel5.setFont(new java.awt.Font("Microsoft Himalaya", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Create New Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel5)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Current password:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 148, -1, -1));

        cnpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cnpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpassActionPerformed(evt);
            }
        });
        jPanel1.add(cnpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 280, 30));

        a1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 0, 0));
        a1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 140, 20));

        a2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a2.setForeground(new java.awt.Color(255, 0, 0));
        a2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 140, 20));

        a3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a3.setForeground(new java.awt.Color(255, 0, 0));
        a3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 140, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("________________________________________");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("________________________________________");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("________________________________________");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
    }//GEN-LAST:event_formWindowActivated

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       a1.setText("");
       a2.setText("");
       a3.setText("");
        
       dbconnector dbc = new dbconnector();
       session sess = session.getInstance();
       PasswordHasher pH = new PasswordHasher();

        try {
            String query = "SELECT * FROM tbl_u WHERE u_id = '" + sess.getUid() + "'";
            ResultSet resultSet = dbc.getData(query);
    
     if (resultSet.next()) {
        String oldpass = resultSet.getString("u_pass");
        String cps = pH.hashPassword(cpass.getText());

       if(cpass.getText().isEmpty() || npass.getText().isEmpty() || cnpass.getText().isEmpty()){
           
        if (cpass.getText().isEmpty()) {
            a1.setText(" * Field required!");
        }
        if (npass.getText().isEmpty()) {
            a2.setText(" * Field required!");
        }else if(npass.getText().length() < 8){        
            a2.setText(" * Password must be 8 characters above!");
            npass.setText("");
        }
            if(cnpass.getText().isEmpty()){
                a3.setText(" * Field required!");    
            }
       }else if(npass.getText().length() < 8){        
            a2.setText(" * Password must be 8 characters above!");
            npass.setText("");
            cnpass.setText("");
       }else if(!cpass.equals(oldpass)){
            a1.setText("Password is incorrect!");
            cpass.setText("");
       }else if (!npass.getText().equals(cnpass.getText())) {
            a2.setText(" * Password does not match!");
            a3.setText(" * Password does not match!");
            npass.setText("");
            cnpass.setText("");
       }else{

                String nps = pH.hashPassword(npass.getText());
                dbc.updateData("UPDATE tbl_u SET u_pass = '" + nps + "' WHERE u_id = '" + sess.getUid() + "'");               
                user_dashboard usd = new user_dashboard();
                usd.setVisible(true);
                this.dispose();
                 }
              }
 
    } catch (SQLException ex) {
     System.out.println("" + ex);
    }
    }//GEN-LAST:event_updateActionPerformed

    private void npassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npassActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassActionPerformed

    private void cnpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpassActionPerformed

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
            java.util.logging.Logger.getLogger(user_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JPasswordField cnpass;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField npass;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
