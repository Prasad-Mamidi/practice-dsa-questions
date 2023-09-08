package com.java.threading;

class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int j=0;j<10;j++){
            System.out.println("Seetha");
            //Thread.yield();
        }

    }
}
public class ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        mt.start();
        for(int i=0;i<10;i++){
            System.out.println("Rama");
            Thread.yield();
        }
    }
}
