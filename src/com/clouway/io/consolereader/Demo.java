package com.clouway.io.consolereader;

import java.util.Scanner;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class Demo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");

    String name = scanner.nextLine();

    System.out.println("Name is: " + name);

  }
}
