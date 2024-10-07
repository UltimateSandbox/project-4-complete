package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

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

    @Override
    public void forEach(Consumer<? super T> action) {
        this.contents.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
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
