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
public class SqrRoot {
    public static void main(String args[]){
        for(double num = 2; num < 20; num++){
            double sqr = Math.sqrt(num);
            System.out.println(num);
            System.out.println("Square root: " + sqr);
            
            double roundError = num - (sqr * sqr);
            System.out.println(roundError);
        }
    }
        
}
