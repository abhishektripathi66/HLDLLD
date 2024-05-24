package LowLevelDesign.DesignPatterns.CommandPattern;

public class MyRemoteControl {
    
    ICommand icommand;

    MyRemoteControl(){

    }

    public void setCommand(ICommand iCommand){
        this.icommand = iCommand;
    }

    public void pressButton(String value){
        this.icommand.execute(value);
    }
}
