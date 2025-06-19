package com.example.spark.models;

public class Business {

    private int businessId;
    private String businessName;
    private String businessCategory;
    private double rating;
    private String businessLogo;

    // Constructor (opcional pero útil)
    public Business(int businessId, String businessName, String businessCategory, double rating, String businessLogo) {
        this.businessId = businessId;
        this.businessName = businessName;
        this.businessCategory = businessCategory;
        this.rating = rating;
        this.businessLogo = businessLogo;
    }

    // Getters y Setters

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getBusinessLogo() {
        return businessLogo;
    }

    public void setBusinessLogo(String businessLogo) {
        this.businessLogo = businessLogo;
    }
}
