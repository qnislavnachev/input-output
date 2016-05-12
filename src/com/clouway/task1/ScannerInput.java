package com.clouway.task1;

/**
 * Created by clouway on 09.05.16.
 */

import java.util.Scanner;

public class ScannerInput {
  public String readeString() {
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    return s;
  }

  public int readInt() {
    Scanner input = new Scanner(System.in);
    int i = input.nextInt();
    return i;
  }

  public float readFloat() {
    Scanner input = new Scanner(System.in);
    float f = input.nextFloat();
    return f;
  }

  public char readChar() {
    Scanner input = new Scanner(System.in);
    char c = input.next().charAt(0);
    return c;
  }
}
