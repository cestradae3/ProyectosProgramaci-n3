/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoderuleta;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author FamiliaEstradaPC
 */
public class Juegoderuleta {
    Scanner objInput = new Scanner(System.in);    
    static int intapuesta=10;
    int intapuesta2=0;
    int intpuntos=100;
    String strcolor="";
    int intnumeroale;
    String strcolorale;
    int intnumeroele=0;
    String strcolorele;
    public void menu(){
        System.out.println("Juego de Ruleta");
        System.out.println("Sus puntos son "+ intpuntos);
    }
    
    public void resultado(){
        intapuesta2=0;
        if (intnumeroele== intnumeroale){
            intapuesta2 = intapuesta *3;
        }else if (strcolorele==strcolorale){
            intapuesta2= intapuesta2+ (intapuesta * 2);
        }else{
            intapuesta2 = -10;
        }
        intpuntos= intpuntos + intapuesta2;
    }
    
    public void eleccionusuarionum (){
        
        for (int i=0;i<=2;i=i+2){
            System.out.println("Elija un numero entero entre 1 y 10");
            intnumeroele = objInput.nextInt();
            if (intnumeroele>10){
                i=0;
            }else if(intnumeroele<=0) {
                i=0;
            }else {
                i=2;
            }
        }
    }
    
    public void eleccincolorusuario (){
        for (int i=0;i<=2;i=i+2){
            System.out.println("Elija un color");
            System.out.println("1-Blanco");
            System.out.println("2-Negro");
            int color=objInput.nextInt();
            if (color>2){
                i=0;
            }else if(color<=0) {
                i=0;
            }else {
                i=2;
                if (color==1){
                strcolorele="Blanco";
                }else{
                strcolorele="Negro";
                }
            }
            
        }
    }
    
    public void numaleatorio(){
        Random numale = new Random();
        intnumeroale = 1+ numale.nextInt(10); 
        System.out.println("Numero Random es "+ intnumeroale);
    }
    
    public void coloraleatorio(){
        if (intnumeroale%2==0){
            strcolorale="Negro";
        }else{
            strcolorale="Blanco";
        }
        System.out.println("El color Random es "+ strcolorale);
    }
     
}
