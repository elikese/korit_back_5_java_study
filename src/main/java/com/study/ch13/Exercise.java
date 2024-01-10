package com.study.ch13;

public class Exercise {
    private static Exercise instance;

    private Exercise() {

    }

    public static Exercise getInstance() {
        if (instance == null) {
            instance = new Exercise();
        }
        return instance;
    }

}
