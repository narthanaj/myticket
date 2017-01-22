
package classes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbconnect {
    
    public static Connection connect(){
        
        Connection con = null;
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/myticket","root","");
            System.out.println("Success");
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println("Db connection Error");
        }
                
                return con;
    }
    
    
}
