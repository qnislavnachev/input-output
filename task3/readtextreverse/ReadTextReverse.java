package task3.readtextreverse;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by clouway on 13.05.16.
 */
public class ReadTextReverse {
    /**
     * Reverses the text that's in the file
     * @param string
     * @throws IOException
     */
    public void reverse(String string) throws IOException {
        write(string, reverse(create(string)));
    }

    /**
     * Reverses the string
     * @param s
     * @return
     */
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char swap = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = swap;
        }
        return String.valueOf(chars);
    }

    /**
     * Writes from the buffer to the file
     * @param string
     * @param buf
     */
    public void write(String string, List<String> buf) {
        try (FileWriter fw = new FileWriter(string)) {
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
     * @param hor
     * @return
     */
    public List<String> reverse(List<String> hor) {
        for (int i = 0; i < hor.size() - 1; i++) {
            hor.add(i, hor.remove(hor.size() - 1));
        }
        return hor;
    }

    /**
     * Creates buffer called "list"
     * The buffer consists of reversed strings
     * Each horizontal string is a new one
     * @param string
     * @return
     * @throws IOException
     */
    public List<String> create(String string) throws IOException {
        List<String> list = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(string))) {
            String s;
            while ((s = br.readLine()) != null) {
                list.add(reverseString(s));
            }
        }
        return list;
    }
}