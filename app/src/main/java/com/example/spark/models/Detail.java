package com.example.spark.models;

public class Detail {

    // Atributos - coinciden con los campos de la tabla
    private int detailId;
    private int productQuantity;
    private double unitPrice;     // DECIMAL(10,2)
    private double subTotalDetail; // DECIMAL(10,2)
    private int cartId;
    private int productId;

    // Constructor completo
    public Detail(int detailId, int productQuantity, double unitPrice, double subTotalDetail, int cartId, int productId) {
        this.detailId = detailId;
        this.productQuantity = productQuantity;
        this.unitPrice = unitPrice;
        this.subTotalDetail = subTotalDetail;
        this.cartId = cartId;
        this.productId = productId;
    }

    // Getters y Setters

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getSubTotalDetail() {
        return subTotalDetail;
    }

    public void setSubTotalDetail(double subTotalDetail) {
        this.subTotalDetail = subTotalDetail;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
