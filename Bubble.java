package hello_world;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class Bubble {
    public static void main(String args[]){
        int myArray[] = {44,235,32,10,-231};
        int size = myArray.length;
        
         System.out.print("Initial array is : ");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        
        System.out.println();
        
        for(int a = 1; a < size; a++){
            for(int b = size -1; b >= a; b--){
                
                System.out.println("a)"+ a + "  " + "b)"+ b);
                if(myArray[b-1] > myArray[b]){
                    int t = myArray[b-1];
                    myArray[b-1] = myArray[b];
                    myArray[b] = t;                    
                }
            }
        }
        
        System.out.print("\n Sorted array is : ");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }
}
