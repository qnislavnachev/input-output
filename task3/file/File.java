package task3.file;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by clouway on 13.05.16.
 */
public class File {
    /**
     * Reverses the text that's in the file
     * @param text
     * @throws IOException
     */
    public void reverse(String text) throws IOException {
        write(text, reverse(create(text)));
    }

    /**
     * Reverses the text
     * @param text
     * @return
     */
    public String reverseText(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char swap = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = swap;
        }
        return String.valueOf(chars);
    }

    /**
     * Writes from the buffer to the file
     * @param text
     * @param buf
     */
    public void write(String text, List<String> buf) {
        try (FileWriter fw = new FileWriter(text)) {
            for (String s : buf) {
                fw.write(s);
                fw.write("");
            }
            fw.close();
        } catch (IOException z) {
            z.printStackTrace();
        }
    }

    /**
     * Reverses the text horizontally
     * @param horText
     * @return
     */
    public List<String> reverse(List<String> horText) {
        for (int i = 0; i < horText.size() - 1; i++) {
            horText.add(i, horText.remove(horText.size() - 1));
        }
        return horText;
    }

    /**
     * Creates buffer called "list"
     * The buffer consists of reversed strings
     * Each horizontal string is a new one
     * @param text
     * @return
     * @throws IOException
     */
    public List<String> create(String text) throws IOException {
        List<String> list = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(text))) {
            String s;
            while ((s = br.readLine()) != null) {
                list.add(reverseText(s));
            }
        }
        return list;
    }
}