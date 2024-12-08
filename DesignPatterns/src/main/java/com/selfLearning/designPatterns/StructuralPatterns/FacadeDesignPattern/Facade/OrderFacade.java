package com.selfLearning.designPatterns.StructuralPatterns.FacadeDesignPattern.Facade;


import com.selfLearning.designPatterns.StructuralPatterns.FacadeDesignPattern.Product.*;

public class OrderFacade {

    ProductDao productDao;
    Payment payment;
    Invoice invoice;
    Notification notification;

    public OrderFacade() {
        productDao = new ProductDao();
        payment = new Payment();
        invoice = new Invoice();
        notification = new Notification();
    }

    public void createOrder() {
        Product product = productDao.getProduct();
        payment.makePayment(product.getPrice(), product.getProductName());
        invoice.generateInvoice();
        notification.sendNotification();
    }
}
