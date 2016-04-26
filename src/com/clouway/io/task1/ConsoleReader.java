package com.clouway.io.task1;

import java.util.Scanner;

/**
 * Created by clouway on 26.04.16.
 */
public class ConsoleReader {
  /**
   * Reads next line from console and returns it as result.
   * @return the last read line
   */
  public String readLine() {
    return new Scanner(System.in).nextLine();
  }
}
