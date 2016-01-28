/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

/**
 *
 * @author mario
 */
public class BreakTest {
   public static void main(String args[]){
      
      //block one does have a break
      one:{
          
                //block two does not have a break
        two:{
          System.out.println("Content of block two");
          break one;
          System.out.println("This shouldn't be printed");
        }
         System.out.println("Content of block 'one'"); 
      }
      

      
      
   } 
}
