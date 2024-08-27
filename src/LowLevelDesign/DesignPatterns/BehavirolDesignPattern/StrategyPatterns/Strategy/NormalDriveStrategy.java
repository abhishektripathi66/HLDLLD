package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StrategyPatterns.Strategy;

public class NormalDriveStrategy implements DriveStrategy{

    public void drive(){
        System.out.println("Normal Drive capability");
    }
}