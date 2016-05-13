package task3.readtextreverse;

import java.io.File;
import java.io.IOException;

/**
 * Created by clouway on 13.05.16.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/clouway/workspace/inputoutput/input-output/src/task3.txt");
        ReadTextReverse rev = new ReadTextReverse();
        int[] read = rev.read(file);
        rev.print(read);
    }
}