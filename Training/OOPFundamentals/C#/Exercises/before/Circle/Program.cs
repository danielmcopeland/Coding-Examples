using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Circle
{
    class Program
    {
        public static void Main(string[] args)
        {
            /*
             Create a function ‘CalculateCircleArea’ that 
             takes the circle radius as a parameter. The function should return the area
             of the circle as a double. Hint: you can access the constant PI inside the System Namespace,
             as Math.PI.

            Example:
              CalculateCircleArea(15.5);// returns ‘754.7676350249478’
            */

            double area = CalculateCircleArea(15.5);
            Console.WriteLine(area);


        }
    }
}
