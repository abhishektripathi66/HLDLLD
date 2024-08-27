package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns.Strategy.DriveStrategy;

public class Vehicle {

    public DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}