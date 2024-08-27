package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.CommandPattern;

public class TurnOffACCommand implements ICommand{

    AirConditioner ac;

    TurnOffACCommand(AirConditioner ac){
        this.ac=ac;
    }
    @Override
    public void execute(String value) {
        ac.turnOffAC();
    }
    @Override
    public void undo(String value) {
        ac.turnOnAc();
    }
    
}
