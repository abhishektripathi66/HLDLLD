package ParkingSpot;

public class ParkingSpot {
    
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        vehicle = vehicle;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void parkVehicle(Vehicle v){
        this.vehicle= v;
        isEmpty=false;
    }

    public void removeVehicle(){
        this.vehicle=null;
        isEmpty=true;
    }
}
