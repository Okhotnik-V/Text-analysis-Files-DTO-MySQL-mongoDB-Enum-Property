package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckerTest {
    Checker checker = new Checker();

    @Test
    void determineTest() {
        assertEquals("Din", checker.determine("Din"));
        assertEquals("Gradle BUM", checker.determine("Gradle BUM"));
        assertEquals("Maven Good Jobs", checker.determine("Maven Good Jobs"));
    }
}