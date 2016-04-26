package task4.transfer.object;

import task2.input.into.file.*;

import java.io.IOException;

/**
 * Created by clouway on 26.04.16.
 */
public class DemoTransferStream {
  public static void main(String[] args) throws IOException, task2.input.into.file.FileError {
    TransferStream test=new TransferStream();
    test.transferPartial("test.txt","partial.txt",2,4);

  }
}
