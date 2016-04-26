package ex6;

import java.io.Serializable;

public class User implements Serializable {
  private String name;
  private int id;
  private int age;
  private int avatar;

  public String getName() {
    return name;
  }

  public User(String name, int id, int age, int avatar) {

    this.name = name;
    this.id = id;
    this.age = age;
    this.avatar = avatar;
  }

  public String toString() {
    return "User\nID: " + id + "\nName: " + name + "\nAge: " + age;
  }
}