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
public class StringMethods {
    public static void main(String args[]){
        String myName = "Mario Mario";
        String myLast = new String("Brusarosco");
        
        System.out.println(myName.equals(myLast));
        System.out.println(myName.charAt(0));
        System.out.println(myName.indexOf("Mario"));
        System.out.println(myName.lastIndexOf("Mario"));
        System.out.println(myLast.indexOf("u"));
        System.out.println(myLast.indexOf("Brusarosco"));
        System.out.println(myLast.indexOf(myName));
    }
}
