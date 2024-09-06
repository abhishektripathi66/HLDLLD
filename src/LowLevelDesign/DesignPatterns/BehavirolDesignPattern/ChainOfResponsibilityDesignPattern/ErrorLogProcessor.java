package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
        //TODO Auto-generated constructor stub
    }

    public void log(int loglevel, String message){
        if(loglevel == ERROR){
            System.out.println("ERROR: "+message);
        }
        else{
            super.log(loglevel, message);
        }
    }
    
}
