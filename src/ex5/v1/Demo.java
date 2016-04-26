package ex5.v1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by clouway on 21.04.16.
 */
public class Demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /**
     * Demo for directory.
     * Shows the home dir.
     */
    List<String> list = new LinkedList<>();
    DirectoryBrowser db = new DirectoryBrowser();
    String dirpath = System.getProperty("user.home");
    List<String> content1 = db.listContent(dirpath);
    for (String s : content1) {
      System.out.println(s);
    }

    /**
     * Demo for file.
     * Shows file in the home dir
     */
    System.out.println("Name of the file.");
    String filename = sc.next();
    List<String> content2 = db.listContent(dirpath + "/" + filename);
    for (String each : content2) {
      System.out.println(each);
    }
  }
}
