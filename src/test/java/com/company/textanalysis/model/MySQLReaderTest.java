package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySQLReaderTest {
    MySQLReader mySQLReader = new MySQLReader();

    @Test
    public void readerSQlTest() {
        assertEquals("MySQL textAnalyse", mySQLReader.getTextDB());
    }
}