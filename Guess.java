/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

public class Guess {
    public static void main(String args[]) throws java.io.IOException{
        char guess,ignore,answer = 'M';

        do{
            System.out.println("I'm thinking of a letter between A and Z. Can you guess? Type it:");
            guess = (char) System.in.read();            
            
            do{
                ignore = (char) System.in.read();
            }while(ignore != '\n');  
            
                if(guess < answer) System.out.println("Too low. Sorry try again");
                else if (guess > answer) System.out.println("Too high. Sorry try again");
        }while(answer != guess);
        
        System.out.println("You're right");
    }
}
