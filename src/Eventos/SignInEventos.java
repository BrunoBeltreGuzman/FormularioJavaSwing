/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Colores.Colores;
import Ventana.Ventana;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author diosl
 */
public class SignInEventos implements MouseListener {

    private Colores colores;

    private Ventana ventana;

    public SignInEventos(Ventana ventana, Colores colores) {

        this.colores = colores;
        this.ventana = ventana;
        
        ventana.getTexUser().addMouseListener(this);
        ventana.getTexPass().addMouseListener(this);
        ventana.getBtnIniciar().addMouseListener(this);



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
        
        if (e.getSource() == ventana.getTexUser()) {
            ventana.getTexUser().setBorder(new javax.swing.border.LineBorder(colores.getBorderAzul(), 1, true));
        }
        if (e.getSource() == ventana.getTexPass()) {
            ventana.getTexPass().setBorder(new javax.swing.border.LineBorder(colores.getBorderAzul(), 1, true));
        }
        if (e.getSource() == ventana.getBtnIniciar()) {
            ventana.getBtnIniciar().setBackground(colores.getColorPrymary().brighter());
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == ventana.getTexUser()) {
            ventana.getTexUser().setBorder(new javax.swing.border.LineBorder(colores.getGris1(), 1, true));
        }
        if (e.getSource() == ventana.getTexPass()) {
            ventana.getTexPass().setBorder(new javax.swing.border.LineBorder(colores.getGris1(), 1, true));
        }
        if (e.getSource() == ventana.getBtnIniciar()) {
            ventana.getBtnIniciar().setBackground(colores.getColorPrymary());
        }
    }

}
