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
        System.out.println(sortFromMin(linkSt));

    }

    public static LinkedStack<Integer> sortFromMin(LinkedStack<Integer> linkSt) {
        LinkedStack<Integer> minLink = new LinkedStack<>(10);
        while(!linkSt.isEmpty()) {
            int min = linkSt.pop();
            while (!minLink.isEmpty() && minLink.peek() < min)
                linkSt.push(minLink.pop());

            minLink.push(min);

        }

        return minLink;

    }
}