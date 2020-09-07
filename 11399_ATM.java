import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] arr = new int[count];

        for(int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(result(count, arr));
    }

    public static int result(int count, int[] arr){

        Arrays.sort(arr);

        int[] temp = new int[count];
        temp[0] = arr[0];
        int result = arr[0];

        for(int i = 1; i < count; i++){
            temp[i] = temp[i - 1] + arr[i];
            result += temp[i];
        }
        return result;
    }
}
