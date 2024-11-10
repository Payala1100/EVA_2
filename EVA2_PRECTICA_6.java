/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_prectica_6;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_PRECTICA_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner cap; cap = new Scanner(System.in);
        int num;
        System.out.println("Escrbe un Numero");
        num =  cap.nextInt();
        cap.nextLine();
        
        for(int i = 1; i <= num; i++){
            for(int o = 1; o <= i; o++){
                System.out.print("*");
            }        
            System.out.println();
        }

        for(int i = num; i >= 1; i--){
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            } 
            System.out.println();
        }
       
    }
    
}
