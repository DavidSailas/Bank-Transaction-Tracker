/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author PC
 */
public class receipt extends javax.swing.JFrame {

    /**
     * Creates new form receipt
     */
    public receipt() {
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
        amount = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tran_type = new javax.swing.JLabel();
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
        page.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 430, 20));

        date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 102));
        date.setText("date");
        page.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 100, -1));

        typetran.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        typetran.setForeground(new java.awt.Color(0, 0, 102));
        typetran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typetran.setText("Type of Transaction");
        page.add(typetran, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 220, 520, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Date");
        page.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N
        page.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 528, 130));

        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        page.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 222, 430, 20));

        amount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 0, 102));
        amount.setText("amount");
        page.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 260, 100, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Time");
        page.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        time.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 102));
        time.setText("time");
        page.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 100, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Total");
        page.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        total.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 102));
        total.setText("total amount");
        page.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 140, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Amount");
        page.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("funds in your wallet.");
        page.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 510, -1));

        tran_type.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tran_type.setForeground(new java.awt.Color(0, 0, 102));
        tran_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tran_type.setText("You have succesfully deposit/withdraw/transfer");
        page.add(tran_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 510, -1));

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
                    .addComponent(returnpage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnpageMouseClicked
        user_dashboard uds = new user_dashboard();
        uds.walletbalance.setText("₱" + String.format("%.2f", amount));
        uds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnpageMouseClicked

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
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel amount;
    public javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel page;
    private javax.swing.JLabel returnpage;
    public javax.swing.JLabel time;
    public javax.swing.JLabel total;
    public javax.swing.JLabel tran_type;
    public javax.swing.JLabel typetran;
    // End of variables declaration//GEN-END:variables
}
