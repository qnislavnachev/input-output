package task4.transfer.object;

/**
 * Created by clouway on 26.04.16.
 */
public class FileError extends Exception {
  public  FileError(){
    super("\n There was an error while transfering your data." );
  }

}
