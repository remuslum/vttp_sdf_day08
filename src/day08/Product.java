

import java.util.Date;

public class Product {
    private long id;
    private String productName;
    private String productDescription;
    private  String productCategory;
    private float price;
    private Date createdDate;

    public Product(Date createdDate, long id, float price, String productCategory, String productDescription, String productName) {
        this.createdDate = createdDate;
        this.id = id;
        this.price = price;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productName = productName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Product {id=" + id + ", name=" + productName + 
        ", category=" + productCategory + ", description=" 
        + productDescription + ", price=" + price 
        + ", dateCreated=" + createdDate;
    }


}
