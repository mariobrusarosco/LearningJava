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
public class LogicalTable {
   public static void main(String[] args){
       boolean p, q;
       System.out.println("p\tq\tp & q\tp | t\tp ^ q\tp!");
       p = false;
       q = false;
       System.out.println(p + "\t" + (q) + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
       p = true;
       q = false;
       System.out.println(p + "\t" + (q) + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
       p = false;
       q = true;
       System.out.println(p + "\t" + (q) + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
       p = true;
       q = true;
       System.out.println(p + "\t" + (q) + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
   
       System.out.println();
   int p2, q2;
       System.out.println("p\tq\tp & q\tp | t\tp ^ q\tp!");
       p2 = 0;
       q2 = 0;
       System.out.println(p2 + "\t" + (q2) + "\t" + (p2 & q2) + "\t" + (p2 | q2) + "\t" + (p2 ^ q2) + "\t" + (!p));
       p2 = 1;
       q2 = 0;
       System.out.println(p2 + "\t" + (q2) + "\t" + (p2 & q2) + "\t" + (p2 | q2) + "\t" + (p2 ^ q2) + "\t" + (!p));
       p2 = 0;
       q2 = 1;
       System.out.println(p2 + "\t" + (q2) + "\t" + (p2 & q2) + "\t" + (p2 | q2) + "\t" + (p2 ^ q2) + "\t" + (!p));
       p2 = 1;
       q2 = 1;
       System.out.println(p2 + "\t" + (q2) + "\t" + (p2 & q2) + "\t" + (p2 | q2) + "\t" + (p2 ^ q2) + "\t" + (!p));
   }
}
