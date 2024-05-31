
package config;


import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class dbconnector {
    
    public Connection connect;
    private String newPassword;
    
    public dbconnector(){
    
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/btt", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
    //Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
    //Function to save data    
        public boolean insertData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Success!");
                pst.close();
                return true;
            }catch(SQLException ex){
                System.out.println("COnnection Error:"+ ex);
                return false;
            }
        }
        //Function to update data
        public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
        }
        // Function to delete data
public boolean deleteData(String sql) {
    try (PreparedStatement pst = connect.prepareStatement(sql)) {
        int rowsDeleted = pst.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Row deleted successfully!");
            return true;
        } else {
            System.out.println("No row found with the specified ID.");
            return false;
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error occurred while deleting the row: " + ex.getMessage());
        return false;
    }
}
    public String generateRandomCode(int length) {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
    SecureRandom random = new SecureRandom();
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < length; i++) {
        int randomIndex = random.nextInt(chars.length());
        sb.append(chars.charAt(randomIndex));
        
    }
    
    return sb.toString();
    
}
     public String getNewPassword() {
        return newPassword;
    }

}