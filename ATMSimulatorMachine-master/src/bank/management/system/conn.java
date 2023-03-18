package bank.management.system;
import java.sql.*;


public class conn{
    Connection c;
    Statement s;
    public conn(){
    try{
        c = DriverManager.getConnection("jdbc:mysql://localhost:3307/bankmanagementsystem","root","root");
        System.out.println("Database Connected");
        s=c.createStatement();
    }catch(Exception e){
        System.out.println(e);
    }
    }
    
}
