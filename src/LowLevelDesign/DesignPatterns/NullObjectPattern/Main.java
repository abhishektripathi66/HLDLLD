package LowLevelDesign.DesignPatterns.NullObjectPattern;

public class Main {
    
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleFactory().getVehicle("Car");
        printVehicleData(vehicle);
        vehicle = new VehicleFactory().getVehicle("Bike");
        printVehicleData(vehicle);
    }

    public static void printVehicleData(Vehicle vehicle){
        System.out.println("The seating capactiy is "+vehicle.getSeatingCapacity());
        System.out.println("The tank capacity is "+vehicle.getTankCapacity());
    } 
}
