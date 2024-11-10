/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_validar_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_VALIDAR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v;
        Scanner cap;
        cap = new Scanner(System.in);
        
        while(true){

          System.out.println("Introduce un numero del 1 - 7");
            v = cap.nextInt();
            cap.nextLine();
                         
            if(v >= 1 && v <=12)
               break;
        } 
        
        switch(v){
              case 1:
                  System.out.println("Enero");
                  break;
               case 2:
                 System.out.println("Febrero");
                  break;
               case 3:
                  System.out.println("Marzo");
                  break;
               case 4:
                  System.out.println("Abril");
                  break;
               case 5: 
                   System.out.println("Mayo");
                  break;
               case 6: 
                   System.out.println("Junio");
                  break;
               case 7:
                   System.out.println("Julio");
                  break;
               case 8:
                   System.out.println("Agosto");
                  break;
              case 9:
                   System.out.println("Septimebre");
                  break;
              case 10:
                   System.out.println("Octubre");
                  break;
              case 11:
                   System.out.println("Noviemre");
                  break;
              case 12:
                   System.out.println("Diciembre");
                  break;
                 
               
          } 
        
        
    
        
    }
    
}
