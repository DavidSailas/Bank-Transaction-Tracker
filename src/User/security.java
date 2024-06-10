
package User;

import config.PasswordHasher;
import config.dbconnector;
import config.session;
import java.sql.ResultSet;
import java.sql.SQLException;

public class security extends javax.swing.JFrame {

    public security() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        scode = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sc = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        csc = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scode.setBackground(new java.awt.Color(51, 153, 255));
        scode.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        scode.setForeground(new java.awt.Color(255, 255, 255));
        scode.setText("UPDATE CODE");
        scode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scodeActionPerformed(evt);
            }
        });
        jPanel2.add(scode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 280, 35));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Security Code");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        sc.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        sc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scActionPerformed(evt);
            }
        });
        jPanel2.add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 280, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Confirm Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        csc.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        csc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        csc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cscActionPerformed(evt);
            }
        });
        jPanel2.add(csc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 280, 30));

        jPanel3.setBackground(new java.awt.Color(0, 92, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TWO - FACOTR AUTHENTICATION");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

        a1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 0, 0));
        a1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 140, 20));

        a2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        a2.setForeground(new java.awt.Color(255, 0, 0));
        a2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 140, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("________________________________________");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("________________________________________");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Two-factor authentication protects your account by requiring an additional code.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 430, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Your security code must be at least 6 characters above.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 320, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Add extra security to your account");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void scodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scodeActionPerformed

        a1.setText("");
        a2.setText("");

        dbconnector dbc = new dbconnector();
        session sess = session.getInstance();
        PasswordHasher pH = new PasswordHasher();

        try {
            String query = "SELECT * FROM tbl_u WHERE u_id = '" + sess.getUid() + "'";
            ResultSet resultSet = dbc.getData(query);

            if (resultSet.next()) {
                String oldpass = resultSet.getString("u_pass");
                String cpass = pH.hashPassword(csc.getText());

                if (csc.getText().isEmpty() || sc.getText().isEmpty()) {
                    if (csc.getText().isEmpty()) {
                        a2.setText("Field required!");
                    }
                    if (sc.getText().isEmpty()) {
                        a1.setText("Field required!");
                    }
                } else if (!cpass.equals(oldpass)) {
                    a2.setText("Password is incorrect!");

                }else if(sc.getText().length() < 6){
                    a1.setText("At least 6 code");

                } else {
                    String code = pH.hashPassword(sc.getText());
                    dbc.updateData("UPDATE tbl_u SET u_code = '" + code + "' WHERE u_id = '" + sess.getUid() + "'");
                    pass_security ps = new pass_security();
                    ps.setVisible(true);
                    this.dispose();
                }
            }

            resultSet.close();  // Ensure the ResultSet is closed

        } catch (SQLException ex) {
            System.out.println("" + ex);
        }

    }//GEN-LAST:event_scodeActionPerformed

    private void scActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scActionPerformed

    private void cscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cscActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        pass_security ps = new pass_security();
        ps.setVisible(true);
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
            java.util.logging.Logger.getLogger(security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new security().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel back;
    private javax.swing.JPasswordField csc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField sc;
    private javax.swing.JButton scode;
    // End of variables declaration//GEN-END:variables
}
