package com.company.textanalysis.model;

import com.mongodb.MongoClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MongoDBReaderTest {
    MongoClient mongoClient = Mockito.mock(MongoClient.class);

    @Test
    void testMongo() {
        assertNotNull(mongoClient);
    }
}