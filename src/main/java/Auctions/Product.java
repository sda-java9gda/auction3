package Auctions;

public class Product {

    private long iDProduct;
    private String productName;
    private String productDescription;
    private double productPrice;

    public long getiDProduct() {
        return iDProduct;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Product(long iDProduct, String productName, String productDescription, double productPrice) {
        this.iDProduct = iDProduct;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "iDProduct=" + iDProduct +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
