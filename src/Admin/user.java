
package Admin;

import Admin.admin_dashboard;
import Admin.message;
import Admin.security;
import Admin.tracker;
import Admin.userAEU;
import btt.loginform;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import config.PanelPrinter;
import config.dbconnector;
import config.session;
import java.awt.Color;
import java.awt.Image;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class user extends javax.swing.JFrame {

    DefaultListModel listModel = new DefaultListModel();
    
    public user() {
        initComponents();
        displayData();
        list.setModel(listModel);
        searchField.setBorder(new EmptyBorder(0,10,0,0));
        DefaultTableModel model = (DefaultTableModel) userTbl.getModel();
    }

    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,92,229);
    
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
   
      public void displayData(){
        try{
            dbconnector connector = new dbconnector();
            ResultSet rs = connector.getData("SELECT u_id, u_fname, u_lname,u_email,u_status FROM tbl_u");
            userTbl.setModel(DbUtils.resultSetToTableModel(rs));
            
            JTableHeader th = userTbl.getTableHeader();
            TableColumnModel tcm = th.getColumnModel();
            TableColumn tc = tcm.getColumn(0);
            TableColumn tc1 = tcm.getColumn(1);
            TableColumn tc2 = tcm.getColumn(2);
            TableColumn tc3 = tcm.getColumn(3);
            TableColumn tc4 = tcm.getColumn(4);
            
            tc.setHeaderValue("ID");
            tc1.setHeaderValue("First Name");
            tc2.setHeaderValue("Last Name");
            tc3.setHeaderValue("Email");
            tc4.setHeaderValue("Status");
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
       
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JPopupMenu();
        view = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenuItem();
        viewpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        u_id = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        umail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stats = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exportData = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        excel = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pdf = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTbl = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        list = new javax.swing.JList<>();
        searchField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        export = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        color1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        color2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        color3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        color4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        popUp.add(view);

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        popUp.add(edit);

        viewpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Id:");

        u_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        u_id.setForeground(new java.awt.Color(0, 0, 102));
        u_id.setText("sample");

        fullname.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullname.setForeground(new java.awt.Color(0, 0, 102));
        fullname.setText("Fullname");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Username:");

        username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 102));
        username.setText("sample");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Email:");

        umail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        umail.setForeground(new java.awt.Color(0, 0, 102));
        umail.setText("sample");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Type:");

        type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 102));
        type.setText("sample");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

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

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Status:");

        stats.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        stats.setForeground(new java.awt.Color(0, 0, 102));
        stats.setText("sample");

        print.setBackground(new java.awt.Color(0, 51, 184));
        print.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText(" EXPORT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 92, 229));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  VIEW DETAILS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout viewpanelLayout = new javax.swing.GroupLayout(viewpanel);
        viewpanel.setLayout(viewpanelLayout);
        viewpanelLayout.setHorizontalGroup(
            viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addComponent(fullname)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewpanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(u_id))
                            .addGroup(viewpanelLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addGroup(viewpanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(umail)
                                            .addComponent(username))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addGroup(viewpanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stats)
                                    .addComponent(type))))
                        .addGap(70, 70, 70))))
        );
        viewpanelLayout.setVerticalGroup(
            viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(u_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewpanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(viewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewpanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
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
                .addComponent(fullname)
                .addGap(18, 18, 18)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        exportData.setBackground(new java.awt.Color(255, 255, 255));
        exportData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        exportData.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 320, 10));

        jPanel7.setBackground(new java.awt.Color(0, 92, 229));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(0, 92, 229));
        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText(" System Users Data");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        exportData.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        excel.setBackground(new java.awt.Color(0, 51, 184));
        excel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        excel.setForeground(new java.awt.Color(255, 255, 255));
        excel.setText("EXCEL");
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });
        exportData.add(excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 110, 30));
        exportData.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 290, 30));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Download reports as:");
        exportData.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 290, 30));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(27, 57, 77));
        jLabel24.setText("File name:");
        exportData.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 20));

        pdf.setBackground(new java.awt.Color(0, 51, 184));
        pdf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pdf.setForeground(new java.awt.Color(255, 255, 255));
        pdf.setText(" PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });
        exportData.add(pdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 110, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(236, 236, 236));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTbl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTblMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(userTbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 540, 385));

        jPanel4.setBackground(new java.awt.Color(0, 92, 229));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setForeground(new java.awt.Color(0, 0, 102));

        list.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listMousePressed(evt);
            }
        });
        jLayeredPane1.add(list);
        list.setBounds(0, 0, 0, 0);

        jPanel4.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 300));

        searchField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchField.setHighlighter(null);
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchFieldMousePressed(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel4.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 30));

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Search");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 49, 220, 385));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Accountant");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        export.setBackground(new java.awt.Color(0, 51, 184));
        export.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        export.setForeground(new java.awt.Color(255, 255, 255));
        export.setText("EXPORT USER DATA");
        export.setBorder(null);
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });
        jPanel1.add(export, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 180, 30));

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

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin_icon/assessment.png"))); // NOI18N
        jLabel20.setText(" TRACKER");
        color3.add(jLabel20);
        jLabel20.setBounds(0, 0, 160, 40);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userTblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTblMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            popUp.show(userTbl, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_userTblMousePressed

    private void listMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMousePressed
         
        String fullName = list.getSelectedValue();
        String[] nameParts = fullName.trim().split("\\s+");
        
 
        int lastNameStartIndex = -1;
        for (int i = 0; i < nameParts.length; i++) {
            if (nameParts[i].equalsIgnoreCase("Delos") ||
                nameParts[i].equalsIgnoreCase("Dela") ||
                nameParts[i].equalsIgnoreCase("Del") ||
                nameParts[i].equalsIgnoreCase("San") ||   
                nameParts[i].equalsIgnoreCase("Santo") || 
                nameParts[i].equalsIgnoreCase("La") || 
                nameParts[i].equalsIgnoreCase("Santa")    
                    ) {
                lastNameStartIndex = i;
                break;
            }
        }

        // If no last name identifier is found, default to the last part as the last name
        if (lastNameStartIndex == -1) {
            lastNameStartIndex = nameParts.length - 1;
        }

        String firstName = String.join(" ", Arrays.copyOfRange(nameParts, 0, lastNameStartIndex));
        String lastName = String.join(" ", Arrays.copyOfRange(nameParts, lastNameStartIndex, nameParts.length));
        
        
        dbconnector dbc = new dbconnector();

        try (PreparedStatement pst = dbc.connect.prepareStatement("SELECT * FROM tbl_u WHERE u_fname = ? AND u_lname = ?")) {
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            ResultSet rs = pst.executeQuery();    

      
            if (rs.next()) {
                userAEU ru = new userAEU();
                ru.u_id.setText(String.valueOf(rs.getInt("u_id")));
                ru.u_fname.setText(rs.getString("u_fname"));
                ru.u_lname.setText(rs.getString("u_lname"));
                ru.u_uname.setText(rs.getString("u_uname"));
                ru.u_email.setText(rs.getString("u_email"));
                ru.u_type.setSelectedItem(rs.getString("u_type"));
                ru.u_status.setSelectedItem(rs.getString("u_status"));
                ru.ACCOUNT_NAME.setText(rs.getString("u_fname") + " " + rs.getString("u_lname"));
                ru.image.setIcon(ru.ResizeImage(rs.getString("u_image"), null, ru.image));
                ru.oldpath = rs.getString("u_image");
                ru.path = rs.getString("u_image");
                ru.destination = rs.getString("u_image");
                ru.setVisible(true);
                this.dispose();
                
                if(rs.getString("u_image").isEmpty()){
                    ru.addProfile.setText(" Add profile");
                    ru.remove.setEnabled(false);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Errors: " + ex.getMessage());
        }
    }//GEN-LAST:event_listMousePressed

    private void searchFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMousePressed

    }//GEN-LAST:event_searchFieldMousePressed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed

    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
       
       listModel.removeAllElements();

        if(!searchField.getText().equals("")){
        list.setSize(200,210);

        dbconnector dbc = new dbconnector();

        try(PreparedStatement pst = dbc.connect.prepareStatement("SELECT * FROM tbl_u WHERE u_fname LIKE ? OR u_lname LIKE ?")){

            String name = searchField.getText();
            pst.setString(1,"%"+name+"%");
            pst.setString(2,"%"+name+"%");
            ResultSet rs = pst.executeQuery();
        
         while(rs.next()){
             listModel.addElement(rs.getString("u_fname") + " " + rs.getString("u_lname"));
         }

            }catch(SQLException ex){
                 System.out.println("Errors: "+ex.getMessage());
         }                   

        }else{
             list.setSize(200,0);
            }
    }//GEN-LAST:event_searchFieldKeyReleased

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
     
        String uid = userTbl.getValueAt(userTbl.getSelectedRow(), 0).toString();

        try {
             dbconnector dbc = new dbconnector();
             TableModel tbl = userTbl.getModel();
             ResultSet rs = dbc.getData("SELECT * FROM tbl_u WHERE u_id = '" + uid + "'");

             if (rs.next()) {
           
              String imagePath = rs.getString("u_image");

              ImageIcon originalIcon = new ImageIcon(imagePath);
              
              ImageIcon resizedIcon = resizeImage(originalIcon, 170, 170);

              image.setIcon(resizedIcon);

              u_id.setText(rs.getString("u_id"));
              fullname.setText(rs.getString("u_fname") + " " + rs.getString("u_lname"));
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
                    ur.u_pass.setText("");
                    ur.u_pass.setEnabled(false);
                    ur.u_type.setSelectedItem(""+resultSet.getString("u_type"));
                    ur.u_status.setSelectedItem(""+resultSet.getString("u_status"));
                    ur.add.setEnabled(false);
                    ur.update.setEnabled(true);
                    ur.image.setIcon(ur.ResizeImage(resultSet.getString("u_image"), null, ur.image));
                    ur.oldpath = resultSet.getString("u_image");
                    ur.path = resultSet.getString("u_image");
                    ur.destination = resultSet.getString("u_image");
                    ur.setVisible(true);
                    this.dispose();
                    
                    if(resultSet.getString("u_image").isEmpty()){
                    ur.addProfile.setText("Add user profile");
                }
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
        }
    }//GEN-LAST:event_formWindowActivated

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed

    }//GEN-LAST:event_excelActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed

        if(nameField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please name the pdf first to generate");
            return;
        }
        String name = nameField.getText() + ".pdf";
        String location = System.getProperty("user.home") + "/Documents/";

        try {
            dbconnector dbc = new dbconnector();
            String query = "SELECT u_id, u_fname, u_lname, u_email, u_uname FROM tbl_u";
            ResultSet resultSet = dbc.getData(query);

            com.itextpdf.text.Document document = new com.itextpdf.text.Document(PageSize.A5.rotate());
            PdfWriter.getInstance(document, new FileOutputStream(location + name));
            document.open();

            PdfPTable pdfPTable = new PdfPTable(5);

            pdfPTable.addCell("ID");
            pdfPTable.addCell("Firstname");
            pdfPTable.addCell("Lastname");
            pdfPTable.addCell("Email");
            pdfPTable.addCell("Username");

            // Check if the result set has data and process the first row
            if (resultSet.next()) {
                do {
                    // Retrieve each column by name and add to the table
                    pdfPTable.addCell(resultSet.getString("u_id"));
                    pdfPTable.addCell(resultSet.getString("u_fname"));
                    pdfPTable.addCell(resultSet.getString("u_lname"));
                    pdfPTable.addCell(resultSet.getString("u_email"));
                    pdfPTable.addCell(resultSet.getString("u_uname"));
                } while (resultSet.next()); // Continue with the rest of the rows
            }

            document.add(pdfPTable);
            document.close();
            Window window = SwingUtilities.getWindowAncestor(exportData);
            window.dispose();
            JOptionPane.showMessageDialog(null, "Successfully Generated");
            nameField.setText("");
        } catch (DocumentException | FileNotFoundException e) {
            System.err.println(e);
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }

    }//GEN-LAST:event_pdfActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed

        Object[] options = {};
        JOptionPane.showOptionDialog(null, exportData, "",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
            null, options, null);

    }//GEN-LAST:event_exportActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed

        JPanel myPanel = new JPanel();

        try {
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_u WHERE u_id = '" + u_id.getText() + "'");

            if (rs.next()) {
                PrintUserDets pud = new PrintUserDets();
                String imagePath = rs.getString("u_image");

                ImageIcon originalIcon = new ImageIcon(imagePath);

                ImageIcon resizedIcon = resizeImage(originalIcon, 170, 170);

                pud.image.setIcon(resizedIcon);

                pud.uid.setText(rs.getString("u_id"));
                pud.fullname.setText(rs.getString("u_fname") + " " + rs.getString("u_lname"));
                pud.username.setText(rs.getString("u_usn"));
                pud.umail.setText(rs.getString("u_email"));
                pud.type.setText(rs.getString("u_type"));

                String as = rs.getString("u_status");

                stats.setText(""+as);

                PanelPrinter pPrint = new PanelPrinter(pud.page);
                pPrint.printPanel();
            }

        }catch(SQLException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_printActionPerformed

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
    private javax.swing.JPanel color1;
    private javax.swing.JPanel color2;
    private javax.swing.JPanel color3;
    private javax.swing.JPanel color4;
    private javax.swing.JMenuItem edit;
    private javax.swing.JButton excel;
    private javax.swing.JButton export;
    private javax.swing.JPanel exportData;
    private javax.swing.JLabel fullname;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton pdf;
    private javax.swing.JPopupMenu popUp;
    private javax.swing.JButton print;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel stats;
    private javax.swing.JLabel type;
    private javax.swing.JLabel u_id;
    private javax.swing.JLabel umail;
    private javax.swing.JTable userTbl;
    private javax.swing.JLabel username;
    private javax.swing.JMenuItem view;
    private javax.swing.JPanel viewpanel;
    // End of variables declaration//GEN-END:variables
}
