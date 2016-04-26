package task3.reverse_file;

import task2.input.into.file.FileError;

import java.io.IOException;

/**
 * Created by clouway on 25.04.16.
 */
public class DemoFileOperation {
  public static void main(String[] args) throws IOException, FileError {
    FileOperation test=new FileOperation();
    test.write("tests.txt");
    test.reverse("tests.txt","reversed.txt");
  }
}
