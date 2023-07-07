package com.project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What number would like us to count down to? ");
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        System.out.println("Count down!");
        down(i);
        System.out.println();
        System.out.println("Count up!");
        up(i);

    }
    public static void down(int i){
        printDown(i);
    }
    public static void up(int i){
        printUp(i, 0);
    }
    private static void printDown(int i){
        if(i>-1){
            System.out.print(i+ " ");
            printDown(i-1);
        }
    }
    private static void printUp(int i, int j){
        if(j<=i){
            System.out.print(j + " ");
            printUp(i, j+1);
        }
    }
}
