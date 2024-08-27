package LowLevelDesign.DesignPatterns.templateDesignPattern;

public class PaymentToIndividual extends PaymentFlow{


    @Override
    public void validateRequest(){
        System.out.println("validate logic to pay to individual");
    }
    
    @Override
    public void debitAmount(){
        System.out.println("Debit the amount to individual");
    }

    @Override
    public void calculateFees(){
        System.out.println("0% fees for individual");
    }

    @Override
    public void creditAmount(){
        System.out.println("crediting the amount to individual");
    }

}