import Dataworkspace.Auction;
import Dataworkspace.AuctionsList;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class TestAuction {
    private AuctionsList auctionsList;
    private Auction auction;

    @Before
    public void setUp() {
        auctionsList = new AuctionsList();

    }

    @Test
    public void testAddedAuctions() throws IOException {
        long idProduct = 124;
        String productName = "maslo";
        String productDescription = "maslane";
        int productPrice = 10;

        auctionsList.addProduct(new Auction(idProduct, productName, productDescription, productPrice));

    }

}
