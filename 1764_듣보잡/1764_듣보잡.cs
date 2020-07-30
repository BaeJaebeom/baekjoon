using System;
using System.Collections.Generic;

namespace baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] value = Array.ConvertAll(Console.ReadLine().Split(' '), num => int.Parse(num));

            List<string> hearList = new List<string>();
            List<string> resultList = new List<string>();

            for (int i = 0; i < value[0]; i++)
            {
                hearList.Add(Console.ReadLine());
            }

            hearList.Sort();

            for (int i = 0; i < value[1]; i++)
            {
                string input = Console.ReadLine();

                int index = hearList.BinarySearch(input);

                if (index >= 0)
                {
                    resultList.Add(input);
                }
            }

            Console.WriteLine(resultList.Count);

            resultList.Sort();

            foreach(string str in resultList)
            {
                Console.WriteLine(str);
            }
        }
    }
}
