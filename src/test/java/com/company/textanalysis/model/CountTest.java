package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTest {
    Counter count = new Counter();

    @Test
    void identifyTest() {
        assertEquals("[1, Vowels: i , 2, Consonants: D n ]", count.identify("Din","1"));
        assertEquals("[3, Vowels: a e U , 6, Consonants: G r d l B M ]", count.identify("Gradle BUM","1"));
        assertEquals("[5, Vowels: a e o o o , 8, Consonants: M v n G d J b s ]", count.identify("Maven Good Jobs","1"));
    }
}