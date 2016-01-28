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
public class QueueDemo {
    public static void main(String args[]){
        
        Queue big    = new Queue(100);
        Queue small  = new Queue(4);

        char ch; 
        int i;

        for(i = 0; i < 26 ;i++){
            big.put( (char) ('A' + i) );
        }

        for(i = 0; i < 26; i++){
            ch = big.get();
            if(ch != (char) '0') System.out.print(ch);
        }
    
    }
}
