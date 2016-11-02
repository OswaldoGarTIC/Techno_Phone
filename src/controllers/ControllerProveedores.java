/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelProveedores;
import views.ViewProveedores;
/**
 *
 * @author BLABPC23
 */
public class ControllerProveedores {
    ModelProveedores modelProveedores;
    ViewProveedores viewProveedores;
    
    public ControllerProveedores(ModelProveedores modelProveedores,ViewProveedores viewsProveedores){
        this.modelProveedores = modelProveedores;
        this.viewProveedores = viewProveedores;
        initView();
    }
    private void initView(){
        viewProveedores.setVisible(true);
    }
}
