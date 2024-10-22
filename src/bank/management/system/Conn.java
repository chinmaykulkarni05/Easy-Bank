// class name conn which means connection
// this class will not run directly, we will create object of it and call it
// JDBC has 5 steps
// Step1. Register the Driver
// Step2. Create Connection
// Step3. Create Statement
// Step4. Execute Query
// Step5. Close Connection


//note import mysql driver (in jar file, see in library)
package bank.management.system;

import java.sql.*;                                                               //import sql library

public class Conn {
    
    Connection c;                                                                //create global obj of connection class
    Statement s;
    
    public Conn(){                                                               //creating constructor
        
        //here we need to handle exception coz mysql is external entity, error may occur during run time
        
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);                                                        //step1, after importing that jar file having mysql driver u dont need to perform step1
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "CHINmay@05");    //step2
            s = c.createStatement();                                                                        //step3
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }   
}
