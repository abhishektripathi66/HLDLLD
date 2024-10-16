package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingStates.Impl;

import java.util.List;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.Coin;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.Item;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingStates.State;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.StateDesignPattern.DesginVendingmachine.VendingMachine;

public class SelectionState implements State{


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
        
       Item item = machine.getInventory().getItem(codeNumber);

       int paidByUser =0;
       for(Coin coin : machine.getCoinList()){
            paidByUser = paidByUser+coin.value;
       }

       if(paidByUser < item.getPrice()){
        System.out.println("insufficient amount, product you selected is for price: "+ item.getPrice()+" and you paid: "+paidByUser);
        refundFullMoney(machine);
        throw new Exception("insufficient Amount");
       }else if(paidByUser>= item.getPrice()){
        if(paidByUser > item.getPrice()){
            getChange(paidByUser-item.getPrice());
        }
        machine.setVendingMachineState(new DispenseState(machine, codeNumber));
       }
        
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("returned the change in the coin dispense Tray: "+ returnChangeMoney);
        return returnChangeMoney;
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
