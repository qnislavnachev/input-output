package com.clouway.io.task1;

/**
 * Created by clouway on 26.04.16.
 */
public class Demo {
  public static void main(String[] args) {
    ConsoleReader reader = new ConsoleReader();
    String firstLine = reader.readLine();
    String secondLine = reader.readLine();

    System.out.println("First Line:" + firstLine);
    System.out.println("Second Line: " + secondLine);
  }
}
