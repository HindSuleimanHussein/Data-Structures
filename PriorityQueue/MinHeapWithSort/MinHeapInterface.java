package com.project;

public interface MinHeapInterface<Hind extends Comparable<Hind>> {
    public void add(Hind newEntry);
    public Hind removeMin();
    public Hind getMin();
    public boolean isEmpty();
    public int getSize();
    public void clear();


}