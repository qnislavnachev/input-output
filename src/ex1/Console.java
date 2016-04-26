package ex1;

import java.util.Scanner;

/**
 * Created by clouway on 19.04.16.
 */
public class Console {
  private Scanner sc = new Scanner(System.in);

  /**
   * Reading a String from the console.
   * @return
   */
  public String readString(){
    return sc.nextLine();
  }

  /**
   * Reading an Integer from the console.
   * @return
   */
  public int readInt(){
    return sc.nextInt();
  }

  /**
   * Reading a single Character from the console.
   * @return
   */
  public char readChar(){
    return sc.next().charAt(0);
  }

  /**
   * Reading a float number from the console.
   * @return
   */
  public float readFloat() { return sc.nextFloat(); }
}