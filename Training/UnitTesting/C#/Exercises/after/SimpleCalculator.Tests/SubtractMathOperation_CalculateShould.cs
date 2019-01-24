using Microsoft.VisualStudio.TestTools.UnitTesting;
using SimpleCalculator;

namespace SimpleCalculator.Tests
{
    [TestClass]
    public class SubtractMathOperation_CalculateShould
    {
        private SubtractMathOperation subtracter;

        public SubtractMathOperation_CalculateShould()
        {
            subtracter = new SubtractMathOperation();
        }

        [TestMethod]
        public void ReturnTheDifferenceOfTwoNumbers()
        {
            Assert.AreEqual(2, subtracter.Calculate(2, 0), 0);
            Assert.AreEqual(0, subtracter.Calculate(12.5, 12.5), 0);
            Assert.AreEqual(24, subtracter.Calculate(262, 238), 0);
            Assert.AreEqual(-8, subtracter.Calculate(-10, -2), 0);
            Assert.AreEqual(60383, subtracter.Calculate(74965, 14582), 0);
            Assert.AreEqual(-30, subtracter.Calculate(20, 50), 0);
        }
    }
}