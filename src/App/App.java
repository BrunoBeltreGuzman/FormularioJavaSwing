/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Colores.Colores;
import Eventos.MenuEventos;
import Eventos.SignInEventos;
import Eventos.SignUpEventos;
import Ventana.Ventana;

/**
 *
 * @author diosl
 */
public class App {
    
    private static void iniciar(){
        Ventana ventana = new Ventana();
        Colores colores = new Colores();
        MenuEventos menuEventos = new MenuEventos(ventana, colores);
        SignInEventos  signInEventos = new SignInEventos(ventana, colores);
        SignUpEventos  signUpEventos = new SignUpEventos(ventana, colores);
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        iniciar();
        
    }
    
}
