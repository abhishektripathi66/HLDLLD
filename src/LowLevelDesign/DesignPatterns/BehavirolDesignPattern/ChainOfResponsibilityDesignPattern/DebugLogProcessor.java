package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
        //TODO Auto-generated constructor stub
    }
    
    public void log(int loglevel, String message){
        if(loglevel == DEBUG){
            System.out.println("DEBUG: "+message);
        }
        else{
            super.log(loglevel, message);
        }
    }
}
