package com.company.textanalysis.model;

import com.company.textanalysis.ui.ReadingFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderFile implements ReadingFile {

    @Override
    public String read(Scanner scanner) {
        String text = "";
        try (java.io.FileReader reader = new java.io.FileReader("Text.txt")) {
            char[] buf = new char[10000];
            int i;
            System.out.println("Read file...");
            while ((i = reader.read(buf)) > 0) {
                if (i < 10000) {
                    buf = Arrays.copyOf(buf, i);
                }
                text = String.valueOf(buf);
            }
        } catch (IOException ex) {
            System.err.println("Read error. Change the content (file type). and press enter");
            scanner.nextLine();
            read(scanner);
        }
        return text;
    }
}
