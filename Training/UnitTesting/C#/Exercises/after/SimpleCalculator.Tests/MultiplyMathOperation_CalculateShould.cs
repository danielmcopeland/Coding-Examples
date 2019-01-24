using Microsoft.VisualStudio.TestTools.UnitTesting;
using SimpleCalculator;

namespace SimpleCalculator.Tests
{
    [TestClass]
    public class MultiplyMathOperation_CalculateShould
    {
        private MathOperation target;

        public MultiplyMathOperation_CalculateShould() 
        {
            target = new MultiplyMathOperation();
        }

        [TestMethod]
        public void ReturnTheProductOfTwoNumbers() 
        {
            Assert.AreEqual(0, target.Calculate(2, 0), 0);
            Assert.AreEqual(156.25, target.Calculate(12.5, 12.5), 0);
            Assert.AreEqual(62356, target.Calculate(262, 238), 0);
            Assert.AreEqual(-20, target.Calculate(-10, 2), 0);
            Assert.AreEqual(1093139630, target.Calculate(74965, 14582), 0);
            Assert.AreEqual(1000, target.Calculate(-20, -50), 0);
		    Assert.AreEqual(1.15, target.Calculate(5, .23), .01);
        }
    }
}