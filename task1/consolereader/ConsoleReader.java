package task1.consolereader;

import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */

public class ConsoleReader {
    /**
     * Scanner
     */
    private Scanner s = new Scanner(System.in);

    /**
     * Reads a string from the console
     * @return
     */
    public String readString() {
        return s.nextLine();
    }

    /**
     * Reads an int from the console
     * @return
     */
    public int readInt() {
        return s.nextInt();
    }

    /**
     * Reads a char from the console
     * @return
     */
    public char readChar() {
        return s.next().charAt(0);
    }

    /**
     * Reads a double from the console
     * @return
     */
    public double readDouble() {
        return s.nextDouble();
    }
}
