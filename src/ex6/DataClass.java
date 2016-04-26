package ex6;

import java.io.*;

public class DataClass {

  /**
   * Save serializable object to a file.
   *
   * @param out
   * @param o
   * @throws IOException
   */
  public void saveObject(OutputStream out, Object o) throws IOException {
    try (ObjectOutputStream output = new ObjectOutputStream(out)) {
      output.writeObject(o);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (out == null) out.close();
    }
  }

  /**
   * Reads serializable object.
   * Throws exeption if the file do not exist.
   *
   * @param in
   * @throws ClassNotFoundException
   */
  public void getObject(InputStream in) throws ClassNotFoundException {
    try {
      ObjectInputStream input = new ObjectInputStream(in);
      User user = (User) input.readObject();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}