package com.selfLearning.designPatterns.CreationalPatterns.FactoryPattern;

public class ShapeFactory {

    public Shape getShape(String shapeInput){
        switch (shapeInput){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
