# Project Overview

This project's main purpose is to give you the chance to learn new software concepts the way we do it out in industry.  Very often, we find ourselves having to implement code and APIs that we're unfamiliar with.  This is a chance for you to do a little research on a new interface type and learn, through trial and error possibly, how this interface is used to make a class iterable.  This is the interface that allows us to be able to use objects in for-each loops and methods and have Java automatically iterate over them for us.

Let's get started!

## Concepts Covered

- Collections
- Generics
- Iterable Interface

## Details

1. Review the material about about collections, iterators (the iterable interface specifically), and generic types.  Google the information if you need to.
2. Download the starting template for this project from https://github.com/UltimateSandbox/project-3-initial.git (Links to an external site.)  You can either fork it, clone it, or download a zip of it - your choice.  (Be sure to push a copy of it to your own repo, if you clone it or download a zip).
3. Write a generic class called Bag that implements the Container interface below.  The bag class is just a type of container that implements methods of both the Container interface and the Iterable interface that it extends.  (You can use the IDE to implement the necessary methods.)
4. The Container interface is defined as follows:
```java
public interface Container<T> extends Iterable<T> {
    boolean isEmpty();
    int size();
    void add(T item);
}
```
5. Your Bag implementation must use the Java ArrayList to implement the Container interface.  (i.e. the backing object used to store items in your Bag class must be an ArrayList.)
6. ***Note:***  Do not change or add to the Container interface.
7. ***Note:***  Do not change or add to the code in the BagManager class.  This is your driver and will help you to code your bag.
8. ***Note:***  You do not need to implement the forEach or the spliterator methods of Iterable.  Only implement the iterator method.  Those other 2 methods are optional (because they are default methods in Iterable.)  You may, however, implement them if you want a challenge.
9. Be sure to ask questions if you're unsure about something!

## Project Hints

- This project is actually a very simple one - if you don't make it more complex than it needs to be. This is probably the most simple project out of all of them this semester.
- Look up how to create a generic class (if you don't remember), or find examples.  (https://docs.oracle.com/javase/tutorial/java/generics/types.html (Links to an external site.) is a good starting point.)
- Remember, your Bag class is just a wrapper around the ArrayList you'll create as a field inside of it.  All of the operations of your class are just 'pass-throughs' for the ArrayList methods of the same names.  (That's a huge hint right there!)
- Use the driver code to figure out how the methods need to be implemented.  In other words, fix the errors in your driver without changing the driver code and you'll have implemented your Bag class correctly (more or less).
- You're going to get to a point with your Bag class where you're going to look at it and say "Is it really that easy?!" The answer is "Yes!"
