/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_restarurant;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_RESTARURANT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap; cap = new Scanner(System.in); 
        String menu[] = {"Papas", "Burritos", "Maruchan", "Tacos"};
        int precios[] = {10,25,18,150};
        int cant, produc;
        
        for(int i = 0; i < menu.length; i++){
            System.out.println(i + " - " + menu[i] + " $ " + precios[i]);
        }
        System.out.println("Elije un Opcion del Menu: ");
        produc = cap.nextInt();
        cap.nextLine();
        
        System.out.println("Cuantas Ordenes: ");
        cant = cap.nextInt();
        cap.nextLine();
        
        System.out.println("El Costo es de: " + cant * precios[produc]);
        
      
        
        
        
    }
    
}
