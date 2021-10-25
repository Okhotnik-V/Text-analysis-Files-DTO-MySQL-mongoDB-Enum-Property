package com.company.textanalysis.model;

import com.company.textanalysis.ui.ReadingFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderFile implements ReadingFile {

    @Override
    public String read(Scanner scanner) {
        String text = "";
        try (FileReader reader = new FileReader("Text.txt")) {
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
            System.err.println("Read error. Change the content (file type).");
        }
        return text;
    }
}
