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
        assertEquals("[4, Vowels: A e a o , 6, Consonants: r s n D m n ]", console.writeConsole(scanner));
    }

    @Test
    public void consoleTest2() {
        Scanner scanner = new Scanner("GRADING");
        assertEquals("[2, Vowels: A I , 5, Consonants: G R D N G ]", console.writeConsole(scanner));
    }

    @Test
    public void consoleTest3() {
        Scanner scanner = new Scanner("Vik Dok Luk Chuck");
        assertEquals("[4, Vowels: i o u u , 10, Consonants: V k D k L k C h c k ]", console.writeConsole(scanner));
    }
}