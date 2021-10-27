package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WriterFileTest {
    WriterFile writerFile = new WriterFile();

    @Test
    public void writerTest1() {
        assertEquals("[1, Vowels: e , 3, Consonants: T x t ]", writerFile.write("Text"));
    }

    @Test
    public void writerTest2() {
        assertEquals("[3, Vowels: e a e , 5, Consonants: R d t x t ]", writerFile.write("Read text"));
    }

    @Test
    public void writerTest3() {
        assertEquals("[6, Vowels: o o i e y e , 7, Consonants: C m p r m s s ]", writerFile.write("Compromise yes"));
    }
}