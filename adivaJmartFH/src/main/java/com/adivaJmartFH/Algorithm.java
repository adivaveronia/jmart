package com.adivaJmartFH;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class algoritma untuk fungsi overloading collect, count, find, paginate, min,
 * max, exists, dan paginate
 * @author Adiva Veronia
 */
public class Algorithm<T> {
    private Algorithm() {
    }

    /**
     * Method Overloading collect
     * Mengembalikan seluruh kumpulan object dalam array ke list baru
     */
    public static <T>List<T> collect(T[] array, T value){
        List<T> list = new ArrayList<>();
        for (T a:array){
            if(a.equals(value)){
                list.add(a);
            }
        }
        return list;
    }

    /**
     * Method Overloading collect
     * Mengembalikan seluruh kumpulan object dalam iterable ke list baru
     */
    public static <T>List<T> collect(Iterable<T> iterable, T value){
        List<T> list = new ArrayList<>();
        for (T a:iterable){
            if(a.equals(value)){
                list.add(a);
            }
        }
        return list;
    }

    /**
     * Method Overloading collect
     * Mengembalikan seluruh kumpulan object dalam iterator ke list baru
     */
    public static <T>List<T> collect(Iterator<T> iterator, T value){
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()){
            if(iterator.equals(value)){
                list.add((T) iterator);
            }
        }
        return list;
    }

    /**
     * Method Overloading collect
     * Mengembalikan seluruh kumpulan object dalam array ke list baru
     */
    public static <T>List<T> collect(T[] array, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        for (T a:array){
            if(a.equals(pred)){
                list.add(a);
            }
        }
        return list;
    }

    /**
     * Method Overloading collect
     * Mengembalikan seluruh kumpulan object dalam iterable ke list baru
     */
    public static <T>List<T> collect(Iterable<T> iterable, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        for (T a:iterable){
            if(a.equals(pred)){
                list.add(a);
            }
        }
        return list;
    }

    /**
     * Method Overloading collect
     * Mengembalikan seluruh kumpulan object dalam iterator ke list baru
     */
    public static <T>List<T> collect(Iterator<T> iterator, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()){
            if(iterator.equals(pred)){
                list.add(iterator.next());
            }
        }
        return list;
    }

    /** Method Overloading count
     * @return hasil perhitungan setelah data telah di iterasi
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal untuk method
     * count melakukan increment terhadap variabel yang bertindak sebagai counter
     */
    public static <T> int count(T[] array, T value) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return count(var, value);
    }

    /** Method Overloading count
     * @return hasil perhitungan setelah data telah di iterasi
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal untuk method
     * count melakukan increment terhadap variabel yang bertindak sebagai counter
     */
    public static <T> int count(Iterable<T> iterable, T value) {
        final Iterator<T> var = iterable.iterator();
        return count(var, value);
    }

    /** Method Overloading count
     * @return hasil perhitungan setelah data telah di iterasi
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal untuk method
     * count melakukan increment terhadap variabel yang bertindak sebagai counter
     */
    public static <T> int count(Iterator<T> iterator, T value) {
        final Predicate<T> var = value::equals;
        return count(iterator,var);
    }

    /** Method Overloading count
     * @return hasil perhitungan setelah data telah di iterasi
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal untuk method
     * count melakukan increment terhadap variabel yang bertindak sebagai counter
     */
    public static <T> int count(T[] array, Predicate<T> pred) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return count(var, pred);
    }

    /** Method Overloading count
     * @return hasil perhitungan setelah data telah di iterasi
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal untuk method
     * count melakukan increment terhadap variabel yang bertindak sebagai counter
     */
    public static <T> int count(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> var = iterable.iterator();
        return count(var, pred);
    }

    public static <T> int count(Iterator<T> iterator, Predicate<T> pred) {
        return count(iterator, pred);
    }

    /** Method Overloading find
     * @return objek sesuai yang dideskripsikan predicate/value, jika tidak ditemukan return null
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal kepada method
     * bahwa objek yang dimaksud ditemukan.
     */
    public static <T> T find(T[] array, T value) {
        for (T a:array){
            if(a.equals(value)){
                return a;
            }else{
                return null;
            }
        }
        return null;
    }

    /** Method Overloading find
     * @return objek sesuai yang dideskripsikan predicate/value, jika tidak ditemukan return null
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal kepada method
     * bahwa objek yang dimaksud ditemukan.
     */
    public static <T> T find(Iterable<T> iterable, T value) {
        for(T a:iterable){
            if(a.equals(value)){
                return a;
            }
        }
        return null;
    }

    /** Method Overloading find
     * @return objek sesuai yang dideskripsikan predicate/value, jika tidak ditemukan return null
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal kepada method
     * bahwa objek yang dimaksud ditemukan.
     */
    public static <T> T find(Iterator<T> iterator, T value) {
        while(iterator.hasNext()){
            if(iterator.next().equals(value)){
                return iterator.next();
            }
        }
        return null;
    }

    /** Method Overloading find
     * @return objek sesuai yang dideskripsikan predicate/value, jika tidak ditemukan return null
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal kepada method
     * bahwa objek yang dimaksud ditemukan.
     */
    public static <T> T find(T[] array, Predicate<T> pred) {
        for(T a:array){
            if(a.equals(pred)){
                return a;
            }
        }
        return null;
    }

    /** Method Overloading find
     * @return objek sesuai yang dideskripsikan predicate/value, jika tidak ditemukan return null
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal kepada method
     * bahwa objek yang dimaksud ditemukan.
     */
    public static <T> T find(Iterable<T> iterable, Predicate<T> pred) {
        for(T a:iterable){
            if(a.equals(pred)){
                return a;
            }
        }
        return null;
    }

    /** Method Overloading find
     * @return objek sesuai yang dideskripsikan predicate/value, jika tidak ditemukan return null
     * Apabila predicate mengembalikan logika true, ini merupakan sinyal kepada method
     * bahwa objek yang dimaksud ditemukan.
     */
    public static <T> T find(Iterator<T> iterator, Predicate<T> pred){
        while(iterator.hasNext()){
            if(iterator.next().equals(pred)){
                return iterator.next();
            }
        }
        return null;
    }

    /** Method Overloading exists
     * Memberi informasi apakah objek terdapat dalam sebuah list/ array
     * @return true jika ditemukan, false jika tidak
     */
    public static <T> boolean exists(T[] array, T value) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return exists(var, value);
    }

    /** Method Overloading exists
     * Memberi informasi apakah objek terdapat dalam sebuah iterable
     * @return true jika ditemukan, false jika tidak
     */
    public static <T> boolean exists(Iterable<T> iterable, T value) {
        final Iterator<T> var = iterable.iterator();
        return exists(var, value);
    }

    /** Method Overloading exists
     * Memberi informasi apakah objek terdapat dalam sebuah iterator
     * @return true jika ditemukan, false jika tidak
     */
    public static <T> boolean exists(Iterator<T> iterator, T value) {
        final Predicate<T> var = value::equals;
        return exists(iterator, var);
    }

    /** Method Overloading exists
     * Memberi informasi apakah objek terdapat dalam sebuah list/ array
     * @return true jika ditemukan, false jika tidak
     */
    public static <T> boolean exists(T[] array, Predicate<T> pred) {
        final Iterator<T> var = Arrays.stream(array).iterator();
        return exists(var, pred);
    }

    /** Method Overloading exists
     * Memberi informasi apakah objek terdapat dalam sebuah iterable
     * @return true jika ditemukan, false jika tidak
     */
    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred) {
        final Iterator<T> var = iterable.iterator();
        return exists(var, pred);
    }

    /** Method Overloading exists
     * Memberi informasi apakah objek terdapat dalam sebuah iterator
     * @return true jika ditemukan, false jika tidak
     */
    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred) {
        return exists(iterator, pred);
    }

    /**
     * @return objek yang paling besar antara objek
     */
    public static <T> T max(T first, T second) {
        if(first.hashCode() > second.hashCode()){
            return first;
        }else {
            return second;
        }
    }

    /**
     * @return objek paling besar dalam array
     */
    public static <T> T max(T[] array) {
        return max(array);
    }

    /**
     * @return objek paling besar dalam iterable
     */
    public static <T> T max(Iterable<T> iterable){
        return max(iterable);
    }

    /**
     * @return objek paling besar dalam iterator
     */
    public static <T> T max(Iterator<T> iterator){
        return max(iterator);
    }

    /**
     * @param comparator sebagai referensi agar mendukung jika generic terkait belum mengimplemetasikan
     * comparable atau ingin mendefinisikan custom comparator.
     * @return objek paling besar antara objek
     */
    public static <T> T max(T first, T second, Comparator<? super T> comparator){
        return max(first, second, comparator);
    }

    /**
     * @param comparator sebagai referensi agar mendukung jika generic terkait belum mengimplemetasikan
     * comparable atau ingin mendefinisikan custom comparator.
     * @return objek paling besar dalam array
     */
    public static <T> T max(T[] array, Comparator<? super T> comparator){
        return max(array, comparator);
    }

    /**
     * @param comparator sebagai referensi agar mendukung jika generic terkait belum mengimplemetasikan
     * comparable atau ingin mendefinisikan custom comparator.
     * @return objek paling besar dalam iterable
     */
    public static <T> T max(Iterable<T> iterable, Comparator<? super T> comparator){
        return max(iterable, comparator);
    }

    /**
     * @param comparator sebagai referensi agar mendukung jika generic terkait belum mengimplemetasikan
     * comparable atau ingin mendefinisikan custom comparator.
     * @return objek paling besar dalam iterator
     */
    public static <T> T max(Iterator<T> iterator, Comparator<? super T> comparator){
        return max(iterator, comparator);
    }

    /**
     * @return objek paling kecil antara objek
     */
    public static <T> T min(T first, T second) {
        if(first.hashCode() < second.hashCode()){
            return first;
        }else {
            return second;
        }
    }

    /**
     * @return objek paling kecil dalam array
     */
    public static <T> T min(T[] array){
        return min(array);
    }

    /**
     * @return objek paling kecil dalam iterable
     */
    public static <T> T min(Iterable<T> iterable){
        return min(iterable);
    }

    /**
     * @return objek paling kecil dalam iterator
     */
    public static <T> T min(Iterator<T> iterator){
        return min(iterator);
    }

    /**
     * @param comparator sebagai referensi agar mendukung jika generic terkait belum mengimplemetasikan
     * comparable atau ingin mendefinisikan custom comparator.
     * @return objek paling kecil antara objek
     */
    public static <T> T min(T first, T second, Comparator<? super T> comparator){
        return min(first, second, comparator);
    }

    /**
     * @param comparator sebagai referensi agar mendukung jika generic terkait belum mengimplemetasikan
     * comparable atau ingin mendefinisikan custom comparator.
     * @return objek paling kecil dalam array
     */
    public static <T> T min(T[] array, Comparator<? super T> comparator){
        return min(array, comparator);
    }

    /**
     * @param comparator sebagai referensi agar mendukung jika generic terkait belum mengimplemetasikan
     * comparable atau ingin mendefinisikan custom comparator.
     * @return objek paling kecil dalam iterable
     */
    public static <T> T min(Iterable<T> iterable, Comparator<? super T> comparator){
        return min(iterable, comparator);
    }

    /**
     * @param comparator sebagai referensi agar mendukung jika generic terkait belum mengimplemetasikan
     * comparable atau ingin mendefinisikan custom comparator.
     * @return objek paling kecil dalam iterator
     */
    public static <T> T min(Iterator<T> iterator, Comparator<? super T> comparator){
        return min(iterator, comparator);
    }

    /**
     * Melakukan paginasi
     */
    public static <T>List<T> paginate (T[] array, int page, int pageSize, Predicate<T> pred){
        return Arrays.stream(array).filter(pred::equals).skip(pageSize*page).limit(pageSize).collect(Collectors.toList());
    }

    /**
     * Membatasi hasil output dari sebuah proses filter
     */
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

    /**
     * Melakukan paginasi
     */
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
