package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReaderFileTest {
    ReaderFile readerFile = new ReaderFile();
    Scanner scanner = new Scanner(" ");
    String text;

    @Test
    public void readerTest1() {
        text = "One Millions Dollar's";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter("Text.txt", false)) {
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        assertEquals(text, readerFile.read(scanner));
    }

    @Test
    public void readerTest2() {
        text = "Github";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter("Text.txt", false)) {
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        assertEquals(text, readerFile.read(scanner));
    }

    @Test
    public void readerTest3() {
        text = "Docker Max";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter("Text.txt", false)) {
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        assertEquals(text, readerFile.read(scanner));
    }
}