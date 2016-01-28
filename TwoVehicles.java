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
public class TwoVehicles {
    public static void main(String args[]){
        double dist;
        dist = 252d;
        
        Vehicle minivan     = new Vehicle(7,16,21);
        Vehicle sportscar   = new Vehicle(2,14,12);
        
        System.out.println("Minivan need " + minivan.fuelNeeded(dist) + " gallons to cover a distance of "
                + dist + " miles.");
        System.out.println("Sportscar need " + sportscar.fuelNeeded(dist) + " gallons to cover a distance of "
                + dist + " miles");

    }
}
