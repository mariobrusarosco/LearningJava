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
public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    public Vehicle(int passengers, int fuelcap, int mpg){
       this.passengers = passengers;
       this.fuelcap    = fuelcap;
       this.mpg        = mpg;
    }
    
    public int range(){
        return this.fuelcap * this.mpg;
    }
    
    public double fuelNeeded(double miles){
        return (double) miles / this.mpg;
    }
}
