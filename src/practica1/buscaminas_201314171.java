/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author 3nriqu3
 */
public class buscaminas_201314171 {

    public static char[][] matriz = new char[9][9];
    public static char[][] matriz2 = new char[9][9];
    public static int filas = 0;
    public static int columnas = 0;
    public static int minas = 0;
    public static int x = 0;
    public static int y = 0;
    public static int ganar = 0;
    public static boolean sijuego = false;
    public static int count = 0;
    public static boolean si = false;
    private static Scanner sc = new Scanner(System.in);
 
    
    /**
     * @param length
     * @param length0
     * @param matriz
     */
    
    public static void imprimirTablero(int length, int length0, char[][] matriz) {
        System.out.println("Tablero");
        for (int i = 1; i < length; i++) {
            if (i == 1) {
                System.out.println("---------------------------------");
            }
            System.out.printf("%4s", i + " ");
            for (int j = 1; j < length0; j++) {
                System.out.printf("%s", "|" + matriz[i][j] + "|");
            }
            if (i == length - 1) {
                System.out.println("");
                for (int j = 1; j < columnas; j++) {
                    if (j == 1) {
                        System.out.print("    ");
                    }
                    System.out.printf("%3s", j + " ");
                }
            }
            System.out.println("");
        }
    }
    
    
   

    
    public static int numeroAleatorio(int sup) {
        Random rnd = new Random();
        int num = (int) (Math.random() * sup);
        return num;
    }

  
    public static void Tablero() {
        for (int l = 1; l < filas; l++) {
            for (int m = 1; m < columnas; m++) {
                matriz2[l][m] = 'X';
            }
        }
        for (int l = 1; l < filas; l++) {
            for (int m = 1; m < columnas; m++) {
                matriz[l][m] = 'X';
            }
        }
    }

  
    public static void Minas() {
        boolean full = false;
        int i = 0;
        out:
        while (i <= minas) {
            for (int j = 1; j < filas; j++) {
                for (int k = 1; k < columnas; k++) {
                    int mina = numeroAleatorio(columnas);
                    if ((k == mina) && (matriz[j][k] == 'X') && (j != x && k != y)) {
                        matriz[j][k] = '*';
                        ++i;
                        if (i == minas) {
                            break out;
                        }
                    }
                }
            }
        }
    }

    public static void revisarMinas() {
        int count = 0;
        for (int n = 2; n <= matriz.length - 2; ++n) {
            for (int o = 2; o <= matriz[0].length - 2; ++o) {
                count = 0;
                if ((matriz[n + 1][o + 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n - 1][o - 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n - 1][o + 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n + 1][o - 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n - 1][o] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n + 1][o] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n][o + 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if ((matriz[n][o - 1] == '*') && (matriz[n][o] == 'X')) {
                    ++count;
                }
                if (matriz[n][o] == 'X') {
                    if (count > 0) {
                        matriz[n][o] = Integer.toString(count).charAt(0);
                    } else if (count == 0) {
                        matriz[n][o] = Integer.toString(count).charAt(0);
                    }
                }
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 'X') {
                    matriz[i][j] = Integer.toString(0).charAt(0);
                }
            }
        }
    }
    
       
     public static void menudejuego()
     {
        System.out.println("----------------------------------------------------");  
        System.out.println("v. Voltear");
        System.out.println("r. Reinicia");
        System.out.println("s. Salir");
        System.out.println("");
        System.out.println("ingrese una opcion");
     }
    
    public static void Movimiento2()
    {
         String opciones="";
        menudejuego();
         opciones = sc.nextLine();
            
            switch(opciones){
                case "v":
                           boolean valid = false;
        while (!valid) {
            System.out.println("Introduce tu movimiento!");
            System.out.print("Introduce la fila ");
            x = sc.nextInt();
            System.out.print("Introduce la columna ");
            y = sc.nextInt();
            System.out.println("introduce posicion correcta");
            valid = (x < filas && y < columnas) && (x > 0 && y > 0);
        }
                    break;
                    
                case "r":
                    sijuego=true;
                    break;
                case "s":
                    si=true;
                    sijuego=true;
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
        
    }
    
    
    public static void Movimiento() {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            System.out.println("Introduce tu movimiento!");
            System.out.print("Introduce la fila ");
            x = sc.nextInt();
            System.out.print("Introduce la columna ");
            y = sc.nextInt();
            System.out.println("introduce posicion correcta");
            valid = (x < filas && y < columnas) && (x > 0 && y > 0);
        }
    }

    /**
     * @param filaX posiciones filas
     * @param columnaY posiciones columnas
     * 
     */
    public static void victoriaDerrota(int filaX, int columnaY) {
        int filaXorg = x;
        int columnaYorg = y;
        if (filaX > filas - 1 || filaX < 0 || columnaY > columnas - 1 || columnaY < 0) {
            return;
        }
        if (matriz[filaXorg][columnaYorg] == '*') {
            sijuego = true;
            System.out.println("PERDISTE!!");
            System.out.println("--------------------------------------------------");
                        si=true;
                                    sijuego = true;
        } else if (matriz[filaX][columnaY] == '0') {
            if (matriz2[filaX][columnaY] != matriz[filaX][columnaY]) {
                matriz2[filaX][columnaY] = matriz[filaX][columnaY];
                ++count;
                victoriaDerrota(filaX + 1, columnaY);
                victoriaDerrota(filaX, columnaY + 1);
                victoriaDerrota(filaX + 1, columnaY + 1);
            }
            if (filaX > filas - 1 || filaX < 0 || columnaY > columnas - 1 || columnaY < 0) {
                victoriaDerrota(filaX, columnaY - 1);
                victoriaDerrota(filaX - 1, columnaY);
                victoriaDerrota(filaX - 1, columnaY - 1);
                victoriaDerrota(filaX - 1, columnaY + 1);
                victoriaDerrota(filaX + 1, columnaY - 1);
            }
        } else if ((matriz[filaX][columnaY] > '0')) {
            if (matriz2[filaX][columnaY] != matriz[filaX][columnaY]) {
                matriz2[filaX][columnaY] = matriz[filaX][columnaY];
                ++count;
            }
        }
        if (count == ganar) {
            System.out.println("HAS GANADOR!!!");
            System.out.println("--------------------------------------------------------");
            sijuego = true;
            si=true;
            //Menu();
        }
    }

  
}