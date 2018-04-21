package Auctions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuctionsList {


   private List<Product> auctionsList = new ArrayList<>();

   String fileName = "Baza aukcji.txt";
   File auctionListFile = new File(fileName);

    public List<Product> getAuctionsList() {
        return auctionsList;
    }



    public AuctionsList() {
        this.auctionsList = auctionsList;
    }

    public void addProduct(Product product) throws IOException {

        auctionsList.add(product);

        FileWriter fileWriter = new FileWriter(auctionListFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(product.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public void removeProduct(String index){
        auctionsList.remove(index);
    }

    public void showAllAuctions(){
        for (Product p:auctionsList
             ) {

            System.out.println(p);

        }
    }


}
