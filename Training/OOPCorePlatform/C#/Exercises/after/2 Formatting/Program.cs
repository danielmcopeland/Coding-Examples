using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2_Formatting
{
    class Program
    {
        static void Main(string[] args)
        {
            //-----------------------------
            // decimals
            //-----------------------------
            int x = 10;
            int y = 20;

            // Example of displaying integers
            // X:10 Y:20
            //System.out.printf("", ...);       

            // TODO: Format number with 4 places and right justify using spaces
            // X:  10 Y:  20

            //Solution
            Console.WriteLine($"X:{x,4} Y:{y,4}");
            //end Solution

            // TODO: Format number with 4 places and pad with zeros
            // X:0010 Y:0020
            
            //Solution
            Console.WriteLine($"X:{x,4:D4} Y:{y,4:D4}");
            //End Solution


            // TODO: Format number with 4 places and left justify using spaces
            // X:10   Y:20

            //Solution
            Console.WriteLine($"X:{x,-4} Y:{y,-4}");
            //End Solution

            // TODO: Format number using comma separator
            // X:1,234,567

            //Solution
            Console.WriteLine("X:{0:N0}", 1234567);
            //End Solution

            // TODO: Format number leaving a space placeholder for positive numbers and prefixing with - for negative numbers
            // X: 10 Y:-20
            
            //Solution   
            y = -y;
            Console.WriteLine($"X:{x,3} Y:{y,3}");
            //End Solution
              

            //-----------------------------
            // float
            //-----------------------------
            double pi = Math.PI;

            // TODO: Format floating point number to display only first 2 decimal places
            // 3.14

            //Solution
            Console.WriteLine(pi.ToString("N2"));
            //End Solution

            //-----------------------------
            // dates
            //-----------------------------

            DateTime now = DateTime.Now;

            // TODO: Display date as 'Month Day, Year at Time(pm or am)'
            //Solution
            Console.WriteLine(now.ToString("MMM dd, yyyy") + " at " + now.ToString("hh") + "pm");
            //End Solution

            //-----------------------------
            // toString
            //-----------------------------
            // TODO: Override the toString method in the Person class to display the name
            // as 'Doe, John'
            Person person = new Person("John", "Doe");
            //Solution
            Console.WriteLine(person.ToString());
            //End Solution

        }
    }
}
