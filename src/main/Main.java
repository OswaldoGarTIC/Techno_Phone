/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllers.*;
import models.*;
import views.*;
/**
 *
 * @author BLABPC23
 */
public class Main {
    public static void main(String[]Gary){
        Object modules[] = new Object[2];
        
        ModelProveedores modelProveedores = new ModelProveedores();
        ViewProveedores viewProveedores = new ViewProveedores();
        ControllerProveedores controllerProveedores = new ControllerProveedores(modelProveedores,viewProveedores);
        
        ControllerProductos controllerProductos = new ControllerProductos();
        
        modules[0] = controllerProductos;
        modules[1] = controllerProveedores;
        
        ModelMain modelMain = new ModelMain();
        ViewMain viewMain = new ViewMain();
        ControllerMain controllerMain = new ControllerMain(modelMain, viewMain, modules);
    }
}
