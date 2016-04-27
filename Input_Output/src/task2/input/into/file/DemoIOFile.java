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
    IOFile test=new IOFile("demo.txt");
    test.write("-");


  }
}
