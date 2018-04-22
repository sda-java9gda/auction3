package Dataworkspace;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuctionsList {

    private static AuctionsList Instance;
    private List<Auction> auctionsList = new ArrayList<>();

    public static AuctionsList getInstance() {
        if (Instance == null){
            Instance = new AuctionsList();
        }
        return Instance;
    }

    String fileName;
    File auctionListFile = new File(fileName);

    public List<Auction> getAuctionsList() {
        return auctionsList;
    }

    public AuctionsList() {
        this.auctionsList = auctionsList;
    }

    public void addProduct(Auction auction) throws IOException {
        auctionsList.add(auction);
        FileWriter fileWriter = new FileWriter(auctionListFile,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(auction.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public void removeAuction(long index) {
        for (Auction a: auctionsList){
            if (a.getiDProduct() == index) {
                auctionsList.remove(a);
            }
        }
    }

    public void showAllAuctions() {
        for (Auction p : auctionsList
                ) {
            System.out.println(p);
        }
    }

    public Auction getAuction (long index){
        for (Auction a: auctionsList){
          if (a.getiDProduct() == index) {
              return a;
          }
        }
        return null;
    }




}
