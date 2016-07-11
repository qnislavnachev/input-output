package task1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        reader.readString(scan.nextLine());
        System.out.println("Enter Integer: ");
        try {
            reader.readInt(scan.nextInt());
        } catch (Exception e) {
            throw new WrongValueException("Wrong Integer!");
        }
        System.out.println("Enter char: ");
        reader.readChar(scan.next().charAt(0));

    }
}
