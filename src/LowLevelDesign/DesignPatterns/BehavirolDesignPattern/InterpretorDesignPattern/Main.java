package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.InterpretorDesignPattern;

public class Main {

    public static void main(String[] args) {
        
        Context context = new Context();
        context.put("a",2);
        context.put("b",4);
        context.put("c",6);
        context.put("d",10);

        // a*b
        AbstractExpression exp1 = new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));

        System.out.println(exp1.interpret(context));
        //(a*b)+(c*d)
        exp1 = new SumNonTerminalExpression(new MultiplyNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b")), new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"), new NumberTerminalExpression("d")));
        System.out.println(exp1.interpret(context));
    }
    
}
