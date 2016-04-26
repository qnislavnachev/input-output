package ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 20.04.16.
 */
public class Writer {
  private File f;
  private String name;

  public Writer(String name) {
    this.name = name;
  }

  /**
   * Creating new file and writing to it.
   *
   * @param exitSymbol
   */
  public void createFile(String exitSymbol) {
    if (f == null) {
      File dir = new File("/src");
      f = new File(dir, name + ".txt");
    }
    write(exitSymbol);
  }

  /**
   * Reading from the console input.
   *
   * @param exitSymbol
   * @return
   */
  private String read(String exitSymbol) {
    Scanner sc = new Scanner(System.in);
    String str = "";
    boolean b = true;
    while (b) {
      String buf = sc.nextLine();
      if (buf.equals(exitSymbol)) {
        b = false;
      } else {
        str += buf + "\n";
      }
    }
    return str;
  }

  /**
   * Writing to the file.
   *
   * @param exitSymbol
   */
  private void write(String exitSymbol) {
    try (FileWriter writer = new FileWriter(name)) {
      writer.write(read(exitSymbol));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

