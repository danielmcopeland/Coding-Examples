using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace C_Sharp_Core_Exercises
{
    class Program
    {
        static void Main(string[] args)
        {
            /*Instructions:
             Create two txt files, InputFile1.txt and InputFile2.txt using the inputs provided
             in the instructions text file. 
             Then provide the two ReadLines method calls below the path to each of the files you created.
             Also provide the AppendLines calls the location where you would like to create the OutPutFile.txt 
             file.
             */

            List<String> lines1 = ReadLines("c:/InputFile1.txt");
            List<String> lines2 = ReadLines("c:/InputFile2.txt");
            AppendLines("d:/OutputFile.txt", lines1);
            AppendLines("d:/OutputFile.txt", lines2);
           
        }
        private static List<String> ReadLines(String inputFile)
        {
            // TODO: use a StreamReader to read data from the inputFile and then returns all the lines
            // HINT: did you use a using statement to automatically close the reader?
            // HINT: did you implement a try/catch block?
            List<String> lines = new List<String>();

            //solution
            try
            {
                using (StreamReader sr = File.OpenText(inputFile))
                {
                    string s = String.Empty;
                    while ((s = sr.ReadLine()) != null)
                    {
                        lines.Add(s);
                    }
                }
              
              }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
            //end solution
            return lines;
        }

        private static void AppendLines(String outputFile, List<String> lines)
        {
            // TODO: Use a StreamWriter to write out all the lines to the output file.
            //       If outputFile does not exist, create it
            //       If outputFile does exist, append it
            // HINT: did you use a using statement to automatically close the writer?
            // HINT: did you implement a try/catch block?

            //solution
            try
            {
                using (StreamWriter sw = new StreamWriter(outputFile, true))
                {
                    foreach (string line in lines)
                    {
                        sw.WriteLine(line);
                    }
                    
                }

            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

            //end solution
        }
    }
}

