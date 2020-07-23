using System;

namespace baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int value = int.Parse(Console.ReadLine());

            Console.WriteLine(answer(value));
        }

        public static int answer(int num)
        {
            int[] arr = new int[num + 1];

            arr[1] = 0;

            for (int i = 2; i <= num; i++)
            {
                arr[i] = arr[i - 1] + 1;

                if (i % 2 == 0)
                    arr[i] = Math.Min(arr[i], arr[i / 2] + 1);
                if (i % 3 == 0)
                    arr[i] = Math.Min(arr[i], arr[i / 3] + 1);
            }
            return arr[num];
        }
    }
}
