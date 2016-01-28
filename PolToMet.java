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
public class PolToMet {
    public static void main(String[] args){
        double pol, met;
        int counter = 0;
        
        for(pol = 1; pol <= 144; pol++){
            met = pol * 39.37;
            System.out.println(pol + " pol is " + met + " meters");
            counter++;
            
            if(counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
