package ex6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    DataClass data = new DataClass();
    User user1 = new User("Ivan", 12345, 22, 123);
    User user2 = new User("Pesho", 11111, 34, 214);
    User user3 = new User("Gosho", 12223, 28,214);

    FileOutputStream outU1 = new FileOutputStream(user1.getName() + ".ser");
    FileOutputStream outU2 = new FileOutputStream(user2.getName() + ".ser");
    FileOutputStream outU3 = new FileOutputStream(user3.getName() + ".ser");

    FileInputStream inU1 = new FileInputStream(user1.getName() + ".ser");
    FileInputStream inU2 = new FileInputStream(user2.getName() + ".ser");
    FileInputStream inU3 = new FileInputStream(user3.getName() + ".ser");

    data.saveObject(outU1, user1);
    data.saveObject(outU2, user2);
    data.saveObject(outU3, user3);

    data.getObject(inU1);
    data.getObject(inU2);
    data.getObject(inU3);
  }
}