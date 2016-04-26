package ex3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 20.04.16.
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    TextFile rev1 = new TextFile();
    Scanner sc = new Scanner(System.in);
    System.out.println("Reversing contains of a file.\nEnter name of the file.");
    String name = sc.nextLine();
    rev1.reverse(name);
  }
}
