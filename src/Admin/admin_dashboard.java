
package Admin;

import Admin.message;
import Admin.security;
import Admin.tracker;
import Admin.user;
import btt.loginform;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class admin_dashboard extends javax.swing.JFrame {

    public admin_dashboard() {
        initComponents();
        displayData();
        displaystat();
    }

    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229);
          
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
        jLabel25 = new javax.swing.JLabel();
        umail = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        color1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        color2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        color3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        color4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        color5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        color6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ttluser = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        active = new javax.swing.JLabel();
        plus1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pending = new javax.swing.JLabel();
        plus2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();

        viewpanel.setBackground(new java.awt.Color(0, 92, 229));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROFILE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User ID:");

        uid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uid.setForeground(new java.awt.Color(255, 255, 255));
        uid.setText("sample");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fullname:");

        fullname1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fullname1.setForeground(new java.awt.Color(255, 255, 255));
        fullname1.setText("sample");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username:");

        username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("sample");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Email:");

        umail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        umail.setForeground(new java.awt.Color(255, 255, 255));
        umail.setText("sample");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Type:");

        type.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setText("sample");

        javax.swing.GroupLayout viewpanelLayout = new javax.swing.GroupLayout(viewpanel);
        viewpanel.setLayout(viewpanelLayout);
        viewpanelLayout.setHorizontalGroup(
            viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(umail))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(type))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        viewpanelLayout.setVerticalGroup(
            viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
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
                    .addComponent(jLabel25)
                    .addComponent(umail))
                .addGap(27, 27, 27)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(type))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(236, 236, 236));

        jPanel6.setBackground(new java.awt.Color(0, 92, 229));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logo-13 (1).png"))); // NOI18N

        color1.setBackground(new java.awt.Color(0, 92, 229));
        color1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color1MouseExited(evt);
            }
        });
        color1.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard-25.png"))); // NOI18N
        jLabel15.setText(" DASHBOARD");
        color1.add(jLabel15);
        jLabel15.setBounds(20, 0, 110, 40);

        color2.setBackground(new java.awt.Color(0, 92, 229));
        color2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color2MouseExited(evt);
            }
        });
        color2.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/users-25.png"))); // NOI18N
        jLabel16.setText(" USERS");
        color2.add(jLabel16);
        jLabel16.setBounds(20, 0, 70, 40);

        color3.setBackground(new java.awt.Color(0, 92, 229));
        color3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color3MouseExited(evt);
            }
        });
        color3.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/location-24.png"))); // NOI18N
        jLabel17.setText("TRACKER");
        color3.add(jLabel17);
        jLabel17.setBounds(20, 0, 80, 40);

        color4.setBackground(new java.awt.Color(0, 92, 229));
        color4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color4MouseExited(evt);
            }
        });
        color4.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/messages-24.png"))); // NOI18N
        jLabel18.setText(" MESSAGE");
        color4.add(jLabel18);
        jLabel18.setBounds(20, 0, 90, 40);

        color5.setBackground(new java.awt.Color(0, 92, 229));
        color5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color5MouseExited(evt);
            }
        });
        color5.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/protect-24.png"))); // NOI18N
        jLabel19.setText("SECURITY");
        color5.add(jLabel19);
        jLabel19.setBounds(20, 0, 90, 40);

        color6.setBackground(new java.awt.Color(0, 92, 229));
        color6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                color6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                color6MouseExited(evt);
            }
        });
        color6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-25.png"))); // NOI18N
        jLabel3.setText("Log out");
        color6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color6, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(color1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(color2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(color3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(color4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(color5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(color6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 92, 229));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel7.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        fullname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        fullname.setText("Fullname");
        jPanel7.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 280, 30));

        user.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        jPanel7.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 30, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Hello,");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Welcome to your Admin Dashboard!");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Your command center for seamless management");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("and real-time insights into banking transactions ");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("awaits you.");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 92, 229));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user-folder-25.png"))); // NOI18N
        jLabel2.setText(" USER COUNT");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, -1));

        ttluser.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ttluser.setForeground(new java.awt.Color(255, 255, 255));
        ttluser.setText("0");
        jPanel8.add(ttluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        plus.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel8.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 184));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/checked-user-male-25.png"))); // NOI18N
        jLabel4.setText(" ACTIVE USERS");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        active.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        active.setForeground(new java.awt.Color(0, 51, 184));
        active.setText("0");
        jPanel9.add(active, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        plus1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel9.add(plus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 184));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user-clock-25.png"))); // NOI18N
        jLabel5.setText(" PENDING USERS");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, -1));

        pending.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pending.setForeground(new java.awt.Color(0, 51, 184));
        pending.setText("0");
        jPanel10.add(pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        plus2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel10.add(plus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 184));
        jLabel9.setText("Dashboard");

        profile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        profile.setForeground(new java.awt.Color(0, 51, 184));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male-user-24.png"))); // NOI18N
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(profile))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(profile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void color1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color1MouseClicked

    private void color1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseEntered
        color1.setBackground(navcolor);
    }//GEN-LAST:event_color1MouseEntered

    private void color1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseExited
        color1.setBackground(hovercolor);
    }//GEN-LAST:event_color1MouseExited

    private void color2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseClicked
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color2MouseClicked

    private void color2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseEntered
        color2.setBackground(navcolor);
    }//GEN-LAST:event_color2MouseEntered

    private void color2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseExited
        color2.setBackground(hovercolor);
    }//GEN-LAST:event_color2MouseExited

    private void color3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseClicked
        tracker t = new tracker();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color3MouseClicked

    private void color3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseEntered
        color3.setBackground(navcolor);
    }//GEN-LAST:event_color3MouseEntered

    private void color3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseExited
        color3.setBackground(hovercolor);
    }//GEN-LAST:event_color3MouseExited

    private void color4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseClicked
        message m = new message();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color4MouseClicked

    private void color4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseEntered
        color4.setBackground(navcolor);
    }//GEN-LAST:event_color4MouseEntered

    private void color4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseExited
        color4.setBackground(hovercolor);
    }//GEN-LAST:event_color4MouseExited

    private void color5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseClicked
        security s = new security();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color5MouseClicked

    private void color5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseEntered
        color5.setBackground(navcolor);
    }//GEN-LAST:event_color5MouseEntered

    private void color5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseExited
        color5.setBackground(hovercolor);
    }//GEN-LAST:event_color5MouseExited

    private void color6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color6MouseClicked

        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color6MouseClicked

    private void color6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color6MouseEntered
        color6.setBackground(navcolor);
    }//GEN-LAST:event_color6MouseEntered

    private void color6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color6MouseExited
        color6.setBackground(hovercolor);
    }//GEN-LAST:event_color6MouseExited

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked

    }//GEN-LAST:event_userMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked

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
    }//GEN-LAST:event_profileMouseClicked

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
    private javax.swing.JPanel color1;
    private javax.swing.JPanel color2;
    private javax.swing.JPanel color3;
    private javax.swing.JPanel color4;
    private javax.swing.JPanel color5;
    private javax.swing.JPanel color6;
    public javax.swing.JLabel fullname;
    private javax.swing.JLabel fullname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    public javax.swing.JLabel menu;
    private javax.swing.JLabel pending;
    public javax.swing.JLabel plus;
    public javax.swing.JLabel plus1;
    public javax.swing.JLabel plus2;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel ttluser;
    private javax.swing.JLabel type;
    private javax.swing.JLabel uid;
    private javax.swing.JLabel umail;
    public javax.swing.JLabel user;
    private javax.swing.JLabel username;
    private javax.swing.JPanel viewpanel;
    // End of variables declaration//GEN-END:variables
}
