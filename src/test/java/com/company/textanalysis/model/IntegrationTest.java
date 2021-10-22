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
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 5 {1=a, 2=e, 3=o, 4=o, 5=o}\n" + "Consonants: 8 {1=M, 2=v, 3=n, 4=G, 5=d, 6=J, 7=b, 8=s}", count.identify(text));
    }

    @Test
    void integrationTest2() {
        text = "audi";
        assertEquals(text, checker.determine(text));
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 3 {1=a, 2=u, 3=i}\n" + "Consonants: 1 {1=d}", count.identify(text));
    }

    @Test
    void integrationTest3() {
        text = "Java";
        assertEquals(text, checker.determine(text));
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 2 {1=a, 2=a}\n" + "Consonants: 2 {1=J, 2=v}", count.identify(text));
    }
}
