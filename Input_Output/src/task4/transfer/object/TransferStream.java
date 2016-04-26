package task4.transfer.object;

import task2.input.into.file.FileError;

import java.io.*;

/**
 * Created by clouway on 25.04.16.
 */
public class TransferStream {
  /**
   * Transfering a stream from one
   * file to another with an added
   * option to transfer partially
   * @output.write()
   * @param fromfile from the file we will be transfering
   * @param tofile to the file we will be transfering
   * @param fromchar the index of the charecter from which we will start
   * @param numberofchars how many chars we will be transfering
   * @throws IOException
   * @throws FileError
   */
  public void transferPartial(String fromfile, String tofile, int fromchar, int numberofchars) throws IOException, FileError {
    BufferedReader input = new BufferedReader(new FileReader(fromfile));
    BufferedWriter output = new BufferedWriter(new FileWriter(tofile));
    String line;
    try {
      do {
        line = input.readLine();
        if (line.length() < (fromchar + numberofchars)) {
          break;
        }
        output.write(line, fromchar, numberofchars);
        output.newLine();
      }
      while (!line.equalsIgnoreCase("."));
    } catch (IOException e) {
      throw new FileError();
    } finally {
      input.close();
      output.close();
    }

  }
}
