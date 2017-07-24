package _10DaysOfStatistics;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day0_WeightedMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = scan.nextInt();
        }

        double somaX = 0;
        double somaW = 0;
        for (int i = 0; i < n; i++) {
            somaX += x[i] * w[i];
            somaW += w[i];
        }

        System.out.printf("%.1f\n", somaX / somaW);
    }
}
