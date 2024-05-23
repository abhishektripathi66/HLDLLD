package LowLevelDesign.DesignPatterns.StrategyPatterns;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new SportsVehicle();
        v.drive();
        v = new PublicVehicle();
        v.drive();
    }
    
}