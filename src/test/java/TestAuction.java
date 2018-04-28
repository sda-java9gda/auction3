import Controllers.AuctionController;
import Dataworkspace.Auction;
import Dataworkspace.AuctionsList;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertTrue;

public class TestAuction {
    private AuctionsList auctionsList;
    private Auction auction;
    private AuctionController auctionController;

    @Before
    public void setUp() {
        auctionsList = new AuctionsList();
        auctionController = new AuctionController();

    }

    @Test
    public void testAddedAuctions() throws IOException {
        long idProduct = 124;
        String productName = "maslo";
        String productDescription = "maslane";
        int productPrice = 10;

        auctionsList.addProduct(new Auction(idProduct));
        assertTrue(auctionsList.getAuctionsList().contains(new Auction(idProduct)));
    }

    @Test
    public void testAddedAuctionIdProductCorectly() {

      auctionController.addAuction(new Auction(12));
      assertTrue(auctionsList.getAuction(12).equals(new Auction(12)));
    }

}
