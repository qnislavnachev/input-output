package task2.consolewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */

public class ConsoleWriter {
    private String string;
    private File file;

    public ConsoleWriter(String string) {
        this.string = string;
    }

    public String readConsole(String end) {
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

    public void writeConsole(String end) {
        try (FileWriter writeConsole = new FileWriter(string)) {
            writeConsole.write(readConsole(end));
        } catch (IOException z) {
            z.printStackTrace();
        }
    }

    public void createFile(String end) {
        if (file == null) {
            File createFile = new File("");
            file = new File(createFile, string);
        }
        writeConsole(end);
    }
}