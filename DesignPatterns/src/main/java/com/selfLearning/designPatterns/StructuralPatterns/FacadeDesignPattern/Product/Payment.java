package com.selfLearning.designPatterns.StructuralPatterns.FacadeDesignPattern.Product;

public class Payment {

    public void makePayment(int price, String productName) {
        System.out.println("Making payment of " + price + "/- for the product " + productName);
    }
}
