package task6.dataclass;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by clouway on 10.05.16.
 */
public class DataClass {
  public void saveObject(OutputStream out, Object o) throws IOException {
    try {
      ObjectOutputStream output = new ObjectOutputStream(out);
      output.writeObject(o);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      out.close();
    }
  }

  public Object getObject(InputStream in) throws IOException, ClassNotFoundException {
    String result = null;
    try {
      ObjectInputStream input = new ObjectInputStream(in);
      Student student = (Student) input.readObject();
      result = student.StudentToString();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    return result;

  }

}
