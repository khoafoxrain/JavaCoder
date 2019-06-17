package lib;

import java.util.ArrayList;
import java.util.List;

public class MathLibrary {
    // solve a*x + b = 0
    public static Double solveEquationLevel1(double a, double b) {
        if ((a == 0) && (b != 0)) {
            return null;
        }
        double root = -b / a;
        return root;
    }

    //solve a*x*x + b*x + c =0
    public static List<Double> solveEquationLevel2(double a, double b, double c) {
        List<Double> roots = new ArrayList<>();

        if (a == 0) {
            if (b == 0) {
                return roots;
            } else {
                roots.add(solveEquationLevel1(b, c));
                return roots;
            }
        }
        double delta = b * b - 4 * a * c;

        if (delta > 0) return roots;
        if (delta == 0) {
            roots.add(-b / (2 * a));
            return roots;
        }

        double root1, root2;
        root1 = (-b + Math.sqrt(delta)) / (2 * a);
        roots.add(root1);
        root2 = (-b - Math.sqrt(delta)) / (2 * a);
        roots.add(root2);

        return roots;
    }
}
