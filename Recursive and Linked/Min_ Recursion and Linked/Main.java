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
        System.out.println("The minimum numbers are: " + min(link.getHead(), Integer.MAX_VALUE));



    }

    public static int min(Node curr, int min){
        if(curr==null)
            return min;

        if(curr.getData()<min)
            min=curr.getData();

        return min(curr.getNext(), min);
    }
}
