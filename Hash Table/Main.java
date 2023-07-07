package com.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        HashTable<Integer> table = new HashTable<>(10);
        table.insert(17);
        table.insert(17);
        table.insert(20);
        table.insert(31);
        table.insert(14);
        table.printHash();
        System.out.println();
        System.out.println("Searching for 20: " + table.search(20));
        System.out.println("Deleting 20");
        table.delete(20);
        System.out.println("Searching for 20: " + table.search(20));
        System.out.println();
        System.out.println("==============================================");
        table.printHash();

    }
}