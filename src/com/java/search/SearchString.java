package com.java.search;

import java.util.Scanner;
public class SearchString {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String str = in.next();
        char ch = in.next().trim().charAt(0);
        int index=searchChar(str,ch);
        System.out.println("character found at "+index+" index");
        int index2=searchChar1(str,ch);
        System.out.println(index2);
    }
    // normal approach as used for array iteration
    static int searchChar(String str,char ch){
        //char[] arr = str.toCharArray();
        if(str.length()==0)
            return -1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
    //String converting into  char array
    static int searchChar1(String str,char ch){
        char[] arr = str.toCharArray();
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                return i;
            }
        }
        return -1;
    }

}
