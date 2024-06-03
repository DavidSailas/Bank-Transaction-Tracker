/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import config.PasswordHasher;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author PC
 */
public class settings extends javax.swing.JFrame {

    /**
     * Creates new form settings
     */
    public settings() {
        initComponents();
    }

    Color lg =  new Color(204,204,204);
    Color bg =  new Color(255,255,255);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pcolor1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pcolor2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pcolor3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pcolor1.setBackground(new java.awt.Color(255, 255, 255));
        pcolor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcolor1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pcolor1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pcolor1MouseExited(evt);
            }
        });
        pcolor1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 184));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText(" Account");
        pcolor1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 184));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(">");
        pcolor1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2, 50, 50));

        pcolor2.setBackground(new java.awt.Color(255, 255, 255));
        pcolor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcolor2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pcolor2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pcolor2MouseExited(evt);
            }
        });
        pcolor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 184));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/shield.png"))); // NOI18N
        jLabel24.setText(" Password & Security");
        pcolor2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 184));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(">");
        pcolor2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2, 50, 50));

        pcolor3.setBackground(new java.awt.Color(255, 255, 255));
        pcolor3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcolor3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pcolor3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pcolor3MouseExited(evt);
            }
        });
        pcolor3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 184));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/id-badge.png"))); // NOI18N
        jLabel25.setText(" Personal Info");
        pcolor3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 184));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(">");
        pcolor3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2, 50, 50));

        jPanel2.setBackground(new java.awt.Color(0, 92, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SETTINGS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 11, 391, -1));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pcolor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pcolor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pcolor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcolor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcolor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcolor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pcolor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseClicked

    }//GEN-LAST:event_pcolor1MouseClicked

    private void pcolor1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseEntered
        pcolor1.setBackground(lg);
    }//GEN-LAST:event_pcolor1MouseEntered

    private void pcolor1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseExited
        pcolor1.setBackground(bg);
    }//GEN-LAST:event_pcolor1MouseExited

    private void pcolor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor2MouseClicked
        pass_security ps = new pass_security();
        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pcolor2MouseClicked

    private void pcolor2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor2MouseEntered
        pcolor2.setBackground(lg);
    }//GEN-LAST:event_pcolor2MouseEntered

    private void pcolor2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor2MouseExited
        pcolor2.setBackground(bg);
    }//GEN-LAST:event_pcolor2MouseExited

    private void pcolor3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor3MouseClicked
       
session sess = session.getInstance();
personalinfo pi = new personalinfo();
pi.u_id.setText(String.valueOf(sess.getUid()));
pi.u_fname.setText(sess.getFname());
pi.u_lname.setText(sess.getLname());
pi.u_email.setText(sess.getEmail());
pi.contact.setText(sess.getContact());

pi.setVisible(true);
this.dispose();

 
    }//GEN-LAST:event_pcolor3MouseClicked

    private void pcolor3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor3MouseEntered
        pcolor3.setBackground(lg);
    }//GEN-LAST:event_pcolor3MouseEntered

    private void pcolor3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor3MouseExited
        pcolor3.setBackground(bg);
    }//GEN-LAST:event_pcolor3MouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pcolor1;
    private javax.swing.JPanel pcolor2;
    private javax.swing.JPanel pcolor3;
    // End of variables declaration//GEN-END:variables
}
