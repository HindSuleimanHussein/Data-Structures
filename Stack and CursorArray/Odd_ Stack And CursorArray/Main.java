package com.project;

public class Main {

    public static void main(String[] args) {
        LinkedStack<Integer> linkSt = new LinkedStack<>(10);
        linkSt.push(50);
        linkSt.push(99);
        linkSt.push(11);
        linkSt.push(15);
        linkSt.push(90);
        linkSt.push(70);

        System.out.println(linkSt);
        System.out.println(getOdd(linkSt));

    }

    public static LinkedStack<Integer> getOdd(LinkedStack<Integer> linkSt) {
        LinkedStack<Integer> oddLink = new LinkedStack<>(10);
        while (!linkSt.isEmpty()) {
            int x = linkSt.peek();
            linkSt.pop();
            if (x%2!=0)
                oddLink.push(x);
        }
        return oddLink;
    }
}