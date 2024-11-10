/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_while_do_wjile;

/**
 *
 * @author invitado
 */
public class EVA2_7_WHILE_DO_WJILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        System.out.println("While");
        int val = 1;
        
       //While
         while(val <= 10){
              System.out.println(val + "-");
            val ++;
              
        }
        
        //Do While
        val = 1;
        System.out.println("Do While");
        do{

          System.out.println(val + "-");
            val ++;
                         
        }while(val <= 10);
        
          
    }
    
}
