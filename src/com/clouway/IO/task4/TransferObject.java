package com.clouway.IO.task4;

import sun.nio.ch.IOUtil;

import java.io.*;

public class TransferObject {
    private InputStream input = null;
    private OutputStream output = null;

    public void transferObject(String fileName, String transferFile){
        try {
            input = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found!");
        }
        try {
            output = new FileOutputStream(transferFile);
        } catch (FileNotFoundException e) {
            System.out.println("File " + transferFile + " not found!");
        }

        int temp, pos = 0;
        int mas[] = new int[100000];

        try {
            while((temp = input.read()) != -1){
                mas[pos] = temp;
                pos++;
            }
        } catch (IOException e) {
            System.out.println("Input error!");
        }

        for(int i = 0; i < pos; i++){
            try {
                output.write(mas[i]);
            } catch (IOException e) {
                System.out.println("Output error!");
            }
        }

        if(output != null){
            try {
                output.close();
            } catch (IOException e) {
                System.out.println("Error while closing the output stream!");
            }
        }
        if(input != null){
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error while closing the input stream!");
            }
        }

        System.out.println("Transfer is completed!");
    }
}
