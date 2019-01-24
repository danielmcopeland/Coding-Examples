using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exceptions
{
    class Program
    {
        static void Main(string[] args)
        {
            //Exercise instructions are in Instructions.txt
            Glass hugeGlass = new Glass(1.5f);

            try
            {
                hugeGlass.AddWater(20f);
            }
            catch (GlassOverflownException e)
            {
                Console.WriteLine(e);
                // Prints com.daugherty.GlassOverflownException: glass capacity exceeded; you have spilt 18.5 gallons
            }

        }
    }
}
