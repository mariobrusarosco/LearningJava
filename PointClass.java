package Swing;

import java.awt.*;

/**
 * Created by mario on 27/01/16.
 */
public class PointClass {

    public static void main(String args[]){

        //BASIC//
        Point myPoint = new Point(10,20);

        //STORING THE COORDINATES, INDIVIDUALLY//
        double x = myPoint.getX();
        double y = myPoint.getY();

        myPoint.setLocation(50,100);
        myPoint.x = 100;
        myPoint.y = 200;
        System.out.println(myPoint);
    }
}
