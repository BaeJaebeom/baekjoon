import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (; num > 0; num--) {
            int checker = 0;
            String parenthesis = sc.next();

            for (int i = 0; i < parenthesis.length(); i++) {
                if (parenthesis.charAt(i) == '(') {
                    checker += 1;
                } else {
                    checker -= 1;
                }

                if(checker < 0){
                    break;
                }
            }
            if(checker == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
