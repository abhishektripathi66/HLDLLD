package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingStates.Impl;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.Coin;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.Item;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingStates.State;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;
public class IdleState implements State{

    public IdleState(){
        System.out.println("Currently VendingMachine is in IdleState");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently VendingMachine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        machine.setVendingMachineState(new HasMoneyState());
        // throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void clickOnStartproductSelectionButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("First you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("you cannot insert coin in the idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("you cannot chose the product in the idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("you cannot get change in the idle state'");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("The product cannot be dsipensed from idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("The Amount is not added in the idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

            machine.getInventory().addItem(item,codeNumber);
    }
    
}
