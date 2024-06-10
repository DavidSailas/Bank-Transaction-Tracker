/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import btt.loginform;
import config.PasswordHasher;
import config.dbconnector;
import config.session;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;

public class changepass extends javax.swing.JFrame {

 
    public changepass() {
        initComponents();
    }


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
        back = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cnpass = new javax.swing.JPasswordField();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update.setBackground(new java.awt.Color(51, 153, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("CHANGE PASSWORD");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 280, 35));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("New password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        npass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        npass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        npass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npassActionPerformed(evt);
            }
        });
        jPanel1.add(npass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 280, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Confirm new password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        cpass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        jPanel1.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 280, 30));

        jPanel2.setBackground(new java.awt.Color(0, 92, 229));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CHANGE PASSWORD");

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Current password:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        cnpass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cnpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cnpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpassActionPerformed(evt);
            }
        });
        jPanel1.add(cnpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 280, 30));

        a1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 0, 0));
        a1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 140, 20));

        a2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a2.setForeground(new java.awt.Color(255, 0, 0));
        a2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 140, 20));

        a3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a3.setForeground(new java.awt.Color(255, 0, 0));
        a3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 140, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("________________________________________");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("________________________________________");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("________________________________________");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Your password must be at least 8 characters above and should include a");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 400, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("combination of numbers, letters and special characters (!$@%).");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 360, -1));

        fullname.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullname.setForeground(new java.awt.Color(0, 0, 102));
        fullname.setText("Create a new strong password");
        jPanel1.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                        a1.setText(" Field required");
                    }
                    if (npass.getText().isEmpty()) {
                        a2.setText(" Field required");
                    }else if(npass.getText().length() < 8){
                        a2.setText(" Password must be 8 characters above!");
                    }
                    if(cnpass.getText().isEmpty()){
                        a3.setText(" Field required");
                    }
                }else if(npass.getText().length() < 8){
                    a2.setText(" Password must be 8 characters above!");
                }else if(!cps.equals(oldpass)){
                    a1.setText("Password is incorrect!");
                }else if (!npass.getText().equals(cnpass.getText())) {
                    a2.setText(" Password does not match!");
                    a3.setText(" Password does not match!");
                }else{

                    String nps = pH.hashPassword(npass.getText());
                    dbc.updateData("UPDATE tbl_u SET u_pass = '" + nps + "' WHERE u_id = '" + sess.getUid() + "'");
                    admin_dashboard asd = new admin_dashboard();
                    asd.setVisible(true);
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
                       
        session sess = session.getInstance();
        
        if (sess.getUid() == 0){
            JOptionPane.showMessageDialog(null,"No account, Login First!");
            loginform ads = new loginform();
            ads.setVisible(true);
            this.dispose();
        }else{
            fullname.setText(sess.getFname() + " " + sess.getLname());

        } 
    }//GEN-LAST:event_formWindowActivated

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        pass_security ps = new pass_security();
        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    /**
     * @param args the command line arguments
     */
         public void logEvent(int userId, String event, String description) {
   
        dbconnector dbc = new dbconnector();
        PreparedStatement pstmt = null;
        
    try {
     

        String sql = "INSERT INTO tbl_logs (l_timestamp, l_event, u_id, l_description) VALUES (?, ?, ?, ?)";
        pstmt = dbc.connect.prepareStatement(sql);
        pstmt.setTimestamp(1, new Timestamp(new Date().getTime()));
        pstmt.setString(2, event);
        pstmt.setInt(3, userId);
        pstmt.setString(4, description);

        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
       
    }
    
 }
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
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel back;
    private javax.swing.JPasswordField cnpass;
    private javax.swing.JPasswordField cpass;
    public javax.swing.JLabel fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField npass;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
