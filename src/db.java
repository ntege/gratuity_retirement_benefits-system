import java.sql.*;
import javax.swing.*;

public class db {
    
    public static Connection java_db(){
        
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
            
              JOptionPane.showMessageDialog(null, "Connection established");
            return conn;
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "error in connection");
            return null;
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
