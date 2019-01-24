using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodOverload
{
    public class Item
    {
        private float _price;

        public float Price
        {
            get
            {
                return _price;
            }
        }
        
        public Item(float price)
        {
            _price = price;
        }
    }
}
