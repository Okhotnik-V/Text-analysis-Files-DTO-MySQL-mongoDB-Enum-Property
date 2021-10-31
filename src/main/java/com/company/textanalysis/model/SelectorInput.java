package com.company.textanalysis.model;

import com.company.textanalysis.enums.Inputter;
import com.company.textanalysis.ui.*;

import java.util.Scanner;

public class SelectorInput implements SelectedInput {
    @Override
    public void select() {
        SelectingConsole selectingConsole = new Console();
        ReadingFile readingFile = new ReaderFile();
        WritingFile writingFile = new WriterFile();
        MySQLReading mySQLReading = new MySQLReader();
        Counting counting = new Counter();
        Checking checking = new Checker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the input type \"Console\", \"File\", \"Database\"");
        String inputType = scanner.nextLine();
        String resultRead = "", text, check;
        if (inputType.equals(Inputter.CONSOLE.getInputer())) {
            check = selectingConsole.writeConsole(scanner);
            resultRead = counting.identify(check, Inputter.CONSOLE.toString());
        } else if (inputType.equals(Inputter.FILE.getInputer())) {
            text = readingFile.read();
            check = checking.determine(text);
            resultRead = counting.identify(check, Inputter.FILE.toString());
            writingFile.write(resultRead);
        } else if (inputType.equals(Inputter.DB.getInputer())) {
            check = checking.determine(mySQLReading.getTextDB());
            resultRead = counting.identify(check, Inputter.DB.toString());
        } else {
            System.err.println("The wrong meaning is written!");
            select();
        }
        System.out.println(resultRead);
    }
}
