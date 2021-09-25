package adivaJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Adiva Veronia)
 * @version (25/09/2021)
 */
public class Recognizable
{
    public static int id;
    /**
     * Constructor for objects of class Recognizable
     */
    protected Recognizable(int id)
    {
        this.id = id;
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
}
