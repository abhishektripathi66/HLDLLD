package LowLevelDesign.DesignPatterns.CommandPattern;

public class AirConditioner {
    
    boolean isOn;
    int temperature;

    public void turnOnAc(){
        isOn=true;
        System.out.println("AC is turned On");
    }

    public void turnOffAC(){
        isOn=false;
        System.out.println("AC is turned off");
    }

    public void settemperature(int temp){
        temperature=temp;
        System.out.println("the temperature of AC is set to "+temp);
    }
}
