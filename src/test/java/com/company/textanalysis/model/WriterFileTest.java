package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WriterFileTest {
    WriterFile writerFile = new WriterFile();

    @Test
    public void writerTest1() {
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 1 {1=e}\n" + "Consonants: 3 {1=T, 2=x, 3=t}", writerFile.write("Text"));
    }

    @Test
    public void writerTest2() {
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 3 {1=e, 2=a, 3=e}\n" + "Consonants: 5 {1=R, 2=d, 3=t, 4=x, 5=t}", writerFile.write("Read text"));
    }

    @Test
    public void writerTest3() {
        assertEquals("Counting vowels and consonants:\n" + "Vowels: 6 {1=o, 2=o, 3=i, 4=e, 5=y, 6=e}\n" + "Consonants: 7 {1=C, 2=m, 3=p, 4=r, 5=m, 6=s, 7=s}", writerFile.write("Compromise yes"));
    }
}