using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exceptions
{
    public class Glass
    {
        private float _maxGallons;
        private float _currentGallons;

        public Glass(float maxGallons)
        {
            _maxGallons = maxGallons;
        }

        public void AddWater(float gallonsToAdd)
        {
            float possibleGallons = _currentGallons + gallonsToAdd;
            if (possibleGallons > _maxGallons)
            {
                throw new GlassOverflownException("glass capacity exceeded; you have spilt " + (possibleGallons - _maxGallons) + " gallons");
            }
            else
            {
                _currentGallons = possibleGallons;
            }
        }
    }
}
