package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns.Strategy.SportsDriveStrategy;

public class OffRoadvehicle extends Vehicle{

    OffRoadvehicle(){
        super(new SportsDriveStrategy());
    }
    
}