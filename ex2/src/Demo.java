/**
 * Created by clouway on 18.05.16.
 */
public class Demo {
    public static void main(String[] args) {

        TextFile file = new TextFile("file");
        Console console = new Console();
        Writer writer = new Writer();

        System.out.println("Enter content for file, then type . to finish:");
        writer.write(console.contentTill("."), file);
    }
}

