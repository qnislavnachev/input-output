package task2.input.into.file;


/**
 * Created by clouway on 22.04.16.
 */

import java.io.*;
import java.util.NoSuchElementException;

public class IOFile {
  private final String filename;

  public IOFile(String name) {
    filename=name;
  }


  /**
   * The method creates a file on which it writes the input
   * from the keyboard.The symbol that ends the input in this
   * case is ".", but it could be changed.The file is then
   * stored in the default directory of the project.
   *
   * @param breaker
   * @throws IOException
   * @throws FileError
   */
  public void ReadAndWriteTillReach(String breaker) throws IOException, FileError {
    BufferedWriter output = new BufferedWriter(new FileWriter(filename));
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String line;
    try {
      do {
        line = input.readLine();
        output.write(line);
        output.newLine();
      } while (!line.equals(breaker));
    } catch (NoSuchElementException e) {
      e.printStackTrace();
    } finally {
      output.close();
      input.close();
    }
  }
}
