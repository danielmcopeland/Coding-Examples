using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodOverload
{
    public class ShoppingCart
    {
        private float _totalPrice;
        private int _numberOfItems;

        public float TotalPrice
        {
            get
            {
                return _totalPrice;
            }
        }

        public int NumberOfItems
        {
            get
            {
                return _numberOfItems;
            }
        }

    }   
}
