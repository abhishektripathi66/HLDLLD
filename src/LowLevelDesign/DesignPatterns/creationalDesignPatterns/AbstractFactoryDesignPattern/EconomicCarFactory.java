package LowLevelDesign.DesignPatterns.creationalDesignPatterns.AbstractFactoryDesignPattern;

public class EconomicCarFactory implements AbstractFactory{

    @Override
    public Car getInstance(int price) {
        
        if(price<= 3000000){
            return new EconomicCar1();
        }else if(price>3000000){
            return new EconomicCar2();
        }
        return null;
    }
    
}
