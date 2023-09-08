package com.java.threading;

public class ThreadJoinDemo1 {
    public static void main(String[] args)  {
        Thread t1 = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("Child-Thread"+i);
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){

                }
            }
        });
        t1.start();
        // join method is called on t1 Thread object.
        // Hence,main thread is waiting for the t1 thread complete its execution
       try{
            t1.join();
            //t1.join(10000);
        }
        catch(InterruptedException e){
            System.out.println("I got interrupted");
        }

        for(int i=0;i<10;i++){
            System.out.println("Main-Thread"+i);
        }

    }
}
