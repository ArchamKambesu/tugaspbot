/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbot;

/**
 *
 * @author hp
 */
public class NumberGenerator {
    
   
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
         new Thread(""+i)
         { 
             public void run()
                     
         {
             System.out.println("thread;"+ getName()+"runnning");    
             }
                 
         }.start();
                 }
    }
}
         
                 
               
        
    
    

