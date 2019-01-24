package com.daugherty.bowling;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
	
	@Test
	public void gameExistsAfterConstruction() {
		assertNotNull(new Game());
	}
}
