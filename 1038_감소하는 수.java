import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        Queue<Long> que = new LinkedList<>();

        if (input < 10) {
            System.out.println(input);
            System.exit(0);
        }

        for (long i = 1; i < 10; i++) {
            que.offer(i);
            count++;
        }

        mainLoop : while (count <= input) {
            if(que.isEmpty()){
                System.out.println(-1);
                System.exit(0);
            }
            long nowQue = que.poll();
            long temp = nowQue % 10;
            for (int i = 0; i < temp; i++) {
                if(i < temp){
                    que.offer((nowQue * 10) + i);
                    count++;
                    if(count == input){
                        System.out.println((nowQue * 10) + i);
                        break mainLoop; // 실제 업무할 땐 함수로 만들어서 리턴하는게 더 좋다
                    }
                }
            }
        }
    }
}
