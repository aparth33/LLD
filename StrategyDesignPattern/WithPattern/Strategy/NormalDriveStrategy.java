package StrategyDesignPattern.WithPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.err.println("normal drive capability");
    }
    
}
