package com.product;

public class Product {
    private int pid;
    private int price;
    private int quantity;

    public Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getPid() {
        return pid;
    }

    public int getQuantity() {
        return quantity;
    }
}