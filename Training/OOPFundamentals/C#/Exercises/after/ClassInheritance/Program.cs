using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassInheritance
{
    class Program
    {
        static void Main(string[] args)
        {
            var worker = new Employee(1);
            var theBoss = new Manager(2);

            Console.WriteLine("Are these employees the same? " + (worker.Equals(theBoss)));
            // Prints ‘Are these employees the same? false’

            Employee anEqualBoss = new Manager(2);
            Console.WriteLine("Are these employees the same? " + (theBoss.Equals(anEqualBoss)));
            // Prints ‘Are these employees the same? true’

            Console.WriteLine("Has The Boss admin rights? " + (theBoss.HasAdministratorRights()));
            // Prints ‘Has The Boss admin rights? true’

        }
    }
    }
}
