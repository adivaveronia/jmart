package com.adivaJmartFH;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Function;

/**
 * Jika sudah tidak terdapat object dalam pool yang perlu diproses,
 * posisikan thread dalam keadaan State.WAITING
 * Thread akan kembali melakukan tugas setelah menerima object baru dari pool
 * @author Adiva Veronia
 */
public class ObjectPoolThread<T> extends Thread{
    private boolean exitSignal;
    private Vector<T> objectPool;
    private Function<T, Boolean> routine;

    public ObjectPoolThread(String name, Function<T, Boolean> routine){
        super(name);
        this.routine = routine;
    }

    public ObjectPoolThread(Function<T, Boolean> routine){
        this.routine = routine;
    }

    /**
     * @return besar list pada instance variabel objectPool
     */
    public int size(){
        return objectPool.size();
    }

    /**
     * Menambahkan objek ke objectPool
     * @param object objek yang akan ditambahkan
     */
    public void add(T object){
        objectPool.add(object);
    }

    /**
     * Memberikan sinyal thread untuk keluar dari loop dan method run
     * sehingga thread berhenti
     */
    public void exit() {
        Thread.interrupted();
    }

    public void run(){
        exitSignal = false;
        synchronized (this){
            for(int i = 0; i < size(); i++) {
                T object = objectPool.get(i);
                boolean temp = routine.apply(object);
                if (!temp) this.objectPool.add(object);
                while(this.objectPool == null){
                    try {
                        routine.wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(exitSignal){
                    break;
                }
            }
        }
    }
}
