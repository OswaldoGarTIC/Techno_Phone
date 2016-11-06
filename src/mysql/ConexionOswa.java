/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author BLABPC23
 */
public class ConexionOswa {
    private Connection con = null;
    public Connection conexion(){
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acme","root","");                     

        }catch(SQLException err){ 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
    }
        return con;
}
}
