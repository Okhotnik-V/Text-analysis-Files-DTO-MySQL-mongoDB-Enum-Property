package com.company.textanalysis.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckTest {
    Check check = new Check();

    @Test
    void determineTest() {
        assertEquals("Din", check.determine("Din"));
        assertEquals("Gradle BUM", check.determine("Gradle BUM"));
        assertEquals("Maven Good Jobs", check.determine("Maven Good Jobs"));
    }
}