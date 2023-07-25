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
        System.out.println(max(link.getHead(), Integer.MIN_VALUE));


    }

    public static int max(Node curr, int max){
        if(curr==null){
            return max;
        }
        if(curr.getData()>max)
            max = curr.getData();

        return max(curr.getNext(),max);

    }

}
