using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassInheritance
{
    public class Employee
    {
        private int _idNumber;

        public Employee(int id)
        {
            _idNumber = id;
        }

        public int IdNumber {
            get
            {
                return _idNumber;
            }
        }

       
        public virtual bool HasAdministratorRights()
        {
            return false;
        }
        public bool Equals(Employee a, Employee b)
        {
            return a.IdNumber == b.IdNumber ? true : false;
        }
    }
}
