package ex2;

import java.util.Scanner;

/**
 * Created by clouway on 20.04.16.
 */
public class Demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String exitString = "/";
    System.out.println("Enter the name for the new file.");
    String name = sc.nextLine();
    System.out.println("Write the text.\n" + "\u001B[36m" + exitString + "\u001B[0m" + " on new line to exit.");
    Writer wr = new Writer(name);
    wr.createFile(exitString);
  }
}
