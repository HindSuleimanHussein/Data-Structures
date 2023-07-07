package com.project;

public class Main {

    public static void main(String[] args) {
        DLinkedList<Integer> link = new DLinkedList();
        link.insertSorted(44);
        link.insertSorted(20);
        link.insertSorted(30);
        link.insertSorted(55);
        link.insertSorted(90);
        link.insertSorted(20);
        link.insertSorted(97);
        //System.out.println(link.find(70));
        System.out.println(link);
        //System.out.println(link.findRecursion(70));

    }
}
