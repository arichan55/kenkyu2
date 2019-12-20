package com.example.myapplication;

import android.app.Application;

public class MyApp extends Application {

    private int testString = 0;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public int getTestString() {
        return testString;
    }

    public void setTestString(int str) {
        testString = str;
    }
}