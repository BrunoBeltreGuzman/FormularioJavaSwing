/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Colores.Colores;
import Ventana.Ventana;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author diosl
 */
public class MenuEventos implements MouseListener{

    private Colores colores;
    
    private Ventana ventana;
    
    public MenuEventos(Ventana ventana, Colores colores){
        
        this.colores = colores;
        this.ventana = ventana;
        
        
        ventana.getBtnSignUp().addMouseListener(this);
        ventana.getBtnSignIn().addMouseListener(this);
        
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == ventana.getBtnSignUp()){
            ventana.getBtnSignUp().setBackground(colores.getColorPrymary().brighter());
        }
        
        if(e.getSource() == ventana.getBtnSignIn()){
            ventana.getBtnSignIn().setOpaque(true);
            ventana.getBtnSignIn().setBorder(null);
            ventana.getBtnSignIn().setBackground(colores.getColorPrymary().brighter());
            ventana.getBtnSignIn().setForeground(Color.WHITE);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == ventana.getBtnSignUp()){
            ventana.getBtnSignUp().setBackground(colores.getColorPrymary());
        }
        
        if(e.getSource() == ventana.getBtnSignIn()){
            ventana.getBtnSignIn().setOpaque(false);
            ventana.getBtnSignIn().setBorder(new javax.swing.border.LineBorder(colores.getColorPrymary(), 2, true));
            ventana.getBtnSignIn().setBackground(colores.getColorPrymary());
            ventana.getBtnSignIn().setForeground(colores.getColorPrymary());
            
        }
    }
    
}
