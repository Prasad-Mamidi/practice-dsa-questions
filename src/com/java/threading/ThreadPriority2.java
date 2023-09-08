package com.java.threading;


public class ThreadPriority2 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread());
            }
        },"Prasad");
        t.setPriority(8);
        t.start();
        for(int j=0;j<5;j++){
            System.out.println(Thread.currentThread());
        }
    }
}
