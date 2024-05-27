
package Admin;

import Admin.admin_dashboard;
import Admin.tracker;
import Admin.security;
import Admin.user;
import btt.loginform;
import java.awt.Color;
import javax.swing.JOptionPane;


public class message extends javax.swing.JFrame {

    public message() {
        initComponents();
    }

    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229);
    
    Color lc =  new Color(204,204,204);
    Color bc =  new Color(240,240,240);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        m = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        m2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        m1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        m3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        m4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        m5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 450));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 184));
        jLabel9.setText("Reports");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 11, -1, -1));

        jPanel16.setBackground(new java.awt.Color(0, 92, 229));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 370));

        m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mMouseExited(evt);
            }
        });
        m.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 184));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male-user-24.png"))); // NOI18N
        jLabel1.setText("Fullname");
        m.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 200, 42));

        jLabel7.setText("__________________________________________________________________________________________________________________________________________");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 830, 30));

        m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m2MouseExited(evt);
            }
        });
        m2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 184));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male-user-24.png"))); // NOI18N
        jLabel5.setText("Fullname");
        m2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 101, 200, 42));

        m1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m1MouseExited(evt);
            }
        });
        m1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 184));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male-user-24.png"))); // NOI18N
        jLabel2.setText("Fullname");
        m1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, 42));

        m3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m3MouseExited(evt);
            }
        });
        m3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 184));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male-user-24.png"))); // NOI18N
        jLabel4.setText("Fullname");
        m3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, 42));

        m4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m4MouseExited(evt);
            }
        });
        m4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 184));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male-user-24.png"))); // NOI18N
        jLabel6.setText("Fullname");
        m4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, 42));

        m5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m5MouseExited(evt);
            }
        });
        m5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 184));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male-user-24.png"))); // NOI18N
        jLabel8.setText("Fullname");
        m5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, 42));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 184));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male-user-26.png"))); // NOI18N
        jLabel10.setText("Fullname");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

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

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseEntered
        m.setBackground(lc);
    }//GEN-LAST:event_mMouseEntered

    private void mMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseExited
        m.setBackground(bc);
    }//GEN-LAST:event_mMouseExited

    private void m2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_m2MouseEntered

    private void m2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_m2MouseExited

    private void m1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_m1MouseEntered

    private void m1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_m1MouseExited

    private void m3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_m3MouseEntered

    private void m3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_m3MouseExited

    private void m4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_m4MouseEntered

    private void m4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_m4MouseExited

    private void m5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_m5MouseEntered

    private void m5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_m5MouseExited

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
            java.util.logging.Logger.getLogger(message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new message().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel m;
    private javax.swing.JPanel m1;
    private javax.swing.JPanel m2;
    private javax.swing.JPanel m3;
    private javax.swing.JPanel m4;
    private javax.swing.JPanel m5;
    // End of variables declaration//GEN-END:variables
}
