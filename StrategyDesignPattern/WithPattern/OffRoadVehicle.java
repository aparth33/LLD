package StrategyDesignPattern.WithPattern;

import StrategyDesignPattern.WithPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportsDriveStrategy()); // Explicitly call the super class constructor
    }
}