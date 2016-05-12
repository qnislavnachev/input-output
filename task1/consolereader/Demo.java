package task1.consolereader;

/**
 * Created by clouway on 12.05.16.
 */

public class Demo {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        System.out.println("Enter a string:");
        reader.readString();
        System.out.println("Enter an int:");
        reader.readInt();
        System.out.println("Enter a char:");
        reader.readChar();
        System.out.println("Enter a double:");
        reader.readDouble();
        System.out.println();
    }
}