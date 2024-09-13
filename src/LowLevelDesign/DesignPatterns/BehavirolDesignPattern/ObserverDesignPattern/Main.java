package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observable.IphoneObservableImpl;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observable.StockObeservable;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {
        
        StockObeservable stockObeservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("ab@bc.com", stockObeservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("ab",stockObeservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("abab@bye.com", stockObeservable);

        stockObeservable.add(observer1);
        stockObeservable.add(observer2);
        stockObeservable.add(observer3);
        stockObeservable.setStockCount(10);
    }
    
}
