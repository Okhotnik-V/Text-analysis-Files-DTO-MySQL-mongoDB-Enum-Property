package com.company.textanalysis.model;

import com.company.textanalysis.ui.Checking;
import com.company.textanalysis.ui.SelectedInput;

import java.util.regex.Pattern;

public class Checker implements Checking {

    @Override
    public String determine(String text) {
        try {
            SelectedInput selectedInput = new SelectorInput();
            boolean result;
            if (text != null && !text.trim().isEmpty()) {
                result = Pattern.matches("[" + "a-z A-Z" + "]" + "*", text);
            } else {
                result = false;
                System.out.println("Error, a sentence is entered that does not meet the requirements");
            }
            boolean correct = false;
            while (correct == false) {
                if (result == true) {
                    System.out.println("The sentence is correct!" + "\n" + "Your sentence: " + text + "\n" + "We process the text...");
                    correct = true;
                } else {
                    System.err.println("Change error. Change the content.");
                    selectedInput.select();
                }
            }
            return text;
        } catch (Exception e) {
            System.err.println("Error: Occurred while checking text.");
            return null;
        }
    }
}
