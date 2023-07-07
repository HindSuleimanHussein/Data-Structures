package com.project;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s= " okay then ";
        reverseSentence(s);
    }
    private static void reverseSentence(String s){
        if(s.indexOf(" ")==-1) {
            System.out.println(s + " ");
        }
        else{
            int space = s.lastIndexOf(" ");
            String lastWord=s.substring(space+1);
            System.out.println(lastWord+ " ");
            reverse(s.substring(0, space).trim());

        }

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
