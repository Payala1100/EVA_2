/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cal;
        Scanner cap;
        cap = new Scanner(System.in);
        
        int v = 0;
        
     for( int i = 1; i <= 20; i++){
            System.out.println("Estudiante " + i);
            System.out.println("Escribe la calificacion: ");
            cal = cap.nextInt();
            cap.nextLine();
            v = v + cal;
        }
     System.out.println("Acumu = " + v);
     System.out.println("Promedio = " + (v/20.0));
    }
    
}
