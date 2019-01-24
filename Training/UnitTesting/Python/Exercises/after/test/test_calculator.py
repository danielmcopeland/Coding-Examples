from code.calculator import Calculator
from code.operations import OperationFactory
from unittest import main, TestCase
from unittest.mock import call, Mock

class TestCalculator(TestCase):
    def setUp(self):
        self.mock_operation = Mock(spec = lambda x,y: 0)
        self.mock_operation_factory = Mock(spec = OperationFactory)
        self.calculator = Calculator(self.mock_operation_factory)

    def test_executes_expected_operation(self):
        num1 = 2
        num2 = 8
        op_code = "^"
        expected = 256
        self.mock_operation.return_value = expected
        self.mock_operation_factory.get_math_operation.return_value = self.mock_operation

        result = self.calculator.calculate(num1, num2, op_code)
        
        self.assertEqual(expected, result)
        self.mock_operation.assert_called_once_with(num1, num2)
        self.mock_operation_factory.get_math_operation.assert_called_once_with(op_code)

class TestIntegratedCalculator(TestCase):
    def setUp(self):
        self.calculator = Calculator(OperationFactory())
    
    def test_calculator_executes_math_operations(self):
        self.assertEqual(4, self.calculator.calculate(2, 2, "+"))
        self.assertEqual(1, self.calculator.calculate(3, 2, "-"))
        self.assertEqual(15, self.calculator.calculate(3, 5, "*"))
        self.assertEqual(5, self.calculator.calculate(10, 2, "/"))

if __name__ == '__main__':
    main()
