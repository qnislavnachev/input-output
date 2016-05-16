/**
 * Created by clouway on 16.05.16.
 */
public class Demo {
    public static void main(String[] args) {
        ConvertedStream reader1 = new ConvertedStream(System.in);
        System.out.println("Input String:");
        System.out.println("String:" + reader1.readString());
        System.out.println("Input Character ");
        System.out.println("Character: " + reader1.readChar());
        System.out.println("Input Integer:");
        System.out.println("Integer: " + reader1.readInt());
        System.out.println("Input float number:");
        System.out.println("Float: " + reader1.readFloat());
    }
}

