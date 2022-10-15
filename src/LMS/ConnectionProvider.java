/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ifti
// */


public class ConnectionProvider{
    

public static Connection connect() {
        //Making Database Connection once & using multiple times whenever required.
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =
            (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb", "root", "iftikharzehri");
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }}
//public class ConnectionProvider {
//     public static Connection getCon() {
//        try {
//            // String user = "root";
//            //    String password = "iftikharzehri";
//            //  String url = "jdbc:mysql://localhost:3306/new_table";
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb",
//                    "root", "iftikharzehri");
//           return (Connection) connection;
////           if (connection != null) {
////                System.out.println("connected sucessfully..." + connection.getCatalog());
////            } else {
////                System.out.println("fail...");
////                
////            }
//        } catch (ClassNotFoundException ex) {
//
//            //  Logger.getLogger(sampleapps.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            // Logger.getLogger(SampleApps.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println(ex);
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        return null;
//
//    }
//}
