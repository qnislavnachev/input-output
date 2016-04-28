package task5.directory_browser;

import java.io.File;

/**
 * Created by clouway on 28.04.16.
 */
public class DirectoryBrowser {
  public String dir="";


  public String listContent(String name) {
    File file = new File(name);
    String type = "Not a file or folder.";
    String case1 = "file ";
    String case2 = "folder ";


    if (file.exists()) {
      if (file.isFile()) {
        type = case1;
        String path = file.getAbsolutePath();
        return type.concat(" @" + path);
      }
      if (file.isDirectory()) {
        type = case2;
        return type.concat(" with " + showDirectory(file));
      }
    }
    return type;
  }

  private String showDirectory(File file) {
    File[] directory = file.listFiles();

    for (File currentFile : directory) {
      if (currentFile.isFile()) {
        dir=dir+" "+currentFile.getName()+".file";
      }
      if (currentFile.isDirectory()) {
        dir=dir+" /"+currentFile.getName();
      }

    }
    return dir;
  }
}
