package vechicle.parking.mysql;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azfar
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;

public class javaconnect {
    
    public static Connection ConnecrDb(){
        Connection conn = null;
        try{
            
            
           conn = DriverManager.getConnection("jdbc:mysql://localhost/vehicle_parking","root","");
            
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}
