package com.project;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.insertAtHead("Hind");
        link.insertAtHead("Amal");
        link.insertAtHead("Reem");
        link.insertAtHead("Mahmoud");
        link.insertAtHead("Dena");
        link.insertAtHead("Ayatt");
        System.out.println(link.find("Hind"));
        System.out.println(link);
        link.delete("Hammad");
        link.delete("Dena");
        link.delete("Hind");
        System.out.println(link);



    }
}