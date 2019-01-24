from code.operations import ADDITION
from unittest import main, TestCase

class TestAddition(TestCase):
    def test_numbers_are_added(self):
        self.assertEqual(2, ADDITION(2, 0))
        self.assertEqual(25, ADDITION(12.5, 12.5))
        self.assertEqual(500, ADDITION(238, 262))
        self.assertEqual(-8, ADDITION(-10, 2))
        self.assertEqual(89547, ADDITION(14582, 74965))
        self.assertEqual(-70, ADDITION(-20, -50))

class TestSubtraction(TestCase):
    pass

class TestMultiplication(TestCase):
    pass

class TestDivision(TestCase):
    pass

if __name__ == '__main__':
    main()
