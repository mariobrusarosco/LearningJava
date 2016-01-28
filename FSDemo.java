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
public class FSDemo {
    
    public static void main(String args[]){
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x = 0;
        
        for(int i = 0 ;i < (fs.length * 2);i++)
           fs.put(i, i*10); 
        
//        for(int i = 0; i < (fs.length * 2);i++){
//            x = fs.get(i);
//            if(x != -1) System.out.print(x + " ");
//        }
        
        
        System.out.println(fs.get(0));
    }
}
