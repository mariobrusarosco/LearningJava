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
public class GalToLitTable {
   public static void main(String[] args){
       double gallons,litters;
       int counter = 0;
       
       for(gallons = 1; gallons <= 100; gallons++){
            litters = gallons * 3.7854;
            System.out.println(gallons + " gallon(s) is " + litters + " litters");
            counter++;
            
           if(counter == 10){
               System.out.println();
               counter = 0;
           }
       }
   } 
}
