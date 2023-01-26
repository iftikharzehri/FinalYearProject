///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package LMS;
//
//import com.sun.jdi.connect.spi.Connection;
//import java.beans.Statement;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
///**
// *
// * @author ifti //
// */
//
//
//    public class ConnectionProvider {
//
//        public static void main(String[] args) {
//            getCon();
//        }
//
//        public static Connection getCon() {
//            try {
//                String user = "iftidev";
//                String password = "balochistan";
//                String url = "jdbc:mysql://localhost:3306/LMS";
//                Class.forName("com.mysql.cj.jdbc.Driver");
//
//                java.sql.Connection con = DriverManager.getConnection(url, user, password);
//                String test = "SELECT LMS.ISSUE_BOOK.ISSUE_ID, LMS.ISSUE_BOOK.STU_ID, LMS.ISSUE_BOOK.BOOK_ID, LMS.ISSUE_BOOK.ISSUE_DATE,"
//                        + " LMS.ISSUE_BOOK.RETURN_DATE,LMS.ISSUE_BOOK.RETURN_STATUS,LMS.STUDENT.SID,LMS.STUDENT.`NAME`"
//                        + "FROM LMS.ISSUE_BOOK"
//                        + "INNER JOIN LMS.STUDENT"
//                        + "ON LMS.ISSUE_BOOK.STU_ID= LMS.STUDENT.SID ";
//                Statement st = (Statement) con.createStatement();
//                Statement s = (Statement) con.createStatement();
//                
//                st.execute();
//                System.out.println("test executed!");
//
//                if (con != null) {
//                    System.out.println("connected sucessfully..." + con.getCatalog());
//                    System.out.println("output from connectionprovider class");
//                } else {
//                    System.out.println("fail...");
//
//                }
//
//            } catch (ClassNotFoundException ex) {
//
//                //  Logger.getLogger(sampleapps.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                // Logger.getLogger(SampleApps.class.getName()).log(Level.SEVERE, null, ex);
//                System.out.println(ex);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//            return null;
//
//        }
//
//    }
