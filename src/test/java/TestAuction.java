import Dataworkspace.Auction;
import Dataworkspace.AuctionsList;
import org.junit.Before;
import org.junit.Test;

public class TestAuction {
private AuctionsList auctionsList;
private Auction auction;
@Before
    public void setUp (){
    auctionsList = new AuctionsList();
    auction =new Auction(124,"maslo","maslo maslane",10);
}

@Test
    public void testAddedAuctions (){


//    auctionsList.addProduct();
}

}
