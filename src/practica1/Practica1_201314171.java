/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;





import static practica1.Menu1_201314171.Menu1;
import static practica1.buscaminas_201314171.revisarMinas;
import static practica1.buscaminas_201314171.columnas;
import static practica1.buscaminas_201314171.count;
import static practica1.buscaminas_201314171.si;
import static practica1.buscaminas_201314171.filas;
import static practica1.buscaminas_201314171.sijuego;
import static practica1.buscaminas_201314171.imprimirTablero;
import static practica1.buscaminas_201314171.Tablero;
import static practica1.buscaminas_201314171.Minas;
import static practica1.buscaminas_201314171.matriz;
import static practica1.buscaminas_201314171.matriz2;
import static practica1.buscaminas_201314171.x;
import static practica1.buscaminas_201314171.y;
import static practica1.buscaminas_201314171.victoriaDerrota;
import static practica1.Menu_201314171.Menu;
import static practica1.buscaminas_201314171.Movimiento2;

/**
 *
 * @author 3nriqu3
 */
public class Practica1_201314171 {

    /**
     * @param args the command line arguments
     */
        static String op;
        public static void main(String [] args){
            op ="";
            do{
            si=false;
            x=0;
            y=0;
            Menu();
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
  
            Menu1();
         
                        if(op!="4")
             {
     
           while (!si) {
             count = 0;
             sijuego = false;
            Tablero();
            imprimirTablero(filas, columnas, matriz2);
            imprimirTablero(filas,columnas,matriz);
             System.out.println("");
             Movimiento2();
             Minas();
             revisarMinas();
             victoriaDerrota(x, y);
                 while (!sijuego) {
                 imprimirTablero(filas, columnas, matriz2);
                 imprimirTablero(filas,columnas,matriz);
                 System.out.println("");
                 System.out.println("");
                 //Movimiento();
                 Movimiento2();
                victoriaDerrota(x, y);
             
                
                
             }
         }
             }
            }while(op!="4");
    }
      
}        
