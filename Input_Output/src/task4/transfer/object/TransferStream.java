package task4.transfer.object;

import task2.input.into.file.FileError;

import java.io.*;

/**
 * Created by clouway on 25.04.16.
 */
public class TransferStream {

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
