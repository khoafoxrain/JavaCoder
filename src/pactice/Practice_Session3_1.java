package pactice;

import lib.MathLibrary;

import java.util.List;
import java.util.Scanner;

public class Practice_Session3_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solve Equation level 1 : a*x + b = 0");
        System.out.println("a =");
        double a = scanner.nextDouble();
        System.out.println("b =");
        double b = scanner.nextDouble();
        if ((a == b) && (a == 0))
            System.out.println("Root = {R}");
        else {
            Double rootLevel1 = MathLibrary.solveEquationLevel1(a, b);
            if (rootLevel1 == null)
                System.out.println("No Root !");
            else
                System.out.println("Root = " + rootLevel1);
        }

        System.out.println("Solve Equation level 2 : a*x*x + bx + c = 0");
        System.out.println("a =");
        a = scanner.nextDouble();
        System.out.println("b =");
        b = scanner.nextDouble();
        System.out.println("c =");
        double c = scanner.nextDouble();
        List<Double> roots = MathLibrary.solveEquationLevel2(a, b, c);
        if ((a == b) && (a == 0) && (b == c))
            System.out.println("Root = {R}");
        else {
            if (roots.size() == 0)
                System.out.println("No Root !");
            else{
                if (roots.size() == 1)
                    System.out.println("Root = " + roots.get(0));
                else
                    System.out.println("Root1 = " + roots.get(0) + " vs Root2 = " + roots.get(1));
            }
        }

        scanner.close();
    }
}
