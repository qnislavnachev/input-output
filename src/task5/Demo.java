package task5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        DataClass data = new DataClass();
        FileOutputStream fileOut = new FileOutputStream("objOut.bin");
        FileInputStream fileIn = new FileInputStream("objOut.bin");
        SomeObject someObject = new SomeObject(8, 10);

        data.saveObject(fileOut, someObject);
        data.getObject(fileIn);
        System.out.println("Object Size: " + someObject.size + "\n" + "Object Weigth: " + someObject.weigth);
    }
}
