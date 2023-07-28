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
        System.out.println(sortFromMax(linkSt));

    }

    public static LinkedStack<Integer> sortFromMax(LinkedStack<Integer> linkSt) {
        LinkedStack<Integer> maxLink = new LinkedStack<>(10);
        while(!linkSt.isEmpty()) {
            int max = linkSt.pop();
            while (!maxLink.isEmpty() && maxLink.peek() > max)
                linkSt.push(maxLink.pop());

            maxLink.push(max);

        }

        return maxLink;

    }
}