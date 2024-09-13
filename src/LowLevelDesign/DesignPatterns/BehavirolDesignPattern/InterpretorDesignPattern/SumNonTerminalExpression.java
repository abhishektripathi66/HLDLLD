package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.InterpretorDesignPattern;

public class SumNonTerminalExpression implements AbstractExpression{

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;

    public SumNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression){
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
    }

    @Override
    public int interpret(Context context) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'interpret'");
        return leftExpression.interpret(context)+ rightExpression.interpret(context);
    }

   

    
    
}
