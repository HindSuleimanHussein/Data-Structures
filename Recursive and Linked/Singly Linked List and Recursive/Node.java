package com.project;

public class Node<E extends Comparable<E>>{

    public int data;
    private Node<E> next;


    public Node(int data) {
        super();
        this.data = data;
    }


    public int getData() {
        return data;
    }


    public void setData(int data) {
        this.data = data;
    }


    public Node<E> getNext() {
        return next;
    }


    public void setNext(Node<E> next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "-->" + data;
    }


}
