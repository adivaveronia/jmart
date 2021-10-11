package adivaJmartFH;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Algorithm<T> {
    private Algorithm() {
    }
    // Method Overloading collect
    public static <T>List<T> collect(T[] array, T value){ return null;}

    public static <T>List<T> collect(Iterable<T> iterable, T value){
        return null;
    }

    public static <T>List<T> collect(Iterator<T> iterator, T value){
        return null;
    }

    public static <T>List<T> collect(T[] array, Predicate<T> pred){
        return null;
    }

    public static <T>List<T> collect(Iterable<T> iterable, Predicate<T> pred){
        return null;
    }

    public static <T>List<T> collect(Iterator<T> iterator, Predicate<T> pred){
        return null;
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
        return null;
    }

    public static <T> T find(Iterable<T> iterable, T value) {
        return null;
    }

    public static <T> T find(Iterator<T> iterator, T value) {
        return null;
    }

    public static <T> T find(T[] array, Predicate<T> pred) {
        return null;
    }

    public static <T> T find(Iterable<T> iterable, Predicate<T> pred) {
        return null;
    }

    public static <T> T find(Iterator<T> iterator, Predicate<T> pred) {
        return null;
    }
    // Method Overloading exists
    public static <T> boolean exists(T[] array, T value) {
        return false;
    }

    public static <T> boolean exists(Iterable<T> iterable, T value) {
        return false;
    }

    public static <T> boolean exists(Iterator<T> iterator, T value) {
        return false;
    }

    public static <T> boolean exists(T[] array, Predicate<T> pred) {
        return false;
    }

    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred) {
        return false;
    }

    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred) {
        return false;
    }
    // return nilai max
    public static <T> T max(T first, T second) {
        return null;
    }

    public static <T> T max(T[] array){
        return null;
    }

    public static <T> T max(Iterable<T> iterable){
        return null;
    }

    public static <T> T max(Iterator<T> iterator){
        return null;
    }

    public static <T> T max(T first, T second, Comparator<? super T> comparator){
        return null;
    }

    public static <T> T max(T[] array, Comparator<? super T> comparator){
        return null;
    }

    public static <T> T max(Iterable<T> iterable, Comparator<? super T> comparator){
        return null;
    }

    public static <T> T max(Iterator<T> iterator, Comparator<? super T> comparator){
        return null;
    }
    // return nilai min
    public static <T> T min(T first, T second) {
        return null;
    }

    public static <T> T min(T[] array){
        return null;
    }

    public static <T> T min(Iterable<T> iterable){
        return null;
    }

    public static <T> T min(Iterator<T> iterator){
        return null;
    }

    public static <T> T min(T first, T second, Comparator<? super T> comparator){
        return null;
    }

    public static <T> T min(T[] array, Comparator<? super T> comparator){
        return null;
    }

    public static <T> T min(Iterable<T> iterable, Comparator<? super T> comparator){
        return null;
    }

    public static <T> T min(Iterator<T> iterator, Comparator<? super T> comparator){
        return null;
    }
}
