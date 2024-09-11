package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.MediatorDesignPattern;

public class Bidder implements Colleague {

    String name;
    AuctionMediator auctionMediator;

    Bidder(String name, AuctionMediator auctionMediator){
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }
    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'placeBid'");
    }

    @Override
    public void recieveBidNotification(int bidAmount) {
        System.out.println("Bidder: "+name+" got the notification that someone has put bid of : "+bidAmount);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'recieveBidNotification'");
    }

    @Override
    public String getName() {
        return name;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
    
}
