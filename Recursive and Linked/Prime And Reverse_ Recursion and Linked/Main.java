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
        link.reverse(link.getHead());

        System.out.println(" ");
        System.out.println("Is there a prime number?");
        boolean prime=prime(link.getHead(), 2);
        System.out.println(prime);


    }

    public static boolean prime(Node<String> head, int i) {
        if(head.getData()<=2)
            return true;

        if(head.getData()%i==0)
            return false;
        if(i*i>head.getData())
            return true;


        return prime(head, (i+1));
    }


}
