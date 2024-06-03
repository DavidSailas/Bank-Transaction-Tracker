/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import config.dbconnector;
import config.session;
import java.awt.Window;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author PC
 */
public class withdraw extends javax.swing.JFrame {

    /**
     * Creates new form withdraw
     */
    public withdraw() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        withdrawpanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        confirmwithdraw = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        amountwithdraw = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        w50 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        w100 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        w150 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        w200 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        w250 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        w500 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        w800 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        w1000 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        addcustomamount = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        withdraw = new javax.swing.JButton();

        withdrawpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Amount to Deposit");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Enter amount to deposit");

        confirmwithdraw.setBackground(new java.awt.Color(0, 51, 184));
        confirmwithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmwithdraw.setForeground(new java.awt.Color(255, 255, 255));
        confirmwithdraw.setText("CONFIRM");
        confirmwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmwithdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout withdrawpanelLayout = new javax.swing.GroupLayout(withdrawpanel);
        withdrawpanel.setLayout(withdrawpanelLayout);
        withdrawpanelLayout.setHorizontalGroup(
            withdrawpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(withdrawpanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(withdrawpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amount)
                    .addComponent(confirmwithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        withdrawpanelLayout.setVerticalGroup(
            withdrawpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawpanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(confirmwithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 92, 229));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 49));

        amountwithdraw.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        amountwithdraw.setForeground(new java.awt.Color(0, 51, 184));
        amountwithdraw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountwithdraw.setText("₱ 0.00");
        jPanel1.add(amountwithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 472, 80));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Amount to Withdrawal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 60, 500, 30));

        w50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w50MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("50");

        javax.swing.GroupLayout w50Layout = new javax.swing.GroupLayout(w50);
        w50.setLayout(w50Layout);
        w50Layout.setHorizontalGroup(
            w50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        w50Layout.setVerticalGroup(
            w50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w50Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(w50, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 168, -1, -1));

        w100.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w100MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("100");

        javax.swing.GroupLayout w100Layout = new javax.swing.GroupLayout(w100);
        w100.setLayout(w100Layout);
        w100Layout.setHorizontalGroup(
            w100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        w100Layout.setVerticalGroup(
            w100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w100Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(w100, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 168, -1, -1));

        w150.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w150.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w150MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("150");

        javax.swing.GroupLayout w150Layout = new javax.swing.GroupLayout(w150);
        w150.setLayout(w150Layout);
        w150Layout.setHorizontalGroup(
            w150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        w150Layout.setVerticalGroup(
            w150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w150Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(w150, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 168, -1, -1));

        w200.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w200MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("200");

        javax.swing.GroupLayout w200Layout = new javax.swing.GroupLayout(w200);
        w200.setLayout(w200Layout);
        w200Layout.setHorizontalGroup(
            w200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        w200Layout.setVerticalGroup(
            w200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w200Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(w200, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 168, -1, -1));

        w250.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w250.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w250MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("250");

        javax.swing.GroupLayout w250Layout = new javax.swing.GroupLayout(w250);
        w250.setLayout(w250Layout);
        w250Layout.setHorizontalGroup(
            w250Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        w250Layout.setVerticalGroup(
            w250Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w250Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(w250, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 256, -1, -1));

        w500.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w500MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("500");

        javax.swing.GroupLayout w500Layout = new javax.swing.GroupLayout(w500);
        w500.setLayout(w500Layout);
        w500Layout.setHorizontalGroup(
            w500Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        w500Layout.setVerticalGroup(
            w500Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w500Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(w500, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 256, -1, -1));

        w800.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w800.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w800MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("800");

        javax.swing.GroupLayout w800Layout = new javax.swing.GroupLayout(w800);
        w800.setLayout(w800Layout);
        w800Layout.setHorizontalGroup(
            w800Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        w800Layout.setVerticalGroup(
            w800Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w800Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(w800, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 256, -1, -1));

        w1000.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w1000MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1000");

        javax.swing.GroupLayout w1000Layout = new javax.swing.GroupLayout(w1000);
        w1000.setLayout(w1000Layout);
        w1000Layout.setHorizontalGroup(
            w1000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        w1000Layout.setVerticalGroup(
            w1000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(w1000Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(w1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 256, -1, -1));

        addcustomamount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcustomamount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcustomamountMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Add Custom Amount");

        javax.swing.GroupLayout addcustomamountLayout = new javax.swing.GroupLayout(addcustomamount);
        addcustomamount.setLayout(addcustomamountLayout);
        addcustomamountLayout.setHorizontalGroup(
            addcustomamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addcustomamountLayout.setVerticalGroup(
            addcustomamountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addcustomamountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(addcustomamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 378, -1));

        withdraw.setBackground(new java.awt.Color(51, 153, 255));
        withdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        withdraw.setForeground(new java.awt.Color(255, 255, 255));
        withdraw.setText("WITHDRAW");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        jPanel1.add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 414, 378, 45));

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

    private void confirmwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmwithdrawActionPerformed
        withdraw w = new withdraw();
        Window window = SwingUtilities.getWindowAncestor(confirmwithdraw);
        window.dispose();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_confirmwithdrawActionPerformed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        user_dashboard uds = new user_dashboard();
        uds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void w50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w50MouseClicked
        amountwithdraw.setText("₱50.00");
    }//GEN-LAST:event_w50MouseClicked

    private void w100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w100MouseClicked
        amountwithdraw.setText("₱100.00");
    }//GEN-LAST:event_w100MouseClicked

    private void w150MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w150MouseClicked
        amountwithdraw.setText("₱150.00");
    }//GEN-LAST:event_w150MouseClicked

    private void w200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w200MouseClicked
        amountwithdraw.setText("₱200.00");
    }//GEN-LAST:event_w200MouseClicked

    private void w250MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w250MouseClicked
        amountwithdraw.setText("₱250.00");
    }//GEN-LAST:event_w250MouseClicked

    private void w500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w500MouseClicked
        amountwithdraw.setText("₱500.00");
    }//GEN-LAST:event_w500MouseClicked

    private void w800MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w800MouseClicked
        amountwithdraw.setText("₱800.00");
    }//GEN-LAST:event_w800MouseClicked

    private void w1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w1000MouseClicked
        amountwithdraw.setText("₱1000.00");
    }//GEN-LAST:event_w1000MouseClicked

    private void addcustomamountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcustomamountMouseClicked
        JOptionPane.showOptionDialog(null, withdrawpanel, "",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, new Object[]{}, null);
    }//GEN-LAST:event_addcustomamountMouseClicked

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
    
    String amountText = amountwithdraw.getText();
    String amountStr = amountText.replace("₱", "").replace(".00", "").trim();
    double amount = Double.parseDouble(amountStr);

    String transactionType = "WITHDRAWAL";

    java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
    java.sql.Time currentTime = new java.sql.Time(System.currentTimeMillis());

    try {
        session sess = session.getInstance();
        int u_id = sess.getUid();

        dbconnector db = new dbconnector();
        ResultSet rs = db.getData("SELECT u_bal FROM tbl_u WHERE u_id = " + u_id);

        if (rs.next()) {
            double currentBalance = rs.getDouble("u_bal");
            if (currentBalance < amount) {
                // If the balance is insufficient, set transaction status to pending
                String insertSql = "INSERT INTO tbl_transaction (u_id, tran_amount, tran_type, tran_date, tran_time, tran_stats) " +
                                   "VALUES (?, ?, ?, ?, ?, ?)";

                PreparedStatement insertPst = db.connect.prepareStatement(insertSql);
                insertPst.setInt(1, u_id);
                insertPst.setDouble(2, amount);
                insertPst.setString(3, transactionType);
                insertPst.setDate(4, currentDate);
                insertPst.setTime(5, currentTime);
                insertPst.setString(6, "FAILED");
                insertPst.executeUpdate();
                insertPst.close();

                JOptionPane.showMessageDialog(null, "Insufficient Balance, Transaction failed!", "Error", JOptionPane.ERROR_MESSAGE);

                return;
            }
            double newBalance = currentBalance - amount;

            String updateSql = "UPDATE tbl_u SET u_bal = ? WHERE u_id = ?";
            PreparedStatement updatePst = db.connect.prepareStatement(updateSql);
            updatePst.setDouble(1, newBalance);
            updatePst.setInt(2, u_id);
            updatePst.executeUpdate();
            updatePst.close();

            String insertSql = "INSERT INTO tbl_transaction (u_id, tran_amount, tran_type, tran_date, tran_time, tran_stats) " +
                               "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement insertPst = db.connect.prepareStatement(insertSql);
            insertPst.setInt(1, u_id);
            insertPst.setDouble(2, amount);
            insertPst.setString(3, transactionType);
            insertPst.setDate(4, currentDate);
            insertPst.setTime(5, currentTime);
            insertPst.setString(6, "SUCCESS");
            insertPst.executeUpdate();
            insertPst.close();

            JOptionPane.showMessageDialog(null, "Withdrawal successful!");

            receipt r = new receipt();
            r.amount.setText("₱" + String.format("%.2f", amount));
            r.total.setText("₱" + String.format("%.2f", amount));
            r.typetran.setText(transactionType);
            r.tran_type.setText("You have successfully " + transactionType);
            SimpleDateFormat sdfDate = new SimpleDateFormat("MMMM dd, yyyy");
            SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm:ss a");
            r.date.setText(sdfDate.format(currentDate));
            r.time.setText(sdfTime.format(currentTime));
            r.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error: Unable to fetch user balance.");
        }
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    
    }//GEN-LAST:event_withdrawActionPerformed

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
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addcustomamount;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel amountwithdraw;
    private javax.swing.JButton confirmwithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel w100;
    private javax.swing.JPanel w1000;
    private javax.swing.JPanel w150;
    private javax.swing.JPanel w200;
    private javax.swing.JPanel w250;
    private javax.swing.JPanel w50;
    private javax.swing.JPanel w500;
    private javax.swing.JPanel w800;
    private javax.swing.JButton withdraw;
    private javax.swing.JPanel withdrawpanel;
    // End of variables declaration//GEN-END:variables
}
