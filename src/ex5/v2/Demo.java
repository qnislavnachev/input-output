package ex5.v2;

import java.util.List;

public class Demo {
  public static void main(String[] args) {
    DirectoryBrowser browser = new DirectoryBrowser();
    String homedir = System.getProperty("user.home");
    List<FileObject> files = browser.listContent(homedir);
    for (FileObject each : files) {
      if (each.size() > 20000) System.out.println(each.name());
    }
  }
}
