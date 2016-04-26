package ex5.v1;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by clouway on 21.04.16.
 */
public class DirectoryBrowser {

  /**
   * Listing content at file path.
   *
   * @param path
   * @return
   */
  public List<String> listContent(String path) {
    List<String> list = new LinkedList<>();
    Path place = Paths.get(path);
    File file = new File(path);

    if (file.exists()) {
      if (file.isFile()) {
        list.add("File");
        list.add("Name: " + file.getName());
        list.add("Path: " + place.toString());
        list.add("Size: " + file.length() + "bytes");
      }
      if (file.isDirectory()) {
        list.add("Directory");
        list.add("Name: " + place.getFileName());
        list.add("Path: " + place.toString());
        list.add("Files in the directory:");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(place)) {
          String s = "";
          for (Path p : stream) {
            if (Files.isDirectory(p)) {
              s += ("\u001B[36m/" + p.getFileName() + "  ");
            }
            if (Files.isRegularFile(p)) {
              s += ("\u001B[35m" + p.getFileName() + "  ");
            }
          }
          list.add(s);
        } catch (IOException | DirectoryIteratorException x) {
          System.err.println(x);
        }
      }
    } else {
      list.add(path + "\u001B[37m" + " does not exist." + "\u001B[0m");
    }
    list.add("\u001B[0m\n");
    return list;
  }
}
