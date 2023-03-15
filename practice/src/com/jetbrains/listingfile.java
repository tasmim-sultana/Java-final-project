package com.jetbrains;
import java.io.*;

public class listingfile {
    public static void main(String args[]) {
        try {
            FileReader reader = new FileReader("E:\\Myfile");
            BufferedReader bufferreader = new BufferedReader(reader);
            String line;
            while ((line = bufferreader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
