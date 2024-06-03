/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PC
 */
public class archivedusers extends javax.swing.JFrame {

 
    public archivedusers() {
        initComponents();
        displayData();
        DefaultTableModel model = (DefaultTableModel) archiveTbl.getModel();
    }

public void displayData() {
    try {
        dbconnector connector = new dbconnector();
        ResultSet rs = connector.getData("SELECT u_id, u_fname, u_lname, u_status FROM tbl_u WHERE u_status = 'Archived'");
        
        DefaultTableModel model = (DefaultTableModel) archiveTbl.getModel();
        model.setRowCount(0); 
        
        
        model.setColumnIdentifiers(new String[]{"ID", "First Name", "Last Name", "Status"});
        
        
        while (rs.next()) {
            String[] rowData = new String[4];
            rowData[0] = rs.getString("u_id");
            rowData[1] = rs.getString("u_fname");
            rowData[2] = rs.getString("u_lname");
            rowData[3] = rs.getString("u_status");
            model.addRow(rowData);
        }

        
        archiveTbl.setModel(model);
        
        
        archiveTbl.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = (String) table.getValueAt(row, 3);
                if (status != null) {
                    if (status.equals("Archived")) {
                        setForeground(Color.RED);
                    } else {
                        // Default text color for other statuses
                        setForeground(table.getForeground());
                    }
                }
                return c;
            }
        });

        // Set custom column headers
        JTableHeader th = archiveTbl.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        tcm.getColumn(0).setHeaderValue("ID");
        tcm.getColumn(1).setHeaderValue("First Name");
        tcm.getColumn(2).setHeaderValue("Last Name");
        tcm.getColumn(3).setHeaderValue("Status");
        
        // Refresh the table header to show new column names
        th.repaint();

        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        view = new javax.swing.JMenuItem();
        unarchive = new javax.swing.JMenuItem();
        viewpanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        u_id = new javax.swing.JLabel();
        fullname2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        umail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stats = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        confirmunarchive = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        noBT = new javax.swing.JButton();
        yesBT1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        archiveTbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        popUp.add(view);

        unarchive.setText("Unarchive");
        unarchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unarchiveActionPerformed(evt);
            }
        });
        popUp.add(unarchive);

        viewpanel.setBackground(new java.awt.Color(255, 255, 255));
        viewpanel.setMinimumSize(new java.awt.Dimension(420, 300));
        viewpanel.setPreferredSize(new java.awt.Dimension(420, 300));
        viewpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Id:");
        viewpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        u_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        u_id.setForeground(new java.awt.Color(0, 0, 102));
        u_id.setText("sample");
        viewpanel.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        fullname2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullname2.setForeground(new java.awt.Color(0, 0, 102));
        fullname2.setText("Fullname");
        viewpanel.add(fullname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Username:");
        viewpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 102));
        username.setText("sample");
        viewpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Email:");
        viewpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        umail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        umail.setForeground(new java.awt.Color(0, 0, 102));
        umail.setText("sample");
        viewpanel.add(umail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Type:");
        viewpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 102));
        type.setText("sample");
        viewpanel.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Status:");
        viewpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        stats.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stats.setForeground(new java.awt.Color(0, 0, 102));
        stats.setText("sample");
        viewpanel.add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 92, 229));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Details");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 320, 45));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 40, 40));

        viewpanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 502, -1));

        confirmunarchive.setBackground(new java.awt.Color(255, 255, 255));
        confirmunarchive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Are you sure you want to unarchive user?");
        confirmunarchive.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 420, 20));

        noBT.setBackground(new java.awt.Color(0, 51, 184));
        noBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noBT.setForeground(new java.awt.Color(255, 255, 255));
        noBT.setText("NO");
        noBT.setBorderPainted(false);
        noBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noBTMouseExited(evt);
            }
        });
        noBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBTActionPerformed(evt);
            }
        });
        confirmunarchive.add(noBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 80, -1));

        yesBT1.setBackground(new java.awt.Color(0, 51, 184));
        yesBT1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yesBT1.setForeground(new java.awt.Color(255, 255, 255));
        yesBT1.setText("YES");
        yesBT1.setBorderPainted(false);
        yesBT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yesBT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yesBT1MouseExited(evt);
            }
        });
        yesBT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBT1ActionPerformed(evt);
            }
        });
        confirmunarchive.add(yesBT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, -1));

        jPanel3.setBackground(new java.awt.Color(0, 92, 229));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(" NOTICE ");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        confirmunarchive.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));
        confirmunarchive.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 420, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        archiveTbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        archiveTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                archiveTblMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(archiveTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 460, 390));

        jPanel2.setBackground(new java.awt.Color(0, 92, 229));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Archived");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 10, 400, -1));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 50));

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

    private void archiveTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archiveTblMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            popUp.show(archiveTbl, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_archiveTblMousePressed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

        String uid = archiveTbl.getValueAt(archiveTbl.getSelectedRow(), 0).toString();

        try {
            dbconnector dbc = new dbconnector();
            TableModel tbl = archiveTbl.getModel();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_u WHERE u_id = '" + uid + "'");

            if (rs.next()) {


                u_id.setText(rs.getString("u_id"));
                fullname2.setText(rs.getString("u_fname") + " " + rs.getString("u_lname"));
                username.setText(rs.getString("u_uname"));
                umail.setText(rs.getString("u_email"));
                type.setText(rs.getString("u_type"));

                String as = rs.getString("u_status");
                if(as.equals("Active")){

                    stats.setText(""+as);
                }else{

                    stats.setText(""+as);
                }

            }

            Object[] options = {};
            JOptionPane.showOptionDialog(null, viewpanel, "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, null);

        }catch(SQLException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_viewActionPerformed

    private void unarchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unarchiveActionPerformed
    
    int rowIndex = archiveTbl.getSelectedRow();
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select a user to unarchive.");
    } else {
        dbconnector connector = new dbconnector();
        TableModel tbl = archiveTbl.getModel();
        String userId = tbl.getValueAt(rowIndex, 0).toString();

            Object[] options = {};
            JOptionPane.showOptionDialog(null, confirmunarchive, "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, null);
        
    }    
    }//GEN-LAST:event_unarchiveActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        archivedusers au = new archivedusers();
        Window window = SwingUtilities.getWindowAncestor(viewpanel);
        window.dispose();
        au.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void noBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noBTMouseEntered

    }//GEN-LAST:event_noBTMouseEntered

    private void noBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noBTMouseExited

    }//GEN-LAST:event_noBTMouseExited

    private void noBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBTActionPerformed
        archivedusers au = new archivedusers();
        Window window = SwingUtilities.getWindowAncestor(confirmunarchive);
        window.dispose();
        au.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_noBTActionPerformed

    private void yesBT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesBT1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBT1MouseEntered

    private void yesBT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesBT1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBT1MouseExited

    private void yesBT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBT1ActionPerformed

        
        dbconnector dbc = new dbconnector();
        
        
           int rowIndex = archiveTbl.getSelectedRow();
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select a user to unarchive.");
    }else{
                TableModel tbl = archiveTbl.getModel();
        String sqlUpdate = "UPDATE tbl_u SET u_status = ? WHERE u_id = ?";
        
        try (PreparedStatement pstUpdate = dbc.connect.prepareStatement(sqlUpdate)) {
            
    String userId = tbl.getValueAt(rowIndex, 0).toString();
    System.out.println("User ID to unarchive: " + userId); 

    pstUpdate.setString(1, "Pending");
    pstUpdate.setString(2, userId);

    int rowsAffected = pstUpdate.executeUpdate();
    System.out.println("Rows affected: " + rowsAffected); 

    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "User data unarchived successfully.");

        Window window = SwingUtilities.getWindowAncestor(confirmunarchive);
        if (window != null) {
            window.dispose();
        }

        displayData();
    } else {
        JOptionPane.showMessageDialog(null, "No records found to unarchive.");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
}
    }
        



    }//GEN-LAST:event_yesBT1ActionPerformed

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
            java.util.logging.Logger.getLogger(archivedusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(archivedusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(archivedusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(archivedusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new archivedusers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable archiveTbl;
    private javax.swing.JLabel back;
    private javax.swing.JPanel confirmunarchive;
    private javax.swing.JLabel fullname2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton noBT;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JLabel stats;
    private javax.swing.JLabel type;
    private javax.swing.JLabel u_id;
    private javax.swing.JLabel umail;
    private javax.swing.JMenuItem unarchive;
    private javax.swing.JLabel username;
    private javax.swing.JMenuItem view;
    public javax.swing.JPanel viewpanel;
    private javax.swing.JButton yesBT1;
    // End of variables declaration//GEN-END:variables
}
