package task3.reverse_file;

import task2.input.into.file.FileError;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 25.04.16.
 */
public class DemoTextFile {
  public static void main(String[] args) throws IOException, FileError {
    System.out.println("Enter file to which will be written:");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("\nEnter breaker for writing:");
    String breaker=sc.nextLine();
    System.out.println("\nWrite to file:");
    TextFile test=new TextFile(name,breaker);
    test.write();
    System.out.println("File will be reversed in reversed.txt");
    test.reverse("reversedfile.txt");
  }
}
