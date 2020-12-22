import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                String reversNum = "";
                int tempNum = num;
                for (; ; ) {
                    reversNum += tempNum % 10;
                    tempNum /= 10;
                    if (tempNum == 0) {
                        break;
                    }
                }

                if (reversNum.equals(Integer.toString(num))) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
    public static void anotherAnswer1() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=br.readLine()).equals("0"))
            System.out.println((s.equals(new StringBuffer(s).reverse().toString()))?"yes":"no");
    }

    public static void anotherAnswer2(){
        Scanner scan = new Scanner(System.in);
        String input;
        while(!(input=scan.next()).equals("0")) {
            boolean flag = true;

            for(int i=0;i<input.length()/2;i++) {
                if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
