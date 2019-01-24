using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharp_Exercises
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             Create a function ‘CalculatePerimeter’ that takes a single parameter
             with an array of float numbers, containing the length of all the sides of the polygon.
             The length of this array may be variable, so a polygon with any number of sides could
             be passed. The function should return as a float the sum of all numbers in the array.

             Example:
                float[] polygonSideLengths = {7.5f, 10.4f, 3.7f, 16f, 20f};// A pentagon
                CalculatePerimeter(polygonSideLengths); // Returns ’57.6’
                */
            
            float[] polygonSideLengths = { 7.5f, 10.4f, 3.7f, 16f, 20f };
            float perimeter = CalculatePerimeter(polygonSideLengths);
            Console.WriteLine(perimeter);
        }
    }
}
