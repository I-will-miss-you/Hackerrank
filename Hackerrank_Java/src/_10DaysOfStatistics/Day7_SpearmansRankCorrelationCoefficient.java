/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10DaysOfStatistics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day7_SpearmansRankCorrelationCoefficient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] X = new double[size];
        double[] Y = new double[size];

        for (int i = 0; i < size; i++) {
            X[i] = scan.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            Y[i] = scan.nextDouble();
        }

        System.out.format("%.3f", spearman(X, Y));
    }

    /* Calculates Spearman's rank correlation coefficient, */
    private static Double spearman(double[] X, double[] Y) {
        /* Error check */
        if (X == null || Y == null || X.length != Y.length) {
            return null;
        }

        /* Create Rank arrays */
        int[] rankX = getRanks(X);
        int[] rankY = getRanks(Y);

        /* Apply Spearman's formula */
        int n = X.length;
        double numerator = 0;
        for (int i = 0; i < n; i++) {
            numerator += Math.pow((rankX[i] - rankY[i]), 2);
        }
        numerator *= 6;
        return 1 - numerator / (n * ((n * n) - 1));
    }

    /* Returns a new (parallel) array of ranks. Assumes unique array values */
    public static int[] getRanks(double[] array) {
        int n = array.length;

        /* Create Pair[] and sort by values */
        Pair[] pair = new Pair[n];
        for (int i = 0; i < n; i++) {
            pair[i] = new Pair(i, array[i]);
        }
        Arrays.sort(pair, new PairValueComparator());

        /* Create and return ranks[] */
        int[] ranks = new int[n];
        int rank = 1;
        for (Pair p : pair) {
            ranks[p.index] = rank++;
        }
        return ranks;
    }
}

/* A class to store 2 variables */
class Pair {

    public final int index;
    public final double value;

    public Pair(int i, double v) {
        index = i;
        value = v;
    }
}

/* This lets us sort Pairs based on their value field */
class PairValueComparator implements Comparator<Pair> {

    double epsilon = 0.0001; // shouldn't use " == " to compare "doubles"

    @Override
    public int compare(Pair p1, Pair p2) {
        if (Math.abs(p1.value - p2.value) < epsilon) {
            return 0;
        } else if (p1.value < p2.value) {
            return -1;
        } else {
            return 1;
        }
    }

}
