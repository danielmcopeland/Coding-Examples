using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultipleConstructors
{
    //solution
    class Triangle
    {
        private float _a;
        private float _b;
        private float _c;

        public Triangle(float sideLength)
        {
            _a = sideLength;
            _b = sideLength;
            _c = sideLength;
        }

        public Triangle(float a, float b, float c)
        {
            _a = a;
            _b = b;
            _c = c;
        }

        public float CalculatePerimeter()
        {
            return _a + _b + _c;
        }
    }
    //end solution
}
