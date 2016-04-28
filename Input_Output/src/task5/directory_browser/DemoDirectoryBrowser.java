package task5.directory_browser;

import java.util.Scanner;

/**
 * Created by clouway on 28.04.16.
 */
public class DemoDirectoryBrowser {
  public static void main(String[] args) {
    DirectoryBrowser test = new DirectoryBrowser();
    Scanner sc = new Scanner(System.in);
    boolean breaker = true;
    while (breaker) {
      System.out.println("\nEnter a name to check if its a file or directory or type exit: ");
      String check = sc.nextLine();
      System.out.println(test.listContent(check));
      if (sc.equals("exit")) {
        breaker = false;
      }

    }
  }
}


