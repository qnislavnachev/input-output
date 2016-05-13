package task2.fileoutput;

import java.util.Scanner;

/**
 * Created by clouway on 13.05.16.
 */
public class Reader {
    public String read(String end) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        boolean bool = true;
        while (bool != false) {
            String read = scanner.nextLine();
            if (read.equals(end)) {
                bool = false;
            } else {
                string += read;
            }
        }
        return string;
    }
}