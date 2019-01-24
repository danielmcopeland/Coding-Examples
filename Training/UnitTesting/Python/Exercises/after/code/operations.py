ADDITION = lambda x,y: x + y
SUBTRACTION = lambda x,y: x - y
MULTIPLICATION = lambda x,y: x * y
DIVISION = lambda x,y: x / y

BASIC_OPERATIONS = {
    "+": ADDITION,
    "-": SUBTRACTION,
    "*": MULTIPLICATION,
    "/": DIVISION
}

class OperationFactory:
    def __init__(self, operation_lookup = BASIC_OPERATIONS):
        self.operation_lookup = operation_lookup
    
    def get_math_operation(self, operation_code):
        if operation_code in self.operation_lookup:
            return self.operation_lookup[operation_code]
        else:
            raise ValueError("unrecognized operation code")