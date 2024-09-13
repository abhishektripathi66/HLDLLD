package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObeservable{

public List<NotificationAlertObserver> observerList = new ArrayList<>();
public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        // TODO Auto-generated method stub
        observerList.add(observer);
        // throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(NotificationAlertObserver obeserver) {
        observerList.remove(obeserver);        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void notifySubscribers() {
        // TODO Auto-generated method stub
        for(NotificationAlertObserver observer:observerList){
            observer.update();
        }

        // throw new UnsupportedOperationException("Unimplemented method 'notifySubscribers'");
    }

    @Override
    public void setStockCount(int newStockAdded) {
        // TODO Auto-generated method stub

        if(stockCount==0){
            notifySubscribers();
        }
        stockCount += newStockAdded;
        // throw new UnsupportedOperationException("Unimplemented method 'setStockCount'");
    }

    @Override
    public int getStockCount() {
        // TODO Auto-generated method stub
        return stockCount;
        // throw new UnsupportedOperationException("Unimplemented method 'getStockCount'");
    }
    
}
