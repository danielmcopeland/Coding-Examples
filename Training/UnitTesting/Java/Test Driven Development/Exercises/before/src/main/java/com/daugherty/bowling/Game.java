package com.daugherty.bowling;
import java.util.ArrayList;

public class Game {

    private ArrayList<Frame> frames = new ArrayList<Frame>();
    private int firstExtraScore;
    private int secondExtraScore;

    public Game() {

    }

    public Frame getFrame(int frameIndex) {
        return frames.get(frameIndex);
    }

    public void fillFrame(int firstBall) {
        frames.add(new Frame(firstBall));
    }

    public void fillFrame(int firstBall, int secondBall) {
        frames.add(new Frame(firstBall, secondBall));

    }
    public void fillFrame(int firstBall, int secondBall, int thirdBall) {
        frames.add(new Frame(firstBall, secondBall, thirdBall));

    }

    public void calculateExtraPoints1(int frameNum) {
        Frame mainFrame = frames.get(frameNum);
        if (frameNum >= 1) {
            Frame previousFrame = frames.get(frameNum-1);

            if (previousFrame.isStrike() && (mainFrame.isStrike() == false || frameNum==9)) {
                previousFrame.addRoll(mainFrame.getRoll(0));
                previousFrame.addRoll(mainFrame.getRoll(1));
            } else if (previousFrame.isSpare()) {
                previousFrame.addRoll(mainFrame.getRoll(0));
            }
        }

        if (frameNum >= 2) {
            Frame previousFrame = frames.get(frameNum - 1);
            Frame previousFrame2 = frames.get(frameNum - 2);

            if (previousFrame.isStrike() && previousFrame2.isStrike()) {
                previousFrame2.addRoll(mainFrame.getRoll(0));

            }
        }


    }



    public void showFrames(int j) {
        for (int i=0; i<j; i++) {
            System.out.println("Frame " + (i+1) + "= " + frames.get(i).getFrameRolls());
        }
    }

    public int calculateScore() {
        for (int i=0; i<frames.size(); i++) {
            calculateExtraPoints1(i);
        }
        int score = 0;
        for (int i=0; i<frames.size(); i++) {
            score+=frames.get(i).getFrameScore();
        }
        return score;
    }
}
