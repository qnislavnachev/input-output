package task4;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.Scanner;

import static java.lang.Character.SIZE;
import static java.lang.Character.isLetter;
import static java.lang.Character.isWhitespace;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by clouway on 19.05.16.
 */
public class TransferObject {
    public Object transferObject(InputStream in, OutputStream out, int off, int len) throws IOException {
        int read;
        int total = 0;
        byte buf[] = new byte[1024];
        if (off < 0 || len < 0 || len > (buf.length - off)) {
            throw new IndexOutOfBoundsException();
        }
        try {
            in.skip(off);
            while ((read = in.read(buf)) != -1) {
                total += read;
                if (total > len) {
                    out.write(buf, 0, read-(read-len));
                }
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out == null) {
                out.close();
            }
        }
        return total;
    }
}