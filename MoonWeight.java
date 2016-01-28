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
public class MoonWeight {
    public static void main(String[] args){
        double moonGravity = 0.17;
        double earthWeight = 74.5;
        double moonWeight;
        
        moonWeight = moonGravity * earthWeight;
        
        System.out.println("In the moon, your weight would be: " + moonWeight);
        
        
    }
    
    
    
}
