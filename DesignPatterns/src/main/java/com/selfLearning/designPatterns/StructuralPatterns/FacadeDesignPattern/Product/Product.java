package com.selfLearning.designPatterns.StructuralPatterns.FacadeDesignPattern.Product;
import java.util.Random;

public class Product {

    int productId;
    int price;
    String productName;
    boolean isAvailable;

    Product(int price, boolean isAvailable, String productName){
        Random rand = new Random();

        this.productId = rand.nextInt(10000);
        this.price = price;
        this.isAvailable = isAvailable;
        this.productName = productName;
    }

    public String getProductName(){
        return this.productName;
    }

    public int getPrice(){
        return this.price;
    }
}
