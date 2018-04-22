package Controllers;

import Dataworkspace.Auction;
import Dataworkspace.AuctionsList;

import java.io.IOException;

public class AuctionController {

    private AuctionsList auctionsList = AuctionsList.getInstance();

    public boolean addAuction(Auction auction) {
        try {
            auctionsList.addProduct(auction);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void showAllAuctions() {
        for (Auction a : auctionsList.getAuctionsList()) {
            System.out.println(a);
        }
    }

//    public boolean bidAuction(long index) {
//        try {
//    auctionsList.
//        }
    }

}
