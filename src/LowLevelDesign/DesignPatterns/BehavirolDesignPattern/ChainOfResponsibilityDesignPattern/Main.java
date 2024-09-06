package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ChainOfResponsibilityDesignPattern;

public class Main {

    public static void main(String[] args) {
        
        LogProcessor lp = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        lp.log(LogProcessor.ERROR, "Exception occurs");
        lp.log(LogProcessor.DEBUG, "Debug message");
        lp.log(LogProcessor.INFO, "info message");
    }
    
}
