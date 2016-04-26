package ex4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 21.04.16.
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    TransferObject t = new TransferObject();
    Scanner sc = new Scanner(System.in);
    byte[] buffer = new byte[4096];
    int len = 200;
    int off = 100;

    System.out.println("Enter the name of the file you want to copy from.");
    String in = sc.nextLine();
    System.out.println("Enter the name of the file you want to copy to.");
    String out = sc.nextLine();

    t.transfer(in, out, off, len, buffer);
  }
}
