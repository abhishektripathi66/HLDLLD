package LowLevelDesign.DesignPatterns.StrategyPatterns;

import LowLevelDesign.DesignPatterns.StrategyPatterns.Strategy.SportsDriveStrategy;

public class OffRoadvehicle extends Vehicle{

    OffRoadvehicle(){
        super(new SportsDriveStrategy());
    }
    
}