package StrategyDesignPattern.WithPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.err.println("sports drive capability");
    }

}