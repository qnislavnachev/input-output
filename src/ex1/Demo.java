package ex1;

/**
 * Created by clouway on 19.04.16.
 */
public class Demo {
  public static void main(String[] args) {
    Console console = new Console();
    String str = "";
    int n = 0;
    char c = 0;
    float f = 0;
    System.out.println("Enter a String.");
    str = console.readString();
    System.out.println("Enter an Integer.");
    n = console.readInt();
    System.out.println("Enter a Character.");
    c = console.readChar();
    System.out.println("Enter a Float number.");
    f = console.readFloat();

    System.out.println("\nString = " + str + "\nInteger = " + n + "\nCharacter = " + c + "\nFloat = " + f);
  }
}
