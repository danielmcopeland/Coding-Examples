package com.daugherty.bowling;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class GameTest {

	@Test
	public void sampleFrames() {
		Game game = new Game();

		game.fillFrame(10);
		game.fillFrame(9,1);
		game.fillFrame(7,1);
		game.fillFrame(0,3);
		game.fillFrame(10);
		game.fillFrame(10);
		game.fillFrame(8,0);
		game.fillFrame(10);
		game.fillFrame(10);
		game.fillFrame(10,10 ,10);

		game.showFrames(10);
		System.out.println("");




		System.out.println(game.calculateScore());
		game.showFrames(10);
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(10);
        testArray.add(10);
        testArray.add(6);
        Assert.assertEquals(testArray, game.getFrame(0).getFrameRolls());

	}


	@Test
	public void gameExistsAfterConstruction() {
		assertNotNull(new Game());
	}

}
