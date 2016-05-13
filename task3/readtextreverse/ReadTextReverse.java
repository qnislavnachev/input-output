package task3.readtextreverse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by clouway on 13.05.16.
 */
public class ReadTextReverse {

    public int[] read(File file) throws IOException {
        FileInputStream input = new FileInputStream(file);
        int current = input.available();
        int count = 0;
        int byteContainer[] = new int[current];
        while (count < current) {
            byteContainer[count] = input.read();
            count++;
        }
        input.close();
        return byteContainer;
    }

    public void print(int[] text) {
        for (int i = text.length - 1; i >= 0; i--) {
            System.out.print((char) text[i]);
        }
    }

}
