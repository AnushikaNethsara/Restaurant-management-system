/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class DB_connection {
      
    
        public  Connection getDBConnection() throws Exception{
        final String DBURL="jdbc:mysql://localhost:3306/db_connection";
        final String USERNAME="root";
        final String PASSWORD="root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        return conn;
        }
        
        public  void insertData(AddFood ob)throws Exception{
            try (Connection c = getDBConnection()) {
                Statement stmt=c.createStatement();
                String sql="insert into addFood (ID,Name,Category,Price,Description) values ('"+ob.getfId()+"','"+ob.getFname()+"','"+ob.getCategory()+"','"+ob.getPrice()+"','"+ob.getDescription()+"')";
                stmt.executeUpdate(sql);
                c.close();
            }
        }
            
          
        public  void updateData (AddFood f1)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql ="update foodItem set fId ='"+f1.getfId()+"',name='"+f1.getFname()+"',category='"+f1.getCategory()+"',price='"+f1.getPrice()+"',description='"+f1.getDescription()+"' where fId ='"+f1.getfId()+"'";
        stmt.executeUpdate(sql);
        c.close();
        }
        

        public void updateTable() throws Exception{
            DB_connection e=new DB_connection();
            Connection c=e.getDBConnection();
            Statement stmt=c.createStatement();
            String sql ="select *from addfood";
            stmt.executeUpdate(sql);
            c.close();
        }

        public void insertFeedBack(Feed_Back obj)throws Exception{
            try (Connection c = getDBConnection()) {
                Statement stmt=c.createStatement();
                String sql="insert into feedback (ID,First_Name,Last_Name,Email,Know,Comment) values ('"+obj.getId()+"','"+obj.getfName()+"','"+obj.getlName()+"','"+obj.getEmail()+"','"+obj.getKnow()+"','"+obj.getComment()+"')";
                stmt.executeUpdate(sql);
                c.close();
            }
        }
        
        public void newUserSignIn(newUser obj)throws Exception{
            try (Connection c = getDBConnection()) {
                Statement stmt=c.createStatement();
                String sql="insert into newuser (Employee_ID,Password) values ('"+obj.getEmployeeId()+"','"+obj.getPassword()+"')";
                stmt.executeUpdate(sql);
                c.close();
            }
        }
        
        
        public void userSignin(addEmployee obj)throws Exception{
            try (Connection c = getDBConnection()) {
                Statement stmt=c.createStatement();
                String sql="insert into employee (ID,Full_Name,Birthday,Sex,Marital_Status,Address,NIC,Phone,Email) values ('"+obj.getId()+"','"+obj.getfName()+"','"+obj.getBirth()+"','"+obj.getSex()+"','"+obj.getMarital()+"','"+obj.getAddress()+"','"+obj.getNic()+"','"+obj.getPhone()+"','"+obj.getEmail()+"')";
                stmt.executeUpdate(sql);
                c.close();
            }
        }
        
        public void Sales(Sales obj)throws Exception{
            try (Connection c = getDBConnection()) {
                Statement stmt=c.createStatement();
                String sql="insert into sales (BillID,FoodID,FoodName,Category,Price,Quantity,Total) values ('"+obj.getBillNo()+"','"+obj.getId()+"','"+obj.getName()+"','"+obj.getCategory()+"','"+obj.getPrice()+"','"+obj.getQuantity()+"','"+obj.getTotal()+"')";
                stmt.executeUpdate(sql);
                c.close();
            }
        }
        
        public void addImage(ImageClass f1,File file)throws Exception{
            Connection c=getDBConnection();
            PreparedStatement ps=c.prepareStatement("update img set image =? where id ='"+f1.getId()+"'");
                        ps.setBinaryStream(1,f1.getImage(),(long)file.length());
                        ps.executeUpdate();

                        ps.close();
        }

        public  void insertData(ImageClass f1)throws Exception{
            Connection c=getDBConnection();
            Statement stmt=c.createStatement();
            String sql="insert into img (id) values ('"+f1.getId()+"')";
            stmt.executeUpdate(sql);
            c.close();

        }



    
}
