package task4.transfer.object;

import task2.input.into.file.FileError;

import java.io.*;
import java.util.stream.Stream;

/**
 * Created by clouway on 25.04.16.
 */
public class TransferObject {
  public void transfer(String from, String to, int offset, int len, byte[] buffer) throws IOException {
    FileInputStream input = null;
    FileOutputStream output = null;
    try {
      input = new FileInputStream(from);
      output = new FileOutputStream(to);

      while (input.read(buffer) != -1) {
        output.write(buffer, offset, len);
      }
    } finally {
      if (input != null) {
        input.close();
      }
      if (output == null) {
        output.close();
      }
    }
  }
}
