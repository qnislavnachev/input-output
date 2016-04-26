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
public class FileOperation {
  public void write(String name) throws IOException, FileError {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter output = new BufferedWriter(new FileWriter(name));
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

  public void reverse(String fromfile, String tofile) throws IOException, FileError {
    BufferedReader input = new BufferedReader(new FileReader(fromfile));
    BufferedWriter output = new BufferedWriter(new FileWriter(tofile));
    String line;
    try {
      do {
        line = input.readLine();
        StringBuilder buf = new StringBuilder(line);
        output.write(String.valueOf(buf.reverse()));
        output.newLine();
      }
      while (!line.equals("."));
    } catch (IOException e) {
      throw new FileError();
    } finally {
      input.close();
      output.close();
    }
  }
}
