package com.project;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("What word would you like? ");
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        System.out.println("What character would you like us to count? ");
        char c = sc.next().charAt(0);

        System.out.println("The amount is: ");
        System.out.print(countChar(s, c));
    }
    public static int countChar(String s, char c){
        if(s.length()<=0)
            return 0;
        if(s.charAt(0)==c){
            return 1+countChar(s.substring(1), c);
        }
        return countChar(s.substring(1), c);

    }
}
