import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int count = 0;
        int counter = 0;

        for (int i = 1; i < m - 1; i++) {
            if (s[i - 1] == 'I' && s[i] == 'O' && s[i + 1] == 'I') {
                counter++;
                if (n == counter) {
                    count++;
                    counter -= 1;
                }
                i++;
            } else counter = 0;
        }
        System.out.println(count);
    }
}
