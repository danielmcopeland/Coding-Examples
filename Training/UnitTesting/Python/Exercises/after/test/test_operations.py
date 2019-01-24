from code.operations import ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
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
    def test_numbers_are_subtracted(self):
        self.assertEqual(2, SUBTRACTION(2, 0))
        self.assertEqual(0, SUBTRACTION(12.5, 12.5))
        self.assertEqual(24, SUBTRACTION(262, 238))
        self.assertEqual(-8, SUBTRACTION(-10, -2))
        self.assertEqual(60383, SUBTRACTION(74965, 14582))
        self.assertEqual(-30, SUBTRACTION(20, 50))

class TestMultiplication(TestCase):
    def test_numbers_are_multiplied(self):
        self.assertEqual(0, MULTIPLICATION(2, 0))
        self.assertEqual(156.25, MULTIPLICATION(12.5, 12.5))
        self.assertEqual(62356, MULTIPLICATION(238, 262))
        self.assertEqual(-20, MULTIPLICATION(-10, 2))
        self.assertEqual(1093139630, MULTIPLICATION(14582, 74965))
        self.assertEqual(1000, MULTIPLICATION(-20, -50))
        self.assertAlmostEqual(1.15, MULTIPLICATION(5, .23), delta = 0.01)

class TestDivision(TestCase):
    def test_numbers_are_divided(self):
        self.assertEqual(1, DIVISION(2, 2))
        self.assertEqual(5, DIVISION(25, 5))
        self.assertAlmostEqual(.9083, DIVISION(238, 262), delta = 0.01)
        self.assertEqual(-5, DIVISION(-10, 2))
        self.assertEqual(2916.4, DIVISION(14582, 5))
        self.assertAlmostEqual(.4, DIVISION(-20, -50), delta = 0.01)
        self.assertEqual(1700, DIVISION(425, .25))
    
    def test_division_by_zero_raises_exception(self):
        with self.assertRaises(ZeroDivisionError):
            DIVISION(10, 0)

if __name__ == '__main__':
    main()
