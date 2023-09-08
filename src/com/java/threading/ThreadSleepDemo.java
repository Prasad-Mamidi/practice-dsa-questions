package com.java.threading;

class MyThread3 extends Thread{
   /* public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                System.out.println("Ramaa");
                Thread.sleep(1000);
            }
        }
         catch(InterruptedException e){
            System.out.println("I got Interrupted");
        }
    }
    */
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Seetha");
        }
        System.out.println("I want to sleep");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("I got Interrupted");
        }
    }

}
public class ThreadSleepDemo {

    public static void main(String[] args) throws InterruptedException {
          MyThread3 m3 = new MyThread3();
          m3.start();
          // interrupt() never gonna wasted
          m3.interrupt();
          System.out.println("Seetha");
    }
}
