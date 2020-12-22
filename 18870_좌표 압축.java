import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int[] nums = new int[l];
        for (int i = 0; i < l; i++){
            nums[i] = sc.nextInt();
        }

        int[] sortNums = nums.clone();
        Arrays.sort(sortNums);

        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for(int num : sortNums){
            if(!map.containsKey(num))
                map.put(num, idx++);
        }

        StringBuilder answer = new StringBuilder("");
        for(int num : nums){
            answer.append(map.get(num)).append(' ');
        }
        System.out.println(answer.toString());
    }
}
