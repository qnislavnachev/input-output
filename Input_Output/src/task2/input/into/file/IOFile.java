package task2.input.into.file;


/**
 * Created by clouway on 22.04.16.
 */

import java.io.*;

public class IOFile {
  /**
   * The method creates a file on which it writes the input
   * from the keyboard.The symbol that ends the input in this
   * case is ".", but it could be changed.The file is then
   * stored in the default directory of the project.
   * @param name The name of the file under which it will be stored
   * @throws IOException
   * @throws FileError
   */
  public void write(String name) throws IOException, FileError {
    File f = new File(name);
    f.createNewFile();
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter output = new BufferedWriter(new FileWriter(f));
    try {
      String line;
      do {
        line = input.readLine();
        output.write(line);
        output.newLine();
      } while (!line.equals("."));
    } catch (IOException e) {
      throw new FileError();
    } finally {
      output.close();
      input.close();
    }


  }
}
