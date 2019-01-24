from bowling.game import Game
from unittest import main, TestCase

class TestGame(TestCase):
    def test_fake(self):
        self.assertIsNotNone(Game())

if __name__=="__main__":
    main()