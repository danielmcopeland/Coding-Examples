package com.daugherty.bowling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	
	private Game game;
	
	@Before
	public void setupGame() {
		game = new Game();
	}
	
	private void rollMany(int pins, int times) {
		for (int i=0; i<times; i++) {
			game.roll(pins);
		}
	}
	
	private void rollEach(int ...pins) {
		for (int pin : pins) {
			game.roll(pin);
		}
	}
	
	@Test
	public void gameOfAllZeroRollsScoresZero() throws Exception {
		rollMany(0, 20);
		assertEquals(0, game.score());
	}
	
	@Test
	public void gameOfAllOneRollsScoresTwenty() throws Exception {
		rollMany(1, 20);
		assertEquals(20, game.score());
	}
	
	@Test
	public void aSingleSpareAddsNextRollAsBonus() throws Exception {
		rollEach(3, 7, 4);
		rollMany(0, 17);
		assertEquals(18, game.score());
	}
	
	@Test
	public void aSingleStrikeAddsNextTwoRollsAsBonus() throws Exception {
		rollEach(10, 7, 2);
		rollMany(0, 16);
		assertEquals(28, game.score());
	}
	
	@Test
	public void aPerfectGameScoresThreeHundred() throws Exception {
		rollMany(10, 12);
		assertEquals(300, game.score());
	}
}
