/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderuleta;

public class Main {
   public static void main(String[] args) {
       Juegoderuleta ruleta = new Juegoderuleta();
       do{
            ruleta.menu();
            ruleta.eleccionusuarionum();
            ruleta.eleccincolorusuario();
            ruleta.numaleatorio();
            ruleta.coloraleatorio();
            ruleta.resultado();
       }while (ruleta.intpuntos!=0);
       System.out.println("Juego Terminado te quedaste sin puntos");
      
        
    }
    
}
