package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.templateDesignPattern;

public class PaymentToMerchant extends PaymentFlow{

    @Override
    public void validateRequest(){
        System.out.println("validate logic to pay to merchant");
    }
    
    @Override
    public void debitAmount(){
        System.out.println("Debit the amount to merchant");
    }

    @Override
    public void calculateFees(){
        System.out.println("2% fees for merchant");
    }

    @Override
    public void creditAmount(){
        System.out.println("crediting the amount to merchant");
    }
    
}