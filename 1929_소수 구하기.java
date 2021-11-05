import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 1);
        arr[0] = arr[1] = 0;

        for (int i = 2; i * i <= n; i++)
            if (arr[i] == 1)
                for (int j = 2; j <= n / i; j++)
                    arr[j * i] = 0;

        for (int i = m; i <= n; i++)
            if (arr[i] == 1)
                System.out.println(i);
    }
}
