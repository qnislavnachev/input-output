package task3.reverse_file;

/**
 * Created by clouway on 25.04.16.
 */
public class FileError extends Exception {
  public FileError(){
    super("\n There was an error with your file");
  }
}
