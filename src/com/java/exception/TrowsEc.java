package com.java.exception;

public class TrowsEc {
    public static void main(String[] args) throws InterruptedException {
        domethod();
    }
    static void domethod() throws InterruptedException{
        domore();
    }
    static void domore() throws InterruptedException{
        Thread.sleep(1000);
    }
}












