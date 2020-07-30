import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hear = sc.nextInt();
        int see = sc.nextInt();

        String[] hearArr = new String[hear];
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < hear; i++) {
            hearArr[i] = sc.next();
        }

        Arrays.sort(hearArr);

        for (int i = 0; i < see; i++) {
            String input = sc.next();
            int in = Arrays.binarySearch(hearArr, input);
            if (in >= 0) {
                resultList.add(input);
            }
        }

        Collections.sort(resultList);

        System.out.println(resultList.size());

        for (String str : resultList) {
            System.out.println(str);
        }
    }
}
