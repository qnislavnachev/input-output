package task3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //create new  file reader
        FileReader file = new FileReader("MyFile.md");

        //create new buffered reader
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine(); // read the file
        br.close();

        //reversing text from file
        String reverse = new StringBuffer(line).reverse().toString();
        System.out.println(reverse);

        //create new file writer
        FileWriter fw = new FileWriter("MyFile.md");

        //write reversed text to the file
        fw.write(reverse);
        fw.close();
    }
}
