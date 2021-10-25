package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleTest {
    Console console = new Console();
    Scanner scanner = new Scanner("Arsen Damon");

    @Test
    public void consoleTest1() {
        Scanner scanner = new Scanner("Arsen Damon");
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 4 {1=A, 2=e, 3=a, 4=o}\n" + "Consonants: 6 {1=r, 2=s, 3=n, 4=D, 5=m, 6=n}", console.writeConsole(scanner));
    }

    @Test
    public void consoleTest2() {
        Scanner scanner = new Scanner("GRADING");
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 2 {1=A, 2=I}\n" + "Consonants: 5 {1=G, 2=R, 3=D, 4=N, 5=G}", console.writeConsole(scanner));
    }

    @Test
    public void consoleTest3() {
        Scanner scanner = new Scanner("Vik Dok Luk Chuck");
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 4 {1=i, 2=o, 3=u, 4=u}\n" + "Consonants: 10 {1=V, 2=k, 3=D, 4=k, 5=L, 6=k, 7=C, 8=h, 9=c, 10=k}", console.writeConsole(scanner));
    }
}