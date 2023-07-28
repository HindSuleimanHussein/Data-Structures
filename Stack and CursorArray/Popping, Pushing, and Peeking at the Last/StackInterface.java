package com.project;

public interface StackInterface<Hind> {
    void pushFirst(Hind data);
    void pushLast(Hind data);
    Hind popFirst();
    Hind popLast();
    Hind peekFirst();
    Hind peekLast();
    boolean isEmpty();
    void clear();

}
