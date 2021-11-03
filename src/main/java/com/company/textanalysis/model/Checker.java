package com.company.textanalysis.model;

import com.company.textanalysis.ui.Checking;
import com.company.textanalysis.ui.SelectedInput;

import java.util.regex.Pattern;

public class Checker implements Checking {

    @Override
    public String determine(String textDetermine) {
        try {
            SelectedInput selectedInput = new SelectorInput();
            boolean resultDetermine;
            if (textDetermine != null && !textDetermine.trim().isEmpty()) {
                resultDetermine = Pattern.matches("[" + "a-z A-Z" + "]" + "*", textDetermine);
            } else {
                resultDetermine = false;
                System.out.println("Error, a sentence is entered that does not meet the requirements");
            }
            boolean correct = false;
            while (correct == false) {
                if (resultDetermine == true) {
                    System.out.println("The sentence is correct!" + "\n" + "Your sentence: " + textDetermine + "\n" + "We process the text...");
                    correct = true;
                } else {
                    System.err.println("Change error. Change the content.");
                    selectedInput.select();
                }
            }
            return textDetermine;
        } catch (Exception e) {
            System.err.println("Error: Occurred while checking text.");
            return null;
        }
    }
}
