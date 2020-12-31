import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            if (Arrays.binarySearch(a, sc.nextInt()) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
