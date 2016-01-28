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
public class Test {
    public static void main(String args[]) throws java.io.IOException{
        
        char userOption, ignoredChars;
        Help currHelp = new Help();
        
        for(;;){
            currHelp.showMenu();
            userOption = (char) System.in.read();
            
            do{
               ignoredChars = (char) System.in.read();
            }while(ignoredChars != '\n');
            
            if(userOption == 'q') break;
            
            if(currHelp.isValid(userOption)){
                System.out.println();
                currHelp.helpOn(userOption);
            }
            else System.out.println("invalid choice");
        
        }
    }

}

