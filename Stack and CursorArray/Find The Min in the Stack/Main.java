package com.project;

public class Main {

    public static void main(String[] args) {
	    LinkedStack<Integer> linkSt = new LinkedStack<>(10);
        linkSt.push(50);
        linkSt.push(11);
        linkSt.push(15);
        linkSt.push(90);
        linkSt.push(70);

        System.out.println(linkSt);
        System.out.println(getMin(linkSt));

    }

    public static int getMin(LinkedStack<Integer> linkSt) {
        int min = linkSt.peek();
        while (!linkSt.isEmpty()) {
            int x = linkSt.peek();
            linkSt.pop();
            if (x < min)
                min = x;
        }
        return min;
    }
}
