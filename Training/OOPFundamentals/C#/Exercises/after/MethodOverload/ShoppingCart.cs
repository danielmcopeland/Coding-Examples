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

        public float TotalPrice { get
            {
                return _totalPrice;
            }
        }

        public int NumberOfItems { get
            {
                return _numberOfItems;
            }
        }

        //solution
        public void AddItems(float price, int numberOfItems)
        {
            _totalPrice += price;
            _numberOfItems += numberOfItems;
        }

        public void AddItems(float price)
        {
            _totalPrice += price;
            _numberOfItems++;
        }

        public void AddItems(params Item[] items)
        {
            foreach(Item item in items)
            {
                _totalPrice += item.Price;
            }
            _numberOfItems += items.Length;
        }
    }
}
