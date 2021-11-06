package adivaJmartFH;

import java.util.HashMap;

/**
 * Write a description of class Recognizable here.
 *
 * @author (Adiva Veronia)
 * @version (25/09/2021)
 */
public class Serializable implements Comparable<Serializable> {
    public final int id = 0;
    // menggunakan HashMap
    static HashMap<Class<?>, Integer> mapCounter = new HashMap<>();

    protected Serializable()
    {
        mapCounter.put(getClass(), id);
    }

    public static Integer setClosingId(Class<Serializable> clazz, int id) {
        if(clazz.isAssignableFrom(Serializable.class)){
            return 0;
        }else{
            return 1;
        }
        //mapCounter.replace(Key ,id);
    }

    public static Integer getClosingId(Class<Serializable> clazz) {
        if(clazz.isAssignableFrom(Serializable.class)){
            return 0;
        }else{
            return 1;
        }
        //return mapCounter.get();
    }

    public boolean equals(Object object) {
        if(object instanceof Serializable){
            Serializable obj = (Serializable)object;
            if(obj.id == id){
                return true;
            }
        }
        return true;
    }

    public boolean equals(Serializable idObject) {
         return idObject.id == id? true : false;
    }

    @Override
    public int compareTo(Serializable other) {
        if(id == other.id){
            return 1;
        }else{
            return 0;
        }
    }
}
