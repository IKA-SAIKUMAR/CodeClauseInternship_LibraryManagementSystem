/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author ikasa
 */
public class ConnectionProvider {
         public static Connection getCon()
         {
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "sai520");
               return con;
            }
            catch(Exception e)
            {
                System.out.println(e);
                return null;
            }
         }
}
