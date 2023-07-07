package com.project;

public interface MaxHeapInterface<Hind extends Comparable<Hind>> {
    void add(Hind newEntry);
    Hind removeMax();
    Hind getMax();
    boolean isEmpty();
    int getSize();
    void clear();


}