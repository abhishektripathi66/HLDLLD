package LowLevelDesign.DesignPatterns.StrategyPatterns;

import LowLevelDesign.DesignPatterns.StrategyPatterns.Strategy.DriveStrategy;

public class Vehicle {

    public DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}