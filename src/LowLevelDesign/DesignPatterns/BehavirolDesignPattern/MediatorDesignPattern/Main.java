package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.MediatorDesignPattern;

public class Main {
   
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague bidder1 = new Bidder("A",auctionMediator);
        Colleague bidder2 = new Bidder("B", auctionMediator);

        bidder1.placeBid(1000);
        bidder2.placeBid(10);
        bidder1.placeBid(35);
        
    }
}
