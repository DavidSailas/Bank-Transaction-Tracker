package Admin;

import btt.loginform;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import javax.swing.JOptionPane;

public class admin_dashboard extends javax.swing.JFrame {

    public admin_dashboard() {
        initComponents();
         displayData();
         displaystat();
    }

    Color navcolor =  new Color(255,255,255);
    Color hovercolor =  new Color(102,204,255);
          
    public void displayData(){
        
    try{
        dbconnector connector = new dbconnector();
        ResultSet rs = connector.getData("SELECT COUNT(*) AS total FROM tbl_u");
        if(rs.next()){
            int totalUsers = rs.getInt("total");
            ttluser.setText("" + totalUsers);
        }
        rs.close();
    }catch(SQLException ex){
        System.out.println("Errors: "+ex.getMessage());
    }
}
     public void displaystat() {
             
        dbconnector connector = new dbconnector();

    try {
       
       ResultSet rs = connector.getData("SELECT COUNT(*) AS TotalActiveUsers FROM tbl_u WHERE u_status = 'Active'");
 
     if (rs.next()) {
            int activeCount = rs.getInt("TotalActiveUsers");
            active.setText(" " + activeCount);
        } else {
            System.out.println("No active users found!");
        }
        rs.close();
 
        ResultSet rs1 = connector.getData("SELECT COUNT(*) AS TotalInactiveUsers FROM tbl_u WHERE u_status = 'Pending'");
 
        if (rs1.next()) {
            int inactiveCount = rs1.getInt("TotalInactiveUsers");
            pending.setText(" " + inactiveCount);
        } else {
            System.out.println("No inactive users found!");
        }
        rs1.close();

    } catch (SQLException ex) {
        System.out.println("Connection Error: " + ex);
    }

     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        viewpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fullname1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        umail = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        menu = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ttluser = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        active = new javax.swing.JLabel();
        plus1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pending = new javax.swing.JLabel();
        plus2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        viewpanel.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("VIEW DETAILS");

        jLabel6.setText("user id:");

        uid.setText("sample");

        jLabel7.setText("fullname:");

        fullname1.setText("sample");

        jLabel8.setText("username:");

        username.setText("sample");

        jLabel18.setText("Email:");

        umail.setText("sample");

        jLabel19.setText("Type:");

        type.setText("sample");

        javax.swing.GroupLayout viewpanelLayout = new javax.swing.GroupLayout(viewpanel);
        viewpanel.setLayout(viewpanelLayout);
        viewpanelLayout.setHorizontalGroup(
            viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uid))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fullname1))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(username))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(umail))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(type)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        viewpanelLayout.setVerticalGroup(
            viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(uid))
                .addGap(27, 27, 27)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fullname1))
                .addGap(27, 27, 27)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(username))
                .addGap(27, 27, 27)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(umail))
                .addGap(27, 27, 27)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(type))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));

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
        jLabel12.setBounds(20, 0, 70, 34);

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
        p_add6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Log out");
        p_add6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_add1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_add5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(p_add6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(p_add6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mune-34.png"))); // NOI18N
        jPanel3.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        fullname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fullname.setText("sample");
        jPanel3.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, 30));

        userName.setFont(new java.awt.Font("Microsoft Himalaya", 1, 22)); // NOI18N
        userName.setText("sample");
        jPanel3.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 60, 20));

        user.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-34.png"))); // NOI18N
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 30, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Welcome");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER COUNT");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        ttluser.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ttluser.setForeground(new java.awt.Color(255, 255, 255));
        ttluser.setText("0");
        jPanel5.add(ttluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        plus.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/total user.png"))); // NOI18N
        jPanel5.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("ACTIVE USERS");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        active.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        active.setText("0");
        jPanel6.add(active, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        plus1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        plus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/active.png"))); // NOI18N
        jPanel6.add(plus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("PENDING USERS");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        pending.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pending.setText("0");
        jPanel7.add(pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        plus2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        plus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pending.png"))); // NOI18N
        jPanel7.add(plus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        session sess = session.getInstance();
        
        if (sess.getUid() == 0){
            JOptionPane.showMessageDialog(null,"No account, Login First!");
            loginform ads = new loginform();
            ads.setVisible(true);
            this.dispose();
        }else{
            fullname.setText(sess.getFname() + " " + sess.getLname());
            userName.setText(""+sess.getUsername());
           
        } 
    }//GEN-LAST:event_formWindowActivated

    private void p_add5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseExited
        p_add5.setBackground(hovercolor);
    }//GEN-LAST:event_p_add5MouseExited

    private void p_add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseEntered
        p_add5.setBackground(navcolor);
    }//GEN-LAST:event_p_add5MouseEntered

    private void p_add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseClicked
        security s = new security();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add5MouseClicked

    private void p_add4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseExited
        p_add4.setBackground(hovercolor);
    }//GEN-LAST:event_p_add4MouseExited

    private void p_add4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseEntered
        p_add4.setBackground(navcolor);
    }//GEN-LAST:event_p_add4MouseEntered

    private void p_add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseClicked
        message m = new message();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add4MouseClicked

    private void p_add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseExited
        p_add3.setBackground(hovercolor);
    }//GEN-LAST:event_p_add3MouseExited

    private void p_add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseEntered
        p_add3.setBackground(navcolor);
    }//GEN-LAST:event_p_add3MouseEntered

    private void p_add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseClicked
        tracker t = new tracker();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add3MouseClicked

    private void p_add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseExited
        p_add2.setBackground(hovercolor);
    }//GEN-LAST:event_p_add2MouseExited

    private void p_add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseEntered
        p_add2.setBackground(navcolor);
    }//GEN-LAST:event_p_add2MouseEntered

    private void p_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseClicked
        administration a = new administration();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add2MouseClicked

    private void p_add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseExited
        p_add1.setBackground(hovercolor);
    }//GEN-LAST:event_p_add1MouseExited

    private void p_add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseEntered
        p_add1.setBackground(navcolor);
    }//GEN-LAST:event_p_add1MouseEntered

    private void p_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseClicked
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add1MouseClicked

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

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

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked

        session sess = session.getInstance();

        if (sess.getUid() > 0) {
            
            uid.setText(String.valueOf(sess.getUid())); 
            fullname.setText(sess.getFname() + " " + sess.getLname());
            username.setText(sess.getUsername());
            umail.setText(sess.getEmail());
            type.setText(sess.getType());
        }

        JOptionPane.showOptionDialog(null, viewpanel, "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, new Object[]{}, null);

    }//GEN-LAST:event_userMouseClicked

    
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
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel active;
    public javax.swing.JLabel fullname;
    private javax.swing.JLabel fullname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    public javax.swing.JLabel menu;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_add1;
    private javax.swing.JPanel p_add2;
    private javax.swing.JPanel p_add3;
    private javax.swing.JPanel p_add4;
    private javax.swing.JPanel p_add5;
    private javax.swing.JPanel p_add6;
    private javax.swing.JLabel pending;
    public javax.swing.JLabel plus;
    public javax.swing.JLabel plus1;
    public javax.swing.JLabel plus2;
    private javax.swing.JLabel ttluser;
    private javax.swing.JLabel type;
    private javax.swing.JLabel uid;
    private javax.swing.JLabel umail;
    public javax.swing.JLabel user;
    public javax.swing.JLabel userName;
    private javax.swing.JLabel username;
    private javax.swing.JPanel viewpanel;
    // End of variables declaration//GEN-END:variables
}
