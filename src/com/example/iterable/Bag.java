package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T> {

    private List<T> contents;

    public Bag() {
        this.contents = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return contents.isEmpty();
    }

    @Override
    public int size() {
        return contents.size();
    }

    @Override
    public void add(T item) {
        this.contents.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.contents.iterator();
    }
}
