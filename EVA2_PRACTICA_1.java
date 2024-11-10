/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_practica_1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_PRACTICA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String le;
        int num;
        Scanner cap; cap = new Scanner(System.in);
        
        System.out.println("Escribe Algo: ");
        le = cap.nextLine();
        System.out.println("Escribe el Numero de Veces a Repetir: ");
        num = cap.nextInt();
        cap.nextLine();
        
        for(int i = 1; i <= num; i++){
            System.out.println(le +" ");
        }
        
        
        
    
    
    
    
    }
    
}
