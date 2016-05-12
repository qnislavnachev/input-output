package task1.consolereader;

import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */

public class ConsoleReader {
    private Scanner s = new Scanner(System.in);

    public String readString() {
        return s.nextLine();
    }

    public int readInt() {
        return s.nextInt();
    }

    public char readChar() {
        return s.next().charAt(0);
    }

    public double readDouble() {
        return s.nextDouble();
    }
}
