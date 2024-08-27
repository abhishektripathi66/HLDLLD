package LowLevelDesign.DesignPatterns.creationalDesignPatterns.FactoryPattern;

public class Main {
    
    public static void main(String[] args) {
         
        Shape s = new ShapeFactory().getShape("CIRCLE");
        s.draw();
        s= new ShapeFactory().getShape("RECTANGLE");
        s.draw();
    }
}
