package LowLevelDesign.DesignPatterns.StrategyPatterns;

import LowLevelDesign.DesignPatterns.StrategyPatterns.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}