package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest {
    Checker checker = new Checker();
    Counter count = new Counter();
    String text;

    @Test
    void integrationTest1() {
        text = "Maven Good Jobs";
        assertEquals(text, checker.determine(text));
        assertEquals("[5, Vowels: a e o o o , 8, Consonants: M v n G d J b s ]", count.identify(text, "1"));
    }

    @Test
    void integrationTest2() {
        text = "audi";
        assertEquals(text, checker.determine(text));
        assertEquals("[3, Vowels: a u i , 1, Consonants: d ]", count.identify(text, "1"));
    }

    @Test
    void integrationTest3() {
        text = "Java";
        assertEquals(text, checker.determine(text));
        assertEquals("[2, Vowels: a a , 2, Consonants: J v ]", count.identify(text, "1"));
    }
}
