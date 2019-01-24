package com.daugherty.bowling;

public class Game {
	
	private int[] rolls = new int[21];
	private int rollIndex = 0;
	
	public int score() {
		int score = 0;
		int frameIndex = 0;
		for (int frame = 0; frame < 10; frame++) {
			score += normalScore(frameIndex);
			if (isStrike(frameIndex) || isSpare(frameIndex)) {
				score += bonus(frameIndex);
			}
			frameIndex += (isStrike(frameIndex) ? 1 : 2);
		}
		return score;
	}
	
	private boolean isSpare(int i) {
		return rolls[i] + rolls[i+1] == 10;
	}
	
	private boolean isStrike(int i) {
		return rolls[i] == 10;
	}

	private int normalScore(int i) {
		return rolls[i] + rolls[i+1];
	}
	
	private int bonus(int i) {
		return rolls[i+2];
	}

	public void roll(int pins) {
		rolls[rollIndex] = pins;
		rollIndex++;
	}
}
