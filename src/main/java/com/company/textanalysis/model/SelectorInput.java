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
        String resultRead = "", text, check;
        Inputter inputter = null;
        System.out.println("Press 0 to enter from the console, 1 to download from the file, 2 to download from DB");

        try {
            inputter = Inputter.values()[scanner.nextInt()];
        } catch (Exception e) {
            System.err.println("Error! No number entered");
        }
        System.out.println("Input - " + inputter);
        switch (inputter) {
            case CONSOLE:
                check = selectingConsole.writeConsole(scanner);
                resultRead = counting.identify(check, Inputter.CONSOLE.toString());
                break;
            case FILE:
                text = readingFile.read();
                check = checking.determine(text);
                resultRead = counting.identify(check, Inputter.FILE.toString());
                writingFile.write(resultRead);
                break;
            case DB:
                check = checking.determine(mySQLReading.getTextDB());
                resultRead = counting.identify(check, Inputter.DB.toString());
                break;
            default:
                System.out.println("Invalid number, please enter a number from 0 are 2");
                break;
        }
        System.out.println(resultRead);
    }
}
