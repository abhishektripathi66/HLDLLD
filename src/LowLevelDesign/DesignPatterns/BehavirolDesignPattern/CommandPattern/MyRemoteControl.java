package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.CommandPattern;

import java.util.Stack;

public class MyRemoteControl {
    
    ICommand icommand;
    Stack<ICommand> acCommandHistory = new Stack<>();
    MyRemoteControl(){

    }

    public void setCommand(ICommand iCommand){
        this.icommand = iCommand;
    }

    public void pressButton(String value){
        this.icommand.execute(value);
        acCommandHistory.add(icommand);
    }

    public void undo(){
        if(!acCommandHistory.empty()){
            ICommand icommand = acCommandHistory.pop();
            icommand.undo("20");
        }
    }
}
