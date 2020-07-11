package com.demo.future;

public class Order {
    int orderNumber;
    Order(int orderNumber){
        this.orderNumber = orderNumber;
        System.out.println(" Init Order "+orderNumber);
    }
    public Integer createOrder() {
        System.out.println("Creating order" + orderNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return orderNumber;
    }
    public  String deliverOrder(){
        return "Order Delivered";
    }
}
