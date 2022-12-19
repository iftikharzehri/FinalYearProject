/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author ifti //
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try {
            String user = "iftidev";
            String password = "balochistan";
            String url = "jdbc:mysql://localhost:3306/LMS";
            Class.forName("com.mysql.cj.jdbc.Driver");

            java.sql.Connection connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("connected sucessfully..." + connection.getCatalog());
            } else {
                System.out.println("fail...");

            }
            String query = "insert into ISSUE values (34, 872, 3, NOW(), date_add(NOW(), INTERVAL 10 DAY))";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();
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

//
//   System.out.println("enter date");
//            Scanner in = new Scanner(System.in);
//
//            String id = in.next();
//            String name = in.next();
//
//            Date date = new Date();
//            java.sql.Date sqldate = new java.sql.Date(date.getTime());
//            String sql = "INSERT INTO checkD (`id`, 'name', 'cDate') VALUES (?, ?, ?)";
//
//            Statement st = (Statement) connection.createStatement();
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, id);
//            ps.setString(2, name);
//            ps.setDate(3, sqldate);
//
//            ps.execute();
////            st.executeQuery(sql);
