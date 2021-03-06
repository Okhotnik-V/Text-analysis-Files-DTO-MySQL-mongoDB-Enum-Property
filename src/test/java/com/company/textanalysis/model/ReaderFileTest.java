package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.FileWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReaderFileTest {
    ReaderFile readerFile = new ReaderFile();
    String text;

    @Test
    public void readerTest1() {
        text = "One Millions Dollar's";
        try (FileWriter fileWriter = new FileWriter("Text.txt", false)) {
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        assertEquals(text, readerFile.read());
    }

    @Test
    public void readerTest2() {
        text = "Github";
        try (FileWriter fileWriter = new FileWriter("Text.txt", false)) {
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        assertEquals(text, readerFile.read());
    }

    @Test
    public void readerTest3() {
        text = "Docker Max";
        try (FileWriter fileWriter = new FileWriter("Text.txt", false)) {
            fileWriter.write(text);
            fileWriter.flush();
        } catch (IOException ex) {
            System.err.println("Write error.");
        }
        assertEquals(text, readerFile.read());
    }
}