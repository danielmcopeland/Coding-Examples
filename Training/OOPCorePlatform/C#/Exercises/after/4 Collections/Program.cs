using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _4_Collections
{
    class Program
    {
        static void Main(string[] args)
        {
            SimpleList();

             OverloadingEqualsMethod();

            ConvertingListToArray();
                       
        }

        //-----------------------------------
        // 1. Simple ArrayList
        //-----------------------------------
        private static void SimpleList()
        {

            // TODO: create a List
            // TODO: add "Foo" and "Bar" strings to your List
            // TODO: Print out all the items in the list
            // TODO: Print out the size of the list

            //Solution
            List<string> newList = new List<string>();
            newList.Add("Foo");
            newList.Add("Bar");
            foreach (string words in newList)
            {
                Console.WriteLine(words);
            }
            Console.WriteLine(newList.Count);
            }
            //end solution

        

        //-----------------------------------
        // 2. Overriding equals() method
        //-----------------------------------
        private static void OverloadingEqualsMethod()
        {
            // TODO: modify the Person class and creat an Equals method that overloads the Object base class 
            //       Equals method.
            //       Person objects with the same ssn should return true


            // Adding some people to the person list
            List<Person> personList = new List<Person>();
            personList.Add(new Person("John", "Doe", "555-55-5555"));
            personList.Add(new Person("John", "Doe", "666-66-6666"));
            personList.Add(new Person("Mike", "Smith", "555-55-5555"));

            // TODO check to see if any of the elements are equal using the Equals method you created

            //Solution
            bool equal = false;
            for (int i = 0; i < personList.Count; i++)
            {
                for (int j = 1; j < personList.Count; j++)
                {
                    if (i < personList.Count - 1)
                    {
                        if (personList[i].Equals(personList[j]))
                            equal = true;
                    }
                }
              
            }
            Console.WriteLine("Equality: " + equal);
            //End Solution
            
            // Remove a person from the list
            Person personToRemove = new Person("John", "Doe", "555-55-5555");
            personList.Remove(personToRemove);

            // Display people in the person list
            Console.WriteLine("People in personList:");
            foreach (Person person in personList)
            {
                Console.WriteLine(person);
            }
        }

        

        //-----------------------------------
        // 3. Converting List to an Array
        //-----------------------------------
        private static void ConvertingListToArray()
        {

            // Constructing an ArrayList of Persons
            List<Person> personList = new List<Person>();
            personList.Add(new Person("John", "Doe", "555-55-5555"));
            personList.Add(new Person("Jane", "Doe", "777-77-7777"));

            // TODO: Convert the personList to an array and then display the people
            Person[] personArray = personList.ToArray();
            
        }

       
        
    }
}
