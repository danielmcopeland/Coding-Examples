using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultipleConstructors
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
             Create a new class, ‘Triangle’, containing:
          •	Three private float members, ‘_a’, ‘_b’ and ‘_c’ representing the three sides of a triangle.
          •	A constructor with three parameters, ‘a’, ‘b’, and ‘c’, that would create a Triangle whose 
            sides would have the specified measure.
          •	A constructor with only one parameter, ‘sideLength’, representing the length of a single side,
            and assuming all sides are equal (that would hence create an equilateral triangle.)
          •	A public method ‘CalculatePerimeter’ that takes no parameters and returns the perimeter of
            this triangle.

            Example:
            Triangle scaleneTriangle = new Triangle(10, 9, 7.5f);
            float scaleneTrianglePerimeter = scaleneTriangle.CalculatePerimeter();
            Console.WriteLine("Scalene triangle perimeter = " + scaleneTrianglePerimeter);
            // Prints ‘Scalene triangle perimeter = 26.5’

            Triangle equilateralTriangle = new Triangle(10);
            float equilateralTrianglePerimeter = equilateralTriangle.CalculatePerimeter();
            Console.WriteLine("Equilateral triangle perimeter = " + equilateralTrianglePerimeter);
            // Prints ‘Equilateral triangle perimeter = 30.0’

            */

            Triangle scaleneTriangle = new Triangle(10, 9, 7.5f);
            float scaleneTrianglePerimeter = scaleneTriangle.CalculatePerimeter();
            Console.WriteLine("Scalene triangle perimeter = " + scaleneTrianglePerimeter);
         

            Triangle equilateralTriangle = new Triangle(10);
            float equilateralTrianglePerimeter = equilateralTriangle.CalculatePerimeter();
            Console.WriteLine("Equilateral triangle perimeter = " + equilateralTrianglePerimeter);
        }
    }
}
