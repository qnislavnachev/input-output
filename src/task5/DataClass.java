package task5;

import java.io.*;

public class DataClass {
    public void saveObject(OutputStream out, Object o) throws IOException {
        ObjectOutputStream outObj = new ObjectOutputStream(out);
        outObj.writeObject(o);
        System.out.println("Object saved!");
        out.close();
        outObj.close();
    }

    public void getObject(InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream inObj = new ObjectInputStream(in);
        SomeObject someObj = (SomeObject) inObj.readObject();
        System.out.println("Object read!");
        in.close();
        inObj.close();
    }
}
