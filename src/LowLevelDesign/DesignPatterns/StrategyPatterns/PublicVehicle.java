package LowLevelDesign.DesignPatterns.StrategyPatterns;

import LowLevelDesign.DesignPatterns.StrategyPatterns.Strategy.NormalDriveStrategy;

public class PublicVehicle extends Vehicle{

    PublicVehicle(){
        super(new NormalDriveStrategy());
    }
}