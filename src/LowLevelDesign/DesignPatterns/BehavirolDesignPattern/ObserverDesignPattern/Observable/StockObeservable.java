package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observable;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObeservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver obeserver);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();


    
}
