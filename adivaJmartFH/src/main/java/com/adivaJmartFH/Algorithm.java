package com.adivaJmartFH;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Algorithm<T> {
    private Algorithm() {
    }
    // Method Overloading collect
    public static <T>List<T> collect(T[] array, T value){
        List<T> list = new ArrayList<>();
        for (T a:array){
            if(a.equals(value)){
                list.add(a);
            }
        }
        return list;
    }

    public static <T>List<T> collect(Iterable<T> iterable, T value){
        List<T> list = new ArrayList<>();
        for (T a:iterable){
            if(a.equals(value)){
                list.add(a);
            }
        }
        return list;
    }

    public static <T>List<T> collect(Iterator<T> iterator, T value){
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()){
            if(iterator.equals(value)){
                list.add((T) iterator);
            }
        }
        return list;
    }

    public static <T>List<T> collect(T[] array, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        for (T a:array){
            if(a.equals(pred)){
                list.add(a);
            }
        }
        return list;
    }

    public static <T>List<T> collect(Iterable<T> iterable, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        for (T a:iterable){
            if(a.equals(pred)){
                list.add(a);
            }
        }
        return list;
    }

    public static <T>List<T> collect(Iterator<T> iterator, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()){
            if(iterator.equals(pred)){
                list.add(iterator.next());
            }
        }
        return list;
    }

    // Method Overloading count
    public static <T> int count(T[] array, T value) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return count(var, value);
    }

    public static <T> int count(Iterable<T> iterable, T value) {
        final Iterator<T> var = iterable.iterator();
        return count(var, value);
    }

    public static <T> int count(Iterator<T> iterator, T value) {
        final Predicate<T> var = value::equals;
        return count(iterator,var);
    }

    public static <T> int count(T[] array, Predicate<T> pred) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return count(var, pred);
    }

    public static <T> int count(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> var = iterable.iterator();
        return count(var, pred);
    }

    public static <T> int count(Iterator<T> iterator, Predicate<T> pred) {
        return count(iterator, pred);
    }
    // Method Overloading find
    public static <T> T find(T[] array, T value) {
        for (T a:array){
            if(a.equals(value)){
                return a;
            }
        }
        return null;
    }

    public static <T> T find(Iterable<T> iterable, T value) {
        for(T a:iterable){
            if(a.equals(value)){
                return a;
            }
        }
        return null;
    }

    public static <T> T find(Iterator<T> iterator, T value) {
        while(iterator.hasNext()){
            if(iterator.next().equals(value)){
                return iterator.next();
            }
        }
        return null;
    }

    public static <T> T find(T[] array, Predicate<T> pred) {
        for(T a:array){
            if(a.equals(pred)){
                return a;
            }
        }
        return null;
    }

    public static <T> T find(Iterable<T> iterable, Predicate<T> pred) {
        for(T a:iterable){
            if(a.equals(pred)){
                return a;
            }
        }
        return null;
    }

    public static <T> T find(Iterator<T> iterator, Predicate<T> pred){
        while(iterator.hasNext()){
            if(iterator.next().equals(pred)){
                return iterator.next();
            }
        }
        return null;
    }
    // Method Overloading exists
    public static <T> boolean exists(T[] array, T value) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return exists(var, value);
    }

    public static <T> boolean exists(Iterable<T> iterable, T value) {
        final Iterator<T> var = iterable.iterator();
        return exists(var, value);
    }

    public static <T> boolean exists(Iterator<T> iterator, T value) {
        final Predicate<T> var = value::equals;
        return exists(iterator, var);
    }

    public static <T> boolean exists(T[] array, Predicate<T> pred) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return exists(var, pred);
    }

    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> var = iterable.iterator();
        return exists(var, pred);
    }

    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred) {
        return exists(iterator, pred);
    }
    // return nilai max
    public static <T> T max(T first, T second) {
        if(first.hashCode() > second.hashCode()){
            return first;
        }else {
            return second;
        }
    }

    public static <T> T max(T[] array) {
        return max(array);
    }

    public static <T> T max(Iterable<T> iterable){
        return max(iterable);
    }

    public static <T> T max(Iterator<T> iterator){
        return max(iterator);
    }

    public static <T> T max(T first, T second, Comparator<? super T> comparator){
        return max(first, second, comparator);
    }

    public static <T> T max(T[] array, Comparator<? super T> comparator){
        return max(array, comparator);
    }

    public static <T> T max(Iterable<T> iterable, Comparator<? super T> comparator){
        return max(iterable, comparator);
    }

    public static <T> T max(Iterator<T> iterator, Comparator<? super T> comparator){
        return max(iterator, comparator);
    }
    // return nilai min
    public static <T> T min(T first, T second) {
        if(first.hashCode() < second.hashCode()){
            return first;
        }else {
            return second;
        }
    }

    public static <T> T min(T[] array){
        return min(array);
    }

    public static <T> T min(Iterable<T> iterable){
        return min(iterable);
    }

    public static <T> T min(Iterator<T> iterator){
        return min(iterator);
    }

    public static <T> T min(T first, T second, Comparator<? super T> comparator){
        return min(first, second, comparator);
    }

    public static <T> T min(T[] array, Comparator<? super T> comparator){
        return min(array, comparator);
    }

    public static <T> T min(Iterable<T> iterable, Comparator<? super T> comparator){
        return min(iterable, comparator);
    }

    public static <T> T min(Iterator<T> iterator, Comparator<? super T> comparator){
        return min(iterator, comparator);
    }

    public static <T>List<T> paginate (T[] array, int page, int pageSize, Predicate<T> pred){
        return Arrays.stream(array).filter(pred::equals).skip(pageSize*page).limit(pageSize).collect(Collectors.toList());
    }

    public static <T>List<T> paginate (Iterable<T> iterable, int page, int pageSize, Predicate<T> pred){
        List<T> list = new ArrayList<T>();
        int counter = 0, counterPrint = 0;
        int size = pageSize * page;
        for (T each : iterable){
            if (counter < size && pred.equals(each)){
                counter++;
                continue;
            }
            if (counterPrint < pageSize && pred.equals(each)){
                list.add(each);
                counterPrint++;
            }else{
                break;
            }
        }
        return list;
    }

    public static <T>List<T> paginate (Iterator<T> iterator, int page, int pageSize, Predicate<T> pred){

        int iteration = 0;
        int occurences = 0;
        int startingIdx = page * pageSize;
        List<T> pageList = new ArrayList<>(pageSize);

        List<T> array = new ArrayList<T>();

        iterator.forEachRemaining(array::add);

        for (; iteration < array.size() && occurences < startingIdx; ++iteration) {
            if (pred.equals(array.get(iteration))) {
                ++occurences;
            }
        }
        for (int i = 0; i < array.size() && pageList.size() < pageSize; ++i) {
            if (pred.equals(array.get(iteration))) {
                pageList.add(array.get(iteration));
            }
        }
        return pageList;
    }
}
