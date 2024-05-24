package LowLevelDesign.DesignPatterns.CommandPattern;

public class Main {
    
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        MyRemoteControl mrc = new MyRemoteControl();

        mrc.setCommand(new TurnOnACCommand(ac));
        mrc.pressButton("true");
        mrc.setCommand(new TurnOffACCommand(ac));
        mrc.pressButton("false");
        mrc.setCommand(new SetTemperatureCommand(ac));
        mrc.pressButton("40");
    }
}
