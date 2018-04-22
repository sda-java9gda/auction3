package Dataworkspace;

public class Auction {

    private long iDProduct;
    private String productName;
    private String productDescription;
    private int productPrice;

    private static Auction Instance;

    public Auction(long idProduct) {
    }

    public static Auction getInstance() {
        if (Instance == null){
            Instance = new Auction();
        }
        return Instance;
    }

    public long getiDProduct() {
        return iDProduct;
    }

    public void setiDProduct(long iDProduct) {
        this.iDProduct = iDProduct;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public Auction(String productName, String productDescription, int productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public Auction() {
    }




    @Override
    public String toString() {
        return iDProduct + " - " + productName + " - " +
                productDescription + " - " +
                 productPrice ;

    }
}
