package task2.fileoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */
public class FileOutput {
    private String name;
    private File file;

    /**
     * Constructor
     *
     * @param name
     */
    public FileOutput(String name) {
        this.name = name;
    }

    /**
     * Reads from the console.
     *
     * @param inputText
     * @return
     */
    public String read(String inputText) {
        Scanner scan = new Scanner(System.in);
        String string = "";
        boolean bool = true;
        while (bool != false) {
            String read = scan.nextLine();
            if (read.equals(inputText)) {
                bool = false;
            } else {
                string += read;
            }
        }
        return string;
    }

    /**
     * Creates new file and writes into it
     *
     * @param text
     */
    public void create(String text) {
        if (file == null) {
            File createFile = new File("");
            file = new File(createFile, name);
        }
        write(text);
    }

    /**
     * Writes in the file
     *
     * @param text
     */
    private void write(String text) {
        try (FileWriter writeConsole = new FileWriter(name)) {
            writeConsole.write(read(text));
        } catch (IOException z) {
            z.printStackTrace();
        }
    }
}