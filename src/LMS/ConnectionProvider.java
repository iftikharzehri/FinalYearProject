/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS;

import Frames.LogIn;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author ifti //
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try {
            String user = "root";
            String password = "iftikharzehri";
            String url = "jdbc:mysql://localhost:3306/LMS";
            Class.forName("com.mysql.cj.jdbc.Driver");
//            String query = "INSERT INTO logIn VALUES (2121, 'kamran', 'KHAN', 22)";
//String sql = "INSERT INTO logIn (`id`, `first`, `last`, `age`) VALUES ('4', 'asif', 'khan', '45');";
            java.sql.Connection connection = DriverManager.getConnection(url, user, password);
//            Statement st = connection.createStatement();
//           PreparedStatement ps =connection.prepareStatement(sql);
//            ps.execute();
//            st.executeQuery(sql);
            if (connection != null) {
                System.out.println("connected sucessfully..." + connection.getCatalog());
            } else {
                System.out.println("fail...");

            }
        } catch (ClassNotFoundException ex) {

            //  Logger.getLogger(sampleapps.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            // Logger.getLogger(SampleApps.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

}
