
package Admin;

import Admin.admin_dashboard;
import Admin.message;
import Admin.security;
import Admin.user;
import btt.loginform;
import java.awt.Color;
import javax.swing.JOptionPane;

public class tracker extends javax.swing.JFrame {

    public tracker() {
        initComponents();
    }
    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229); 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        color1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        color2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        color3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        color4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Tracker");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 92, 229));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 84));

        color1.setBackground(new java.awt.Color(0, 92, 229));
        color1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color1MouseExited(evt);
            }
        });
        color1.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/house-chimney (1).png"))); // NOI18N
        jLabel15.setText(" DASHBOARD");
        color1.add(jLabel15);
        jLabel15.setBounds(0, 0, 180, 40);

        jPanel6.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 40));

        color2.setBackground(new java.awt.Color(0, 92, 229));
        color2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color2MouseExited(evt);
            }
        });
        color2.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/users.png"))); // NOI18N
        jLabel16.setText(" ACCOUNTANT");
        color2.add(jLabel16);
        jLabel16.setBounds(0, 0, 180, 40);

        jPanel6.add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 40));

        color3.setBackground(new java.awt.Color(0, 92, 229));
        color3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color3MouseExited(evt);
            }
        });
        color3.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/assessment (1).png"))); // NOI18N
        jLabel25.setText(" TRACKER");
        color3.add(jLabel25);
        jLabel25.setBounds(0, 0, 160, 40);

        jPanel6.add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 180, 40));

        color4.setBackground(new java.awt.Color(0, 92, 229));
        color4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color4MouseExited(evt);
            }
        });
        color4.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/file-circle-info.png"))); // NOI18N
        jLabel18.setText(" REPORT");
        color4.add(jLabel18);
        jLabel18.setBounds(0, 0, 150, 40);

        jPanel6.add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 40));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo-13.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 120));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 220, 330));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Recent Transfer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Recent Transaction History");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 500, 140));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 500, 140));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Recent Activity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void color1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color1MouseClicked

    private void color1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseEntered
        color1.setBackground(navcolor);
    }//GEN-LAST:event_color1MouseEntered

    private void color1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseExited
        color1.setBackground(hovercolor);
    }//GEN-LAST:event_color1MouseExited

    private void color2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseClicked
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color2MouseClicked

    private void color2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseEntered
        color2.setBackground(navcolor);
    }//GEN-LAST:event_color2MouseEntered

    private void color2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseExited
        color2.setBackground(hovercolor);
    }//GEN-LAST:event_color2MouseExited

    private void color3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseClicked
        tracker t = new tracker();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color3MouseClicked

    private void color3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseEntered
        color3.setBackground(navcolor);
    }//GEN-LAST:event_color3MouseEntered

    private void color3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseExited
        color3.setBackground(hovercolor);
    }//GEN-LAST:event_color3MouseExited

    private void color4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseClicked
        message m = new message();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color4MouseClicked

    private void color4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseEntered
        color4.setBackground(navcolor);
    }//GEN-LAST:event_color4MouseEntered

    private void color4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseExited
        color4.setBackground(hovercolor);
    }//GEN-LAST:event_color4MouseExited

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
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel color1;
    private javax.swing.JPanel color2;
    private javax.swing.JPanel color3;
    private javax.swing.JPanel color4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
