package com.project;

public class Main {

    public static void main(String[] args) {
        DLinkedList<Integer> link = new DLinkedList<>();
        link.insertAtHead(7);
        link.insertAtHead(6);
        link.insertAtHead(5);
        //System.out.println(link.getNext());
        link.insertAtHead(1201566);
        link.insertAtHead(55);
        link.insertAtHead(90);
        link.insertAtHead(1201074);
        link.insertAtHead(20);
        link.insertAtHead(97);
        link.delete(1201566);
        //link.deleteAllNodes();
        System.out.println(link.find(80));
        //link.display();
        System.out.println(link);

    }
}
