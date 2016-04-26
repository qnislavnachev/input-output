package ex5.v2;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class DirectoryBrowser {

  public List<FileObject> listContent(String path) {
    List<FileObject> list = new LinkedList<>();
    Path place = Paths.get(path);
    File f = new File(path);
    if (f.exists()) {
      if (f.isDirectory()) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(place)) {
          for (Path p : stream) {
            FileObject file = new FileObject(p.getFileName()+"", p.toFile().length());
            list.add(file);
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return list;
  }
}

class FileObject {
  private String name;
  private long size;

  public FileObject(String name, long size) {
    this.name = name;
    this.size = size;
  }

  public long size(){
    return size;
  }

  public String name(){
    return name;
  }
}
