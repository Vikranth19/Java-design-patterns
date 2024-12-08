package com.selfLearning.designPatterns.StructuralPatterns.FacadeDesignPattern.Product;

public class ProductDao {

    public Product getProduct() {
        return new Product(100, true, "Yoga mat");
    }
}
