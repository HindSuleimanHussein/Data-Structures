package com.project;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Linear<Integer> linear = new Linear<>(11);
        linear.insert(-2);
        linear.insert(30);
        linear.insert(40);
        linear.insert(50);
        linear.insert(45);
        linear.insert(45);
        System.out.println(linear.find(45));
        System.out.println(linear.delete(50));

        System.out.println(linear);
    }
}
