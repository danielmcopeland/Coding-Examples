using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4_Collections
{
    class Person
    {
        private string _firstName;
        private string _lastName;
        private string _ssn;

        public Person(string firstName, string lastName, string ssn)
        {
            _firstName = firstName;
            _lastName = lastName;
            _ssn = ssn;
        }

        public string FirstName { get
            {
                return _firstName;
            }
        }
        public string LastName { get
            {
                return _lastName;
            }
        }
        public string Ssn {get
            {
                return _ssn;
            }
        }


        // TODO: Create an  Equals method that takes a Person as a parameter and do a comparison using the ssn field
       
       

        public override string ToString()
        {
            return string.Format("{0}, {1} ({2})", _lastName, _firstName, _ssn);
        }
    }
}
