/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;
import static practica1.Menu1.Menu1;



/**
 *
 * @author 3nriqu3
 */
public class Menu {

  
    private final Scanner sc = new Scanner(System.in);
    
    
    
    public static void Menu(){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Luis Enrique Pérez Aj");
        System.out.println("201314171");
        System.out.println("IPC A Practica 1");
        System.out.println("BUSCAMINAS!!!!");
        System.out.println("Presione Enter para Continuar");
        sc.nextLine();
        Menu1();
    }
    
    
}
