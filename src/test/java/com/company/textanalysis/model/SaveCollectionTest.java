package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SaveCollectionTest {
    SaverCollection saveCollection = new SaverCollection();

    @Test
    public void saveTest() {
        int vowelsNumber = 2;
        int consonantsNumber = 3;
        String vowels = "a y";
        String consonants = "b d c";
        String resultTest = "[2, a y, 3, b d c]";
        assertEquals(resultTest, saveCollection.saveList(vowelsNumber, consonantsNumber, vowels, consonants));
    }

}