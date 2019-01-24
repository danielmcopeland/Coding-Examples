class Calculator:
    def __init__(self, operation_factory):
        self.operation_factory = operation_factory
    
    def calculate(self, num1, num2, operation_code):
        operation = self.operation_factory.get_math_operation(operation_code)
        return operation(num1, num2)