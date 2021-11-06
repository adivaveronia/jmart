package adivaJmartFH;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.function.Predicate;

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
        return array.length;
    }

    public static <T> int count(Iterable<T> iterable, T value) {
        int count = 0;
        for(Object i : iterable){
            count++;
        }
        return count;
    }

    public static <T> int count(Iterator<T> iterator, T value) {
        int count = 0;
        while(iterator.hasNext()){
            count++;
        }
        return count;
    }

    public static <T> int count(T[] array, Predicate<T> pred) {
        int count = 0;
        if(pred.equals(false)){
            return 0;
        }
        else {
            for(T a:array){
                count++;
            }
        }
        return count;
    }

    public static <T> int count(Iterable<T> iterable, Predicate<T> pred) {
        int count = 0;
        if(pred.equals(false)){
            return 0;
        }
        else {
            for(T a:iterable){
                count++;
            }
        }
        return count;
    }

    public static <T> int count(Iterator<T> iterator, Predicate<T> pred) {
        int count = 0;
        if(pred.equals(false)){
            return 0;
        }
        else {
            while(iterator.hasNext()){
                count++;
            }
        }
        return count;
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
        for(T a:array){
            if(a.equals(value)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(Iterable<T> iterable, T value) {
        for(T a:iterable){
            if(a.equals(value)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(Iterator<T> iterator, T value) {
        while(iterator.hasNext()){
            if(iterator.next().equals(value)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(T[] array, Predicate<T> pred) {
        for(T a:array){
            if(a.equals(pred)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred) {
        for(T a:iterable){
            if(a.equals(pred)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred) {
        while(iterator.hasNext()){
            if(iterator.next().equals(pred)){
                return true;
            }
        }
        return false;
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
}
