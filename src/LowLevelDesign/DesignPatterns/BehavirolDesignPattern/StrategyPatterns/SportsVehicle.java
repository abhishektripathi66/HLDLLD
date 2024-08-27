package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}