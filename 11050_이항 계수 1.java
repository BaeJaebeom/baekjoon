import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int numerator = factorial(n);
        int denominator = factorial(k) * factorial(n-k);

        System.out.print(numerator/denominator);
    }

    public static int factorial(int num){
        if(num <= 1)
            return 1;

        return factorial(num-1) * num;
    }
}
