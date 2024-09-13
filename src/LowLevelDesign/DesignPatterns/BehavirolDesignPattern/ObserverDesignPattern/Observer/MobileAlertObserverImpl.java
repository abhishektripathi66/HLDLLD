package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observer;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observable.StockObeservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    StockObeservable stockObeservable;
    String Username;

    public MobileAlertObserverImpl(String Username,StockObeservable stockObeservable){
        this.Username=Username;
        this.stockObeservable=stockObeservable;
    }


    @Override
    public void update() {
        sendMessageOnPhone("the product is in stock", Username);
    
    }

    public void sendMessageOnPhone(String msg, String Username){
        System.out.println("Message : "+msg+", is notified to user: "+Username);
    }
    
}
