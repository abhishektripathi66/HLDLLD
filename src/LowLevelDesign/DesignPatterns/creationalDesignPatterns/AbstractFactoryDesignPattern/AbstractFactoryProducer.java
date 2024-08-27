package LowLevelDesign.DesignPatterns.creationalDesignPatterns.AbstractFactoryDesignPattern;

public class AbstractFactoryProducer {

    public AbstractFactory getFactoryInstance(String value){

        if("Economic".equalsIgnoreCase(value)){
            return new EconomicCarFactory();
        }
        else if("Luxury".equalsIgnoreCase(value) || "Premium".equalsIgnoreCase(value)){
            return new LuxuryCarFactory();
        }
        return null;
    }
    
}
