package task3.reverse_file;

import task2.input.into.file.FileError;

import java.io.IOException;

/**
 * Created by clouway on 25.04.16.
 */
public class DemoTextFile {
  public static void main(String[] args) throws IOException, FileError {
    TextFile test=new TextFile("test.txt",".");
    test.write();
    test.reverse("reversed.txt");
  }
}
