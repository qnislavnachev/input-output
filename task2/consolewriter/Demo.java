package task2.consolewriter;

import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = ".";
        System.out.println("Enter name for the file you are creating: ");
        String string = scanner.nextLine();
        System.out.println("Type '.' to exit the program");
        ConsoleWriter cw = new ConsoleWriter(string);
        cw.createFile(s);
    }
