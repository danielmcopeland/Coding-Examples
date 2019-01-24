using Microsoft.VisualStudio.TestTools.UnitTesting;
using SimpleCalculator;
using System;

namespace SimpleCalculator.Tests
{
    [TestClass]
    public class DivideMathOperation_CalculateShould
    {
        private MathOperation target;

        public DivideMathOperation_CalculateShould() 
        {
            target = new DivideMathOperation();
        }

        [TestMethod]
        public void ReturnTheQuotientOfTwoNumbers() 
        {
            Assert.AreEqual(1, target.Calculate(2, 2), 0);
            Assert.AreEqual(5, target.Calculate(25, 5), 0);
            Assert.AreEqual(.9083, target.Calculate(238, 262), .01);
            Assert.AreEqual(-5, target.Calculate(-10, 2), 0);
            Assert.AreEqual(2916.4, target.Calculate(14582, 5), 0);
            Assert.AreEqual(.4, target.Calculate(-20, -50), .01);
            Assert.AreEqual(1700, target.Calculate(425, .25), 0);
        }

        [TestMethod]
        [ExpectedException(typeof(DivideByZeroException))]
        public void ThrowExceptionIfDividesByZero()
        {
            target.Calculate(2, 0);
        }
    }
}