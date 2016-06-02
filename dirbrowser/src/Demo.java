import java.io.File;

/**
 * Created by clouway on 02.06.16.
 */
public class Demo {
  public static void main(String[] args) {
    File source = new File("/home/clouway/developmnet/input-output");
    File source2 = new File("/home/clouway/developmnet/input-output/file");
    DirectoryBrowser browser = new DirectoryBrowser();

    for (FileBox f : browser.listContent(source)) {
      System.out.println(f.getFile().getName() + " Is direcotry " + f.isDir());
    }
    System.out.println();
    for (FileBox f : browser.listContent(source2)) {
      System.out.println(f.getFile().getName());
    }
  }
}
