using System;

namespace baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] value = Array.ConvertAll(Console.ReadLine().Split(' '), s => int.Parse(s));

            Console.WriteLine(answer(value[0], value[1], value[2]));
        }

        public static int answer(int n, int r, int c)
        {
            int result = 0;

            for (; n >= 0; n--)
            {
                //0사분면 일때는 아무것도 안함
                if (r < Math.Pow(2, n - 1) && c >= Math.Pow(2, n - 1)) // 1사분면
                {
                    result += Convert.ToInt32(Math.Pow(2, n - 1)) * Convert.ToInt32(Math.Pow(2, n - 1)) * 1;
                    c -= Convert.ToInt32(Math.Pow(2, n - 1));
                }
                else if (r >= Math.Pow(2, n - 1) && c < Math.Pow(2, n - 1)) // 2사분면
                {
                    result += Convert.ToInt32(Math.Pow(2, n - 1)) * Convert.ToInt32(Math.Pow(2, n - 1)) * 2;
                    r -= Convert.ToInt32(Math.Pow(2, n - 1));
                }
                else if (r >= Math.Pow(2, n - 1) && c >= Math.Pow(2, n - 1)) // 3사분면
                {
                    result += Convert.ToInt32(Math.Pow(2, n - 1)) * Convert.ToInt32(Math.Pow(2, n - 1)) * 3;
                    r -= Convert.ToInt32(Math.Pow(2, n - 1));
                    c -= Convert.ToInt32(Math.Pow(2, n - 1));
                }
            }
            return result;
        }
    }
}