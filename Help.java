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
public class Help {

        public void showMenu(){
            System.out.println("Help on:");
            System.out.println(" 1: if");
            System.out.println(" 2: switch");
            System.out.println(" 3: for");
            System.out.println(" 4: while");
            System.out.println(" 5: do-while");
            System.out.println(" 6: break");
            System.out.println(" 7: continue");
            System.out.println("Press 'q' to quit");
       }
        
        public void helpOn(char choice){
            
            switch(choice){
                case '1':
                    System.out.println("if(condition) {");
                    System.out.println("   //code// ");
                    System.out.println("  }");
                    break;
                case '2':
                    System.out.println("switch(condition){");
                    System.out.println("  case 'constant':");
                    System.out.println("         //code//");
                    System.out.println("           break;");
                    System.out.println(" ..//optional cases//}");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("for(initialization;condition;post action){");
                    System.out.println("    //code// ");
                    System.out.println(" }");
                    break;
                case '4':
                    System.out.println("while(condition){");
                    System.out.println("  //code for eventually get out of the loop");
                    System.out.println(" }");
                    break;
                case '5':
                     System.out.println("do{");
                     System.out.println("    //code to be executed at least one time");
                     System.out.println(" }while(condition);");
                    break;
                case '6':
                    System.out.println("The break \n");
                    System.out.println("break or break label;");
                    break;
                case '7':
                    System.out.println("The continue \n");
                    System.out.println(" contiune; or continue label;");
                    break;                
            }
            System.out.println();
        }
        
        public boolean isValid(char userChar){
            if(userChar < '1' || userChar > '7') return false;
            else return true;
        }
   
}
