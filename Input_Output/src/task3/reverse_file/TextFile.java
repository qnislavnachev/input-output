package task3.reverse_file;

import task2.input.into.file.FileError;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by clouway on 22.04.16.
 */
public class TextFile {
  String filename;
  String breaker;
  public TextFile(String name,String breakerforwriting){
    filename=name;
    breaker=breakerforwriting;
  }
  /**
   * The same method from task 2
   * @throws IOException
   * @throws FileError
   */
  public void write() throws IOException, FileError {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter output = new BufferedWriter(new FileWriter(filename));
    try {
      String line;
      do {
        line = input.readLine();
        output.write(line);
        output.newLine();
      } while (!line.equals(breaker));
    } catch (IOException e) {
      throw new FileError();
    } finally {
      output.close();
      input.close();
    }
  }

  /**
   * Reverse method using a StringBuilder buffer
   * to load the read line from the input stream
   * and reverse it then write it with the output
   * stream to the new file.
   * @param tofile the file that will have the reversed strings.
   * @throws IOException
   * @throws FileError
   */
  public void reverse(String tofile) throws IOException, FileError {
    BufferedReader input = new BufferedReader(new FileReader(filename));
    BufferedWriter output = new BufferedWriter(new FileWriter(tofile));
    String line;
    try {
      do {
        line = input.readLine();
        StringBuilder buf = new StringBuilder(line);
        output.write(String.valueOf(buf.reverse()));
        output.newLine();
      }
      while (!line.equals(breaker));
    } catch (IOException e) {
      throw new FileError();
    } finally {
      input.close();
      output.close();
    }
  }
}
