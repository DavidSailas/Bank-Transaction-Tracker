/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import config.dbconnector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author PC
 */
public class receipttransfer extends javax.swing.JFrame {

    /**
     * Creates new form receipt
     */
    public receipttransfer() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        page = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        typetran = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fee = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        refno = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tran_type = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        accno = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        returnpage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(617, 700));

        jPanel1.setBackground(new java.awt.Color(0, 92, 229));
        jPanel1.setMinimumSize(new java.awt.Dimension(617, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(617, 700));

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("D.S POINEER PAY");
        page.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 152, 530, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRANSACTION DETAILS");
        page.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 182, 530, 30));

        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        page.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 430, 20));

        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 102));
        date.setText("date");
        page.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 100, -1));

        typetran.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        typetran.setForeground(new java.awt.Color(0, 0, 102));
        typetran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typetran.setText("Type of Transaction");
        page.add(typetran, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 220, 520, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Date");
        page.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 40, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N
        page.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 528, 130));

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        page.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 222, 430, 20));

        fee.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fee.setForeground(new java.awt.Color(0, 0, 102));
        fee.setText("fee");
        page.add(fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 100, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Reference Number");
        page.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        refno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        refno.setForeground(new java.awt.Color(0, 0, 102));
        refno.setText("ref no.");
        page.add(refno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 100, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Total");
        page.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        total.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 102));
        total.setText("total amount");
        page.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 140, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Fee");
        page.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 30, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("funds in your wallet.");
        page.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 510, -1));

        tran_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tran_type.setForeground(new java.awt.Color(0, 0, 102));
        tran_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tran_type.setText("You have succesfully deposit/withdraw/transfer");
        page.add(tran_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 510, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Time");
        page.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 40, -1));

        time.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 102));
        time.setText("time");
        page.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 100, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Account Number");
        page.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("Amount");
        page.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        accno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        accno.setForeground(new java.awt.Color(0, 0, 102));
        accno.setText("acc no.");
        page.add(accno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 100, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setText("Account Name");
        page.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        accname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        accname.setForeground(new java.awt.Color(0, 0, 102));
        accname.setText("acc name");
        page.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 100, -1));

        amount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 0, 102));
        amount.setText("amount");
        page.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 100, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/file-download.png"))); // NOI18N
        jLabel1.setText(" Download");

        returnpage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnpage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        returnpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnpageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(returnpage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(returnpage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 676, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(page, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnpageMouseClicked
        user_dashboard uds = new user_dashboard();
        uds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnpageMouseClicked

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
            java.util.logging.Logger.getLogger(receipttransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipttransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipttransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipttransfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipttransfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel accname;
    public javax.swing.JLabel accno;
    public javax.swing.JLabel amount;
    public javax.swing.JLabel date;
    public javax.swing.JLabel fee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel page;
    public javax.swing.JLabel refno;
    private javax.swing.JLabel returnpage;
    public javax.swing.JLabel time;
    public javax.swing.JLabel total;
    public javax.swing.JLabel tran_type;
    public javax.swing.JLabel typetran;
    // End of variables declaration//GEN-END:variables
}
