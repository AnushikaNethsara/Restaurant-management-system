/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class AdminLogin {
            String pass;

    
    public boolean validate(String id, String password){
         try
        {   
            
            DB_connection n =new DB_connection();
            Connection c=n.getDBConnection();
            
            
            String sql=("SELECT * FROM newuser WHERE Employee_ID='"+id+"'");
            Statement stmt=c.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            
            while(rs.next())
            {
                pass=rs.getString(2);
            }
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
         
         if(password.equals(pass))
             return true;
         
         else
             return false;
        
    }
    
}
