package pactice;

import java.util.*;

public class Practice_Session3_3 {
    public static List<Integer> arrayList = Collections.unmodifiableList(Arrays.asList(
            1, 2, 3, 4, 9, 10, 11, 12, 13, 14, 19, 20, 21, 22, 27, 28, 29, 30
            , 31, 32, 36, 40, 41, 42, 43, 44, 45, 49, 50, 54, 55, 56, 57,
            58, 59, 60, 61, 65, 66)
    );

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Number Output = ");
        int numberOutput = scanner.nextInt();
        int luckyNumber;
        for (int i = 1; i <= numberOutput; i++) {
            luckyNumber = random.nextInt(66);
            System.out.println("["+i+"] => " + luckyNumber );
            if (arrayList.contains(luckyNumber)) {
                System.out.println(luckyNumber+" is a number LUCKY");
            }
        }
    }
}
