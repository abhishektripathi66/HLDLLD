package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observer;

import LowLevelDesign.DesignPatterns.BehavirolDesignPattern.ObserverDesignPattern.Observable.StockObeservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObeservable stockObeservable;

    public EmailAlertObserverImpl(String emailId, StockObeservable stockObeservable){
        this.emailId=emailId;
        this.stockObeservable=stockObeservable;
    }

    @Override
    public void update() {
        sendMail(emailId,"product is in stock hurry up");    
    
    }

    public void sendMail(String mailid, String message){
        System.out.println("message: "+message+", sent to :"+mailid);
    }
    
}
