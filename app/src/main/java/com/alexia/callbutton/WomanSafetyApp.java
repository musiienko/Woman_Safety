package com.alexia.callbutton;

import android.app.Application;

public class WomanSafetyApp extends Application {
    public int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}