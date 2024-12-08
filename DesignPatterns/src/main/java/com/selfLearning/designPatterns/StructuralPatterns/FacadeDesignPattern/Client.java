package com.selfLearning.designPatterns.StructuralPatterns.FacadeDesignPattern;


import com.selfLearning.designPatterns.StructuralPatterns.FacadeDesignPattern.Facade.OrderFacade;

public class Client {

    public static void main(String[] args){
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}
