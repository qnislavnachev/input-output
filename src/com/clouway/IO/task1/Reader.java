package com.clouway.IO.task1;

import java.io.*;

public class Reader {

    private InputStreamReader input = new InputStreamReader(System.in);
    private BufferedReader in = new BufferedReader(input);

    public String readString(){
        try {
            return in.readLine();
        } catch (IOException e) {
            System.out.println("Failed input!");
        }
        return "";
    }

    public char readChar(){
        try {
            return in.readLine().charAt(0);
        } catch (IOException e) {
            System.out.println("Failed input!");
        }
        return 0;
    }

    public int readInt(){;
        try {
            int temp = Integer.parseInt(in.readLine());
            return temp;
        } catch (IOException e) {
            System.out.println("Failed input!");
        }
        return 0;
    }

    public float readFloat(){
        try {
            float temp = Float.parseFloat(in.readLine());
            return temp;
        } catch (IOException e) {
            System.out.println("Failed input!");
        }
        return 0;
    }
}
