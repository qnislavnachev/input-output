package ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by clouway on 20.04.16.
 */
public class TextFile {

  /**
   * Reversing the content of a text file.
   *
   * @param filename
   * @throws IOException
   */
  public void reverse(String filename) throws IOException {
    write(filename, reverseRows(createBuffer(filename)));
  }

  /**
   * Creating the buffer(List<String>) and filling it with reversed strings.
   * Each line of the file is a new string.
   *
   * @param filename
   * @return
   * @throws IOException
   */
  private List<String> createBuffer(String filename) throws IOException {
    List<String> buffer = new LinkedList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line;
      while ((line = br.readLine()) != null) {
        buffer.add(reverseString(line));
      }
    }
    return buffer;
  }

  /**
   * Reversing the lines in the file.
   *
   * @param rows
   * @return
   */
  private List<String> reverseRows(List<String> rows) {
    for (int i = 0; i < rows.size() - 1; i++) {
      rows.add(i, rows.remove(rows.size() - 1));
    }
    return rows;
  }

  /**
   * Reversing a string.
   *
   * @param str
   * @return
   */
  private String reverseString(String str) {
    char[] c = str.toCharArray();
    for (int i = 0; i < c.length / 2; i++) {
      char tmp = c[i];
      c[i] = c[c.length - i - 1];
      c[c.length - i - 1] = tmp;
    }
    return String.valueOf(c);
  }

  /**
   * Writing the content of the buffer to the file.
   *
   * @param name
   * @param buffer
   */
  private void write(String name, List<String> buffer) {
    try (FileWriter writer = new FileWriter(name)) {
      for (String s : buffer) {
        writer.write(s);
        writer.write("\n");
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
