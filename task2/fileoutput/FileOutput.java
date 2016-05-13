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

    public FileOutput(String string) {
        this.string = string;
    }

    public void create(String end) {
        if (file == null) {
            File createFile = new File("");
            file = new File(createFile, string);
        }
        write(end);
    }

    private String read(String end) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        boolean bool = true;
        while (bool != false) {
            String read = scanner.nextLine();
            if (read.equals(end)) {
                bool = false;
            } else {
                string += read;
            }
        }
        return string;
    }

    private void write(String end) {
        try (FileWriter writeConsole = new FileWriter(string)) {
            writeConsole.write(read(end));
        } catch (IOException z) {
            z.printStackTrace();
        }
    }

}