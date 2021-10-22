package com.company.textanalysis.model;

import com.company.textanalysis.ui.Checking;
import com.company.textanalysis.ui.Counting;
import com.company.textanalysis.ui.WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriterFile implements WritingFile {
    public String write(String text) {
        String result = "";
        try (FileWriter fileWriter = new FileWriter("Result.txt", false)) {
            Checking checking = new Checker();
            Counting counting = new Counter();
            String check = checking.determine(text);
            result = counting.identify(check);
            fileWriter.write(result);
            fileWriter.flush();
            System.out.println("The result is saved in a file.");
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        return result;
    }
}
