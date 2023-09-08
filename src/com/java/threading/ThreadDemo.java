package com.java.threading;

class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("run");

    }
    /*public void start(){
        super.start();
        System.out.println("start");
    }*/
}
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("child");
    }
}
public class ThreadDemo {
    // main thread starting the main method
    public static void main(String[] args) {
        // implemented class object is being passed to Thread class
        // for the support of Thread Scheduler by start() method
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        //t.start();
        // same procedure but anonymous class
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("run() method is running by "+Thread.currentThread().getName());
            }
        },"Prasad");
        // same but lambda expression
        Thread t2 =
                new Thread(()->System.out.println("run() method is running by "+
                        Thread.currentThread().getName())
          );
        t.start();
        System.out.println("main() method is running by "+Thread.currentThread().getName());
        // the bottom approach is defining the thread it works properly
        // as Thread class pass by constructor is being passed by MyThread instance
        // Hence it  doesn't raise any error because Thread is consider to be child of Runnable
        // then the reference m treated to be child to parent reference
        MyThread m1 = new MyThread();
        Thread t3 = new Thread(m1);
        //t1.start();

    }


}
