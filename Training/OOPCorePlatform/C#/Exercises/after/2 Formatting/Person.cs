using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2_Formatting
{
    class Person
    {
        private string _firstName;
        private string _lastName;

        public Person(string firstName, string lastName)
        {
            _firstName = firstName;
            _lastName = lastName;
        }
        //Solution
        public override string ToString()
        {
            return $"{_lastName}, {_firstName}";
        }
        //End Solution
    }
}
