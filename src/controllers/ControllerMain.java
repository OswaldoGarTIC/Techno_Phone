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
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import models.ModelMain;
import views.ViewMain;
/**
 *
 * @author BLABPC23
 */
public class ControllerMain{
    ModelMain modelMain;
    ViewMain viewMain;
    ControllerProductos controllerProductos;
    ControllerProveedores controllerProveedores;
    
    Object modules[];
    
    //ControllerAbout controllerAbout;
    
    public ControllerMain(ModelMain modelMain,ViewMain viewMain,Object modules[]){
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        
        viewMain.jLabel_Ayuda.addMouseListener(ActionPerformed_jLabel_Ayuda);
        viewMain.jLabel_Ayuda_AcercaDe.addMouseListener(ActionPerformed_jLabel_Ayuda_AcercaDe);
        
        controllerProductos = (ControllerProductos)modules[0];
        controllerProveedores = (ControllerProveedores)modules[1];
        
        initView();
    }
    
    MouseAdapter ActionPerformed_jLabel_Ayuda = new MouseAdapter(){
        public void mouseClicked(MouseEvent evt){
                int count = evt.getClickCount();
                if (count == 1){
                    viewMain.setContentPane(controllerProveedores.viewsProveedores);
                    viewMain.revalidate();
                    viewMain.repaint();
                    System.out.println("Ayuda");
                }
        }
    };
    MouseAdapter ActionPerformed_jLabel_Ayuda_AcercaDe = new MouseAdapter(){
        public void mouseClicked(MouseEvent evt){
                int count = evt.getClickCount();
                if (count == 1){
                    System.out.println("Acerda de...");
                }
        }
    };
    
    private void initView(){
        viewMain.setTitle("TecnoPhone");
        viewMain.setLocationRelativeTo(null);
        viewMain.setVisible(true);
    }
}
