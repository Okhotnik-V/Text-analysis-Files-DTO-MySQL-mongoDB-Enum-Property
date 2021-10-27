package com.company.textanalysis.model;

import com.company.textanalysis.ui.Checking;
import com.company.textanalysis.ui.SelectingConsole;

import java.util.Scanner;


public class Console implements SelectingConsole {

    @Override
    public String writeConsole(Scanner scanner) {
        String resultConsole = "", check = "";
        try {
            Checking checking = new Checker();
            System.out.println("Write your sentence.");
            String text = scanner.next();
            resultConsole = checking.determine(text);
            System.out.println("Your sentence: " + text);
        } catch (Exception e) {
            System.err.println("Console error.");
        }
        return resultConsole;
    }
}
