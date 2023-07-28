package com.project;

public class Main {

    public static void main(String[] args) {
        LinkedStack<Integer> linkSt = new LinkedStack<>(10);
        linkSt.pushLast(20);
        linkSt.pushLast(10);
        linkSt.pushLast(32);
        linkSt.pushLast(15);
        linkSt.pushLast(90);

        System.out.println(linkSt.peekLast());
        System.out.println(linkSt);




    }
}