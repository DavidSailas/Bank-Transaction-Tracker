
package Admin;

import config.dbconnector;
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
import net.proteanit.sql.DbUtils;

public class tracker extends javax.swing.JFrame {

    public tracker() {
        initComponents();
        displayHis();
        displayActivity();
        DefaultTableModel model = (DefaultTableModel) historyTbl.getModel();

    }
    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229);
    
    Color G = new Color(0,245,39);
    Color O = new Color(255,202,51);
    Color R = new Color(255,0,0); 
    
       public void displayActivity() {
    try {
        dbconnector dbc = new dbconnector();
        String query = "SELECT l.l_id, CONCAT(u.u_id, ' - ', u.u_type) AS user_info, l.l_event, l.l_timestamp " +
                       "FROM tbl_logs l " +
                       "JOIN tbl_u u ON l.u_id = u.u_id " +
                       "ORDER BY l.l_timestamp DESC";
        ResultSet rs = dbc.getData(query);
        logsTbl.setModel(DbUtils.resultSetToTableModel(rs));

        JTableHeader th = logsTbl.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0); 
        TableColumn tc1 = tcm.getColumn(1); 
        TableColumn tc2 = tcm.getColumn(2); 
        TableColumn tc3 = tcm.getColumn(3); 

        tc0.setHeaderValue("Log ID");
        tc1.setHeaderValue("User");
        tc2.setHeaderValue("EVENT");
        tc3.setHeaderValue("TIME");


        logsTbl.removeColumn(tc0);

        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}
       
public void displayHis() {
    try {
        dbconnector connector = new dbconnector();

        String query = "SELECT tran.tran_id, tbl_u.u_fname, tran.tran_amount, " +
                       "tran.tran_type, tran.tran_date, tran.tran_time, " +
                       "tran.tran_stats " +
                       "FROM tbl_transaction tran " +
                       "JOIN tbl_u ON tran.u_id = tbl_u.u_id";

        ResultSet rs = connector.getData(query);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return String.class; // All columns will be of type String
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Disable cell editing
            }
        };

        // Set column names
        model.setColumnIdentifiers(new String[]{"ID", "Name", "Amount", "Action", "Date", "Time", "Status"});

        // Add data to the table model
        while (rs.next()) {
            String[] rowData = new String[7];
           
            rowData[0] = rs.getString("tran_id");
            rowData[1] = rs.getString("u_fname");
            rowData[2] = rs.getString("tran_amount");
            rowData[3] = rs.getString("tran_type");
            rowData[4] = rs.getString("tran_date");
            rowData[5] = rs.getString("tran_time");
            rowData[6] = rs.getString("tran_stats");
            model.addRow(rowData);
        }

        // Set the table model to the JTable
        historyTbl.setModel(model);

        // Set cell renderer for "Status" column to color code text based on transaction status
        historyTbl.getColumnModel().getColumn(6).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = (String) table.getValueAt(row, 6);
                if (status != null) {
                    if (status.equals("SUCCESS")) {
                        setForeground(Color.GREEN);
                    } else if (status.equals("PENDING")) {
                        setForeground(Color.ORANGE);
                    } else {
                        // Default text color for other statuses
                        setForeground(table.getForeground());
                    }
                }
                return c;
            }
        });

        JTableHeader th = historyTbl.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        tcm.getColumn(0).setHeaderValue("ID");
        tcm.getColumn(1).setHeaderValue("Name");
        tcm.getColumn(2).setHeaderValue("Amount");
        tcm.getColumn(3).setHeaderValue("Action");
        tcm.getColumn(4).setHeaderValue("Date");
        tcm.getColumn(5).setHeaderValue("Time");
        tcm.getColumn(6).setHeaderValue("Status");

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

        viewhis = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        tid = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        Description1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        date_time = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        viewactivity = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        u_id = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        event = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        des = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        viewtransfer = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        u_id2 = new javax.swing.JLabel();
        fullname4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        username2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        umail2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        stats2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        popUp_activity = new javax.swing.JPopupMenu();
        viewActivity = new javax.swing.JMenuItem();
        popUp_history = new javax.swing.JPopupMenu();
        viewHis = new javax.swing.JMenuItem();
        popUp_transfer = new javax.swing.JPopupMenu();
        viewTransfer = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyTbl = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        logsTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
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

        viewhis.setBackground(new java.awt.Color(255, 255, 255));
        viewhis.setMinimumSize(new java.awt.Dimension(420, 300));
        viewhis.setPreferredSize(new java.awt.Dimension(420, 350));
        viewhis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Id:");
        viewhis.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 70, 20));

        tid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tid.setForeground(new java.awt.Color(0, 0, 102));
        tid.setText("sample");
        viewhis.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Amount:");
        viewhis.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, -1));

        amount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 0, 102));
        amount.setText("sample");
        viewhis.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        Description1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Description1.setForeground(new java.awt.Color(0, 0, 102));
        Description1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Description1.setText(" Action:");
        viewhis.add(Description1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 102));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Fullname:");
        viewhis.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, -1));

        fullname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fullname.setForeground(new java.awt.Color(0, 0, 102));
        fullname.setText("sample");
        viewhis.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 102));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Date & Time:");
        viewhis.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, -1));

        date_time.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date_time.setForeground(new java.awt.Color(0, 0, 102));
        date_time.setText("sample");
        viewhis.add(date_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 92, 229));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Details");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 320, 45));

        back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
        });
        jPanel8.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 40, 40));

        viewhis.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 502, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        type.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 102));
        type.setText("sample");

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(0, 0, 102));
        status.setText("sample");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status)
                    .addComponent(type))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(type)
                .addGap(18, 18, 18)
                .addComponent(status)
                .addContainerGap())
        );

        viewhis.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, 80));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("jLabel7");
        viewhis.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 420, 10));

        viewactivity.setBackground(new java.awt.Color(255, 255, 255));
        viewactivity.setMinimumSize(new java.awt.Dimension(420, 300));
        viewactivity.setPreferredSize(new java.awt.Dimension(420, 350));
        viewactivity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Id:");
        viewactivity.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 80, 20));

        u_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        u_id.setForeground(new java.awt.Color(0, 0, 102));
        u_id.setText("sample");
        viewactivity.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Event:");
        viewactivity.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 100, -1));

        event.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        event.setForeground(new java.awt.Color(0, 0, 102));
        event.setText("sample");
        viewactivity.add(event, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        Description.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Description.setForeground(new java.awt.Color(0, 0, 102));
        Description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Description.setText("Description:");
        viewactivity.add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Info:");
        viewactivity.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 90, -1));

        info.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        info.setForeground(new java.awt.Color(0, 0, 102));
        info.setText("sample");
        viewactivity.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Time:");
        viewactivity.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 90, -1));

        time.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 102));
        time.setText("sample");
        viewactivity.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 92, 229));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Details");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 320, 45));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel4.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 40, 40));

        viewactivity.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 502, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        des.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        des.setForeground(new java.awt.Color(0, 0, 102));
        des.setText("sample");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(des)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(des)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        viewactivity.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, 80));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");
        viewactivity.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 420, 10));

        viewtransfer.setBackground(new java.awt.Color(255, 255, 255));
        viewtransfer.setMinimumSize(new java.awt.Dimension(420, 300));
        viewtransfer.setPreferredSize(new java.awt.Dimension(420, 300));
        viewtransfer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("Id:");
        viewtransfer.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        u_id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        u_id2.setForeground(new java.awt.Color(0, 0, 102));
        u_id2.setText("sample");
        viewtransfer.add(u_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        fullname4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullname4.setForeground(new java.awt.Color(0, 0, 102));
        fullname4.setText("Fullname");
        viewtransfer.add(fullname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 102));
        jLabel23.setText("Username:");
        viewtransfer.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        username2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username2.setForeground(new java.awt.Color(0, 0, 102));
        username2.setText("sample");
        viewtransfer.add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 102));
        jLabel24.setText("Email:");
        viewtransfer.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        umail2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        umail2.setForeground(new java.awt.Color(0, 0, 102));
        umail2.setText("sample");
        viewtransfer.add(umail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("Type:");
        viewtransfer.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        type2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        type2.setForeground(new java.awt.Color(0, 0, 102));
        type2.setText("sample");
        viewtransfer.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 102));
        jLabel28.setText("Status:");
        viewtransfer.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        stats2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stats2.setForeground(new java.awt.Color(0, 0, 102));
        stats2.setText("sample");
        viewtransfer.add(stats2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0, 92, 229));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Details");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 320, 45));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 40, 40));

        viewtransfer.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 502, -1));

        viewActivity.setText("View");
        viewActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActivityActionPerformed(evt);
            }
        });
        popUp_activity.add(viewActivity);

        viewHis.setText("View");
        viewHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHisActionPerformed(evt);
            }
        });
        popUp_history.add(viewHis);

        viewTransfer.setText("View");
        viewTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTransferActionPerformed(evt);
            }
        });
        popUp_transfer.add(viewTransfer);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Tracker");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 220, 330));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Recent Transfer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Transaction History");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        historyTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        historyTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                historyTblMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(historyTbl);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 500, 140));

        logsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        logsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logsTblMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(logsTbl);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 500, 140));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Recent Activity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

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
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/house-chimney.png"))); // NOI18N
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
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/file-circle-info.png"))); // NOI18N
        jLabel18.setText(" REPORT");
        color4.add(jLabel18);
        jLabel18.setBounds(0, 0, 150, 40);

        jPanel6.add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void viewActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActivityActionPerformed
       
        int selectedRow = logsTbl.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a log from the table.");
            return;
        }

        String lid = logsTbl.getModel().getValueAt(selectedRow, 0).toString();

        try {
            dbconnector dbc = new dbconnector();
            String query = "SELECT l.l_id, CONCAT(u.u_id, ' - ', u.u_type) AS user_info, l.l_event, l.l_timestamp, l.l_description " +
                           "FROM tbl_logs l " +
                           "JOIN tbl_u u ON l.u_id = u.u_id " +
                           "WHERE l.l_id = '" + lid + "'";
            ResultSet rs = dbc.getData(query);

            if (rs.next()) {
                u_id.setText(rs.getString("l_id"));
                info.setText(rs.getString("user_info"));
                event.setText(rs.getString("l_event"));
                time.setText(rs.getString("l_timestamp"));
                des.setText(rs.getString("l_description"));
            } else {
                JOptionPane.showMessageDialog(null, "No data found for the selected log ID.");
                return;
            }

            Object[] options = {};
            JOptionPane.showOptionDialog(null, viewactivity, "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, null);

            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving data: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_viewActivityActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        tracker t = new tracker();
        Window window = SwingUtilities.getWindowAncestor(viewactivity);
        window.dispose();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void viewHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHisActionPerformed
               
    int selectedRow = historyTbl.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a log from the table.");
        return;
    }

    String tranid = historyTbl.getModel().getValueAt(selectedRow, 0).toString();

    try {
        dbconnector dbc = new dbconnector();
        String query = "SELECT tran.tran_id, CONCAT(u.u_fname, ' - ', u.u_fname) AS fullname, " +
                       "CONCAT(tran.tran_date, ' - ', tran.tran_time) AS timestamp, " +
                       "tran.tran_amount, tran.tran_type, tran.tran_stats " +
                       "FROM tbl_transaction tran " +
                       "JOIN tbl_u u ON tran.u_id = u.u_id " +                    
                       "WHERE tran.tran_id = '" + tranid + "'";
                     
                     
        ResultSet rs = dbc.getData(query);

        if (rs.next()) {
            tid.setText(rs.getString("tran_id"));
            fullname.setText(rs.getString("fullname"));
            amount.setText(rs.getString("tran_amount"));
            date_time.setText(rs.getString("timestamp"));
            type.setText(rs.getString("tran_type"));
            
            String c = rs.getString("tran_stats");
              if(c.equals("SUCCESS")){
                  status.setForeground(G);
                  status.setText(""+c);
              }else if(c.equals("PENDING")){
                  status.setForeground(O);
                  status.setText(""+c);
              }else if(c.equals("FAILED")){
                  status.setForeground(R);
                  status.setText(""+c);
              }
              
        } else {
            JOptionPane.showMessageDialog(null, "No data found for the selected log ID.");
            return;
        }

        Object[] options = {};
        JOptionPane.showOptionDialog(null, viewhis, "",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options, null);

        rs.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("" + ex);
    }
        
    }//GEN-LAST:event_viewHisActionPerformed

    private void viewTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTransferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTransferActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void logsTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsTblMousePressed
                if (SwingUtilities.isRightMouseButton(evt)) {
            popUp_activity.show(logsTbl, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_logsTblMousePressed

    private void historyTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyTblMousePressed
                if (SwingUtilities.isRightMouseButton(evt)) {
            popUp_history.show(historyTbl, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_historyTblMousePressed

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        tracker t = new tracker();
        Window window = SwingUtilities.getWindowAncestor(viewactivity);
        window.dispose();
        t.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1MouseClicked

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
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Description;
    private javax.swing.JLabel Description1;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back1;
    private javax.swing.JPanel color1;
    private javax.swing.JPanel color2;
    private javax.swing.JPanel color3;
    private javax.swing.JPanel color4;
    private javax.swing.JLabel date_time;
    private javax.swing.JLabel des;
    private javax.swing.JLabel event;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel fullname4;
    private javax.swing.JTable historyTbl;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable logsTbl;
    private javax.swing.JPopupMenu popUp_activity;
    private javax.swing.JPopupMenu popUp_history;
    private javax.swing.JPopupMenu popUp_transfer;
    private javax.swing.JLabel stats2;
    private javax.swing.JLabel status;
    private javax.swing.JLabel tid;
    private javax.swing.JLabel time;
    private javax.swing.JLabel type;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel u_id;
    private javax.swing.JLabel u_id2;
    private javax.swing.JLabel umail2;
    private javax.swing.JLabel username2;
    private javax.swing.JMenuItem viewActivity;
    private javax.swing.JMenuItem viewHis;
    private javax.swing.JMenuItem viewTransfer;
    public javax.swing.JPanel viewactivity;
    public javax.swing.JPanel viewhis;
    public javax.swing.JPanel viewtransfer;
    // End of variables declaration//GEN-END:variables
}
