package com.company.textanalysis;

import com.company.textanalysis.model.Console;
import com.company.textanalysis.model.ReaderFile;
import com.company.textanalysis.model.WriterFile;
import com.company.textanalysis.ui.ReadingFile;
import com.company.textanalysis.ui.SelectingConsole;
import com.company.textanalysis.ui.WritingFile;

import java.util.Scanner;

public class Main {

    protected String[] args;

    public static void main(String[] args) {
        SelectingConsole selectingConsole = new Console();
        ReadingFile readingFile = new ReaderFile();
        WritingFile writingFile = new WriterFile();
        Scanner scanner = new Scanner(System.in);
        Boolean restart = true;
        String result = "", text;
        System.out.println("Press 1 to enter from the console, 2 to download from the file.");
        switch (scanner.nextLine()) {
            case "1":
                result = selectingConsole.writeConsole(scanner);
                break;
            case "2":
                text = readingFile.read(scanner);
                result = writingFile.write(text);
                break;
            default:
                System.out.println("Invalid number, please enter a number from 1 are 2");
                break;
        }
        System.out.println(result);
        do {
            System.out.println("If you want to exit the program, enter \"exit\", otherwise restart the program.");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                return;
            } else {
                main(args);
            }
        } while (restart);
    }
}
