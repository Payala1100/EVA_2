/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_base_potencia;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_BASE_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, potencia;
        Scanner cap;
        cap = new Scanner(System.in);
        
           System.out.println("Escribe la Base ");
           base = cap.nextInt();
           cap.nextLine();
           System.out.println("Escribe la Potencia ");
           potencia = cap.nextInt();
           cap.nextLine();
           
        int v = 1;
        
     for(int i = 1; i <= potencia ; i++){
            v = v * base;
        }
     System.out.println("Acumu = " + v);
    }
    }
 
