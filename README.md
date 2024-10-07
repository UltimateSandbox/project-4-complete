# Project Overview

This project's main purpose is to give you the chance to learn new software concepts the way we do it out in industry.  Very often, we find ourselves having to implement code and APIs that we're unfamiliar with.  This is a chance for you to do a little research on a new interface type and learn, through trial and error possibly, how this interface is used to make a class iterable.  This is the interface that allows us to be able to use objects in for-each loops and methods and have Java automatically iterate over them for us.

Let's get started!

## Concepts Covered

- Collections
- Generics
- Iterable Interface

## Details

1. Review the material about collections, iterators (the iterable interface specifically), and generic types.  Google the information if you need to.
2. Fork, then clone the starting template for this project from https://github.com/UltimateSandbox/project-3-initial.git
3. Write a generic class called Bag that implements the Container interface below.  The bag class is just a type of container that implements methods of both the Container interface and the Iterable interface that it extends.  (Remember, you can use the IDE to implement the necessary method stubs.)
4. The Container interface included in the template is defined as follows:
```java
public interface Container<T> extends Iterable<T> {
    boolean isEmpty();
    int size();
    void add(T item);
}
```
5. Your Bag implementation ***must*** use the Java ArrayList to implement the Container interface.  (i.e. the backing object used to store items in your Bag class must be an ArrayList.)  You will lose points if you do not use an ArrayList.
6. Do not change or add to the Container interface.
7. Utilize the appropriate test class to test your code.
8. You are not required to implement the forEach or spliterator methods of Iterable.
9. Be sure to ask questions if you're unsure about something!

## Extra Credit
- For 10 points extra credit, implement the forEach and spliterator methods of the Iterable interface.  (This is a challenge, but it's not too difficult if you've been following the course material about the Facade pattern.)

## Project Hints

- This project is actually a very simple one - if you don't make it more complex than it needs to be. This is probably the most simple project out of all of them this semester.
- Remember, your Bag class is just a wrapper around the ArrayList you'll create as a field inside of it.  All of the operations of your class are just 'pass-throughs' for the ArrayList methods of the same names.  Remember what we did with the Stack and Queue classes to create those.
- You're going to get to a point with your Bag class where you're going to look at it and say "Is it really that easy?!" The answer is "Yes!"
