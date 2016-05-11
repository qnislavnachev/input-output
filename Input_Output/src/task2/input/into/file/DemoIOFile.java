package task2.input.into.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by clouway on 22.04.16.
 */
public class DemoIOFile {
  public static void main(String[] args) throws IOException, FileError {
    System.out.println("Enter file to which will be written to:");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    IOFile test=new IOFile(name);
    System.out.println("Enter Breaker for writing:");
    String breaker=sc.nextLine();
    System.out.println("Write to file.");
    test.write(breaker);

  }
}
