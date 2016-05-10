package task6.dataclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by clouway on 10.05.16.
 */
public class DemoDataClass {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    DataClass data=new DataClass();
    Student student1=new Student("Vasil",18087,6,6);
    FileOutputStream serialize=new FileOutputStream("student1.ser");
    FileInputStream unserialize=new FileInputStream("student1.ser");
    data.saveObject(serialize,student1);
    System.out.println(data.getObject(unserialize));
  }
}
