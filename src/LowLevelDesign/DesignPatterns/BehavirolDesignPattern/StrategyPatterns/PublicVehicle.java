package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns.Strategy.NormalDriveStrategy;

public class PublicVehicle extends Vehicle{

    PublicVehicle(){
        super(new NormalDriveStrategy());
    }
}