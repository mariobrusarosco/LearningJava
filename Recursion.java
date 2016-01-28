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
public class Recursion {
    String demo = "";
    
    double allSum(double number){
       if(number <= 1){
        demo += number;   
        System.out.println(demo);
        return 1;
       }
       
       demo += number + " + ";
       System.out.println(demo);
       return allSum(number - 1) + number; 
    }
    
    
    public static void main(String args[]){
        Recursion test = new Recursion();
        System.out.println(test.allSum(8));
    }
            
}