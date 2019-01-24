using Microsoft.VisualStudio.TestTools.UnitTesting;
using Bowling;

namespace Bowling.Tests
{
    [TestClass]
    public class Game_Should
    {
        [TestMethod]
        public void ExistAfterConstruction()
        {
            Assert.IsNotNull(new Game());
        }
    }
}
