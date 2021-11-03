package com.company.textanalysis.model;

import com.company.textanalysis.ui.WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFile implements WritingFile {

    @Override
    public String write(String textWrite) {
        try (FileWriter fileWriter = new FileWriter("Result.txt", false)) {
            fileWriter.write(textWrite);
            fileWriter.flush();
            System.out.println("The result is saved in a file.");
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        return textWrite;
    }
}
