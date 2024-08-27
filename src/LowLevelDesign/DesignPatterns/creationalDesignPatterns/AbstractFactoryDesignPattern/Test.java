package LowLevelDesign.DesignPatterns.creationalDesignPatterns.AbstractFactoryDesignPattern;

public class Test {
    
    public static void main(String[] args) {
        
        Car c = new AbstractFactoryProducer().getFactoryInstance("Economic").getInstance(1000000);
        System.out.println(c.getTopSpeed());
        c = new AbstractFactoryProducer().getFactoryInstance("Luxury").getInstance(10000000);
        System.out.println(c.getTopSpeed());
    }
}
