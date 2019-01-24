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

           

            // TODO: Format number with 4 places and pad with zeros
            // X:0010 Y:0020
            
           


            // TODO: Format number with 4 places and left justify using spaces
            // X:10   Y:20

            

            // TODO: Format number using comma separator
            // X:1,234,567

            

            // TODO: Format number leaving a space placeholder for positive numbers and prefixing with - for negative numbers
            // X: 10 Y:-20
            
            
              

            //-----------------------------
            // float
            //-----------------------------
            double pi = Math.PI;

            // TODO: Format floating point number to display only first 2 decimal places
            // 3.14

            

            //-----------------------------
            // dates
            //-----------------------------

            DateTime now = DateTime.Now;

            // TODO: Display date as 'Month Day, Year at Time(pm or am)'
          

            //-----------------------------
            // toString
            //-----------------------------
            // TODO: Override the toString method in the Person class to display the name
            // as 'Doe, John'
            Person person = new Person("John", "Doe");
            

        }
    }
}
