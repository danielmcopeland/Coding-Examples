using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _6_Logging
{
    class Program
    {
        static void Main(string[] args)
        {
            static Logger generalLogger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
            static Logger fileLogger = Logger.getLogger("filelogger");

           
                generalLogging();
                fileLogging();
            }

            //-------------------
            // 1. General Logging
            //-------------------
            private static void generalLogging()
            {
                // TODO: use the generalLogger to log an INFO, WARNING and SEVERE log message
            }

            //-------------------
            // 2. Logging to a file
            //-------------------
            private static void fileLogging()
            {
                // TODO: Use the fileLogger to log all log messages to a file in your home directory
            }
        
    }
}
