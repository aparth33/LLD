package StrategyDesignPattern.WithPattern;

import StrategyDesignPattern.WithPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy()); // Explicitly call the super class constructor
    }
}