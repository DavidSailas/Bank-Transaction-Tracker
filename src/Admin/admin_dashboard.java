
package Admin;

import Admin.message;
import Admin.security;
import Admin.tracker;
import Admin.user;
import btt.loginform;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class admin_dashboard extends javax.swing.JFrame {

    public admin_dashboard() {
        initComponents();
        displayData();
        displaystat();
        displaytype();
        date();
        time();
    }

    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229);
    
    
    Color lg =  new Color(204,204,204);
    Color bg =  new Color(255,255,255);
    
    private void date() {
       
        Date d = new Date();
    
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd,yyyy");
        String dt = sdf.format(d);
        date.setText(dt);
    }

    
        Timer t;
        SimpleDateFormat st;
    
    private void time(){

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
                
                String tm = st.format(dt);
                 time.setText(tm);             
            }
        });
        
        t.start();
        
    }
    
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
      public void displaytype() {
        dbconnector connector = new dbconnector();

        try {


            // Count Admins
            ResultSet rs = connector.getData("SELECT COUNT(*) AS TotalAdmins FROM tbl_u WHERE u_type = 'Admin'");
            if (rs.next()) {
                int adminCount = rs.getInt("TotalAdmins");
                admin.setText(" " + adminCount);  // Assuming 'admin' is a UI component like JLabel
            } else {
                System.out.println("No admins found!");
            }
            rs.close();

            // Count Users
            ResultSet rs1 = connector.getData("SELECT COUNT(*) AS TotalUsers FROM tbl_u WHERE u_type = 'User'");
            if (rs1.next()) {
                int userCount = rs1.getInt("TotalUsers");
                users.setText(" " + userCount);  // Assuming 'user' is a UI component like JLabel
            } else {
                System.out.println("No users found!");
            }
            rs.close();

        } catch (SQLException e) {
                System.out.println("Error closing resources: " + e);
            }
        }
   public String destination = "";
   File selectedFile;
   public String path;
   public String oldpath;
   
   public ImageIcon resizeImage(ImageIcon originalIcon, int targetWidth, int targetHeight) {
        Image originalImage = originalIcon.getImage();


        int newHeight = getHeightFromWidth(originalImage, targetWidth);

        BufferedImage resizedImage = new BufferedImage(targetWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        resizedImage.createGraphics().drawImage(originalImage, 0, 0, targetWidth, newHeight, null);
        return new ImageIcon(resizedImage);
}

    public int getHeightFromWidth(Image image, int desiredWidth) {
        int originalWidth = image.getWidth(null);
        int originalHeight = image.getHeight(null);

        return (int) ((double) desiredWidth / originalWidth * originalHeight);
    }
    
   public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
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
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stats = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pcolor1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        pcolor2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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
        jPanel7 = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        add1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txtuser = new javax.swing.JLabel();
        users = new javax.swing.JLabel();
        plus3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtadmin = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        plus4 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        viewpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 184));
        jLabel12.setText("Id:");

        u_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        u_id.setForeground(new java.awt.Color(0, 51, 184));
        u_id.setText("sample");

        fullname2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fullname2.setForeground(new java.awt.Color(0, 51, 184));
        fullname2.setText("Fullname");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 184));
        jLabel6.setText("Username:");

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 51, 184));
        username.setText("sample");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 184));
        jLabel7.setText("Email:");

        umail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        umail.setForeground(new java.awt.Color(0, 51, 184));
        umail.setText("sample");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 184));
        jLabel8.setText("Type:");

        type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(0, 51, 184));
        type.setText("sample");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        image.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 184));
        jLabel13.setText("Status:");

        stats.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stats.setForeground(new java.awt.Color(0, 51, 184));
        stats.setText("sample");

        jPanel3.setBackground(new java.awt.Color(0, 92, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROFILE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 400, 45));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/undo.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 40, 40));

        jLabel24.setText("_____________________________________________________________________________");

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

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 184));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/settings (2).png"))); // NOI18N
        jLabel23.setText(" Settings");
        pcolor1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        pcolor2.setBackground(new java.awt.Color(255, 255, 255));
        pcolor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcolor2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pcolor2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pcolor2MouseExited(evt);
            }
        });
        pcolor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 184));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/exit (1).png"))); // NOI18N
        jLabel3.setText(" Log-out");
        pcolor2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        javax.swing.GroupLayout viewpanelLayout = new javax.swing.GroupLayout(viewpanel);
        viewpanel.setLayout(viewpanelLayout);
        viewpanelLayout.setHorizontalGroup(
            viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(u_id)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addComponent(fullname2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(username)
                            .addComponent(umail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(type)
                            .addComponent(stats))
                        .addGap(41, 41, 41))))
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pcolor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pcolor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewpanelLayout.setVerticalGroup(
            viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(u_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewpanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stats))
                            .addGroup(viewpanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(umail)))))
                .addGap(25, 25, 25)
                .addComponent(fullname2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pcolor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcolor2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(236, 236, 236));
        jPanel5.setMinimumSize(new java.awt.Dimension(1000, 450));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
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

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/assessment.png"))); // NOI18N
        jLabel17.setText(" TRACKER");
        color3.add(jLabel17);
        jLabel17.setBounds(0, 0, 160, 40);

        jPanel6.add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 180, 40));

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
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/file-circle-info.png"))); // NOI18N
        jLabel18.setText(" REPORT");
        color4.add(jLabel18);
        jLabel18.setBounds(0, 0, 150, 40);

        jPanel6.add(color4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 40));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 450));

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

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("\" Manage your finances with");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("D.S PIONEER PAY. \"");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Investment data-bro (1).png"))); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 230, 170));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 530, 170));

        jPanel8.setBackground(new java.awt.Color(0, 92, 229));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/users-alt.png"))); // NOI18N
        jLabel2.setText(" USER COUNT");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        ttluser.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ttluser.setForeground(new java.awt.Color(255, 255, 255));
        ttluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttluser.setText("0");
        jPanel8.add(ttluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, -1));

        plus.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel8.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 170, 100));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 184));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/user-trust.png"))); // NOI18N
        jLabel4.setText(" ACTIVE USERS");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        active.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        active.setForeground(new java.awt.Color(0, 51, 184));
        active.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        active.setText("0");
        jPanel9.add(active, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 40, 170, -1));

        plus1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel9.add(plus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 170, 100));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 184));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/user-time.png"))); // NOI18N
        jLabel5.setText(" PENDING USERS");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        pending.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pending.setForeground(new java.awt.Color(0, 51, 184));
        pending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pending.setText("0");
        jPanel10.add(pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, -1));

        plus2.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel10.add(plus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 170, 100));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Dashboard");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        profile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        profile.setForeground(new java.awt.Color(0, 51, 184));
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/circle-user.png"))); // NOI18N
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        jPanel5.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 40, 30));

        date.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 102));
        date.setText("May 19,2024");
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateMouseExited(evt);
            }
        });
        jPanel5.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 100, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 184));
        jLabel11.setText("Daily Reports:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 230, 380));

        add1.setBackground(new java.awt.Color(255, 255, 255));
        add1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        add1.setForeground(new java.awt.Color(0, 51, 184));
        add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/user-add.png"))); // NOI18N
        add1.setText("ADD NEW USER");
        add1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel5.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 90));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtuser.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtuser.setForeground(new java.awt.Color(0, 51, 184));
        txtuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/user.png"))); // NOI18N
        txtuser.setText(" USER");
        jPanel11.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        users.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        users.setForeground(new java.awt.Color(0, 51, 184));
        users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users.setText("0");
        jPanel11.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, -1));

        plus3.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel11.add(plus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 170, 90));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtadmin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtadmin.setForeground(new java.awt.Color(0, 51, 184));
        txtadmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/admin-alt.png"))); // NOI18N
        txtadmin.setText("ADMIN");
        jPanel12.add(txtadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        admin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        admin.setForeground(new java.awt.Color(0, 51, 184));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("0");
        jPanel12.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 40, 170, -1));

        plus4.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel12.add(plus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 170, 90));

        time.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 102));
        time.setText("00:00:00 AM/PM");
        time.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeMouseExited(evt);
            }
        });
        jPanel5.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked

    }//GEN-LAST:event_userMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
   session sess = session.getInstance();

    try {
        dbconnector dbc = new dbconnector();
        ResultSet rs = dbc.getData("SELECT * FROM tbl_u WHERE u_id = '" + sess.getUid() + "'");

        if (rs.next()) {
            String imagePath = rs.getString("u_image");

            if (imagePath != null && !imagePath.isEmpty()) {
                ImageIcon originalIcon = new ImageIcon(imagePath);
                ImageIcon resizedIcon = resizeImage(originalIcon, 170, 170);
                image.setIcon(resizedIcon);
            } else {
                image.setIcon(null);
            }

            u_id.setText(String.valueOf(sess.getUid()));
            fullname.setText(rs.getString("u_fname") + " " + rs.getString("u_lname"));
            username.setText(rs.getString("u_uname"));
            umail.setText(rs.getString("u_email"));
            type.setText(rs.getString("u_type"));
            stats.setText(rs.getString("u_status"));
        }

        JOptionPane.showOptionDialog(null, viewpanel, "",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, new Object[]{}, null);
    } catch (SQLException ex) {
        System.out.println("Error retrieving profile data: " + ex.getMessage());
        JOptionPane.showMessageDialog(null, "Error loading profile data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
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

    private void dateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseEntered

    }//GEN-LAST:event_dateMouseEntered

    private void dateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseExited

    }//GEN-LAST:event_dateMouseExited

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        userAEU ur = new userAEU();
        ur.update.setEnabled(false);
        ur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_add1ActionPerformed

    private void timeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseEntered

    }//GEN-LAST:event_timeMouseEntered

    private void timeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseExited

    }//GEN-LAST:event_timeMouseExited

    private void pcolor1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseEntered
        pcolor1.setBackground(lg);
    }//GEN-LAST:event_pcolor1MouseEntered

    private void pcolor1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseExited
        pcolor1.setBackground(bg);
    }//GEN-LAST:event_pcolor1MouseExited

    private void pcolor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor1MouseClicked
        settings s = new settings();
        Window window = SwingUtilities.getWindowAncestor(viewpanel);
        window.dispose();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pcolor1MouseClicked

    private void pcolor2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor2MouseEntered
         pcolor2.setBackground(lg);
    }//GEN-LAST:event_pcolor2MouseEntered

    private void pcolor2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor2MouseExited
        pcolor2.setBackground(bg);
    }//GEN-LAST:event_pcolor2MouseExited

    private void pcolor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcolor2MouseClicked
        loginform ads = new loginform();
        Window window = SwingUtilities.getWindowAncestor(viewpanel);
        window.dispose();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pcolor2MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        admin_dashboard ads = new admin_dashboard();
        Window window = SwingUtilities.getWindowAncestor(viewpanel);
        window.dispose();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

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
    private javax.swing.JButton add1;
    private javax.swing.JLabel admin;
    private javax.swing.JPanel color1;
    private javax.swing.JPanel color2;
    private javax.swing.JPanel color3;
    private javax.swing.JPanel color4;
    private javax.swing.JLabel date;
    public javax.swing.JLabel fullname;
    private javax.swing.JLabel fullname2;
    public javax.swing.JLabel image;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    public javax.swing.JLabel menu;
    private javax.swing.JPanel pcolor1;
    private javax.swing.JPanel pcolor2;
    private javax.swing.JLabel pending;
    public javax.swing.JLabel plus;
    public javax.swing.JLabel plus1;
    public javax.swing.JLabel plus2;
    public javax.swing.JLabel plus3;
    public javax.swing.JLabel plus4;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel stats;
    private javax.swing.JLabel time;
    private javax.swing.JLabel ttluser;
    private javax.swing.JLabel txtadmin;
    private javax.swing.JLabel txtuser;
    private javax.swing.JLabel type;
    private javax.swing.JLabel u_id;
    private javax.swing.JLabel umail;
    public javax.swing.JLabel user;
    private javax.swing.JLabel username;
    private javax.swing.JLabel users;
    public javax.swing.JPanel viewpanel;
    // End of variables declaration//GEN-END:variables
}
