/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groceryapp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author sn-cm
 */
public class TableButton extends JButton{
    
    private boolean mousepress;
    
    public TableButton(){
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                mousepress = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousepress = false;
            }    
    });
}

}