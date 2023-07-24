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
        if(odd(link.getHead())==-1) {
            System.out.println("The odd numbers don't exist here");
        }
        else
            System.out.println("The odd numbers are: " + odd(link.getHead()));



    }

    public static int odd(Node curr){
        if(curr==null){
            return -1;
        }
        if(curr.getData()%2!=0){
            return curr.getData();
        }

        return odd(curr.getNext());
    }


}
