package StrategyDesignPattern.WithPattern;

import StrategyDesignPattern.WithPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {
        super(new NormalDriveStrategy()); // Explicitly call the super class constructor
    }
}