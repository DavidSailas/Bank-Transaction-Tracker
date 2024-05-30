package btt;

import Admin.admin_dashboard;
import User.user_dashboard;
import com.formdev.flatlaf.FlatLightLaf;
import config.PasswordHasher;
import config.dbconnector;
import config.session;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;


import javax.swing.UIManager;
import register.registrationform;

public class loginform extends javax.swing.JFrame {

    
    public loginform() {
        initComponents();
    }

    static String status;
    static String type;

    
    public static boolean loginAcc(String username, String password){
        dbconnector connector = new dbconnector();
        try{
            String query = "SELECT * FROM tbl_u  WHERE u_uname = '" + username + "' AND u_pass = '" + password + "'";
            ResultSet resultSet = connector.getData(query);
             if(resultSet.next()){
                
                status = resultSet.getString("u_status");
                type = resultSet.getString("u_type");

                session sess = session.getInstance();
                sess.setUid(resultSet.getInt("u_id")); 
                sess.setFname(resultSet.getString("u_fname"));
                sess.setLname(resultSet.getString("u_lname"));
                sess.setEmail(resultSet.getString("u_email"));
                sess.setUsername(resultSet.getString("u_uname"));
                sess.setType(resultSet.getString("u_type"));
                sess.setStatus(resultSet.getString("u_status"));
                
                return true;
            }else{
                return false;
            }
            
        }catch (SQLException ex) {
            return false;
        }

    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        u_uname = new javax.swing.JTextField();
        u_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nousn = new javax.swing.JLabel();
        xps = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 92, 229));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 450));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 450));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo-260.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME BACK!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 59, 500, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 70, -1));

        u_uname.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        u_uname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        u_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_unameActionPerformed(evt);
            }
        });
        jPanel1.add(u_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 280, 30));

        u_pass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        u_pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(u_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 280, 30));

        jButton1.setBackground(new java.awt.Color(0, 51, 184));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG IN");
        jButton1.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 270, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 184));
        jLabel5.setText("Forgot password?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("__________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 351, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("__________");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 352, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("or");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 351, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Don't have an account?");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 184));
        jLabel4.setText("Sign up now!");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(jLabel4))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 384, -1, -1));

        nousn.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        nousn.setForeground(new java.awt.Color(255, 0, 0));
        nousn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(nousn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 170, 20));

        xps.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        xps.setForeground(new java.awt.Color(255, 0, 0));
        xps.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(xps, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 170, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 60, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("________________________________________");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("________________________________________");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, 30));

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        registrationform registrationform = new registrationform();
        registrationform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        forgetpass fp = new forgetpass();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        nousn.setText("");
        xps.setText("");

        PasswordHasher pH = new PasswordHasher();
        String password = pH.hashPassword(u_pass.getText());


        if(u_uname.getText().isEmpty() || u_pass.getText().isEmpty()){ // Use isEmpty() for consistency
            if(u_uname.getText().isEmpty()){
                nousn.setText("Field Required");
            }
            if(u_pass.getText().isEmpty()){ // Use isEmpty() instead of equals("")
                xps.setText("Field Required");
            }
        } else {
            if(loginAcc(u_uname.getText(), password)) {
                if(!status.equals("Active")){
                    JOptionPane.showMessageDialog(null, "Account is not Active!.");
                } else {
                    if(type.equals("Admin")){
                        JOptionPane.showMessageDialog(null, "Log in successfully.");
                        admin_dashboard ads = new admin_dashboard();
                        ads.setVisible(true);
                        this.dispose();
                    } else if(type.equals("User")){
                        JOptionPane.showMessageDialog(null, "Log in successfully.");
                        user_dashboard uds = new user_dashboard();
                        uds.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Account does not exist!", "Notice", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                nousn.setText("Invalid Username.");
                xps.setText("Invalid Password.");
                u_uname.setText("");
                u_pass.setText("");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void u_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_unameActionPerformed
      
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nousn;
    private javax.swing.JPasswordField u_pass;
    private javax.swing.JTextField u_uname;
    private javax.swing.JLabel xps;
    // End of variables declaration//GEN-END:variables
}
