import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<String, String> inputMap = new TreeMap<>();

        int inputCount = sc.nextInt();
        int outputCount = sc.nextInt();

        for (int i = 0; i < inputCount; i++) {
            String pocketmon = sc.next();
            String number = Integer.toString(i+1);
            inputMap.put(pocketmon, number);
            inputMap.put(number, pocketmon);
        }
        for (int i = 0; i < outputCount; i++) {
            System.out.println(inputMap.get(sc.next()));
        }
    }
}
