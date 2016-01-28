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
public class Queue {

        char queue[];
        int getLoc,putLoc;
        
       Queue(int size){
          queue = new char[size + 1];
          getLoc = putLoc = 0;
      }
       
       void put(char ch){
           if(putLoc == queue.length - 1) {
               System.out.println("Queue is full");
               return;
           }
           putLoc++; 
           queue[putLoc] = ch; 
       }
       
       char get(){
         if(getLoc == putLoc){
           System.out.println(" Queue is empty");  
           return (char) 0;  
         }  
         getLoc++;
         return queue[getLoc];   
       }
}


