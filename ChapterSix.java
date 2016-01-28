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
  
class MyPile{
    private char pile[];
    private int size, popLoc = 0, pushLoc = 0;


    MyPile(int givenSize){
       pile = new char[givenSize + 1]; 
       size = givenSize;
    }

    public void push(char ch, boolean showPile){
       //ALWAYS INSERT AN CHARACTER AT THE BEGINNING OF THE ARRAY//
           if(pile[0] != 0){
               System.out.println("The pile is full.");
               return;
           }
           
           pile[size] = ch;

           for(int i = 0; i < size;i++){
                //System.out.println("data[" + i + "] = data[" + (i+1) + "]" );
                //System.out.println(i);
                pile[i] = pile[i+1];
           }
           
           pile[size] = 0;
           if(showPile) this.showPile();
    }
            
    public void pop(boolean showPile){
        //THIS IS SUPPOSED TO REMOVE THE LAST INSERTED ELEMENT OF THAT ARRAY//
//        if(popLoc == pushLoc){
//            System.out.println("The pile is empty");
//            return;
//        }
//        
        if(pile[size - 1] == 0){
            System.out.println("The pile is empty");
            return;
        }else{
            System.out.println("The removed item is: " + pile[size - 1]);
            pile[size - 1] = 0;
            
            for(int i = size -1; i > 0 ; i--){
                //System.out.println("pile[" + i + "] = pile[" + (i-1) + "]");
                char temp;
                temp = pile[i-1];
                pile[i-1] = 0;
                pile[i] = temp;
            }
        }
        
        if(showPile) this.showPile();
    }
    
    public void showPile(){
        for(int i = 0 ; i <= size ;i++) System.out.println("index[" + i + "]" + pile[i] + " ");
    }
}

class RecString{
    private String string;
    private int    size;
    
    RecString(String givenString){
        string = givenString;
        size   = string.length();
    }
    
     public void reverse1(){
        String newS = "";
        for(int i = (this.string.length() - 1); i >= 0; i--){
           newS += this.string.charAt(i);
       }        
       System.out.println(newS); 
    }
    
    public String reverse(int size){
        String newS = "";
        if(size == 0){
            return newS += this.string.charAt(0);
        }
        
        newS += this.string.charAt(size);
        //System.out.print(this.string.charAt(size-1));
        return newS += reverse(size -1);
        
    }
}

public class ChapterSix {
    
    private void ansOne(){
        System.out.println("No, stupid!");
    }
    
    private void ansTwo(){
      System.out.println("Preced");
    }
    
    private void ansFive(){
        System.out.println("NO, {} is missing. There's no constructor method neither");
    }
        
    private void ansSix(String givenString){
        RecString example = new RecString(givenString);
                  //example.reverse1();
                 System.out.println(example.reverse(givenString.length() -1 ));
    }
      
    public void ansSeven(){
        System.out.println("static Type varName = value;");
    }
    
    public void ansEight(){
        System.out.println("Because you may have to initialize some static variable that " +
                "might be used by static method. Since static methos just can get access to" +
                " static variables.");
    }
    
    public void ansNine(){
        System.out.println("It's a class declared inside another class or method.");
    }
    
    public void ansTen(){
        System.out.println("private");
    }
    
    public void ansEleven(){
       System.out.println("Signature");
    }
    
    public void ansTwelve(){
        System.out.println("methodName(int argName)");
    }
    
    public double ansThirteen(double ... numbers){
        double sum = 0.00d;
            
        for(double value: numbers) sum += value;
        return sum;
    }
    
    public void ansFourteen(String msg){
        System.out.println(msg);
    }
    
    public void ansFifteen(){
        System.out.println("method(int arg1, int ... varargs)");
        System.out.println("method(int ... varargs)");
        System.out.println("call: method(1)");
        System.out.println("Java doesn't know if you're saying: 'arg1 should receive 1 and varargs is gonna be an empty array' or "
                + "arg1 isn't gonna receive a value and varargs is gonna receive 1.");
    }
    
    public static void main(String args[]){
      ChapterSix answers = new ChapterSix();
      
      answers.ansOne();
      System.out.println();
      answers.ansTwo();
      System.out.println();
      answers.ansFive();
      System.out.println();
      answers.ansSix("MARIO BRUSAROSCO");
      System.out.println();
      answers.ansSeven();
      System.out.println();
      answers.ansEight();
      System.out.println();
      answers.ansNine();
      System.out.println();
      answers.ansTen();
      System.out.println();
      answers.ansEleven();
      System.out.println();
      answers.ansTwelve();
      System.out.println();
      System.out.println(answers.ansThirteen(0.6,4,5.4));
      System.out.println();
      answers.ansFourteen("Yes.");
      System.out.println();
      answers.ansFifteen();
//      MyPile pile = new MyPile(5);
//      pile.push('m',false);
//      pile.push('a',false);
//      pile.push('r',false);
//    
//      pile.pop(false);
//    
//      pile.push('i',true);
//      pile.pop(true);
//      pile.push('M',true);
//      pile.push('o',true);
//      pile.pop(true);
//      pile.pop(true);
//      pile.push('r',true);
//      pile.push('i',false);
//      pile.push('o',true);
//      pile.push('o',true);
//      
//      pile.pop(true);
//      pile.pop(true);
//      pile.pop(false);
//      pile.pop(false);
//      pile.pop(true);
//      pile.pop(true);
//      pile.push('c', true);
//      pile.push('a', true);
//      pile.push('r', true);
//      pile.push('o', true);
//      pile.push('l', true);
//      pile.push('o', true);
//      pile.pop(true);
//      pile.pop(true);
//      pile.pop(true);
//      pile.push('m', true);
//      pile.push('i', true);
//      pile.push('l', true);
//      pile.push('a', true);
//          pile.pop(true);

    }
}
