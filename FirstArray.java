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
public class FirstArray {
    public static void main(String args[]){
        int myArray[][] = {
                                {1,2,3,4,5},
                                {6,7,8}
        };
    
    for(int i = 0; i < myArray.length; i++){
       for(int j = 0; j < myArray[i].length ;j++){
          System.out.print(myArray[i][j] + " ");
       }
       System.out.println();
    }

    }
}
