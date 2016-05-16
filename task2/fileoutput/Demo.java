package task2.fileoutput;

import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = ".";
        System.out.println("Enter name for the file you are creating: ");
        String string = scan.nextLine();
        System.out.println("Type '.' to exit the program");
        FileOutput wr = new FileOutput(string);
        wr.create(s);
    }
}