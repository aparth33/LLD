package StrategyDesignPattern.WithPattern;

import StrategyDesignPattern.WithPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStrategy()); // Explicitly call the super class constructor
    }
}