package com.company.textanalysis;

import com.company.textanalysis.model.SelectorInput;
import com.company.textanalysis.ui.SelectedInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SelectedInput selectedInput = new SelectorInput();
        Scanner scanner = new Scanner(System.in);
        Boolean restart = true;
        selectedInput.select();
        do {
            System.out.println("If you want to exit the program, enter \"exit\", otherwise restart the program.");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                return;
            } else {
                selectedInput.select();
            }
        } while (restart);
    }
}
