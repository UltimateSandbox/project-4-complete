package com.example.iterable;

public interface Container<T> extends Iterable<T> {

    int size();
    void add(T item);
    boolean isEmpty();

}
