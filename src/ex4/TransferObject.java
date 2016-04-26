package ex4;

import java.io.*;

/**
 * Created by clouway on 21.04.16.
 */
public class TransferObject {

  /**
   * Transfer data from one stream to another.
   * Transfering from file to file.
   *
   * @param fileIn
   * @param fileOut
   * @param offset
   * @param len
   * @param buffer
   * @throws IOException
   */
  public void transfer(String fileIn, String fileOut, int offset, int len, byte[] buffer) throws IOException {
    FileInputStream inputStream = null;
    FileOutputStream outputStream = null;
    try {
      inputStream = new FileInputStream(fileIn);
      outputStream = new FileOutputStream(fileOut);

      while (inputStream.read(buffer) != -1) {
        outputStream.write(buffer, offset, len);
      }
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }
      if (outputStream == null) {
        outputStream.close();
      }
    }
  }
}
