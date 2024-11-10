/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner cap;
        cap = new Scanner(System.in);
        
           System.out.println("Escribe un Numero ");
           num = cap.nextInt();
           cap.nextLine();

        int v = 1;
        
     for(int i = 1; i <= num ; i++){
          v = v * i;
        }
     System.out.println("Factorial de " + num + " = " + v );
    }
    
}
