package com.project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashTable<E extends Comparable<E>> {
    LinkedList<E>[] a;
    int m;

    public HashTable(int capacity) {
        m=capacity;
        a=new LinkedList[m];
        for(int i=0; i<a.length; i++){
            a[i]=new LinkedList<>();
        }

    }

    public void insert(E data) {
        int key = data.hashCode();
        int index = key%m;
        a[index].insertAtHead(data);

    }
    public E search(E data){
        int index = data.hashCode()%m;
        return a[index].find(data);
    }

    public void delete(E data){
        int index = data.hashCode()%m;
        a[index].delete(data);
    }

    public void printHash(){
        for(int i=0; i<a.length; i++){
            System.out.println(i+":"+a[i].toString());
        }
    }

}
