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
public class SignUpEventos implements MouseListener{

    private Colores colores;

    private Ventana ventana;

    public SignUpEventos(Ventana ventana, Colores colores) {

        this.colores = colores;
        this.ventana = ventana;
        
        ventana.getTexNombre().addMouseListener(this);
        ventana.getTexNomUsuario().addMouseListener(this);
        ventana.getTexMail().addMouseListener(this);
        ventana.getTesPassW().addMouseListener(this);
        ventana.getBtnRegistrar().addMouseListener(this);
        
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
        
        if (e.getSource() == ventana.getTexNombre()) {
            ventana.getTexNombre().setBorder(new javax.swing.border.LineBorder(colores.getBorderAzul(), 1, true));
        }
        if (e.getSource() == ventana.getTexNomUsuario()) {
            ventana.getTexNomUsuario().setBorder(new javax.swing.border.LineBorder(colores.getBorderAzul(), 1, true));
        }
        if (e.getSource() == ventana.getTexMail()) {
            ventana.getTexMail().setBorder(new javax.swing.border.LineBorder(colores.getBorderAzul(), 1, true));
        }
        if (e.getSource() == ventana.getTesPassW()) {
            ventana.getTesPassW().setBorder(new javax.swing.border.LineBorder(colores.getBorderAzul(), 1, true));
        }
        if (e.getSource() == ventana.getBtnRegistrar()) {
            ventana.getBtnRegistrar().setBackground(colores.getColorPrymary().brighter());
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        
           if (e.getSource() == ventana.getTexNombre()) {
            ventana.getTexNombre().setBorder(new javax.swing.border.LineBorder(colores.getGris1(), 1, true));
        }
        if (e.getSource() == ventana.getTexNomUsuario()) {
            ventana.getTexNomUsuario().setBorder(new javax.swing.border.LineBorder(colores.getGris1(), 1, true));
        }
        if (e.getSource() == ventana.getTexMail()) {
            ventana.getTexMail().setBorder(new javax.swing.border.LineBorder(colores.getGris1(), 1, true));
        }
        if (e.getSource() == ventana.getTesPassW()) {
            ventana.getTesPassW().setBorder(new javax.swing.border.LineBorder(colores.getGris1(), 1, true));
        }
        if (e.getSource() == ventana.getBtnRegistrar()) {
            ventana.getBtnRegistrar().setBackground(colores.getColorPrymary());
        }
    }
    
}
