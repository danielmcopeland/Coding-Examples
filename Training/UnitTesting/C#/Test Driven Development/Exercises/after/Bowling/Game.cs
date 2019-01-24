using System;

namespace Bowling
{
    public class Game
    {
        private int[] rolls = new int[21];
        private int rollIndex = 0;

        public int Score() 
        {
            int score = 0;
            int frameIndex = 0;
            for (int frame = 0; frame < 10; frame++)
            {
                score += NormalScore(frameIndex);
                if (IsStrike(frameIndex) || IsSpare(frameIndex))
                {
                    score += Bonus(frameIndex);
                }
                frameIndex += (IsStrike(frameIndex) ? 1 : 2);
            }
            return score;
        }

        private bool IsSpare(int i) 
        {
            return rolls[i] + rolls[i+1] == 10;
        }

        private bool IsStrike(int i)
        {
            return rolls[i] == 10;
        }

        private int NormalScore(int i) 
        {
            return rolls[i] + rolls[i+1];
        }

        private int Bonus(int i)
        {
            return rolls[i+2];
        }

        public void Roll(int pins)
        {
            rolls[rollIndex] = pins;
            rollIndex++;
        }
    }
}
