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
public class SearchFor {
        static int myNumbers[] = {123,12,425,456,2,7,54,85,1,632,8,4,848,22};

        static void search(int num){
            for(int currNum: myNumbers){
                if(currNum == num) {
                    System.out.println("Found!");                
                    break;
                }   
            }
        }        
        
    public static void main(String args[]){               
        search(12);
    }
}
