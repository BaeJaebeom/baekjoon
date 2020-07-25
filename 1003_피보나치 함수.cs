using System;

namespace baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int value = int.Parse(Console.ReadLine());
            int[] arrValue = new int[value];

            for (int i = 0; i < value; i++)
            {
                arrValue[i] = int.Parse(Console.ReadLine());
            }

            for (int i = 0; i < value; i++)
            {
                Console.WriteLine(answer(arrValue[i]));
            }
        }

        public static string answer(int num)
        {
            int[] arr0 = new int[num + 2];
            int[] arr1 = new int[num + 2];

            arr0[0] = arr1[1] = 1;
            arr0[1] = arr1[0] = 0;

            for (int i = 2; i <= num; i++)
            {
                arr0[i] = arr0[i - 1] + arr0[i - 2];
                arr1[i] = arr1[i - 1] + arr1[i - 2];
            }

            return arr0[num] + " " + arr1[num];
        }
    }
}
