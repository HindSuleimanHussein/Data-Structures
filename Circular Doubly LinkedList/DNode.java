package com.project;

public class DNode<T extends Comparable<T>>{
    public T data;
    public DNode prev, next;

    public DNode(T data){
        this.data=data;
    }

    public DNode() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data+" ";
    }




}