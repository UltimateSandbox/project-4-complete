package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<E> implements Container<E> {

    private List<E> contents;

    public Bag() {
        this.contents = new ArrayList<>();
    }

    @Override
    public void add(E item) {
        this.contents.add(item);
    }

    @Override
    public boolean remove(E item) {
        return this.contents.remove(item);
    }

    @Override
    public boolean contains(E item) {
        return this.contents.contains(item);
    }

    @Override
    public int size() {
        return this.contents.size();
    }

    @Override
    public boolean isEmpty() {
        return this.contents.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return this.contents.iterator();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        this.contents.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return this.contents.spliterator();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bag {");
        sb.append("contents=").append(contents);
        sb.append('}');
        return sb.toString();
    }
}
