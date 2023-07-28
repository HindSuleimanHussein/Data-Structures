package com.project;

public class LinkedStack<Hind extends Comparable<Hind>> implements StackInterface<Hind> {
    CArray<Hind> cA;
    int list;

    public LinkedStack(int capacity) {
        cA=new CArray<>(capacity);
        list=cA.createList();
    }

    @Override
    public void pushFirst(Hind data) {
        if(cA.hasFree())
            cA.insertAtHead(data, list);
        else
            System.out.println("Stack Overflow!");

    }

    @Override
    public void pushLast(Hind data) {
        if(cA.hasFree())
            cA.insertAtLast(data, list);
        else
            System.out.println("Stack Overflow!");

    }

    @Override
    public Hind popFirst() {
        if(!cA.isEmpty(list))
            return cA.deleteFirst(list);
        return null;

    }

    @Override
    public Hind popLast() {
        if(!cA.isEmpty(list))
            return cA.deleteLast(list);
        return null;

    }

    @Override
    public Hind peekFirst() {
        return cA.seeFirst(list);
    }

    @Override
    public Hind peekLast() {
        return cA.seeLast(list);
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

