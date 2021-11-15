package adivaJmartFH;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Function;

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

    public int size(){
        return objectPool.size();
    }

    public void add(T object){
        objectPool.add(object);
    }

    public void exit() {
        Thread.interrupted();
    }

    public void run() {
        Iterator<T> iterator = objectPool.iterator();
        while (iterator.hasNext()) {
            boolean check = routine.apply(iterator.next());
            if (check == true) {
                break;
            }
        }
    }
}
