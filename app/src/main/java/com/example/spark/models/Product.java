package com.example.spark.models;

public class Product {

    // Atributos - coinciden con los campos de la tabla
    private int productId;
    private String productName;
    private String productDescription;
    private double price;              // DECIMAL(10,2)
    private int availability;
    private double discount;           // DECIMAL(5,2), puede ser null
    private String productImage;
    private String additionalImages;   // Puede contener múltiples URLs separadas por comas o JSON
    private int timesAddedToCart;      // Por defecto 0
    private int categoryId;

    // Constructor completo
    public Product(int productId, String productName, String productDescription,
                   double price, int availability, double discount,
                   String productImage, String additionalImages,
                   int timesAddedToCart, int categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.availability = availability;
        this.discount = discount;
        this.productImage = productImage;
        this.additionalImages = additionalImages;
        this.timesAddedToCart = timesAddedToCart;
        this.categoryId = categoryId;
    }

    // Getters y Setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getAdditionalImages() {
        return additionalImages;
    }

    public void setAdditionalImages(String additionalImages) {
        this.additionalImages = additionalImages;
    }

    public int getTimesAddedToCart() {
        return timesAddedToCart;
    }

    public void setTimesAddedToCart(int timesAddedToCart) {
        this.timesAddedToCart = timesAddedToCart;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
