using Microsoft.VisualStudio.TestTools.UnitTesting;
using SimpleCalculator;
using Moq;
using System;

namespace SimpleCalculator.Tests
{
    [TestClass]
    public class Calculator_CalculateShould
    {
        private Mock<MathOperation> operation;
        private Mock<MathOperationFactory> factory;
        private Calculator calculator;

        public Calculator_CalculateShould() 
        {
            operation = new Mock<MathOperation>();
            factory = new Mock<MathOperationFactory>();
            calculator = new Calculator(factory.Object);
        }

        [TestMethod]
        public void ProduceTheResultUsingTheOperationDeterminedByTheFactory() 
        {
            double num1 = 1;
            double num2 = 1;
            String op = "$";
            double expectedResult = 11;

            operation.Setup(x => x.Calculate(num1, num2)).Returns(expectedResult);
            factory.Setup(x => x.GetMathOperation(op)).Returns(operation.Object);

            double actualResult = calculator.Calculate(num1, num2, op);

            Assert.AreEqual(expectedResult, actualResult, 0);
        }
    }
}