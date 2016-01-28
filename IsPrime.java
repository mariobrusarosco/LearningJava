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
public class IsPrime {
    public static void main(String[] args){
        for(int counter = 2; counter <= 100; counter++){
            if((counter % 2) != 0){
                System.out.println("Number " + counter + " is prime.");
            }
        }
    }
}
