package task3.file;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 13.05.16.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        File rev = new File();
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        rev.reverseHorizontalText(string);
    }
}