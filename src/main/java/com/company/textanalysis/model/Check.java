package com.company.textanalysis.model;

import com.company.textanalysis.Main;
import com.company.textanalysis.ui.Checking;

import java.util.regex.Pattern;

public class Check extends Main implements Checking {

    @Override
    public String determine(String text) {
        try {
            boolean result;
            if (text != null && !text.trim().isEmpty()) {
                result = Pattern.matches("[" + "a-z A-Z" + "]" + "*", text);
            } else {
                result = false;
                System.out.println("Error, a sentence is entered that does not meet the requirements");
            }
            int e = 0;
            while (e == 0) {
                if (result == true) {
                    System.out.println("The sentence is correct!" + "\n" + "Your sentence: " + text + "\n" + "We process the text...");
                    e++;
                } else {
                    System.err.println("Change error. Change the content.");
                    main(super.args);
                }
            }
            return text;
        } catch (Exception e) {
            System.err.println("Error: Occurred while checking text.");
            main(super.args);
            return null;
        }
    }
}
