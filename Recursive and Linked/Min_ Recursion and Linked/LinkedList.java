package com.project;

public class LinkedList<E extends Comparable<E>> {
    private Node<E> head;

    public Node<E> getHead() {
        return head;
    }

    public void insertAtHead(int data) {
        Node<E> newNode = new Node(data);
        Node<E> current = head;

        if (head == null) {
            head = newNode;
        } else {
            current.setNext(newNode);
        }

    }

    public void insertAtEnd(int data) {
        Node<E> newNode = new Node(data);
        Node<E> current = head;
        if (current == null) {
            insertAtHead(data);
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

    }

    @Override
    public String toString() {
        String s = "Head ";
        Node<E> curr = head;
        while (curr != null) {
            s += curr.toString();
            curr = curr.getNext();
        }
        return s + " -->Null";
    }

}