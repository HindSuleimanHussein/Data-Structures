package com.project;

public class LinkedStack<Hind extends Comparable<Hind>> implements StackInterface<Hind> {
    CArray<Hind> cA;
    int list;

    public LinkedStack(int capacity) {
        cA=new CArray<>(capacity);
        list=cA.createList();
    }

    @Override
    public void push(Hind data) {
        if(cA.hasFree())
            cA.insertAtHead(data, list);
        else
            System.out.println("Stack Overflow!");

    }

    @Override
    public Hind pop() {
        if(!cA.isEmpty(list))
            return cA.deleteFirst(list);
        return null;

    }

    @Override
    public Hind peek() {
        return cA.deleteFirst(list);
    }

    @Override
    public boolean isEmpty() {
        return cA.isEmpty(list);
    }

    @Override
    public void clear() {
        cA.deleteAll(list);

    }
    public String toString(){
        return cA.toString();
    }
}
