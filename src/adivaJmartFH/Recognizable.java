package adivaJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Adiva Veronia)
 * @version (25/09/2021)
 */
public class Recognizable implements Comparable<Recognizable> {
    public static int id;
    /**
     * Constructor for objects of class Recognizable
     */
    protected Recognizable()
    {
        this.id = 421;
    }

    public static int setClosingId(Class<Recognizable> clazz, int id) {
        return 0;
    }

    public static int getClosingId(Class<Recognizable> clazz) {
        return 0;
    }

    public boolean equals(Object object) {
        if(object instanceof Recognizable){
            Recognizable obj = (Recognizable)object;
            if(obj.id == id){
                return true;
            }
        }
        return true;
    }

    public boolean equals(Recognizable idObject) {
         return idObject.id == id? true : false;
    }

    @Override
    public int compareTo(Recognizable obj) {
        return (this.id/id);
    }
}
