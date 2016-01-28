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
public class Chapter5 {

    
   public void ex1(){
      double array1[][];
      array1 = new double[1][12];
      
      double array1_2[][] = {
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2},
                           {1.2}
                        };
   } 
   
   public static void ex2(){
       int array2[] = new int[5];
       
       for(int i = 1; i <= 5;i++){
           array2[i-1] = i;
       }
       
       for(int item: array2){
            System.out.println(item);
       }
   }
   
   public void ex3(){
       double array3[] = {2.3,5,5,5,5,5,5,5,5.0,5.0}, sum = 0;
       
       for(double number: array3){
          sum += number; 
       }       
       System.out.println("Average: " + sum/10);
   }
   
   public void ex4(String data[]){
       int size = data.length;
       char lastFirstCh, lastButOneFirstCh;
       
      for(int i = 0; i < size ; i++){
          data[i] = this.myLower(data[i]);
      }
      
  
      for(int i = 0; i < size;i++){
          for(int j = (size - 1); j > i ;j--){
              String t;
              //lastFirstCh        = data[j].charAt(0) > 97 ? (char) ((int) data[j].charAt(0) - 32)      : data[j].charAt(0); 
              //lastButOneFirstCh  = data[j -1].charAt(0) > 97 ? (char) ((int) data[j-1].charAt(0) - 32) : data[j-1].charAt(0);
              lastFirstCh        = data[j].charAt(0); 
              lastButOneFirstCh  = data[j-1].charAt(0);
              if(lastButOneFirstCh > lastFirstCh){
                  t = data[j];
                  data[j] = data[j-1];
                  data[j-1] = t;
              }    
          }
      }
      
      for(String item: data){
          System.out.print(item + " ");
      }
   }
   
   public String myLower(String string){
      String newString = "";
      char ch;
      int size = string.length();
      
      for(int i = 0; i < size ;i++){
          ch = string.charAt(i) > 96 ? (char) (string.charAt(i) - 32): string.charAt(i);
         newString += ch;
      }
      
      return newString;
   }
   
   public void ex5(){
       /**
        * lastIndexOf() just consider the last occurrence of that String
        * 
        * 
        */
   }
   

   public static void main(String args[]) throws java.io.IOException{
        Chapter5 exercises = new Chapter5();
       
       //ex2();       
       //exercises.ex3();
       //exercise 4//
       String myData[] = {"de","Mario","Brusarosco","Almeida","salada","CAROL", "WOLKS", "teste"};
       exercises.ex4(myData);

       String name = "Mario Brusarosco";
       
      System.out.println("Mario Brusarosco");
       
   }
}
