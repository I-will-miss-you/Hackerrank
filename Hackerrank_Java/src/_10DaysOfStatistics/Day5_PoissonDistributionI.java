package _10DaysOfStatistics;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day5_PoissonDistributionI {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static double poisson(double x, int n) {
        double e = 2.71828;
        return pow(x, n) * (pow(e, -1 * x) / factorial(n));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x = s.nextDouble();
        int n = s.nextInt();

        double result = poisson(x, n);
        System.out.printf("%.3f", result);
    }

}
