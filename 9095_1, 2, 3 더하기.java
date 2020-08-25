import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 0; i < count; i++){
            System.out.println(result(sc.nextInt()));
        }
    }

    public static int result(int num){
        int[] arr = new int[num + 3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;

        if(num < 3)
            return arr[num - 1];

        for(int i = 3; i < num; i++){
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        return arr[num - 1];
    }
}
