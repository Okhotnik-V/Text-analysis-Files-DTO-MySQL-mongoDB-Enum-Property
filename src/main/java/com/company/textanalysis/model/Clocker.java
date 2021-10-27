package com.company.textanalysis.model;

import com.company.textanalysis.ui.Clocking;

import java.sql.Timestamp;

public class Clocker implements Clocking {

    @Override
    public Timestamp getTime() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp;
    }
}
