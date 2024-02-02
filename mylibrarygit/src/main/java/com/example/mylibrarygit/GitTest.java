package com.example.mylibrarygit;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

public class GitTest extends Application {
    private static GitTest instance;

    private GitTest() {

    }

    public static GitTest getInstance() {
        if (instance == null) {
            instance = new GitTest();
        }
        return instance;
    }


    public static void printLog(String s) {
        Log.d("Key-->", s);
    }

    public void printToast() {
        Toast.makeText(getApplicationContext(), "HI", Toast.LENGTH_SHORT).show();
    }

}
