using System;
using System.Collections.Generic;

namespace baekjoon
{
    class Program
    {
        static int[] value;
        static int[,] adjacencyMatrix;
        static int[] visitDFS;
        static int[] visitBFS;

        static void Main(string[] args)
        {
            value = Array.ConvertAll(Console.ReadLine().Split(' '), s => int.Parse(s));

            adjacencyMatrix = new int[value[0], value[0]];

            visitDFS = new int[value[0]];
            visitBFS = new int[value[0]];

            for (int i = 0; i < value[1]; i++)
            {
                int[] line = Array.ConvertAll(Console.ReadLine().Split(' '), s => int.Parse(s));

                adjacencyMatrix[line[0] - 1, line[1] - 1] = adjacencyMatrix[line[1] - 1, line[0] - 1] = 1;
            }

            DFS(value[2] - 1);
            Console.WriteLine();

            BFS(value[2] - 1);
            Console.WriteLine();
        }

        public static void DFS(int node)
        {
            visitDFS[node] = 1;

            Console.Write("{0} ", node + 1);

            for (int i = 0; i < value[0]; i++)
            {
                if(adjacencyMatrix[node, i] == 1 && visitDFS[i] != 1)
                {
                    DFS(i);
                }
            }
        }
        public static void BFS(int node)
        {
            visitBFS[node] = 1;

            Queue<int> que = new Queue<int>();

            que.Enqueue(node);
            Console.Write("{0} ", node + 1);

            while (que.Count != 0) {

                int nowQue = que.Dequeue();

                for (int i = 0; i < value[0]; i++)
                {
                    if (adjacencyMatrix[nowQue, i] == 1 && visitBFS[i] != 1)
                    {
                        visitBFS[i] = 1;
                        Console.Write("{0} ", i + 1);
                        que.Enqueue(i);
                    }
                }
            }

        }
    }
}
