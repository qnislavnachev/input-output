package com.clouway.IO.task4;

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

        int temp;

        try {
            while((temp = input.read()) != -1){
                output.write(temp);
            }
        } catch (IOException e) {
            System.out.println("Input error!");
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
