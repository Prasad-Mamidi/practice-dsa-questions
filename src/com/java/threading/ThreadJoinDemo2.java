package com.java.threading;


class MyThread2 extends Thread{
     static Thread main;
    @Override
    public void run(){
        try{
//            main.join(10000);
            main.join();
        }
        catch(InterruptedException e){}
        for(int i=0;i<10;i++){
            System.out.println("Seetha"+i);
        }
    }
}
public class ThreadJoinDemo2 {
    public static void main(String[] args)  {
        Thread m =Thread.currentThread();
        // Assigning the main thread reference to static variable of MyThread2
        MyThread2.main = m;
        MyThread2 t = new MyThread2();
        // Assigning the main thread reference to variable of MyThread2
        // t.main = m;
        t.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("Raama"+j);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){

            }
        }
    }
}
