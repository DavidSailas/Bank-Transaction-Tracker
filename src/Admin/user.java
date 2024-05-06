
package Admin;

import btt.loginform;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class user extends javax.swing.JFrame {

   
    public user() {
        initComponents();
        displayData();       
    }

    Color navcolor =  new Color(255,255,255);
    Color hovercolor =  new Color(102,204,255);
    
      public void displayData(){
        try{
            dbconnector connector = new dbconnector();
            ResultSet rs = connector.getData("SELECT u_id, u_fname, u_lname,u_email,u_status FROM tbl_u");
            userTbl.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
       
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        view = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        randompass = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        u_rpass = new javax.swing.JTextField();
        generateRandomPassword = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        p_add = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        p_add1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        p_add2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        p_add3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        p_add4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        p_add5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        p_add6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        adminName1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        add1 = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        view.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("VIEW DETAILS");

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        randompass.setBackground(new java.awt.Color(102, 204, 255));

        jLabel2.setText("Random Password:");

        u_rpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_rpassActionPerformed(evt);
            }
        });

        generateRandomPassword.setText("Reset");
        generateRandomPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateRandomPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout randompassLayout = new javax.swing.GroupLayout(randompass);
        randompass.setLayout(randompassLayout);
        randompassLayout.setHorizontalGroup(
            randompassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randompassLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(randompassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(u_rpass)
                    .addGroup(randompassLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(generateRandomPassword)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        randompassLayout.setVerticalGroup(
            randompassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(randompassLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(u_rpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(generateRandomPassword)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

        jScrollPane1.setViewportView(userTbl);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo-13 (1).png"))); // NOI18N

        p_add.setBackground(new java.awt.Color(102, 204, 255));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-dashboard-34.png"))); // NOI18N
        jLabel10.setText("DASHBOARD");
        p_add.add(jLabel10);
        jLabel10.setBounds(20, 0, 106, 34);

        p_add1.setBackground(new java.awt.Color(102, 204, 255));
        p_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add1MouseExited(evt);
            }
        });
        p_add1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/users-34.png"))); // NOI18N
        jLabel12.setText("USERS");
        p_add1.add(jLabel12);
        jLabel12.setBounds(20, 0, 80, 34);

        p_add2.setBackground(new java.awt.Color(102, 204, 255));
        p_add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add2MouseExited(evt);
            }
        });
        p_add2.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-admin-settings-male-34.png"))); // NOI18N
        jLabel13.setText("ADMINISTRATION");
        p_add2.add(jLabel13);
        jLabel13.setBounds(20, 0, 140, 34);

        p_add3.setBackground(new java.awt.Color(102, 204, 255));
        p_add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add3MouseExited(evt);
            }
        });
        p_add3.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-tracking-34.png"))); // NOI18N
        jLabel15.setText("TRACKER");
        p_add3.add(jLabel15);
        jLabel15.setBounds(20, 0, 90, 34);

        p_add4.setBackground(new java.awt.Color(102, 204, 255));
        p_add4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add4MouseExited(evt);
            }
        });
        p_add4.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-messages-34.png"))); // NOI18N
        jLabel14.setText("MESSAGE");
        p_add4.add(jLabel14);
        jLabel14.setBounds(20, 0, 90, 34);

        p_add5.setBackground(new java.awt.Color(102, 204, 255));
        p_add5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add5MouseExited(evt);
            }
        });
        p_add5.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-security-34.png"))); // NOI18N
        jLabel16.setText("SECURITY");
        p_add5.add(jLabel16);
        jLabel16.setBounds(20, 0, 90, 34);

        p_add6.setBackground(new java.awt.Color(102, 204, 255));
        p_add6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add6MouseExited(evt);
            }
        });
        p_add6.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Log out");
        p_add6.add(jLabel3);
        jLabel3.setBounds(30, 10, 49, 15);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_add1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(p_add6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(p_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p_add6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("USERS");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        menu.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mune-34.png"))); // NOI18N
        jPanel3.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        adminName.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel3.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 150, 30));

        adminName1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jPanel3.add(adminName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 150, 30));

        user.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-34.png"))); // NOI18N
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 30, -1));

        add1.setBackground(new java.awt.Color(102, 204, 255));
        add1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add1.setText("ADD");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(102, 204, 255));
        edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(add1)
                        .addGap(18, 18, 18)
                        .addComponent(edit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1)
                    .addComponent(edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseClicked
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add1MouseClicked

    private void p_add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseEntered
        p_add1.setBackground(navcolor);
    }//GEN-LAST:event_p_add1MouseEntered

    private void p_add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseExited
        p_add1.setBackground(hovercolor);
    }//GEN-LAST:event_p_add1MouseExited

    private void p_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseClicked
        administration a = new administration();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add2MouseClicked

    private void p_add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseEntered
        p_add2.setBackground(navcolor);
    }//GEN-LAST:event_p_add2MouseEntered

    private void p_add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseExited
        p_add2.setBackground(hovercolor);
    }//GEN-LAST:event_p_add2MouseExited

    private void p_add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseClicked
        tracker t = new tracker();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add3MouseClicked

    private void p_add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseEntered
        p_add3.setBackground(navcolor);
    }//GEN-LAST:event_p_add3MouseEntered

    private void p_add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseExited
        p_add3.setBackground(hovercolor);
    }//GEN-LAST:event_p_add3MouseExited

    private void p_add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseClicked
        message m = new message();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add4MouseClicked

    private void p_add4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseEntered
        p_add4.setBackground(navcolor);
    }//GEN-LAST:event_p_add4MouseEntered

    private void p_add4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseExited
        p_add4.setBackground(hovercolor);
    }//GEN-LAST:event_p_add4MouseExited

    private void p_add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseClicked
        security s = new security();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add5MouseClicked

    private void p_add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseEntered
        p_add5.setBackground(navcolor);
    }//GEN-LAST:event_p_add5MouseEntered

    private void p_add5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseExited
        p_add5.setBackground(hovercolor);
    }//GEN-LAST:event_p_add5MouseExited

    private void p_add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add6MouseClicked
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add6MouseClicked

    private void p_add6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add6MouseEntered
        p_add6.setBackground(navcolor);
    }//GEN-LAST:event_p_add6MouseEntered

    private void p_add6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add6MouseExited
        p_add6.setBackground(hovercolor);
    }//GEN-LAST:event_p_add6MouseExited

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        userAEU ur = new userAEU();
        ur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int rowIndex = userTbl.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select an Item!");
        }else{
            try{
            dbconnector connector = new dbconnector();
            TableModel tbl = userTbl.getModel();
            ResultSet resultSet = connector.getData("SELECT * FROM tbl_u WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
            if(resultSet.next()){
            userAEU ur = new userAEU();
            ur.u_id.setText(""+resultSet.getInt("u_id"));
            ur.u_fname.setText(""+resultSet.getString("u_fname"));
            ur.u_lname.setText(""+resultSet.getString("u_lname"));
            ur.u_email.setText(""+resultSet.getString("u_email"));
            ur.u_uname.setText(""+resultSet.getString("u_uname"));
            ur.u_pass.setText(""+resultSet.getString("u_pass"));
            ur.u_type.setSelectedItem(""+resultSet.getString("u_type"));
            ur.u_status.setSelectedItem(""+resultSet.getString("u_status"));
            ur.add.setEnabled(false);
            ur.update.setEnabled(true);
            ur.setVisible(true);
            this.dispose();
            } 
        }catch(SQLException ex){
                System.out.println(""+ex);
        }
    } 
    }//GEN-LAST:event_editActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
                
        session sess = session.getInstance();
        
        if (sess.getUid() == 0){
            JOptionPane.showMessageDialog(null,"No account, Login First!");
            loginform ads = new loginform();
            ads.setVisible(true);
            this.dispose();
        }else{
            adminName.setText(""+sess.getFname());
            adminName1.setText(""+sess.getLname());
        
        } 
    }//GEN-LAST:event_formWindowActivated

    private void u_rpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_rpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_rpassActionPerformed

    private void generateRandomPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateRandomPasswordActionPerformed

dbconnector connector = new dbconnector();
String userId = "theUserId"; 

if (connector.resetUserPassword(userId)) {
    String newPassword = connector.getNewPassword();
    u_rpass.setText(newPassword); 
    JOptionPane.showMessageDialog(null, "New Password: " + newPassword);
} else {
    // Handle password reset failure
}
    
    }//GEN-LAST:event_generateRandomPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    public javax.swing.JLabel adminName;
    public javax.swing.JLabel adminName1;
    private javax.swing.JButton edit;
    private javax.swing.JButton generateRandomPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel menu;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_add1;
    private javax.swing.JPanel p_add2;
    private javax.swing.JPanel p_add3;
    private javax.swing.JPanel p_add4;
    private javax.swing.JPanel p_add5;
    private javax.swing.JPanel p_add6;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JPanel randompass;
    private javax.swing.JTextField u_rpass;
    public javax.swing.JLabel user;
    private javax.swing.JTable userTbl;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}
