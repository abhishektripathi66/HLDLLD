package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.NullObjectPattern;

public class Car implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 4;
    }
    
}
