
package User;

import btt.loginform;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.awt.Component;
import java.awt.Window;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;


public class inbox extends javax.swing.JFrame {

    public inbox() {
        initComponents();
        displayInbox();
        DefaultTableModel model = (DefaultTableModel) inboxTbl.getModel();
    }
    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229);
    
    Color lg =  new Color(204,204,204);
    Color bg =  new Color(255,255,255);
    
        private String getUId() {
        session sess = session.getInstance();
        int u_id = sess.getUid();
        return String.valueOf(u_id);
    }
        
    private void displayInbox() {
    String loggedInUId = getUId(); 

    try {
        dbconnector dbc = new dbconnector();
        String query = "SELECT c.c_id, CONCAT(u.u_fname, ' ', u.u_lname) AS admin_name, " +
                       "c.c_type, c.c_status, c.c_content, c.c_date_time " +
                       "FROM tbl_communication c " +
                       "JOIN tbl_u u ON c.c_from = u.u_id " +
                       "WHERE u.u_type = 'admin' AND c.c_to = ? " +
                       "ORDER BY c.c_date_time DESC";

        try (PreparedStatement pst = dbc.connect.prepareStatement(query)) {
            pst.setString(1, loggedInUId);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) inboxTbl.getModel();
            inboxTbl.setModel(DbUtils.resultSetToTableModel(rs));

            JTableHeader th = inboxTbl.getTableHeader();
            TableColumnModel tcm = th.getColumnModel();

            TableColumn tc0 = tcm.getColumn(0); // c_id
            TableColumn tc1 = tcm.getColumn(1); // admin_name
            TableColumn tc2 = tcm.getColumn(2); // c_type
            TableColumn tc3 = tcm.getColumn(3); // c_status
            TableColumn tc4 = tcm.getColumn(4); // c_content
            TableColumn tc5 = tcm.getColumn(5); // c_date_time

            tc0.setHeaderValue("ID");
            tc1.setHeaderValue("Admin");
            tc2.setHeaderValue("Type");
            tc3.setHeaderValue("Status");
            tc4.setHeaderValue("Content");
            tc5.setHeaderValue("Date Time");

            inboxTbl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    String status = table.getValueAt(row, 3).toString(); // Get the status from the c_status column
                    if ("unread".equalsIgnoreCase(status)) {
                        label.setForeground(Color.BLACK);
                    } else if ("read".equalsIgnoreCase(status)) {
                        label.setForeground(Color.GRAY);
                    }
                    return label;
                }
            });

            rs.close();
        }
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportPanel = new javax.swing.JPanel();
        otherreport = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Send = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pcolor1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        popUp = new javax.swing.JPopupMenu();
        View = new javax.swing.JMenuItem();
        ViewPanel = new javax.swing.JPanel();
        requestPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        color1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        color2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        color3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        color4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        color5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inboxTbl = new javax.swing.JTable();
        Request = new javax.swing.JLabel();
        Reports = new javax.swing.JLabel();

        reportPanel.setBackground(new java.awt.Color(255, 255, 255));
        reportPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        otherreport.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        otherreport.setForeground(new java.awt.Color(0, 0, 102));
        otherreport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        otherreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherreportActionPerformed(evt);
            }
        });
        reportPanel.add(otherreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 470, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("____________________________________________________________________");
        reportPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 470, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        reportPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        Send.setBackground(new java.awt.Color(0, 51, 184));
        Send.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Send.setForeground(new java.awt.Color(255, 255, 255));
        Send.setText("SEND");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        reportPanel.add(Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 35));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/cross-small.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        reportPanel.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel3");
        reportPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 500, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("OTHER");
        reportPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 20));

        pcolor1.setBackground(new java.awt.Color(255, 255, 255));
        pcolor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcolor1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pcolor1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pcolor1MouseExited(evt);
            }
        });
        pcolor1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("TRANSACTION SCAM");
        pcolor1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(">");
        pcolor1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 50, 50));

        reportPanel.add(pcolor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 480, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 184));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/triangle-warning.png"))); // NOI18N
        jLabel2.setText(" REPORT");
        reportPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        View.setText("View");
        popUp.add(View);

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        requestPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 184));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/file-edit.png"))); // NOI18N
        jLabel4.setText(" REQUEST");

        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/cross-small.png"))); // NOI18N
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout requestPanelLayout = new javax.swing.GroupLayout(requestPanel);
        requestPanel.setLayout(requestPanelLayout);
        requestPanelLayout.setHorizontalGroup(
            requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                .addComponent(close1)
                .addContainerGap())
        );
        requestPanelLayout.setVerticalGroup(
            requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(requestPanelLayout.createSequentialGroup()
                .addGroup(requestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(requestPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(close1))
                    .addGroup(requestPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)))
                .addContainerGap(445, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 450));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Inbox");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 11, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 92, 229));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel15.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/house-chimney (1).png"))); // NOI18N
        jLabel15.setText(" DASHBOARD");
        color1.add(jLabel15);
        jLabel15.setBounds(0, 0, 170, 40);

        jPanel6.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 40));

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

        jLabel17.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt.png"))); // NOI18N
        jLabel17.setText(" TRANSACTION");
        color2.add(jLabel17);
        jLabel17.setBounds(0, 0, 180, 40);

        jPanel6.add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 40));

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

        jLabel18.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/envelope (1).png"))); // NOI18N
        jLabel18.setText(" INBOX");
        color3.add(jLabel18);
        jLabel18.setBounds(0, 0, 140, 40);

        jPanel6.add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 180, 40));

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

        jLabel19.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/settings.png"))); // NOI18N
        jLabel19.setText(" SETTINGS");
        color4.add(jLabel19);
        jLabel19.setBounds(0, 0, 160, 40);

        jPanel6.add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 40));

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
        color5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        jLabel3.setText("LOG OUT");
        color5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        jPanel6.add(color5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 180, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo-13.png"))); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 120));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        inboxTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        inboxTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inboxTblMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(inboxTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 63, 758, 360));

        Request.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Request.setForeground(new java.awt.Color(0, 51, 184));
        Request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/file-edit.png"))); // NOI18N
        Request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RequestMouseClicked(evt);
            }
        });
        jPanel1.add(Request, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        Reports.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Reports.setForeground(new java.awt.Color(0, 51, 184));
        Reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/triangle-warning.png"))); // NOI18N
        Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportsMouseClicked(evt);
            }
        });
        jPanel1.add(Reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, -1));

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

    private void color1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseClicked
        user_dashboard uds = new user_dashboard();
        uds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color1MouseClicked

    private void color1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseEntered
        color1.setBackground(navcolor);
    }//GEN-LAST:event_color1MouseEntered

    private void color1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color1MouseExited
        color1.setBackground(hovercolor);
    }//GEN-LAST:event_color1MouseExited

    private void color2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseClicked
        transaction t = new transaction();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color2MouseClicked

    private void color2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseEntered
        color2.setBackground(navcolor);
    }//GEN-LAST:event_color2MouseEntered

    private void color2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color2MouseExited
        color2.setBackground(hovercolor);
    }//GEN-LAST:event_color2MouseExited

    private void color3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseClicked
        inbox l = new inbox();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color3MouseClicked

    private void color3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseEntered
        color3.setBackground(navcolor);
    }//GEN-LAST:event_color3MouseEntered

    private void color3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color3MouseExited
        color3.setBackground(hovercolor);
    }//GEN-LAST:event_color3MouseExited

    private void color4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseClicked
        settings s = new settings();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color4MouseClicked

    private void color4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseEntered
        color4.setBackground(navcolor);
    }//GEN-LAST:event_color4MouseEntered

    private void color4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseExited
        color4.setBackground(hovercolor);
    }//GEN-LAST:event_color4MouseExited

    private void color5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseClicked
        session sess = session.getInstance();
        
        int userId = sess.getUid();
        
        logEvent(userId, "LOGOUT", "User logged out");
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color5MouseClicked

    private void color5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseEntered
        color5.setBackground(navcolor);
    }//GEN-LAST:event_color5MouseEntered

    private void color5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color5MouseExited
        color5.setBackground(hovercolor);
    }//GEN-LAST:event_color5MouseExited

    private void otherreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherreportActionPerformed
    String report = otherreport.getText().trim();
    if (!report.isEmpty()) {
        try {
            
            updateCContentInDatabase(report);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid report.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_otherreportActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        inbox i = new inbox();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void inboxTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inboxTblMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
        popUp.show(inboxTbl, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_inboxTblMousePressed

private String loggedInUId = getUId();

private void updateCContentInDatabase(String content) {
    if (loggedInUId.isEmpty()) {
        System.out.println("No valid user ID set.");
        return;
    }

    try {
        dbconnector dbc = new dbconnector();
        String query = "UPDATE tbl_communication SET c_content = ? WHERE c_to = ?";
        try (PreparedStatement pst = dbc.connect.prepareStatement(query)) {
            pst.setString(1, content);
            pst.setString(2, loggedInUId);
            pst.executeUpdate();
        }
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed

    otherreportActionPerformed(evt);

    displayInbox();

    Window window = SwingUtilities.getWindowAncestor(reportPanel);
    window.dispose();
    
    }//GEN-LAST:event_SendActionPerformed

    private void RequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestMouseClicked
        
        Object[] options = {};
        JOptionPane.showOptionDialog(null, requestPanel, "",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options, null);
    }//GEN-LAST:event_RequestMouseClicked

    private void ReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseClicked
  
        Object[] options = {};
        JOptionPane.showOptionDialog(null, reportPanel, "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, null); 
        
        
    }//GEN-LAST:event_ReportsMouseClicked

    private void pcolor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseClicked
    String scamReport = "Transaction Scam";
    updateCContentInDatabase(scamReport);
    
    Window window = SwingUtilities.getWindowAncestor(reportPanel);
    window.dispose();
    }//GEN-LAST:event_pcolor1MouseClicked

    private void pcolor1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseEntered
        pcolor1.setBackground(lg);
    }//GEN-LAST:event_pcolor1MouseEntered

    private void pcolor1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseExited
        pcolor1.setBackground(bg);
    }//GEN-LAST:event_pcolor1MouseExited

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        inbox i = new inbox();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_close1MouseClicked

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
            java.util.logging.Logger.getLogger(inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Reports;
    private javax.swing.JLabel Request;
    private javax.swing.JButton Send;
    private javax.swing.JMenuItem View;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JPanel color1;
    private javax.swing.JPanel color2;
    private javax.swing.JPanel color3;
    private javax.swing.JPanel color4;
    private javax.swing.JPanel color5;
    private javax.swing.JTable inboxTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField otherreport;
    private javax.swing.JPanel pcolor1;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JPanel requestPanel;
    // End of variables declaration//GEN-END:variables
}
