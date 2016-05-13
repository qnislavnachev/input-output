package task2.fileoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */
public class Writer extends Reader {
    private String string;
    private File file;

    public Writer(String string) {
        this.string = string;
    }

    public void create(String end) {
        if (file == null) {
            File createFile = new File("");
            file = new File(createFile, string);
        }
        write(end);
    }

    private void write(String end) {
        try (FileWriter writeConsole = new FileWriter(string)) {
            writeConsole.write(read(end));
        } catch (IOException z) {
            z.printStackTrace();
        }
    }
}