package com.project;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        int randomVar;
        for(int i=55; i<99; i++) {
            randomVar=(int) (Math.random()*(99-55+1)+55);
            link.insertAtHead(randomVar);
        }
        System.out.println(link);
        System.out.println(getPassed(link.getHead()));


    }

    public static int getPassed(Node curr){
       if(curr!=null){
           if(curr.getData()>=60)
               return 1+ getPassed(curr.getNext());
           return getPassed(curr.getNext());
       }
       return 0;
    }
}