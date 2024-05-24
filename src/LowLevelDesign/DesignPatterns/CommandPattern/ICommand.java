package LowLevelDesign.DesignPatterns.CommandPattern;

public interface ICommand {
    
    public void execute(String value);
    public void undo(String value);
}
