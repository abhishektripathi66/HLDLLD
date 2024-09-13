package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.InterpretorDesignPattern;

public class Main {

    public static void main(String[] args) {
        
        Context context = new Context();
        context.put("a",2);
        context.put("b",4);

        AbstractExpression exp1 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));

        System.out.println(exp1.interpret(context));
    }
    
}
