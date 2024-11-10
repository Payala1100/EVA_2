/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_8_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Usuario;
        String pwd;
        
        Scanner  cap; 
        cap = new Scanner(System.in);
        
        
      do{
        System.out.println("Ingrese el Ususario");
        Usuario = cap.nextLine();
        
        
        System.out.println("Ingrese el Ususario");
        pwd = cap.nextLine(); 
      
      
      }while(!(Usuario.equals("Admin") && pwd.equals("123")));  

        

        
        
        
        
       System.out.println("PORGRAMA PRINCIPAL!!");
        
    }
    
}
