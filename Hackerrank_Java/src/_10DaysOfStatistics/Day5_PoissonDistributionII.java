package _10DaysOfStatistics;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day5_PoissonDistributionII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();

        double cA = 160 + 40 * (A * A);
        double cB = 128 + 40 * (B * B);

        System.out.format("%.3f%n", cA);
        System.out.format("%.3f%n", cB);
    }

}
