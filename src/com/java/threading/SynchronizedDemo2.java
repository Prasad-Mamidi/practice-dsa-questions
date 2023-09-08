package com.java.threading;

class Display2{
    public synchronized void dispNum(){
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
            }
    }
    public synchronized void dispChar(){
        for (int i = 65; i < 75; i++) {
            System.out.print((char)i+" ");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){}
        }
    }
}
public class SynchronizedDemo2 {
    public static void main(String[] args){
        Display2 d = new Display2();
        Thread t1 = new Thread(()-> {
            d.dispNum();});
        Thread t2 = new Thread(()->{
            d.dispChar();
        });
        t1.start();
        t2.start();
    }
}
