package com.selfLearning.designPatterns.CreationalPatterns.FactoryPattern;

public class Client {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
    }
}
