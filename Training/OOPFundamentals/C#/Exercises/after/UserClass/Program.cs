using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserClass
{
    class Program
    {
        /*
         Create a new class, ‘User’, containing:
            •	Two private class members, ‘_name’ (string) and ‘_score’ (int).
            •	Properties that will allow the developer to get and set the value of the name and score members.
            •	A public, empty, default constructor.
            •	A method ‘IncreaseScoreByOne’ that takes no parameters, and returns nothing, but increases
                the value of the score of this object by one.

            Example:
                var sampleUser = new User();
                sampleUser.Name = "Henry";
                sampleUser.Score = 1336;
                sampleUser.IncreaseScoreByOne();

                System.out.println("User " + sampleUser.getName() + " has a score of: " + sampleUser.getScore()); 
                // Prints ‘User Henry has a score of: 1337’
            */

        static void Main(string[] args)
        {
            var sampleUser = new User();
            sampleUser.Name = "Henry";
            sampleUser.Score = 1336;
            sampleUser.IncreaseScoreByOne();

            Console.WriteLine("User " + sampleUser.Name + " has a score of: " + sampleUser.Score); // Prints ‘User Henry has a score of: 1337’

        }
    }
}
