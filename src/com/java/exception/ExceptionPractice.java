package com.java.exception;
import java.lang.*;
class InsufficientFundException extends RuntimeException{
    InsufficientFundException(String msg){
       // System.out.println(msg);
        super(msg);
    }
}

public class ExceptionPractice extends Error {
    static int balance=1000;
    public static void main(String[] args)  {
        //throw new ExceptionPractice();
        int amount = 1100;
        withdraw(amount);

    }
    static void withdraw(int amount){
        if(amount>balance){
            throw new InsufficientFundException("insufficient funds");
        }
    }
   /* static void controlFlow(){
        try {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        }

        finally{
            System.out.println(5);
        }
        //System.out.println(6/0);

    }
    */
}
