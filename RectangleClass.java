package Swing;

import java.awt.*;

/**
 * Created by mario on 27/01/16.
 */
public class RectangleClass {
    public static void main(String args[]){
        //CONSTRUCTOR//
        Rectangle myRect1 = new Rectangle();                                            //EMPTY//
        Rectangle myRect2 = new Rectangle(200,400);                                     //SET ONLY THE SIZE//
        Rectangle myRect3 = new Rectangle(10,20,200,400);                               //SET THE SIZE AND LOCATION//
        Rectangle myRect4 = new Rectangle(new Point(10,20));                          //SET ONLY THE LOCATION//
        Rectangle myRect5 = new Rectangle(new Point(10,20) , new Dimension(200,400));   //...//


        System.out.println(myRect1);
        System.out.println(myRect2);
        System.out.println(myRect3);
        System.out.println(myRect4);
        System.out.println(myRect5);


        //PROPERTIES//
        double height = myRect1.height = 411;
        double width  = myRect1.width  = 211;
        double x      = myRect1.x      = 11;
        double y      = myRect1.y      = 21;

        System.out.println(myRect1);

        Point rec1Location = myRect1.getLocation();
        Dimension rec1Dim  = myRect1.getSize();


        //METHODS//
        myRect1.setSize(212,412);
        myRect1.setLocation(12,22);
        System.out.println("\n" + myRect1 + "\n");
        myRect1.setBounds(13,23,213,413);
        System.out.println("\n" + myRect1 + "\n");
        myRect1.setBounds(new Rectangle(14,24,214,414));
        System.out.println("\n" + myRect1 + "\n");
        System.out.println(myRect1.getX());


    }
}
