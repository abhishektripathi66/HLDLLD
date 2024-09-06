package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ChainOfResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
        
    }

    public void log(int loglevel, String message){
        if(loglevel == INFO){
            System.out.println("INFO: "+message);
        }
        else{
            super.log(loglevel, message);
        }
    }
    
}
