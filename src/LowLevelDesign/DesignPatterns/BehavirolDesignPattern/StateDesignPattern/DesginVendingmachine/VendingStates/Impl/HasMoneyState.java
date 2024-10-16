package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingStates.Impl;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.Coin;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.Item;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingStates.State;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingMachine;

import java.util.List;
public class HasMoneyState implements State{

    public HasMoneyState(){
        System.out.println("Currently the machine is the hasmoneystate");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void clickOnStartproductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("returned the full amount back in the coin dispense tray");
        List<Coin> coins = machine.getCoinList();
        machine.setVendingMachineState(new IdleState(machine));
        return coins;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }
    
}
