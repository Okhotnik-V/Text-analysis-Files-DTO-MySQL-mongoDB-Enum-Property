package com.company.textanalysis.model;

import com.company.textanalysis.ui.Checking;
import com.company.textanalysis.ui.Counting;
import com.company.textanalysis.ui.SelectingConsole;

import java.util.Scanner;


public class Console implements SelectingConsole {

    @Override
    public String writeConsole(Scanner scanner) {
        String result = "", check = "";
        try {
            Counting counting = new Counter();
            Checking checking = new Checker();
            System.out.println("Write your sentence.");
            String text = scanner.nextLine();
            check = checking.determine(text);
            result = counting.identify(check);
            System.out.println("Your sentence: " + text);
            result = counting.identify(text);
        } catch (Exception e) {
            System.err.println("Console error.");
        }
        return result;
    }
}
