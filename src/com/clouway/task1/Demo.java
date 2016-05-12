package com.clouway.task1;

import java.io.IOException;

/**
 * Created by clouway on 09.05.16.
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    ReadFromConsole readeConsole = new ReadFromConsole();
    System.out.println(readeConsole.readeString());
    System.out.println(readeConsole.readInt());
    System.out.println(readeConsole.readChar());
    System.out.println(readeConsole.readFloat());
  }
}
