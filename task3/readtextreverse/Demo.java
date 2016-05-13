package task3.readtextreverse;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 13.05.16.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        ReadTextReverse rev = new ReadTextReverse();
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        rev.reverse(string);
    }
}