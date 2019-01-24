from bowling.game import Game
from unittest import main, TestCase

class TestGame(TestCase):
    def setUp(self):
        self.game = Game()
    
    def roll_all(self, rolls):
        for pins in rolls:
            self.game.roll(pins)

    def test_game_of_all_zeros_scores_zero(self):
        self.roll_all([0] * 20)
        self.assertEqual(0, self.game.score())
	
    def test_game_of_all_ones_scores_twenty(self):
        self.roll_all([1] * 20)
        self.assertEqual(20, self.game.score())

    def test_single_spare_adds_next_roll_as_bonus(self):
        self.roll_all([3, 7, 4] + [0] * 17)
        self.assertEqual(18, self.game.score())
    
    def test_single_strike_adds_next_two_rolls_as_bonus(self):
        self.roll_all([10, 7, 2] + [0] * 16)
        self.assertEqual(28, self.game.score())
    
    def test_perfect_game_score_three_hundread(self):
        self.roll_all([10] * 12)
        self.assertEqual(300, self.game.score())

if __name__=="__main__":
    main()