/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_CONTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acum = 0;
        String v;
        Scanner cap;
        cap = new Scanner(System.in);
         
        System.out.println("INTROUCE UN NUMERO ENETERO");
            v = cap.nextLine();
            cap.nextLine();

     for(int  i = 0; i < v.length(); i++){
     char caracter = v.charAt(i);
    
     if(caracter == 'a' || caracter == 'e' ||caracter == 'i' ||caracter == 'o' ||caracter == 'u' ||
        caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
         acum ++;
         System.out.println("N° de Vocales:");
         System.out.println(acum);
     }
    
    
        
    
     }
    }
}
