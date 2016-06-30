package task4;

import java.io.FileNotFoundException;

/**
 * Created by clouway on 19.05.16.
 */
public class NoFileException extends Exception {
    public NoFileException(){
        super("\n Missing input or output file.");
    }
}
