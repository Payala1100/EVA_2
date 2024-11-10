/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_practica_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_PRACTICA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner cap; cap = new Scanner(System.in);
        
        System.out.println("Escribe Valor 1: ");
        num1 = cap.nextInt();
        cap.nextLine();
        System.out.println("Escribe Valor 2: ");
        num2 = cap.nextInt();
        cap.nextLine();
        
     
        
        for(int i = 1; i <= num2; i++){
           int v = 1;
           v = v + num1;
           
           System.out.println(v);
        }
        
    }
    
    
}
