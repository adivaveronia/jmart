package com.adivaJmartFH;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Vector;
import com.google.gson.*;

public class JsonTable <T> extends Vector{
    public final String filepath = null;
    private final Gson gson = new Gson();

    public JsonTable (Class<T> clazz, String filepath) {
        String filepath1 = filepath;
        try {
            FileReader obj = new FileReader(filepath1);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public T readJson(Class<T> clazz, String filepath) {
        try {
            File file = new File("C:/Users/adiva/Documents/jmart/" + filepath);
            FileReader obj = new FileReader(filepath);
            /*if (file.createNewFile()){
                PrintWriter pr = new PrintWriter(new FileWriter(file, true));
                pr.close();
                System.out.println("File berhasil dibuat!");
            }
            else{
                System.out.println("File sudah ada!");
            }*/
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }
        return null;
    }

    public void writeJson() {

    }

    public static void writeJson(Object object, String filepath) {
        try {
            FileOutputStream file = new FileOutputStream(filepath);
            ObjectOutputStream objOut = new ObjectOutputStream(file);
            object = new Gson();
            objOut.writeObject(object);
            objOut.close();
            System.out.println("Object successfully written to file!");
        } catch (IOException e){
            System.out.print(e);
        }
    }
}
