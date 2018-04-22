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


    int licznik = 0;

    public boolean bidAuction(long index, int newPrice) {
        try {
            auctionsList.getAuction(index).setProductPrice(newPrice);
            ++licznik;
            if (licznik >2){
                System.out.println("KUPILES PRZEDMIOT " + auctionsList.getAuction(index));
                auctionsList.removeAuction(index);
                
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
