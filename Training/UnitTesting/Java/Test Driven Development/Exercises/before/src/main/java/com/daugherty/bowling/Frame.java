package com.daugherty.bowling;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Frame {
    private ArrayList<Integer> rollsList = new ArrayList<Integer>();

    public Frame(int r1) {
        addRoll(r1);
    }

    public Frame(int r1, int r2) {
        addRoll(r1);
        addRoll(r2);
    }

    public Frame(int r1, int r2, int r3) {
        addRoll(r1);
        addRoll(r2);
        addRoll(r3);
    }

    public void addRoll(int r) { rollsList.add(r); }


    public ArrayList<Integer> getFrameRolls() {
        return rollsList;
    }

    public int getRoll(int index) {
        return rollsList.get(index);
    }

    public int getFrameScore() {
        int score = 0;
        for (int i=0; i < rollsList.size(); i++) {
            score += rollsList.get(i);
        }
        return score;
    }

    public boolean isStrike() {
        return this.rollsList.get(0) == 10;
    }

    public boolean isSpare() {
        int temp = rollsList.size() > 1 ? this.rollsList.get(1) : 0;
        return this.rollsList.get(0) + temp == 10;
    }




}
