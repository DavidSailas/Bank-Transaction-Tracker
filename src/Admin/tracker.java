
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
        jLabel17 = new javax.swing.JLabel();
        color4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        color5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        color6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        color7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        color8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        color9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 450));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 450));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 184));
        jLabel9.setText("Tracker");

        jPanel6.setBackground(new java.awt.Color(0, 92, 229));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo-13 (1).png"))); // NOI18N
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
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        jLabel15.setText(" DASHBOARD");
        color1.add(jLabel15);
        jLabel15.setBounds(0, 0, 180, 40);

        jPanel6.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 113, 180, 40));

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
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/group.png"))); // NOI18N
        jLabel16.setText(" ACCOUNTANT");
        color2.add(jLabel16);
        jLabel16.setBounds(0, 0, 180, 40);

        jPanel6.add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 159, 180, 40));

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/expense.png"))); // NOI18N
        jLabel17.setText(" TRACKER");
        color3.add(jLabel17);
        jLabel17.setBounds(0, 0, 160, 40);

        jPanel6.add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 205, 180, 40));

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
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file.png"))); // NOI18N
        jLabel18.setText(" REPORT");
        color4.add(jLabel18);
        jLabel18.setBounds(0, 0, 150, 40);

        jPanel6.add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 251, 180, 40));

        color5.setBackground(new java.awt.Color(0, 92, 229));
        color5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color5MouseExited(evt);
            }
        });
        color5.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shield.png"))); // NOI18N
        jLabel19.setText(" SECURITY");
        color5.add(jLabel19);
        jLabel19.setBounds(0, 0, 160, 40);

        jPanel6.add(color5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 297, 180, 40));

        color6.setBackground(new java.awt.Color(0, 92, 229));
        color6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color6MouseExited(evt);
            }
        });
        color6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel3.setText(" Log out");
        color6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        jPanel6.add(color6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 398, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 92, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        color7.setBackground(new java.awt.Color(0, 92, 229));
        color7.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Recent Activity");
        color7.add(jLabel20);
        jLabel20.setBounds(0, 0, 150, 40);

        jPanel2.add(color7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, 40));

        color8.setBackground(new java.awt.Color(0, 92, 229));
        color8.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText(" Recent Transaction");
        color8.add(jLabel21);
        jLabel21.setBounds(0, 0, 170, 40);

        jPanel2.add(color8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 40));

        color9.setBackground(new java.awt.Color(0, 92, 229));
        color9.setLayout(null);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(" Recent Transfer");
        color9.add(jLabel22);
        jLabel22.setBounds(0, 0, 150, 40);

        jPanel2.add(color9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 500, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(269, 269, 269))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
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

    private void color5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseClicked
        security s = new security();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color5MouseClicked

    private void color5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseEntered
        color5.setBackground(navcolor);
    }//GEN-LAST:event_color5MouseEntered

    private void color5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseExited
        color5.setBackground(hovercolor);
    }//GEN-LAST:event_color5MouseExited

    private void color6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color6MouseClicked

        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color6MouseClicked

    private void color6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color6MouseEntered
        color6.setBackground(navcolor);
    }//GEN-LAST:event_color6MouseEntered

    private void color6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color6MouseExited
        color6.setBackground(hovercolor);
    }//GEN-LAST:event_color6MouseExited

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
    private javax.swing.JPanel color5;
    private javax.swing.JPanel color6;
    private javax.swing.JPanel color7;
    private javax.swing.JPanel color8;
    private javax.swing.JPanel color9;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
