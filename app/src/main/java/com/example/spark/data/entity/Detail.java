package com.example.spark.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Detail")
public class Detail {

    @PrimaryKey(autoGenerate = true)
    private int detailId;

    private int productQuantity;

    private double unitPrice;

    private double subTotalDetail;

    private int cartId;

    private int productId;

    // Constructor
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
