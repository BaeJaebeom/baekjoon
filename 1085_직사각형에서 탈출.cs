using System;

namespace baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] value = Array.ConvertAll(Console.ReadLine().Split(' '), s => int.Parse(s));

            Console.WriteLine(answer(value[0], value[1], value[2], value[3]));
        }

        public static int answer(int x, int y, int w, int h)
        {
            return Math.Min(Math.Min(w - x, h - y), Math.Min(x, y));
        }
    }
}
