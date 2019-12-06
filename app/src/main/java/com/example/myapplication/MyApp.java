package com.example.myapplication;

import android.app.Application;

public class MyApp extends Application {

    private String testString = "default";

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String str) {
        testString = str;
    }
}