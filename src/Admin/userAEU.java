
package Admin;

import btt.loginform;
import config.PasswordHasher;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static register.registrationform.email;
import static register.registrationform.username;


public class userAEU extends javax.swing.JFrame {

    public userAEU() {
        initComponents();
    }

    Color navcolor =  new Color(255,255,255);
    Color hovercolor =  new Color(102,204,255);
            

   public String destination = "";
      File selectedFile;
      public String path;
      public String oldpath;
    
   public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/u_images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    }

   public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
   
   public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
    
    
    public boolean dupCheck(){
        
        dbconnector connector = new dbconnector();
        
        try{
            
            String query = "SELECT * FROM tbl_u  WHERE u_uname = '" + u_uname.getText() + "' OR u_email = '" + u_email.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){
             
                email = resultSet.getString("u_email");
                if(email.equals(u_email.getText())){
                    JOptionPane.showMessageDialog(null,"Email is Already Used!");
                    u_email.setText("");
                }
                
                username = resultSet.getString("u_uname");
                if(username.equals(u_uname.getText())){
                    JOptionPane.showMessageDialog(null,"Username is Already Used!");
                    u_uname.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            
            System.out.println(""+ex);
            return false;
        }
        
    }
    
     public boolean upCheck(){
        
        dbconnector connector = new dbconnector();
        
        try{
            
            String query = "SELECT * FROM tbl_u  WHERE (u_uname = '" + u_uname.getText() + "' OR u_email = '" + u_email.getText() + "')AND u_id != '"+u_id.getText()+"'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){
             
                email = resultSet.getString("u_email");
                if(email.equals(u_email.getText())){
                    JOptionPane.showMessageDialog(null,"Email is Already Used!");
                    u_email.setText("");
                }
                
                username = resultSet.getString("u_uname");
                if(username.equals(u_uname.getText())){
                    JOptionPane.showMessageDialog(null,"Username is Already Used!");
                    u_uname.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            
            System.out.println(""+ex);
            return false;
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        u_fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        u_lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        u_email = new javax.swing.JTextField();
        u_uname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        u_pass = new javax.swing.JTextField();
        u_status = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        u_id = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        u_type = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancle = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        navtext = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        adminName1 = new javax.swing.JLabel();

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 92, 229));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMinimumSize(new java.awt.Dimension(500, 450));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 320, 230));

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 150, -1));

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 150, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 470, 400));

        u_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_fnameActionPerformed(evt);
            }
        });
        jPanel4.add(u_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("First name:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 20));

        u_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_lnameActionPerformed(evt);
            }
        });
        jPanel4.add(u_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Last name:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Email:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Username:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, 20));

        u_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_emailActionPerformed(evt);
            }
        });
        jPanel4.add(u_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 150, 30));

        u_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_unameActionPerformed(evt);
            }
        });
        jPanel4.add(u_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Password:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, 20));

        u_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_passActionPerformed(evt);
            }
        });
        jPanel4.add(u_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 150, 30));

        u_status.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        u_status.setForeground(new java.awt.Color(51, 51, 51));
        u_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        u_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_statusActionPerformed(evt);
            }
        });
        jPanel4.add(u_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 150, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("User Type:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 20));

        add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add.setText("ADD");
        add.setPreferredSize(new java.awt.Dimension(60, 30));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel4.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("User ID:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, 20));

        u_id.setEnabled(false);
        u_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_idActionPerformed(evt);
            }
        });
        jPanel4.add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("User Status:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 20));

        u_type.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        u_type.setForeground(new java.awt.Color(51, 51, 51));
        u_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User", " " }));
        jPanel4.add(u_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 150, 30));

        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("UPDATE");
        update.setPreferredSize(new java.awt.Dimension(60, 30));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel4.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 100, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("DELETE");
        delete.setPreferredSize(new java.awt.Dimension(60, 30));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 100, -1));

        cancle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancle.setText("CANCEL");
        cancle.setPreferredSize(new java.awt.Dimension(60, 30));
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });
        jPanel4.add(cancle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 100, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navtext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        navtext.setText("USERS");
        jPanel3.add(navtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        adminName.setFont(new java.awt.Font("Microsoft Himalaya", 1, 24)); // NOI18N
        jPanel3.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 150, 30));

        adminName1.setFont(new java.awt.Font("Microsoft Himalaya", 1, 18)); // NOI18N
        jPanel3.add(adminName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 150, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

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

    private void u_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_fnameActionPerformed

    private void u_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_emailActionPerformed

    private void u_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_unameActionPerformed

    private void u_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_passActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        
        
               PasswordHasher pH = new PasswordHasher();
        
       String password = pH.hashPassword(u_pass.getText());
        
        if(u_fname.getText().isEmpty() || u_lname.getText().isEmpty() || u_email.getText().isEmpty()
            || u_uname.getText().isEmpty() || u_pass.getText().isEmpty())
        {

            JOptionPane.showMessageDialog(null,"All fields are required!");

        }else if(u_pass.getText().length() < 8){

            JOptionPane.showMessageDialog(null,"Password should be 8 above!");
            u_pass.setText("");

        }else if(upCheck()){

            System.out.println("Duplicate Exist!");

        }
        else{


         dbconnector connector = new dbconnector();

// Inserting data into the database
String query = "INSERT INTO tbl_u(u_fname, u_lname, u_email, u_uname, u_pass, u_type, u_status, u_image) "
        + "VALUES ('" + u_fname.getText() + "','" + u_lname.getText() + "','" + u_email.getText() + "','"
        + u_uname.getText() + "','" + password + "','" + u_type.getSelectedItem() + "','Pending','')";

if (connector.insertData(query)) {
    JOptionPane.showMessageDialog(null, "Inserted Success!");
     user u = new user();
     u.setVisible(true);
     this.dispose();
} else {
    JOptionPane.showMessageDialog(null, "Connection Error:");
}

    }
    }//GEN-LAST:event_addActionPerformed

    private void u_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_idActionPerformed

    private void u_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_lnameActionPerformed

    private void u_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_statusActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

       PasswordHasher pH = new PasswordHasher();
        
       String password = pH.hashPassword(u_pass.getText());
        
        if(u_fname.getText().isEmpty() || u_lname.getText().isEmpty() || u_email.getText().isEmpty()
            || u_uname.getText().isEmpty())
        {

            JOptionPane.showMessageDialog(null,"All fields are required!");

        }else if(upCheck()){

            System.out.println("Duplicate Exist!");

        }
        else{
        
        dbconnector connector = new dbconnector();
        
   connector.updateData("UPDATE tbl_u SET u_fname = '" + u_fname.getText() + "', u_lname = '" + u_lname.getText() + "', u_email = '" + u_email.getText() + "',"
        + "u_uname = '" + u_uname.getText() + "', u_type = '" + u_type.getSelectedItem() + "', u_status = '" + u_status.getSelectedItem() + "' "
        + "WHERE u_id = '" + u_id.getText() + "'");

            user u = new user();
            u.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    
    dbconnector connector = new dbconnector();
    
    String sql = "DELETE FROM tbl_u WHERE u_id = ?";
    try (PreparedStatement pst = connector.connect.prepareStatement(sql)) {
    pst.setString(1, u_id.getText()); 
    int rowsAffected = pst.executeUpdate(); 
    if (rowsAffected > 0) {
        user u = new user();
        u.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "No records found to delete.");
    }
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    }

    }//GEN-LAST:event_deleteActionPerformed

    private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancleActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        image.setIcon(null);
        destination = "";
        path = "";
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/u_images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(userAEU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userAEU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userAEU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userAEU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userAEU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JLabel adminName;
    public javax.swing.JLabel adminName1;
    private javax.swing.JButton cancle;
    private javax.swing.JButton delete;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel navtext;
    public javax.swing.JTextField u_email;
    public javax.swing.JTextField u_fname;
    public javax.swing.JTextField u_id;
    public javax.swing.JTextField u_lname;
    public javax.swing.JTextField u_pass;
    public javax.swing.JComboBox<String> u_status;
    public javax.swing.JComboBox<String> u_type;
    public javax.swing.JTextField u_uname;
    public javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
