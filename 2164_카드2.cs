using System;
using System.Collections.Generic;

namespace baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            int value = int.Parse(Console.ReadLine());

            Console.WriteLine(answer(value));
        }

        public static int answer(int n)
        {
            Queue<int> que = new Queue<int>();
            bool flag = true;

            for(int i = 1; i <= n; i++)
            {
                que.Enqueue(i);
            }

            while (true)
            {
                if (que.Count == 1)
                    return que.Dequeue();

                if (flag)
                {
                    que.Dequeue();
                    flag = false;
                }
                else
                {
                    que.Enqueue(que.Dequeue());
                    flag = true;
                }
            }
        }
    }
}
