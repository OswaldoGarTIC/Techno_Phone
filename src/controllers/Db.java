/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MarGaryIto
 */
public class Db {
    public static Connection connection;
    public static Connection connect(){
    String url = "jdbc:mysql://localhost:3306/tecno_phone";
    String user = "root";
    String pass = "1234";
    System.out.println("Conectando...");
    try{
         connection = DriverManager.getConnection(url, user,pass);
    
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    return connection;
    }
}
