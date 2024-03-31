package travel.management.system;
import java.sql.*;
// my sql driver
public class Conn{

   Connection c;
   public Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem?" + "autoReconnect=true&useSSL=false","root","Amir@4114");
            System.out.println("MONGODB CONNECTED!");
            s =c.createStatement();
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
