package task2.input.into.file;

import java.io.IOException;

/**
 * Created by clouway on 22.04.16.
 */
public class DemoIOFile {
  public static void main(String[] args) throws IOException, FileError {
    IOFile test=new IOFile();
    test.write("test.txt");

  }
}
