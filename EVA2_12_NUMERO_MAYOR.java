/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int v, numg = -999999;
                int b = 0;
        Scanner cap;
        cap = new Scanner(System.in);
        
        do{

          System.out.println("INTROUCE UN NUMERO ENETERO");
            v = cap.nextInt();
            cap.nextLine();

            if(v < numg ){ 
                numg = v;
            }
            
            
        }while(v != -1);
        
         System.out.println("Acumu = " + numg);
        
        System.out.println("---------------------------------------------");
        System.out.println("NOTA; ");
        System.out.println("INTROUCE UN -1 PARA FINALIZAR");
        
    }
    
}
