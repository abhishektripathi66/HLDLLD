package LowLevelDesign.DesignPatterns.CommandPattern;

public class TurnOnACCommand implements ICommand{

    AirConditioner ac ;

    TurnOnACCommand(AirConditioner ac){
        this.ac=ac;
    }
    @Override
    public void execute(String value) {
        ac.turnOnAc();
    }
    @Override
    public void undo(String value) {
        ac.turnOffAC();
    }
    
}
