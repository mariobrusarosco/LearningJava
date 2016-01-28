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
public class Test2 {
    public static void main(String args[]) throws java.io.IOException{
        
        char choice,ignore;
        Help helpobj = new Help();
        
        for(;;){
            
            do{
                helpobj.showMenu();                
                choice = (char) System.in.read();

                do{
                    ignore = (char) System.in.read();
                }while(ignore != '\n');
                
            }while(!helpobj.isValid(choice));
            
            if(choice == 'q') break;
            
            helpobj.helpOn(choice);
        }
        
    }
}
