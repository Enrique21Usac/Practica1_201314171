/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;
import static practica1.buscaminas_201314171.columnas;
import static practica1.buscaminas_201314171.filas;
import static practica1.buscaminas_201314171.minas;
import static practica1.buscaminas_201314171.ganar;
import static practica1.Practica1_201314171.op;
import static practica1.buscaminas_201314171.si;
import static practica1.buscaminas_201314171.sijuego;

/**
 *
 * @author 3nriqu3
 */
public class Menu1_201314171 {
   
    
    public static void Menu1() {
        
        Scanner sc = new Scanner(System.in);
        int opcion=0;
                    System.out.println("BUSCAMINAS");
      
        System.out.println("1. Jugar Nivel Principiante");
        System.out.println("2. Jugar Nivel Intermedio");
        System.out.println("3. Jugar Nivel Avanzado");
        System.out.println("4. Salir");
        System.out.println("");
        System.out.println("ingrese una opcion");
        opcion = sc.nextInt();
        System.out.println("");
                switch (opcion) {
            case 1:
                filas = 5;
                columnas = 5;
                minas = 4;
                ganar = (4 * 4) - 4;
                break;
            case 2:
                filas = 7;
                columnas = 7;
                minas = 8;
                ganar = (6*6) - 8;
                break;
            case 3:
                filas = 9;
                columnas = 9;
                minas = 12;
                ganar = (8 * 8) - 12;
                break;
            case 4:
                op= "4";
                break;
                default:
                    System.out.println("OPCION INVALIDA");
                    si=true;
                    sijuego=true;
                break;
        }
        }
        
        


    }



    

