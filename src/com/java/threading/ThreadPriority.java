package com.java.threading;



class MyT extends Thread{


}
public class ThreadPriority {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());//5
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());//7
        MyT mt = new MyT();
       // System.out.println(mt.currentThread());
        System.out.println(mt.getPriority());

    }
}
