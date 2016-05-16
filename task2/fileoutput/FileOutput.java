package task2.fileoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */
public class FileOutput {
    private String string;
    private File file;

    /**
     * Constructor
     * @param name
     */
    public FileOutput(String name) {
        this.string = name;
    }

    /**
     * Reads from the console.
     * @param end
     * @return
     */
    public String read(String end) {
        Scanner scan = new Scanner(System.in);
        String string = "";
        boolean bool = true;
        while (bool != false) {
            String read = scan.nextLine();
            if (read.equals(end)) {
                bool = false;
            } else {
                string += read;
            }
        }
        return string;
    }

    /**
     * Creates new file and writes into it
     * @param end
     */
    public void create(String end) {
        if (file == null) {
            File createFile = new File("");
            file = new File(createFile, string);
        }
        write(end);
    }

    /**
     * Writes in the file
     * @param end
     */
    private void write(String end) {
        try (FileWriter writeConsole = new FileWriter(string)) {
            writeConsole.write(read(end));
        } catch (IOException z) {
            z.printStackTrace();
        }
    }
}