package LowLevelDesign.DesignPatterns.StructuralDesignPattern.DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+10;  }
    
    
}
