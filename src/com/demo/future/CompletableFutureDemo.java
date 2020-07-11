package com.demo.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) {
        CompletableFuture<Boolean> future1 = CompletableFuture.supplyAsync(()->{
           Order ord = new Order(1);
           return ord.createOrder();
        }).thenApply(p->{
            Payment payment = new Payment();
            return payment.makePayment(p);
        });
        CompletableFuture<Boolean> future2 = CompletableFuture.supplyAsync(()->{
            Order ord = new Order(2);
            return ord.createOrder();
        }).thenApply(p->{
            Payment payment = new Payment();
            return payment.makePayment(2);
        });
        System.out.println("Waiting for Orders");
        System.out.println(future1.join()? "Order 1 Completed":"Order 1 failed");
        System.out.println(future2.join()? "Order 2 Completed":"Order 1 failed");

    }
}
