package StrategyDesignPattern.WithPattern;

import StrategyDesignPattern.WithPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    //constructor
    public Vehicle(DriveStrategy driveStrategy){
        this.driveObject = driveStrategy;
    }
    public void drive(){
        driveObject.drive();
    }
}