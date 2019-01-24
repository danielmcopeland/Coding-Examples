using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exceptions
{
    public class GlassOverflownException : Exception
    {
        public GlassOverflownException() : base ()
        {
        }

        public GlassOverflownException(string message) : base(message)
        {

        }
    }
}
