package task1.input_reader;

import java.util.Scanner;

/**
 * Created by clouway on 21.04.16.
 */
public class KeyReader {
  Scanner scan = new Scanner(System.in);

  /**
   * Reads a string from the keyboard.
   * @return str which is the string read from the keyboard
   */
  public String readStr() {
    String str = scan.next();
    return str;
  }

  /**
   * Reads an integer from the keyboard.
   * @return i which is the integer read from the keyboard.
   */
  public int readInt() {
    int i = scan.nextInt();
    return i;
  }

  /**
   * Reads a char from the keyboard.If the user enters more than one char the method reads only the first one.
   * @return c which is the first char read from the keyboard.
   */
  public char readChar() {
    char c = scan.next().charAt(0);
    return c;
  }

  /**
   * Reads a float from the keyboard.
   * @return f which is the float read from the keyboard.
   */
  public float readFloat() {
    float f = scan.nextFloat();
    return f;
  }
}
