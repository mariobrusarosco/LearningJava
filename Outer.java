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
public class Outer {
    //CREATE AN ARRAY OF INTEGERS. THIS ARRAY IS GONNA BE ACCESSED BY AN INNER CLASS//
    int outerNumbers[];
    
    //CONSTRUCTOR METHOD//
    public Outer(int givenNumbers[]){
        outerNumbers = givenNumbers;
    }
    /**
     * This method is gonna perform some actions to the outer numbers array
     */
    void analyse(){
     //CREATE THE NEW INNER CLASS//
     Inner myInnerClass = new Inner();
     
        myInnerClass.sum(true);
        myInnerClass.avg();
        myInnerClass.min();
    }
    
    class Inner{
        public int sum(boolean printable){
            int sumResult = 0;
            for(int number: outerNumbers){
                sumResult += number;
            }
            if(printable) System.out.println("The sum of all numbers present in this array is: " + sumResult);
            return sumResult;
        }
        
        void min(){
            int min = outerNumbers[0];
            for(int i = 0; i < outerNumbers.length ;i++){
                if(outerNumbers[i] < min) min = outerNumbers[i];
            }
            System.out.println("The lower value inside this array is: " + min);
        }
        
        void avg(){
            double avgResult = this.sum(false) / outerNumbers.length;
            System.out.println("The average of this array is: " + avgResult);
        }
    }
    
    public static void main(String args[]){
        int myArray[] = {12,234,4,52,65,-345};
        Outer test = new Outer(myArray);
        
        test.analyse();
    }
    
}
