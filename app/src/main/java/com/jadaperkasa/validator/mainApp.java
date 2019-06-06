package com.jadaperkasa.validator;

import android.app.Application;
import android.content.Context;

public class mainApp extends Application {

    private static Context myContext;

    @Override
    public void onCreate() {
        super.onCreate();
        myContext = getApplicationContext();
    }
}
