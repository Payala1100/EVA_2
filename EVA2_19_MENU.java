/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    String menu[];
    int preci[];
    
    Scanner cap = new Scanner(System.in);
    int cant;
    System.out.println("Cuantos productos va a tener el menu:  ");
    cant = cap.nextInt();
    cap.nextLine();
    
    menu = new String[cant];
    preci = new int[cant];   
    
      for(int i = 0; i < menu.length; i++){
            System.out.println("Nombre del Pructo:  ");
            menu[i] = cap.nextLine();
            
            System.out.println("Cuantos productos va a tener el menu:  ");
            preci[i] = cap.nextInt();
            cap.nextLine();
      }
      
       for(int i = 0; i < menu.length; i++){
            System.out.println(i + " - " + menu[i] + " $ " + preci[i]);
        }
        
    }
    
}
