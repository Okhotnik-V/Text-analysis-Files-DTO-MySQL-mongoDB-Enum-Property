package com.company.textanalysis.model;

import com.company.textanalysis.ui.MongoDBReading;
import com.mongodb.MongoClient;

public class MongoDBReader implements MongoDBReading {

    public MongoDBReader(com.mongodb.client.MongoClient mongoClient) {
    }

    @Override
    public String connectingMongo() {
        PropertySingleton propertySingleton = PropertySingleton.getInstance();
        try (MongoClient mongoClient = new MongoClient(propertySingleton.mongoUrl, Integer.parseInt(propertySingleton.mongoPort))) {
            var database = mongoClient.getDatabase(propertySingleton.mongoDatabase);
            var textCollection = database.getCollection(propertySingleton.mongoCollection);
            String textMongoBD = textCollection.find().first().getString(propertySingleton.mongoKey);
            return textMongoBD;
        } catch (Exception e) {
            System.err.println("Error MongoDB");
            e.printStackTrace();
            return null;
        }
    }
}
