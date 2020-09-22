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
public class newUser {
    private String employeeId;
    private String password;
    boolean found=false,alreadyThere=false;
    
   
    public newUser(String employeeId,String password){
        this.employeeId=employeeId;
        this.password=password;

    }

    /**
     * @return the employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }


    public boolean employeeIdIdentifier(String enteredId){
        
         try
        {   
            System.out.println("enteredId: "+enteredId);
            DB_connection n=new DB_connection();
            Connection c=n.getDBConnection();
            String sql="SELECT ID FROM employee";
            //String sql=("SELECT * FROM feedback WHERE ID='"+a+"' ");
            Statement stmt=c.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            
            
        
            while(rs.next() && found!=true) 
            {
                
                if(rs.getString(1).equals(enteredId)){
                   found=true;
                    break;
                }
                    
                else 
                    found=false;
             
            }
           
        }
        catch(Exception e){
            System.out.println(e);
        }
         
        return found;
    }
    
    
    public boolean alreadyAdd(String enteredId){
         try
        {   
            System.out.println("enteredId: "+enteredId);
            DB_connection n=new DB_connection();
            Connection c=n.getDBConnection();
            String sql="SELECT Employee_ID FROM newuser";
            //String sql=("SELECT * FROM feedback WHERE ID='"+a+"' ");
            Statement stmt=c.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            
            
        
            while(rs.next() && alreadyThere!=true) 
            {
                
                if(rs.getString(1).equals(enteredId)){
                   alreadyThere=true;
                    break;
                }
                    
                else 
                    alreadyThere=false;
             
            }
           
        }
        catch(Exception e){
            System.out.println(e);
        }
         return alreadyThere;
        
    }
    
    
    
}
