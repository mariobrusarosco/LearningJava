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
public class Ternary {
    
    public void testPrint(String toPrint){
        System.out.println(toPrint);
    }
    
    public static void main(String args[]){
    int test = 10;
    String result;
    
    result = test > 5 ? "Higher": "Lower";
    test > 9 ? testPrint("higher"): testPrint("lower");

 }
}
