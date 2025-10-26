package com.example.iterable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;

public class BagTest {

    private Bag<String> bag;

    @BeforeEach
    public void setUp() {
        bag = new Bag<>();
    }

    @Test
    public void testNewBagIsEmpty() {
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.size());
    }

    @Test
    public void testAddSingleItem() {
        bag.add("item1");
        assertFalse(bag.isEmpty());
        assertEquals(1, bag.size());
        assertTrue(bag.contains("item1"));
    }

    @Test
    public void testAddMultipleItems() {
        bag.add("item1");
        bag.add("item2");
        bag.add("item3");
        assertEquals(3, bag.size());
        assertTrue(bag.contains("item1"));
        assertTrue(bag.contains("item2"));
        assertTrue(bag.contains("item3"));
    }

    @Test
    public void testAddDuplicateItems() {
        bag.add("item1");
        bag.add("item1");
        assertEquals(2, bag.size());
    }

    @Test
    public void testAddNullItem() {
        bag.add(null);
        assertEquals(1, bag.size());
        assertTrue(bag.contains(null));
    }

    @Test
    public void testRemoveExistingItem() {
        bag.add("item1");
        assertTrue(bag.remove("item1"));
        assertEquals(0, bag.size());
        assertFalse(bag.contains("item1"));
    }

    @Test
    public void testRemoveNonExistingItem() {
        bag.add("item1");
        assertFalse(bag.remove("item2"));
        assertEquals(1, bag.size());
    }

    @Test
    public void testRemoveFromEmptyBag() {
        assertFalse(bag.remove("item1"));
    }

    @Test
    public void testRemoveOnlyOneOccurrenceOfDuplicate() {
        bag.add("item1");
        bag.add("item1");
        assertTrue(bag.remove("item1"));
        assertEquals(1, bag.size());
        assertTrue(bag.contains("item1"));
    }

    @Test
    public void testRemoveNull() {
        bag.add(null);
        assertTrue(bag.remove(null));
        assertEquals(0, bag.size());
    }

    @Test
    public void testContainsExistingItem() {
        bag.add("item1");
        assertTrue(bag.contains("item1"));
    }

    @Test
    public void testContainsNonExistingItem() {
        assertFalse(bag.contains("item1"));
    }

    @Test
    public void testIteratorEmptyBag() {
        Iterator<String> iterator = bag.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorWithItems() {
        bag.add("item1");
        bag.add("item2");
        bag.add("item3");

        List<String> items = new ArrayList<>();
        for (String item : bag) {
            items.add(item);
        }

        assertEquals(3, items.size());
        assertTrue(items.contains("item1"));
        assertTrue(items.contains("item2"));
        assertTrue(items.contains("item3"));
    }

    @Test
    public void testForEach() {
        bag.add("item1");
        bag.add("item2");

        List<String> items = new ArrayList<>();
        bag.forEach(items::add);

        assertEquals(2, items.size());
        assertTrue(items.contains("item1"));
        assertTrue(items.contains("item2"));
    }

    @Test
    public void testForEachEmptyBag() {
        AtomicInteger count = new AtomicInteger(0);
        bag.forEach(item -> count.incrementAndGet());
        assertEquals(0, count.get());
    }

    @Test
    public void testSpliterator() {
        bag.add("item1");
        bag.add("item2");

        Spliterator<String> spliterator = bag.spliterator();
        assertNotNull(spliterator);
        assertEquals(2, spliterator.estimateSize());
    }

    @Test
    public void testToString() {
        bag.add("item1");
        String result = bag.toString();
        assertTrue(result.contains("Bag"));
        assertTrue(result.contains("item1"));
    }

    @Test
    public void testToStringEmptyBag() {
        String result = bag.toString();
        assertTrue(result.contains("Bag"));
    }
}
