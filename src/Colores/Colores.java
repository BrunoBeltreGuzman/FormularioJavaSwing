/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colores;

import java.awt.Color;

/**
 *
 * @author diosl
 */
public class Colores {

    private Color fondo1;
    private Color gris1;
    private Color gris2;
    private Color gris3;
    private Color colorPrymary;
    private Color colorPrymary2;

    private Color colorBackground;
    private Color colorForeground;

    private Color colorFaceBook;
    private Color colorGoogle;
    private Color colorApple;
    private Color colorMicrosoft;

    public Colores() {
        fondo1 = new Color(255, 255, 255);
        gris1 = new Color(130,130,130);
        gris2 = new Color(78, 79, 80);
        gris3 = new Color(99, 101, 103);
        colorPrymary = new Color(0, 152, 218);
        colorPrymary2 = new Color(21, 43, 108);
        colorBackground = new Color(24, 25, 26);
        colorForeground = new Color(255, 255, 255);

        colorFaceBook = new Color(23, 115, 234);;
        colorGoogle = new Color(247, 63, 47);
        colorApple = new Color(0, 0, 0);
        colorMicrosoft = new Color(110, 182, 28);

    }

    public Color getFondo1() {
        return fondo1;
    }

    public Color getGris1() {
        return gris1;
    }

    public Color getGris2() {
        return gris2;
    }

    public Color getGris3() {
        return gris3;
    }

    public Color getColorPrymary() {
        return colorPrymary;
    }

    public Color getColorPrymary2() {
        return colorPrymary2;
    }

    public Color getColorBackground() {
        return colorBackground;
    }

    public Color getColorForeground() {
        return colorForeground;
    }

    Color borderVerde = new Color(0, 127, 0);

    public Color getBorderVerde() {
        return borderVerde;
    }

    Color borderAzul = new Color(0, 126, 255);

    public Color getBorderAzul() {
        return borderAzul;
    }

    Color borderRojo = new Color(255, 0, 0);

    public Color getBorderRojo() {
        return borderRojo;
    }

    public Color getColorFaceBook() {
        return colorFaceBook;
    }

    public Color getColorGoogle() {
        return colorGoogle;
    }

    public Color getColorApple() {
        return colorApple;
    }

    public Color getColorMicrosoft() {
        return colorMicrosoft;
    }
    
    
    

}
