using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodOverload
{
    class Program
    {
        static void Main(string[] args)
        {
            // Instructions are in the Instructions.txt file within this project

            ShoppingCart shoppingCart = new ShoppingCart();

            Item item1 = new Item(10.5f);
            Item item2 = new Item(20.75f);
            Item item3 = new Item(9.99f);
            Item item4 = new Item(14f);
            Item item5 = new Item(100f);
            Item item6 = new Item(55.5f);

            // Add item1 individually
            // Add the remaining items (item2, item3, item4, item5 and item6) in a single operation
            // Add another item of price 33.5
            // Add two items in a single operation, with a combined price of 50

            //solution
            shoppingCart.AddItems(item1.Price);
            shoppingCart.AddItems(item2, item3, item4, item4, item5, item6);
            shoppingCart.AddItems(33.5f);
            shoppingCart.AddItems(50f, 2);

            //end solution
            Console.WriteLine(shoppingCart.NumberOfItems + " items were added,"
                    + " with a total price of $" + shoppingCart.TotalPrice);
        }
    }
    
}
