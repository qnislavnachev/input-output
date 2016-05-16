import java.io.*;

/**
 * Created by clouway on 16.05.16.
 */

public class ConvertedStream {
    private InputStream stream;

    public ConvertedStream(InputStream inputStream) {
        stream = inputStream;
    }


    /**
     * Reads String type of input
     *
     * @return
     */
    public String readString() {
        return readNextLine();
    }

    /**
     * Reads char type of input
     *
     * @return
     */

    public char readChar() {
        return readNextLine().charAt(0);
        }

    /**
     * Reads int type of input
     *
     * @return
     */
    public int readInt() {
        return Integer.parseInt(readNextLine());
    }

    /**
     * Reads float type of input
     *
     * @return
     */
    public float readFloat() {
        return Float.parseFloat(readNextLine());
    }

    /**
     * Convert stream to string.
     * @return
     */
    private String readNextLine() {
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
            sb.append(br.readLine());
        } catch (IOException e) {
            e.fillInStackTrace();
        }

        return sb.toString();
    }
}
