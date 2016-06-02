import java.io.File;

/**
 * Created by clouway on 02.06.16.
 */
public class FileBox {
  private boolean dir;
  private File file;

  public FileBox(boolean dir, File file) {
    this.dir = dir;
    this.file = file;
  }

  /**
   * Returns boolean for dir or file.
   *
   * @return
   */
  public boolean isDir() {
    return dir;
  }

  /**
   * Returns file object.
   *
   * @return
   */
  public File getFile() {
    return file;
  }
}