package com.project;

public class LinkedList<E extends Comparable<E>> {
    private Node<E> head;

    public void insertAtHead(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;

    }

    public void insertAtEnd(E data) {
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

    public void insertSorted(E data) {
        Node<E> newNode = new Node<>(data);
        Node<E> curr = head;
        Node<E> prev = null;
        if (head == null) {
            head = newNode;
        } else {
            while (curr != null && curr.getData().compareTo(data) < 0) {
                prev = curr;
                curr = curr.getNext();

            }
            if (prev == null) {
                head = newNode;
                head.setNext(curr);
            } else {
                newNode.setNext(curr);
                prev.setNext(newNode);

            }
        }
    }

    public E find(E data){
        Node<E> curr = head;
        while(curr!=null){
            if(curr.getData().equals(data))
                return curr.getData();

            curr=curr.getNext();
        }

        return null;
    }

    public void delete(E data) {
        Node<E> curr = head;
        Node<E> prev = null;
        if (curr != null && curr.getData() == data) {
            head = curr.getNext(); // Changed head
            return;
        }

        while (curr != null && curr.getData() != data) {
            prev = curr;
            curr = curr.getNext();
        }

        // If key was not present in linked list
        if (curr == null)
            return;

        // Unlink the node from linked list
        prev.setNext(curr.getNext());

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