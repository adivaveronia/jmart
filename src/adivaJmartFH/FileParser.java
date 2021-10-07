package adivaJmartFH;


/**
 * Write a description of interface FileParser here.
 *
 * @author (Adiva Veronia)
 * @version (25/09/2021)
 */
public interface FileParser{
    public boolean read(String content);
    Object write();
    public static Object newInstance(String content){
        return null;
    }
}
