package task2.input.into.file;

/**
 * Created by clouway on 22.04.16.
 */
public class FileError extends Exception {
  public FileError(){
    super("\n There was an error with your file");
  }
}
