import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i = 0; i < count; i++){
            System.out.println(result(sc.nextInt()));
        }
    }

    public static long result(int num){

        List<Long> arr = new ArrayList<>();
        arr.add(1l);
        arr.add(1l);
        arr.add(1l);
        arr.add(2l);
        arr.add(2l);

        for(int i = 5; i < num; i++){
            arr.add(arr.get(i - 1) + arr.get(i - 5));
        }

        return arr.get(num - 1);
    }
}
