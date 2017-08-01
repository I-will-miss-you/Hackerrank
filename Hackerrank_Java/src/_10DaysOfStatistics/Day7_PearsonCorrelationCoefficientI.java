package _10DaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day7_PearsonCorrelationCoefficientI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] xs = new double[size];
        double[] ys = new double[size];
        for (int i = 0; i < size; i++) {
            xs[i] = scan.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            ys[i] = scan.nextDouble();
        }

        System.out.println(pearson(xs, ys));
    }

    private static Double pearson(double[] xs, double[] ys) {
        if (xs == null || ys == null || xs.length != ys.length) {
            return null;
        }
        double xMean = getMean(xs);
        double yMean = getMean(xs);
        int n = xs.length;

        double numerator = 0;

        for (int i = 0; i < xs.length; i++) {
            numerator += (xs[i] - xMean) * (ys[i] - yMean);
        }
        return numerator / (n * standardDeviation(xs) * standardDeviation(ys));
    }

    private static Double getMean(double[] array) {
        if (array == null) {
            return null;
        }
        return Arrays.stream(array).sum() / array.length;
    }

    private static Double standardDeviation(double[] array) {
        if (array == null) {
            return null;
        }
        double mean = getMean(array);
        double sum = 0;
        for (double x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }

}
