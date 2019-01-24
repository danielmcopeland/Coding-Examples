using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace _3_Regular_Expressions
{
    class Program
    {
        static void Main(string[] args)
        {
            // TODO: Use a regular expression to replace all whitespace with a single space 
            string s1 = "this   string   has a lot   of extra spaces";
            //Solution
            string pattern = "\\s + ";
            string replacement = " ";
            Regex reg = new Regex(pattern);
            s1 = reg.Replace(s1, replacement);
            Console.WriteLine(s1);
            //End Solution


            // TODO: Use the String.split method and a regular expression to split the comma separated values in the string below
            // remove the extra whitespace and display each part
            string s2 = "a, ab , abc, abcd  , abcde";

            //Solution
            string[] s2Split = s2.Split(',');
            string pattern2 = "\\s";
            string replacer = "";
            Regex reg2 = new Regex(pattern2);
            for (int i = 0; i < s2Split.Length; i++)
            {
                s2Split[i] = reg2.Replace(s2Split[i], replacer);
                Console.WriteLine(s2Split[i]);
            }
            //End Solution
           

            // TODO: Use the Pattern and Matcher classes to find and display all the e-mail addresses in the string
            //below
            string s3 = "Emails: joe@yahoo.com; matt@gmail.com, test@daugherty.com, bob, mike@test";

            //Solution
            string pattern3 = "[a-z0-9_\\.-]+@[\\da-z\\.-]+\\.[a-z\\.]{2,6}";
            Regex reg3 = new Regex(pattern3);
            foreach (Match m in reg3.Matches(s3))
            {
                Console.WriteLine(m.Value);
            }
            //End Solution 
           
            
        }
    }
}
