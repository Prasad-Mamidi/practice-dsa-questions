package com.java.mathdsa;

public class PrimeNumber {
    public static void main(String[] args) {
          printPrimeSeries(40);
        System.out.println();
          sieve(40);
    }
    // this will give the O(N.sqrt(N))
    static void printPrimeSeries(int n){
        for(int num=1;num<=n;num++){
            if(isPrime2(num))
                System.out.print(num+" ");
        }
    }
    public static void printPrimeOrNot(int n){
        for(int i=1;i<=n;i++){
            if(isPrime2(i))
                System.out.println(i+" is prime");
            else
                System.out.println(i+" is not prime");

        }
    }
    public static boolean isPrime1(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static boolean isPrime2(int n){
        if(n==1)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    // Optimization method for prime & time complexity O(N*log(log(n))
    static void sieve(int n){
        boolean[] primes = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i])
                System.out.print(i+" ");
        }
    }
}
