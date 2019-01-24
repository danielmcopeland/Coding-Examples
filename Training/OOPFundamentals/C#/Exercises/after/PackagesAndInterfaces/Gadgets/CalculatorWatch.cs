using PackagesAndInterfaces.Math;
using PackagesAndInterfaces.Time;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PackagesAndInterfaces.Gadgets
{
    public class CalculatorWatch : IWatch, ICalculator
    {
       
        public long GetUNIXEpochTime()
        {
            long time = (long)(DateTime.UtcNow - new DateTime(1970, 1, 1)).TotalSeconds;
            return time;
        }
        public int CalculateAdd(int numberOne, int numberTwo)
        {
            return numberOne + numberTwo;
        }
    }
}
