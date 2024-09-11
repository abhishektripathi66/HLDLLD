package LowLevelDesign.DesignPatterns.BehavirolDesignPattern.MediatorDesignPattern;

import java.util.*;

public class Auction implements AuctionMediator {

    List<Colleague> colleagues = new ArrayList<>();
    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'addBidder'");
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {

        for(Colleague c : colleagues){
            if(!c.getName().equals(bidder.getName())){
                c.recieveBidNotification(bidAmount);
            }
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'placeBid'");
    }
    
}
