package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.NullObjectPattern;

public class VehicleFactory {
    
    public Vehicle getVehicle(String vehicleType){

        switch (vehicleType) {
            case "Car":
                return new Car();        
            default:
                return new NullVehicle();
        }
    }
}
