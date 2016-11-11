/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllers.*;
import java.sql.SQLException;
import models.*;
import views.*;
/**
 *
 * @author MarGaryIto
 */
public class Main {
    public static void main(String[]Gary) throws SQLException{
        Object modules[] = new Object[5];
        
        ModelProveedores modelProveedores = new ModelProveedores();
        ViewProveedores viewProveedores = new ViewProveedores();
        ControllerProveedores controllerProveedores = new ControllerProveedores(modelProveedores,viewProveedores);
        
        ControllerProductos controllerProductos = new ControllerProductos();
        
        Model_Add_User modelAddUser = new Model_Add_User();
        View_Add_User viewAddUser = new View_Add_User();
        Controller_Add_User controllerAddUser = new Controller_Add_User(modelAddUser, viewAddUser);
        
        Model_About modelAbout = new Model_About();
        View_About viewAbout = new View_About();
        Controller_About controllerAbout = new Controller_About(viewAbout, modelAbout);
        
        ModelClientes modelClientes = new ModelClientes();
        View_Clients viewClients = new View_Clients();
        ControllerClientes controllerClientes = new ControllerClientes(modelClientes, viewClients);
        
        modules[0] = controllerProductos;
        modules[1] = controllerProveedores;
        modules[2] = controllerAddUser;
        modules[3] = controllerAbout;
        modules[4] = controllerClientes;
        ModelMain modelMain = new ModelMain();
        ViewMain viewMain = new ViewMain();
        ControllerMain controllerMain = new ControllerMain(modelMain, viewMain, modules);
    }

    
}
