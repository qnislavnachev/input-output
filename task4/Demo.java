package task4;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.nio.ByteBuffer;

/**
 * Created by clouway on 17.05.16.
 */
public class Demo {
    public static void main(String[] args) throws IOException, NoFileException {
        try {
            TransferObject obj = new TransferObject();
            InputStream in = new BufferedInputStream(new FileInputStream("from.txt"), 100);
            OutputStream out = new FileOutputStream("/home/clouway/Downloads/to.txt");
            obj.transferObject(in, out, 2, 5);
        } catch (FileNotFoundException z) {
            throw new NoFileException();
        }
    }
}