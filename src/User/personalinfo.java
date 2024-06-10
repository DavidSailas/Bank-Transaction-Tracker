
package User;

import config.dbconnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class personalinfo extends javax.swing.JFrame {

 
    public personalinfo() {
        initComponents();
    }

public boolean upCheck() {
    dbconnector connector = new dbconnector();
    
    String Contact = contact.getText();
    String email = u_email.getText();
    String uid = u_id.getText();

    String query = "SELECT COUNT(*) AS count FROM tbl_u WHERE (u_contact = ? OR u_email = ?) AND u_id != ?";
    try (PreparedStatement pst = connector.connect.prepareStatement(query)) {
        pst.setString(1, Contact);
        pst.setString(2, email);
        pst.setString(3, uid);
        ResultSet resultSet = pst.executeQuery();

        if (resultSet.next()) {
            int count = resultSet.getInt("count");
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Email or Phone no. is Already Used!");
                return true;
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
    }
    return false;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        u_fname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        u_lname = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        u_email = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        u_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 92, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PERSONAL INFO");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 3, 399, 40));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 49));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("First name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 142, -1, 20));

        u_fname.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        u_fname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        u_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_fnameActionPerformed(evt);
            }
        });
        jPanel1.add(u_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 162, 150, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("_____________________");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 172, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Last name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 142, -1, 20));

        u_lname.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        u_lname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        u_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_lnameActionPerformed(evt);
            }
        });
        jPanel1.add(u_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 162, 150, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("_____________________");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 172, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 323, -1, 20));

        u_email.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        u_email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        u_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_emailActionPerformed(evt);
            }
        });
        jPanel1.add(u_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 343, 150, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("_____________________");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 353, -1, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("____________________________________________________________________");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 500, 30));

        update.setBackground(new java.awt.Color(0, 51, 184));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("SAVE CHANGE");
        update.setPreferredSize(new java.awt.Dimension(60, 30));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 439, 150, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Phone no.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 323, -1, 20));

        contact.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 343, 150, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("_____________________");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 353, -1, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Basic info");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 71, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Contact info");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 256, -1, -1));

        u_id.setForeground(new java.awt.Color(255, 255, 255));
        u_id.setText("jLabel8");
        jPanel1.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 487, 500, 13));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        settings s = new settings();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void u_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_fnameActionPerformed

    private void u_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_lnameActionPerformed

    private void u_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_emailActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if (u_fname.getText().isEmpty() || u_lname.getText().isEmpty()
            || u_email.getText().isEmpty() || contact.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else {
            dbconnector dbc = new dbconnector();

            if (upCheck()) {
                System.out.println("Duplicate Exist!");
            } else {
                try {
                    PreparedStatement pst = dbc.connect.prepareStatement("UPDATE tbl_u SET u_fname = ?, u_lname = ?, u_email = ?, u_contact = ? WHERE u_id = ?");
                    pst.setString(1, u_fname.getText());
                    pst.setString(2, u_lname.getText());
                    pst.setString(3, u_email.getText());
                    pst.setString(4, contact.getText());
                    pst.setString(5, u_id.getText());

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Update successful!");

                    settings s = new settings();
                    s.setVisible(true);
                    this.dispose();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

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
            java.util.logging.Logger.getLogger(personalinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personalinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personalinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personalinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personalinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    public javax.swing.JTextField contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField u_email;
    public javax.swing.JTextField u_fname;
    public javax.swing.JLabel u_id;
    public javax.swing.JTextField u_lname;
    public javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
