/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    
    public ControllerMain(ModelMain modelMain,ViewMain viewMain,Object modules[]){
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        
        controllerProductos = (ControllerProductos)modules[0];
        controllerProveedores = (ControllerProveedores)modules[1];
        
        initView();
        mouseListener();
    }
    private void mouseListener(){
        viewMain.jLabel_Ayuda.addMouseListener(ActionPerformed_jLabels);
    }
    MouseAdapter ActionPerformed_jLabels = new MouseAdapter(){
        public void mouseClicked(MouseEvent evt){
            JLabel jlabel = (JLabel) evt.getComponent();
            jlabel.setForeground(Color.black);
        }
        public void mouseEntered(MouseEvent men){
            JLabel jlabel = (JLabel) men.getComponent();
            jlabel.setForeground(Color.gray);
        }
        public void mouseExited(MouseEvent mle){
            JLabel jlabel = (JLabel) mle.getComponent();
            jlabel.setForeground(Color.white);
        }
    };

    private void initView(){
        viewMain.setTitle("TecnoPhone");
        viewMain.setLocationRelativeTo(null);
        viewMain.setVisible(true);
    }
}
