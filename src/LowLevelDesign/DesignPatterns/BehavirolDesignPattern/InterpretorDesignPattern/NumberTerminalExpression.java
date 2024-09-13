package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.InterpretorDesignPattern;

public class NumberTerminalExpression implements AbstractExpression{

    String stringvalue;

    NumberTerminalExpression(String stringval){
        this.stringvalue=stringval;
    }

    @Override
    public int interpret(Context context) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'interpret'");
        return context.get(stringvalue);
    }

    
    
}
