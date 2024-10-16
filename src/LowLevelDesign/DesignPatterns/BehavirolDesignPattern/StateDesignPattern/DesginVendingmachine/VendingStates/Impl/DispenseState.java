package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingStates.Impl;


import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.Coin;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.Item;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingMachine;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingStates.State;
import java.util.*;
public class DispenseState  implements State{

    DispenseState(VendingMachine machine, int codeNumber) throws Exception{
        System.out.println("currently vending machine is in dispensestate");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void clickOnStartproductSelectionButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnStartproductSelectionButton'");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        
            System.out.println("Product has been dispensed");
            Item item = machine.getInventory().getItem(codeNumber);
            machine.getInventory().updateSoldOutItem(codeNumber);
            machine.setVendingMachineState(new IdleState(machine));
            return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refundFullMoney'");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }
    
}
