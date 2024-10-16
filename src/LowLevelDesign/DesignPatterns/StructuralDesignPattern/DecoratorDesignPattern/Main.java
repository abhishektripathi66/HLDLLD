package LowLevelDesign.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class Main {

    public static void main(String[] args) {
         
        BasePizza margBasePizza = new ExtraCheese(new Margherita());
        System.out.println(margBasePizza.cost());
        BasePizza margmushroomPizza = new Mushroom(margBasePizza);
        System.out.println(margmushroomPizza.cost());

    }
    
}
