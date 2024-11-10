/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_practica_4;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_PRACTICA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String le;
        Scanner cap; cap = new Scanner(System.in);
        
        System.out.println("Escribe Algo: ");
        le = cap.nextLine();
        
        for(int i = 0; i < le.length(); i++){
            System.out.println(le.charAt(1));
        }
    }
    
}
