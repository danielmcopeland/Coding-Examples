using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassInheritance
{
    class Manager : Employee
    {
        public override bool HasAdministratorRights()
        {
            return true;
        }

        public Manager(int id) : base (id)
        {

        }
    }
}
