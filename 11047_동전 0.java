import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int count = 0;
        int index = n - 1;
        while(true){
            if(k == 0){
                System.out.println(count);
                break;
            }
            if(a[index] > k){
                index -= 1;
            }
            if(a[index] <= k){
                count += 1;
                k -= a[index];
            }
        }
    }
}
