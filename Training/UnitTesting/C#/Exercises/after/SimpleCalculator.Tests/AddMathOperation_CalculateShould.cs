using Microsoft.VisualStudio.TestTools.UnitTesting;
using SimpleCalculator;

namespace SimpleCalculator.Tests
{
    [TestClass]
    public class AddMathOperation_CalculateShould
    {
        private AddMathOperation adder;

        public AddMathOperation_CalculateShould()
        {
            adder = new AddMathOperation();
        }

        [TestMethod]
        public void ReturnTheSumOfTwoNumbers()
        {
            Assert.AreEqual(2, adder.Calculate(2, 0), 0);
            Assert.AreEqual(25, adder.Calculate(12.5, 12.5), 0);
            Assert.AreEqual(500, adder.Calculate(238, 262), 0);
            Assert.AreEqual(-8, adder.Calculate(-10, 2), 0);
            Assert.AreEqual(89547, adder.Calculate(14582, 74965), 0);
            Assert.AreEqual(-70, adder.Calculate(-20, -50), 0);
        }
    }
}
