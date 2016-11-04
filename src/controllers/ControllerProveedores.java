/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import models.ModelProveedores;
import views.ViewProveedores;
import mysql.Conexion;
import views.ViewMain;
/**
 *
 * @author BLABPC23
 */
public class ControllerProveedores {
    ModelProveedores modelProveedores;
    ViewProveedores viewProveedores;
    ControllerMain controllerMain;
    ViewMain viewMain;
    Conexion conexion;
    private String tarea = "ninguna";
    mysql.Conexion con = new mysql.Conexion();
    
    public ControllerProveedores(ModelProveedores modelProveedores,ViewProveedores viewProveedores){
        this.modelProveedores = modelProveedores;
        this.viewProveedores = viewProveedores;
        initView();
        mouseListener();
    }
    private void mouseListener(){
        viewProveedores.jLabel_Agregar.addMouseListener(ActionPerformed_jLabels);
        viewProveedores.jLabe_lEditar.addMouseListener(ActionPerformed_jLabels);
        viewProveedores.jLabel_Eliminar.addMouseListener(ActionPerformed_jLabels);
        viewProveedores.jLabel_Buscar.addMouseListener(ActionPerformed_jLabels);
        viewProveedores.jLabel_Conexion.addMouseListener(ActionPerformed_jLabels);
        viewProveedores.jLabel_aceptar.addMouseListener(ActionPerformed_jButons);
        viewProveedores.jLabel_cancelar.addMouseListener(ActionPerformed_jButons);
        viewProveedores.jLabel_Sandwich.addMouseListener(Sandwich);
    }
    MouseAdapter ActionPerformed_jLabels = new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent evt){
            if(evt.getComponent()==viewProveedores.jLabel_Conexion){
                tarea = "conexion";
                mostrarPanelMedio();
            }else if(evt.getComponent()==viewProveedores.jLabel_Agregar){
                tarea = "agregar";
                mostrarPanelMedio();
            }else if(evt.getComponent()==viewProveedores.jLabe_lEditar){
                tarea="ediar";
                mostrarPanelMedio();
            }
            else if(evt.getComponent()==viewProveedores.jLabel_Eliminar){
                tarea = "eliminar";
                mostrarPanelMedio();
            }else if(evt.getComponent()==viewProveedores.jLabel_Buscar){
                tarea = "buscar";
                mostrarPanelMedio();
            }
            JLabel jlabel = (JLabel) evt.getComponent();
            jlabel.setForeground(Color.darkGray);
        }
        @Override
        public void mouseEntered(MouseEvent men){
            JLabel jlabel = (JLabel) men.getComponent();
            jlabel.setForeground(Color.gray);
        }
        @Override
        public void mouseExited(MouseEvent mle){
            JLabel jlabel = (JLabel) mle.getComponent();
            jlabel.setForeground(Color.white);
        }
    };
    MouseAdapter ActionPerformed_jButons = new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent evt){
            if(evt.getComponent()==viewProveedores.jLabel_aceptar){
                if(null != tarea)switch (tarea) {
                    case "agregar":
                {
                    try {
                        agregar();
                    } catch (SQLException ex) {
                        Logger.getLogger(ControllerProveedores.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                        break;
                    case "editar":
                        editar();
                        break;
                    case "eliminar":
                        eliminar();
                        break;
                    case "buscar":
                        buscar();
                        break;
                    case "conexion":
                        conexion();
                        break;
                    default:
                        break;
                }
            }else if(evt.getComponent()==viewProveedores.jLabel_cancelar){
                mostrarPanelMedio();
            }
            JLabel jlabel = (JLabel) evt.getComponent();
            jlabel.setForeground(Color.darkGray);
        }
        @Override
        public void mouseEntered(MouseEvent men){
            JLabel jlabel = (JLabel) men.getComponent();
            jlabel.setForeground(Color.gray);
        }
        @Override
        public void mouseExited(MouseEvent mle){
            JLabel jlabel = (JLabel) mle.getComponent();
            jlabel.setForeground(Color.blue);
        }
    };
    MouseAdapter Sandwich = new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent evt){
            sandwichActionPerformed();
        }
    };
    private void agregar() throws SQLException{    
        String nombre=this.viewProveedores.jLabel_nombre.getText();
        String sql = "insert into proveedores(nombre) values ('"+nombre+"');";
        PreparedStatement us = con.conexion().prepareStatement(sql);
        us.executeQuery();
    } 

    private void initView() {
        viewProveedores.setVisible(true);
    }
        
    private void editar(){
        //
    }
    private void eliminar(){
        //
    }
    private void buscar(){
        //
    }
    private void conexion(){
        //
    }
    private void sandwichActionPerformed(){
        this.viewMain.setContentPane(controllerMain.viewMain);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    private void mostrarPanelMedio(){
        if(viewProveedores.jPanel_Medio.isVisible()){
            viewProveedores.jPanel_Medio.setVisible(false);
            tarea = "ninguna";
        }else{
            viewProveedores.jPanel_Medio.setVisible(true);
        }
    }
}
