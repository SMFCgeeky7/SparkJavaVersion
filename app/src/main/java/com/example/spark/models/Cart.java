package com.example.spark.models;

public class Cart {
    private int cartId;
    private double subtotal;
    private double total;
    private int userId;

    // Constructor
    public Cart(int cartId, double subtotal, double total, int userId) {
        this.cartId = cartId;
        this.subtotal = subtotal;
        this.total = total;
        this.userId = userId;
    }

    // Getters y Setters

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public double getSubTotal() {
        return subtotal;
    }

    public void setSubTotal(double subTotal) {
        this.subtotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
