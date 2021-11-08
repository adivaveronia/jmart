package adivaJmartFH;

import java.util.HashMap;

/**
 * Write a description of class Recognizable here.
 *
 * @author (Adiva Veronia)
 * @version (25/09/2021)
 */
public class Serializable implements Comparable<Serializable> {
    public final int id;
    // menggunakan HashMap
    private static HashMap<Class<?>, Integer> mapCounter = new HashMap<>();

    protected Serializable()
    {
        Integer counter = mapCounter.get(getClass());
        counter = counter == null? 0:counter+1;
        this.id = counter;
        mapCounter.put(getClass(), id);
    }

    public static Integer setClosingId(Class<Serializable> clazz, int id) {
        mapCounter.replace(clazz ,id);
        return 0;
    }

    public static Integer getClosingId(Class<Serializable> clazz) {
        return mapCounter.get(clazz);
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
