package com.inventorysystem;

public class Product{
    public Product(String productId, Double price, String description, double weight, Size size) {
        this.productId = productId;
        this.price = price;
        this.description = description;
        this.weight = weight;
        this.size = size;
    }

    String productId;
    Double price;
    String description;
    double weight;
    Size size;
}