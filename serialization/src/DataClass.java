import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by clouway on 31.05.16.
 */
public class DataClass {

  /**
   * Serialize object and save it to file.
   * @param out shows the place where to be written.
   * @param obj object that is written.
   */
  public void saveObject(OutputStream out, Object obj) {

    try {
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
      objectOutputStream.writeObject(obj);
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Deserialize an object and return it.
   * @param inputStream
   * @return deserialize copy of given object
   */
  public Object getObject(InputStream inputStream) {
    Object object = null;

    try {
      ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
      object = objectInputStream.readObject();
      objectInputStream.close();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return object;
  }
}
