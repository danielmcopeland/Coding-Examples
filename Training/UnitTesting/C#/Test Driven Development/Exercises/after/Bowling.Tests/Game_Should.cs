using Microsoft.VisualStudio.TestTools.UnitTesting;
using Bowling;

namespace Bowling.Tests
{
    [TestClass]
    public class Game_Should
    {
        private Game game;
        public Game_Should()
        {
            game = new Game();
        }

        private void RollMany(int pins, int times)
        {
            for (int i = 0; i < times; i++)
            {
                game.Roll(pins);
            }
        }

        private void RollEach(params int[] pins)
        {
            foreach (int pin in pins)
            {
                game.Roll(pin);
            }
        }

        [TestMethod]
        public void ScoreZeroIfAllRollsAreZero()
        {
            RollMany(0, 20);
            Assert.AreEqual(0, game.Score(), 0);
        }

        [TestMethod]
        public void ScoreTwentyForGameOfAllOnes()
        {
            RollMany(1, 20);
            Assert.AreEqual(20, game.Score(), 0);
        }

        [TestMethod]
        public void AddNextRollAsBonusForASingleSpare()
        {
            RollEach(3, 7, 4);
            RollMany(0, 17);
            Assert.AreEqual(18, game.Score(), 0);
        }

        [TestMethod]
        public void AddNextTwoRollsAsBonusForASingleStrike()
        {
            RollEach(10, 7, 2);
            RollMany(0, 16);
            Assert.AreEqual(28, game.Score(), 0);
        }

        [TestMethod]
        public void ScoreThreeHundredForAPerfectGame()
        {
            RollMany(10, 12);
            Assert.AreEqual(300, game.Score(), 0);
        }
    }
}
