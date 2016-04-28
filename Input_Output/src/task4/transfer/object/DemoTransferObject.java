package task4.transfer.object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by clouway on 26.04.16.
 */
public class DemoTransferObject {
  public static void main(String[] args) throws IOException {
    byte[]buffer=new byte[1000];
    TransferObject test=new TransferObject();
    test.transfer("demo.txt","reversed",3,6,buffer);
  }
}

