
package Admin;



import config.dbconnector;
import java.awt.Color;
import java.awt.Component;
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



public class report extends javax.swing.JFrame {

    public report() {
        initComponents();
        displayReports();
        DefaultTableModel model = (DefaultTableModel) reportsTbl.getModel();
    }
    


    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229);
    
public void displayReports() {
    try {
        dbconnector dbc = new dbconnector();
        String query = "SELECT c.c_id, CONCAT(u.u_fname, ' ', u.u_lname) AS user_name, " +
                       "c.c_type, c.c_status, c.c_content, c.c_date_time, c.c_from, c.c_to " +
                       "FROM tbl_communication c " +
                       "JOIN tbl_u u ON c.u_id = u.u_id " +
                       "ORDER BY c.c_date_time DESC";
        ResultSet rs = dbc.getData(query);
        DefaultTableModel model = (DefaultTableModel) reportsTbl.getModel();
        reportsTbl.setModel(DbUtils.resultSetToTableModel(rs));

        JTableHeader th = reportsTbl.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0); // c_id
        TableColumn tc1 = tcm.getColumn(1); // user_name
        TableColumn tc2 = tcm.getColumn(2); // c_type
        TableColumn tc3 = tcm.getColumn(3); // c_status
        TableColumn tc4 = tcm.getColumn(4); // c_content
        TableColumn tc5 = tcm.getColumn(5); // c_date_time
        TableColumn tc6 = tcm.getColumn(6); // c_from
        TableColumn tc7 = tcm.getColumn(7); // c_to

        tc0.setHeaderValue("ID");
        tc1.setHeaderValue("User");
        tc2.setHeaderValue("Type");
        tc3.setHeaderValue("Status");
        tc4.setHeaderValue("Content");
        tc5.setHeaderValue("Date Time");
        tc6.setHeaderValue("From");
        tc7.setHeaderValue("To");


        reportsTbl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = table.getValueAt(row, 3).toString();
                if ("unread".equalsIgnoreCase(status)) {
                    label.setForeground(Color.BLACK);
                } else if ("read".equalsIgnoreCase(status)) {
                    label.setForeground(Color.GRAY);
                }
                return label;
            }
        });

        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MessagePanel = new javax.swing.JPanel();
        from = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textmessage = new javax.swing.JTextArea();
        Send = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        u_id = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        sendto = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        popUp = new javax.swing.JPopupMenu();
        Unread = new javax.swing.JMenuItem();
        Read = new javax.swing.JMenuItem();
        View = new javax.swing.JMenuItem();
        ViewPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        reportsTbl = new javax.swing.JTable();
        message = new javax.swing.JLabel();

        MessagePanel.setBackground(new java.awt.Color(255, 255, 255));
        MessagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        from.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        from.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });
        MessagePanel.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 470, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("___________________________________________________________________");
        MessagePanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 470, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("From:");
        MessagePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, 20));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Message");
        MessagePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        textmessage.setColumns(20);
        textmessage.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textmessage.setRows(5);
        jScrollPane2.setViewportView(textmessage);

        MessagePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 480, 240));

        Send.setBackground(new java.awt.Color(0, 51, 184));
        Send.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Send.setForeground(new java.awt.Color(255, 255, 255));
        Send.setText("SEND");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        MessagePanel.add(Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 30));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/cross-small.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        MessagePanel.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 19, -1, -1));

        u_id.setForeground(new java.awt.Color(255, 255, 255));
        u_id.setText("jLabel3");
        MessagePanel.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 500, 10));

        type.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 102));
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Report", "Message", "Request" }));
        MessagePanel.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 100, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("To:");
        MessagePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        sendto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        sendto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sendto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendtoActionPerformed(evt);
            }
        });
        MessagePanel.add(sendto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("___________________________________________________________________");
        MessagePanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 470, 30));

        Unread.setText("Mark as unread");
        Unread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnreadActionPerformed(evt);
            }
        });
        popUp.add(Unread);

        Read.setText("Mark as read");
        Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadActionPerformed(evt);
            }
        });
        popUp.add(Read);

        View.setText("View");
        popUp.add(View);

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 450));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 184));
        jLabel9.setText("Reports");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 11, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 92, 229));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo-13.png"))); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 120));

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

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/house-chimney (1).png"))); // NOI18N
        jLabel15.setText(" DASHBOARD");
        color1.add(jLabel15);
        jLabel15.setBounds(0, 0, 180, 40);

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

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/users.png"))); // NOI18N
        jLabel16.setText(" ACCOUNTANT");
        color2.add(jLabel16);
        jLabel16.setBounds(0, 0, 180, 40);

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

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/assessment.png"))); // NOI18N
        jLabel17.setText(" TRACKER");
        color3.add(jLabel17);
        jLabel17.setBounds(0, 0, 160, 40);

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

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/file-circle-info (1).png"))); // NOI18N
        jLabel18.setText(" REPORT");
        color4.add(jLabel18);
        jLabel18.setBounds(0, 0, 150, 40);

        jPanel6.add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        reportsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        reportsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reportsTblMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(reportsTbl);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 61, 771, 368));

        message.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        message.setForeground(new java.awt.Color(0, 51, 184));
        message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/comment-alt-dots.png"))); // NOI18N
        message.setText("Message");
        message.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messageMouseClicked(evt);
            }
        });
        jPanel3.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        report m = new report();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_color4MouseClicked

    private void color4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseEntered
        color4.setBackground(navcolor);
    }//GEN-LAST:event_color4MouseEntered

    private void color4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color4MouseExited
        color4.setBackground(hovercolor);
    }//GEN-LAST:event_color4MouseExited

    private void messageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messageMouseClicked
        Object[] options = {};
        JOptionPane.showOptionDialog(null, MessagePanel, "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, null);
    }//GEN-LAST:event_messageMouseClicked

    private void reportsTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsTblMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
        popUp.show(reportsTbl, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_reportsTblMousePressed

    private void UnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnreadActionPerformed
                DefaultTableModel model = (DefaultTableModel) reportsTbl.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.setValueAt("unread", i, 3); // Assuming status is in column index 3
        }
    }//GEN-LAST:event_UnreadActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        
    }//GEN-LAST:event_fromActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        report r = new report();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadActionPerformed
               DefaultTableModel model = (DefaultTableModel) reportsTbl.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.setValueAt("read", i, 3); // Assuming status is in column index 3
        }
    }//GEN-LAST:event_ReadActionPerformed

    private int getUserIdByEmail(String email) throws SQLException {
    dbconnector dbc = new dbconnector();
    String query = "SELECT u_id FROM tbl_u WHERE u_email = ?";
    PreparedStatement statement = dbc.connect.prepareStatement(query);
    statement.setString(1, email);
    ResultSet rs = statement.executeQuery();
    if (rs.next()) {
        return rs.getInt("u_id");
    } else {
        throw new SQLException("User with email " + email + " not found.");
    }
}
    
    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
                
        String sender = from.getText(); // From
    String recipient = sendto.getText(); // To
    String messageType = type.getSelectedItem().toString(); // Type
    String messageContent = textmessage.getText(); // Message

    // Check if any field is empty
    if (sender.isEmpty() || recipient.isEmpty() || messageType.isEmpty() || messageContent.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Insert the message into the database
    try {
        dbconnector dbc = new dbconnector();
        String query = "INSERT INTO tbl_communication (u_id, c_type, c_status, c_content, c_date_time, c_from, c_to) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = dbc.connect.prepareStatement(query);
        // Assuming you have a method to retrieve the user ID based on the sender's email
        int userId = getUserIdByEmail(sender); // Implement this method according to your database structure
        statement.setInt(1, userId);
        statement.setString(2, messageType);
        statement.setString(3, "unread"); // Assuming the default status is "unread"
        statement.setString(4, messageContent);
        statement.setTimestamp(5, new Timestamp(System.currentTimeMillis())); // Current timestamp
        statement.setString(6, sender);
        statement.setString(7, recipient);
        statement.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Message sent successfully!");
        
        // Optionally, you can clear the fields after sending the message
        from.setText("");
        sendto.setText("");
        type.setSelectedIndex(0);
        textmessage.setText("");
        
        // Update the displayed reports
        displayReports();
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }

    }//GEN-LAST:event_SendActionPerformed

    private void sendtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendtoActionPerformed

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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MessagePanel;
    private javax.swing.JMenuItem Read;
    private javax.swing.JButton Send;
    private javax.swing.JMenuItem Unread;
    private javax.swing.JMenuItem View;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JLabel close;
    private javax.swing.JPanel color1;
    private javax.swing.JPanel color2;
    private javax.swing.JPanel color3;
    private javax.swing.JPanel color4;
    public javax.swing.JTextField from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel message;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JTable reportsTbl;
    public javax.swing.JTextField sendto;
    private javax.swing.JTextArea textmessage;
    public javax.swing.JComboBox<String> type;
    private javax.swing.JLabel u_id;
    // End of variables declaration//GEN-END:variables
}
