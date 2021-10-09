package adivaJmartFH;

import java.util.Iterator;
import java.util.function.Predicate;

public class Algorithm<T> {
    private Algorithm() {
    }
    // Method Overloading count
    public int count(T[] array, T value) {
        return 0;
    }

    public int count(Iterable<T> iterable, T value) {
        return 0;
    }

    public int count(Iterator<T> iterator, T value) {
        return 0;
    }

    public int count(T[] array, Predicate<T> pred) {
        return 0;
    }

    public int count(Iterable<T> iterable, Predicate<T> pred) {
        return 0;
    }

    public int count(Iterator<T> iterator, Predicate<T> pred) {
        return 0;
    }
    // Method Overloading find
    public T find(T[] array, T value) {
        return null;
    }

    public T find(Iterable<T> iterable, T value) {
        return null;
    }

    public T find(Iterator<T> iterator, T value) {
        return null;
    }

    public T find(T[] array, Predicate<T> pred) {
        return null;
    }

    public T find(Iterable<T> iterable, Predicate<T> pred) {
        return null;
    }

    public T find(Iterator<T> iterator, Predicate<T> pred) {
        return null;
    }
    // Method Overloading exists
    public boolean exists(T[] array, T value) {
        return false;
    }

    public boolean exists(Iterable<T> iterable, T value) {
        return false;
    }

    public boolean exists(Iterator<T> iterator, T value) {
        return false;
    }

    public boolean exists(T[] array, Predicate<T> pred) {
        return false;
    }

    public boolean exists(Iterable<T> iterable, Predicate<T> pred) {
        return false;
    }

    public boolean exists(Iterator<T> iterator, Predicate<T> pred) {
        return false;
    }
    // return nilai max
    public T max(T first, T second) {
        return null;
    }
    // return nilai min
    public T min(T first, T second) {
        return null;
    }
}
