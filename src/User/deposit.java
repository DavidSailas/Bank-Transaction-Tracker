
package User;

import config.dbconnector;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author PC
 */
public class deposit extends javax.swing.JFrame {

    /**
     * Creates new form deposit
     */
    public deposit() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        depositpanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        confirmdeposit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        amountdeposit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        d50 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        d100 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        d150 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        d200 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        d250 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        d500 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        d800 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        d1000 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        addcustomamount = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        deposit = new javax.swing.JButton();

        depositpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Amount to Deposit");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Enter amount to deposit");

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        confirmdeposit.setBackground(new java.awt.Color(0, 51, 184));
        confirmdeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmdeposit.setForeground(new java.awt.Color(255, 255, 255));
        confirmdeposit.setText("CONFIRM");
        confirmdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmdepositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout depositpanelLayout = new javax.swing.GroupLayout(depositpanel);
        depositpanel.setLayout(depositpanelLayout);
        depositpanelLayout.setHorizontalGroup(
            depositpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(depositpanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(depositpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amount)
                    .addComponent(confirmdeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        depositpanelLayout.setVerticalGroup(
            depositpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositpanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(confirmdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel2.setBackground(new java.awt.Color(0, 92, 229));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEPOSIT");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 390, -1));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        amountdeposit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        amountdeposit.setForeground(new java.awt.Color(0, 51, 184));
        amountdeposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountdeposit.setText("₱ 0.00");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Amount to Deposit");

        d50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d50MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("50");

        javax.swing.GroupLayout d50Layout = new javax.swing.GroupLayout(d50);
        d50.setLayout(d50Layout);
        d50Layout.setHorizontalGroup(
            d50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        d50Layout.setVerticalGroup(
            d50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d50Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        d100.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d100MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("100");

        javax.swing.GroupLayout d100Layout = new javax.swing.GroupLayout(d100);
        d100.setLayout(d100Layout);
        d100Layout.setHorizontalGroup(
            d100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        d100Layout.setVerticalGroup(
            d100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d100Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        d150.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d150.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d150MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("150");

        javax.swing.GroupLayout d150Layout = new javax.swing.GroupLayout(d150);
        d150.setLayout(d150Layout);
        d150Layout.setHorizontalGroup(
            d150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        d150Layout.setVerticalGroup(
            d150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d150Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        d200.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d200MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("200");

        javax.swing.GroupLayout d200Layout = new javax.swing.GroupLayout(d200);
        d200.setLayout(d200Layout);
        d200Layout.setHorizontalGroup(
            d200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        d200Layout.setVerticalGroup(
            d200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d200Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        d250.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d250.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d250MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("250");

        javax.swing.GroupLayout d250Layout = new javax.swing.GroupLayout(d250);
        d250.setLayout(d250Layout);
        d250Layout.setHorizontalGroup(
            d250Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        d250Layout.setVerticalGroup(
            d250Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d250Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        d500.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d500MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("500");

        javax.swing.GroupLayout d500Layout = new javax.swing.GroupLayout(d500);
        d500.setLayout(d500Layout);
        d500Layout.setHorizontalGroup(
            d500Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        d500Layout.setVerticalGroup(
            d500Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d500Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        d800.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d800.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d800MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("800");

        javax.swing.GroupLayout d800Layout = new javax.swing.GroupLayout(d800);
        d800.setLayout(d800Layout);
        d800Layout.setHorizontalGroup(
            d800Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        d800Layout.setVerticalGroup(
            d800Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d800Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        d1000.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d1000.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d1000MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1000");

        javax.swing.GroupLayout d1000Layout = new javax.swing.GroupLayout(d1000);
        d1000.setLayout(d1000Layout);
        d1000Layout.setHorizontalGroup(
            d1000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        d1000Layout.setVerticalGroup(
            d1000Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d1000Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addContainerGap(23, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addcustomamountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        deposit.setBackground(new java.awt.Color(51, 153, 255));
        deposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deposit.setForeground(new java.awt.Color(255, 255, 255));
        deposit.setText("DEPOSIT");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addcustomamount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(d250, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(d50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(d200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(amountdeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amountdeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d250, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addcustomamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

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

    private void addcustomamountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcustomamountMouseClicked
        JOptionPane.showOptionDialog(null, depositpanel, "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, new Object[]{}, null);
    }//GEN-LAST:event_addcustomamountMouseClicked

    private void confirmdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmdepositActionPerformed

        amountActionPerformed(evt);
        
        Window window = SwingUtilities.getWindowAncestor(confirmdeposit);
        window.dispose();

    }//GEN-LAST:event_confirmdepositActionPerformed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        user_dashboard uds = new user_dashboard();
        uds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        
    String amountText = amountdeposit.getText();
    String amountStr = amountText.replace("₱", "").replace(".00", "").trim();
    double amount = Double.parseDouble(amountStr);

    
    int u_id = 1; 
    String transactionType = "deposit"; 

    java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
    java.sql.Time currentTime = new java.sql.Time(System.currentTimeMillis());

    String sql = "INSERT INTO tbl_transaction (u_id, tran_amount, tran_type, tran_date, tran_time) " +
                 "VALUES (?, ?, ?, ?, ?)";

    try {
        dbconnector db = new dbconnector();
        PreparedStatement pst = db.connect.prepareStatement(sql);
        pst.setInt(1, u_id);
        pst.setDouble(2, amount);
        pst.setString(3, transactionType);
        pst.setDate(4, currentDate);
        pst.setTime(5, currentTime);
        pst.executeUpdate();
        pst.close();
        JOptionPane.showMessageDialog(null, "Deposit successful!");


        receipt r = new receipt();
        r.amount.setText("₱" + String.format("%.2f", amount));
        r.total.setText("₱" + String.format("%.2f", amount)); 
        SimpleDateFormat sdfDate = new SimpleDateFormat("MMMM dd, yyyy");
        SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm:ss a");
        r.date.setText(sdfDate.format(currentDate));
        r.time.setText(sdfTime.format(currentTime));
        r.setVisible(true);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_depositActionPerformed

    private void d50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d50MouseClicked
        amountdeposit.setText("₱50.00");
    }//GEN-LAST:event_d50MouseClicked

    private void d100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d100MouseClicked
        amountdeposit.setText("₱100.00");
    }//GEN-LAST:event_d100MouseClicked

    private void d150MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d150MouseClicked
        amountdeposit.setText("₱150.00");
    }//GEN-LAST:event_d150MouseClicked

    private void d200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d200MouseClicked
        amountdeposit.setText("₱200.00");
    }//GEN-LAST:event_d200MouseClicked

    private void d250MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d250MouseClicked
        amountdeposit.setText("₱250.00");
    }//GEN-LAST:event_d250MouseClicked

    private void d500MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d500MouseClicked
        amountdeposit.setText("₱500.00");
    }//GEN-LAST:event_d500MouseClicked

    private void d800MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d800MouseClicked
        amountdeposit.setText("₱800.00");
    }//GEN-LAST:event_d800MouseClicked

    private void d1000MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1000MouseClicked
        amountdeposit.setText("₱1000.00");
    }//GEN-LAST:event_d1000MouseClicked

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
    String customAmount = amount.getText();
    if (!customAmount.isEmpty()) {
        amountdeposit.setText("₱" + customAmount + ".00");
    }
    }//GEN-LAST:event_amountActionPerformed

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
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addcustomamount;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel amountdeposit;
    private javax.swing.JButton confirmdeposit;
    private javax.swing.JPanel d100;
    private javax.swing.JPanel d1000;
    private javax.swing.JPanel d150;
    private javax.swing.JPanel d200;
    private javax.swing.JPanel d250;
    private javax.swing.JPanel d50;
    private javax.swing.JPanel d500;
    private javax.swing.JPanel d800;
    private javax.swing.JButton deposit;
    private javax.swing.JPanel depositpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
