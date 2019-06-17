package pactice;

import java.util.Scanner;

public class Practice_Session3_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Show *");
        int n = 0;
        do {
            System.out.println("n =");
            n = scanner.nextInt();
            if (n <= 0) System.out.println("n >0");
        } while (n <= 0);

        System.out.println("1. Show all *");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("2. Show * position right > left");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("3. Show * position right < left");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("4. Show * position right < left");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= (n-j))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("5. Show * position right < left");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i<=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("6. Show * pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            for(int k=0;k<(i*2)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
