package LowLevelDesign.DesignPatterns.CommandPattern;

public class SetTemperatureCommand implements ICommand {

    AirConditioner ac;

    SetTemperatureCommand(AirConditioner ac){
        this.ac=ac;
    }
    @Override
    public void execute(String Value) {
        ac.settemperature(Integer.parseInt(Value));
    }
    @Override
    public void undo(String value) {
        ac.settemperature(Integer.parseInt(value));
    }
    
}
