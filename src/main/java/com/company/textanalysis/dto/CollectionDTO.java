package com.company.textanalysis.dto;

public class CollectionDTO {
    private int vowelsNumber;
    private int consonantsNumber;
    private String vowels;
    private String consonants;

    public CollectionDTO(int vowelsNumber, int consonantsNumber, String vowels, String consonants) {
        this.vowelsNumber = vowelsNumber;
        this.consonantsNumber = consonantsNumber;
        this.vowels = vowels;
        this.consonants = consonants;
    }

    public int getVowelsNumber() {
        return vowelsNumber;
    }

    public int getConsonantsNumber() {
        return consonantsNumber;
    }

    public String getVowels() {
        return vowels;
    }

    public String getConsonants() {
        return consonants;
    }
}
