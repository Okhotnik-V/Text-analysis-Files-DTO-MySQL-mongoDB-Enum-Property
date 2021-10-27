package com.company.textanalysis.ui;

import java.sql.Timestamp;
import java.util.List;

public interface SavingStatistic {
    public List<String> saveStatistic(int vowelsNumber, int consonantsNumber, String vowels, String consonants, String line, String typeInput);
}
