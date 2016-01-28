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
public class For {
    public static void main(String args[]){
        int myArray[][] = new int[10][10];
        int counter = 0;
        
        for(int a = 0 ; a < 10; a++){
            for(int b = 0; b < 10 ;b++){
                myArray[a][b] = (a * 10) + b + 1;                
            }
        }
        
        for(int row[]: myArray){
            for(int item: row){
                System.out.println(item);
            }
        }
        
        System.out.println(myArray[1][0]);
        
    }
}
