/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS;


import Frames.Add_Book;
import Frames.LogIn;
import static LMS.ConnectionProvider.getCon;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author ifti
 */
public class Main {

    public static void main(String[] args) {
        new LogIn().setVisible(true);
//        Connection con = getCon();
//new Add_Book().setVisible(true);
    }
    
    
    

}
