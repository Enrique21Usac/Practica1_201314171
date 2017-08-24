/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;




import static practica1.Menu.Menu;
import static practica1.buscaminas.revisarMinas;
import static practica1.buscaminas.columnas;
import static practica1.buscaminas.count;
import static practica1.buscaminas.si;
import static practica1.buscaminas.filas;
import static practica1.buscaminas.sijuego;
import static practica1.buscaminas.imprimirTablero;
import static practica1.buscaminas.Tablero;
import static practica1.buscaminas.Minas;
import static practica1.buscaminas.Movimiento;
import static practica1.buscaminas.matriz;
import static practica1.buscaminas.matriz2;
import static practica1.buscaminas.x;
import static practica1.buscaminas.y;
import static practica1.buscaminas.victoriaDerrota;


/**
 *
 * @author 3nriqu3
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            
            // TODO code application logic here
            
        while (!si) {
            count = 0;
            sijuego = false;
            Menu();
            Tablero();
            imprimirTablero(filas, columnas, matriz2);
            imprimirTablero(filas,columnas,matriz);
            System.out.println("");
            Movimiento();
            Minas();
            revisarMinas();
            victoriaDerrota(x, y);
            while (!sijuego) {
                imprimirTablero(filas, columnas, matriz2);
                imprimirTablero(filas,columnas,matriz);
                System.out.println("");
                System.out.println("");
                Movimiento();
                victoriaDerrota(x, y);
            }
        }

    }
  
}
