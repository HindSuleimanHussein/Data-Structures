package com.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What word would you like to reverse?");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        reverse(s);
    }

    public static void reverse(String s){
        reverse(s, s.length()-1);
    }

    private static void reverse(String s, int index){
        if(index>=0){
            System.out.print(s.charAt(index));
            reverse(s, index-1);
        }
    }
}
