using Microsoft.VisualStudio.TestTools.UnitTesting;
using SimpleCalculator;

namespace SimpleCalculator.Tests
{
    [TestClass]
    public class SimpleCalculator_Should
    {
        private MathOperationFactory factory;
        private Calculator calculator;

        public SimpleCalculator_Should()
        {
            factory = new MathOperationFactoryImpl();
            calculator = new Calculator(factory);
        }

        [TestMethod]
        public void HandleTheFourStandardOperations() 
        {
            Assert.AreEqual(4, calculator.Calculate(2, 2, "+"), 0);
            Assert.AreEqual(1, calculator.Calculate(3, 2, "-"), 0);
            Assert.AreEqual(5, calculator.Calculate(10, 2, "/"), 0);
            Assert.AreEqual(15, calculator.Calculate(3, 5, "*"), 0);
        }
    }
}