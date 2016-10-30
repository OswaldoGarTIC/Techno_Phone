/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author BLABPC23
 */
public class ModelMain {
    private JLabel jLabel = new JLabel();
    
    MouseAdapter ActionPerformed_jLabels = new MouseAdapter(){
        public void mouseClicked(MouseEvent evt){
            getjLabel().setForeground(Color.black);
        }
        public void mouseEntered(MouseEvent men){
            getjLabel().setForeground(Color.gray);
        }
        public void mouseExited(MouseEvent mle){
            getjLabel().setForeground(Color.white);
        }
    };

    /**
     * @return the jLabel
     */
    public JLabel getjLabel() {
        return jLabel;
    }

    /**
     * @param jLabel the jLabel to set
     */
    public void setjLabel(JLabel jLabel) {
        this.jLabel = jLabel;
    }
}
