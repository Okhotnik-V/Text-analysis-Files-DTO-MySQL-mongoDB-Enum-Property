package com.company.textanalysis.model;

import com.company.textanalysis.Main;
import com.company.textanalysis.ui.Checking;
import com.company.textanalysis.ui.Counting;
import com.company.textanalysis.ui.WritingFile;

import java.io.IOException;

public class WriterFile extends Main implements WritingFile {
    public String write(String text) {
        String result = "";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter("Result.txt", false)) {
            Checking checking = new Check();
            Counting counting = new Count();
            String check = checking.determine(text);
            result = counting.identify(check);
            fileWriter.write(result);
            fileWriter.flush();
            System.out.println("The result is saved in a file.");
        } catch (IOException ex) {
            System.err.println("Write error. Restart");
            main(super.args);
        }
        return result;
    }
}
