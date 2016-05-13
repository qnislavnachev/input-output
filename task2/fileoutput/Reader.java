package task2.fileoutput;

import java.util.Scanner;

/**
 * Created by clouway on 13.05.16.
 */
public class Reader {
    /**
     * Reads from the console.
     * @param end
     * @return
     */
    public String read(String end) {
        Scanner scan = new Scanner(System.in);
        String string = "";
        boolean bool = true;
        while (bool != false) {
            String read = scan.nextLine();
            if (read.equals(end)) {
                bool = false;
            } else {
                string += read;
            }
        }
        return string;
    }
}