package com.java.threading;

class Display{
    // when you declare the method as static
    // even though you are having different objects
    //but process will go in the regular process
    //hence only one thread allowed  at a time to execute
    // this said to be class level lock
    public void message(String name){
        synchronized (Display.class){
        for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning:");
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){}
                System.out.println(name);
            }
//            System.out.println("start");
//            System.out.println("end");
        }
    }
}
class Thread1 extends Thread{


    Display d;
    String name;
    Thread1(Display d , String name){
        this.d = d;
        this.name = name;
    }
    @Override
     public void run(){
          d.message(name);
    }
}
public class synchronizationDemo {
    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
       // Display d2 = new Display();
        // when you are passing different objects , then it will come as normal multi threading
        // then it is better not to go for synchronized
        // one object multiple thread - May be synchronization is required
        // multiple object - synchronization is not required
        Thread1 t1 = new Thread1(d1,"kohli");
        Thread1 t2 = new Thread1(d2,"Prasad");
        t1.start();
        t2.start();
    }

}
