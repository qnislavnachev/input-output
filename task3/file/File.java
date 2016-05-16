package task3.file;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by clouway on 13.05.16.
 */
public class File {
    /**
     * Reverses the horizontal text that's in the file
     *
     * @param text
     * @throws IOException
     */
    public void reverseHorizontalText(String text) throws IOException {
        write(text, getHorText(reverseList(text)));
    }

    /**
     * Reverses the text
     *
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
     *
     * @param filename
     * @param buf
     */
    public void write(String filename, List<String> buf) {
        try (FileWriter fw = new FileWriter(filename)) {
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
     *
     * @param horText
     * @return
     */
    public List<String> getHorText(List<String> horText) {
        for (int i = 0; i < horText.size() - 1; i++) {
            horText.add(i, horText.remove(horText.size() - 1));
        }
        return horText;
    }

    /**
     * Creates list and adds new reversed string on each line after reading it
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public List<String> reverseList(String filename) throws IOException {
        List<String> list = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String s;
            while ((s = br.readLine()) != null) {
                list.add(reverseText(s));
            }
        }
        return list;
    }
}