import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by clouway on 02.06.16.
 */
public class DirectoryBrowser {

  /**
   * Returns list of subdirectory and file, if it is given directory
   * and returns list of one file if it is given file.
   *
   * @param file file or dir.
   * @return list of objects of class FileBox.
   */
  public List<FileBox> listContent(File file) {
    List<FileBox> boxes = new LinkedList<>();

    if (file.isDirectory()) {

      for (File f : file.listFiles()) {

        if (f.isDirectory()) {
          FileBox fileBox = new FileBox(true, f);
          boxes.add(fileBox);
        } else {
          FileBox fileBox = new FileBox(false, f);
          boxes.add(fileBox);
        }
      }
    } else {
      FileBox fileBox = new FileBox(false, file);
      boxes.add(fileBox);
    }
    return boxes;
  }
}
