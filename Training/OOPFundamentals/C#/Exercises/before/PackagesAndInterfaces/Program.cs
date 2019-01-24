using PackagesAndInterfaces.Gadgets;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PackagesAndInterfaces
{
    class Program
    {
        //Exercise Instructions are in Instructions.text

        static void Main(string[] args)
        {
            var calculatorWatch = new CalculatorWatch();

            int addedNumbers = calculatorWatch.CalculateAdd(2, 2);
            long currentUNIXTime = calculatorWatch.GetUNIXEpochTime();

            Console.WriteLine($"The result of the addition is {addedNumbers} and the current UNIX time is {currentUNIXTime}");
            // Prints: ‘The result of the addition is 4 and the current UNIX time is
            //(the following number will vary depending on when you run the program) 1467411884801’
        }
    }
}
