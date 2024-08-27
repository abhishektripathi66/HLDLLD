package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.templateDesignPattern;

public class Test {

    public static void main(String[] args) {
        
        PaymentFlow pf = new PaymentToIndividual();
        pf.sendMoney();
        pf = new PaymentToMerchant();
        pf.sendMoney();
    }
}