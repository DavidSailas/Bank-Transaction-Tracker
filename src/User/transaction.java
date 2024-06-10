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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;






public class transaction extends javax.swing.JFrame {

    
    public transaction() {
        initComponents();
        displayTran();
        DefaultTableModel model = (DefaultTableModel) tranTbl.getModel();
    }
    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229);
    
    Color G = new Color(0,245,39);
    Color O = new Color(255,202,51);
    Color R = new Color(255,0,0);
    
    private String getUId() {
        session sess = session.getInstance();
        int u_id = sess.getUid();
        return String.valueOf(u_id);
    }

public void displayTran() {
    String loggedInUId = getUId();

    try {
        dbconnector connector = new dbconnector();

        String query = "SELECT tran_id, tran_amount, tran_type, tran_date, tran_time, tran_stats " +
                       "FROM tbl_transaction WHERE u_id = ?";

        // Use PreparedStatement to prevent SQL injection
        try (PreparedStatement pst = connector.connect.prepareStatement(query)) {
            pst.setString(1, loggedInUId);
            ResultSet rs = pst.executeQuery();

            // Create a table model
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
            model.setColumnIdentifiers(new String[]{"ID", "Amount", "Action", "Date", "Time", "Status"});

            // Add data to the table model
            while (rs.next()) {
                String[] rowData = new String[6];
                rowData[0] = rs.getString("tran_id");
                rowData[1] = rs.getString("tran_amount");
                rowData[2] = rs.getString("tran_type");
                rowData[3] = rs.getString("tran_date");
                rowData[4] = rs.getString("tran_time");
                rowData[5] = rs.getString("tran_stats");
                model.addRow(rowData);
            }

            // Set the table model to the JTable
            tranTbl.setModel(model);

            // Set cell renderer for "Status" column to color code text based on transaction status
            tranTbl.getColumnModel().getColumn(5).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    String status = (String) table.getValueAt(row, 5);
                    if (status != null) {
                        if (status.equals("SUCCESS")) {
                            setForeground(Color.GREEN);
                        } else if (status.equals("PENDING")) {
                            setForeground(Color.ORANGE);
                        }else if (status.equals("FAILED")) {
                            setForeground(Color.RED);
                        } else {
                            // Default text color for other statuses
                            setForeground(table.getForeground());
                        }
                    }
                    return c;
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

        popUp_history = new javax.swing.JPopupMenu();
        viewHis = new javax.swing.JMenuItem();
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
        jlabelrefno = new javax.swing.JLabel();
        ref_no = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tranTbl = new javax.swing.JTable();
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

        viewHis.setText("View");
        viewHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHisActionPerformed(evt);
            }
        });
        popUp_history.add(viewHis);

        viewhis.setBackground(new java.awt.Color(255, 255, 255));
        viewhis.setMinimumSize(new java.awt.Dimension(420, 300));
        viewhis.setPreferredSize(new java.awt.Dimension(420, 350));
        viewhis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Id:");
        viewhis.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 20));

        tid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tid.setForeground(new java.awt.Color(0, 0, 102));
        tid.setText("sample");
        viewhis.add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Amount:");
        viewhis.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 110, -1));

        amount.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 0, 102));
        amount.setText("sample");
        viewhis.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        Description1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Description1.setForeground(new java.awt.Color(0, 0, 102));
        Description1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Description1.setText(" Action:");
        viewhis.add(Description1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 102));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Fullname:");
        viewhis.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 120, -1));

        fullname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fullname.setForeground(new java.awt.Color(0, 0, 102));
        fullname.setText("sample");
        viewhis.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 102));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Date & Time:");
        viewhis.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, -1));

        date_time.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        date_time.setForeground(new java.awt.Color(0, 0, 102));
        date_time.setText("sample");
        viewhis.add(date_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

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

        viewhis.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 370, 80));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("jLabel7");
        viewhis.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 420, 10));

        jlabelrefno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabelrefno.setForeground(new java.awt.Color(0, 0, 102));
        jlabelrefno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelrefno.setText("Reference Number:");
        viewhis.add(jlabelrefno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 190, -1));

        ref_no.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ref_no.setForeground(new java.awt.Color(0, 0, 102));
        ref_no.setText("sample");
        viewhis.add(ref_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Transaction");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        tranTbl.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tranTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tranTbl);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 750, 380));

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
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/receipt (1).png"))); // NOI18N
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
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/envelope.png"))); // NOI18N
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

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 450));

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
        }
    }//GEN-LAST:event_formWindowActivated

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

    private void viewHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHisActionPerformed

        int selectedRow = tranTbl.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a log from the table.");
            return;
        }

        String tranid = tranTbl.getModel().getValueAt(selectedRow, 0).toString();

        try {
            dbconnector dbc = new dbconnector();
            String query = "SELECT tran.tran_id, CONCAT(u.u_fname, ' - ', u.u_fname) AS fullname, " +
            "CONCAT(tran.tran_date, ' - ', tran.tran_time) AS timestamp, " +
            "tran.tran_amount, tran.tran_type, tran.tran_stats, tran.tran_refno " +
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
                ref_no.setText(rs.getString("tran_refno"));

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

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        transaction t = new transaction();
        Window window = SwingUtilities.getWindowAncestor(viewhis);
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
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Description1;
    private javax.swing.JLabel amount;
    private javax.swing.JLabel back1;
    private javax.swing.JPanel color1;
    private javax.swing.JPanel color2;
    private javax.swing.JPanel color3;
    private javax.swing.JPanel color4;
    private javax.swing.JPanel color5;
    private javax.swing.JLabel date_time;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlabelrefno;
    private javax.swing.JPopupMenu popUp_history;
    private javax.swing.JLabel ref_no;
    private javax.swing.JLabel status;
    private javax.swing.JLabel tid;
    private javax.swing.JTable tranTbl;
    private javax.swing.JLabel type;
    private javax.swing.JMenuItem viewHis;
    public javax.swing.JPanel viewhis;
    // End of variables declaration//GEN-END:variables
}
