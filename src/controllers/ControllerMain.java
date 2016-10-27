/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import models.ModelMain;
import views.ViewMain;
/**
 *
 * @author BLABPC23
 */
public class ControllerMain {
    ModelMain modelMain;
    ViewMain viewMain;
    ControllerProductos controllerProductos;
    ControllerProveedores controllerProveedores;
    
    Object modules[];
    
    //ControllerAbout controllerAbout;
    
    public ControllerMain(ModelMain modelMain,ViewMain viewMain,Object modules[]){
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        
        viewMain.jLabel_Ayuda.addMouseListener(mouseAdapter);
        
        controllerProductos = (ControllerProductos)modules[0];
        controllerProveedores = (ControllerProveedores)modules[1];
        
        initView();
    }
    
    MouseAdapter mouseAdapter = new MouseAdapter(){
        public void mouseClicked(MouseEvent evt){
                int count = evt.getClickCount();
                if (count == 2){
                    System.out.println("Doble clic");
                }
        }
    };
    
    private void initView(){
        System.out.println("texto");
    }
}
