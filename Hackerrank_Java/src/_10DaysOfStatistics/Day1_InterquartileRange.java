/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10DaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day1_InterquartileRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] v = new int[n];
        int[] w = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = scan.nextInt();
        }

        int nElem = Arrays.stream(w).sum();
        int[] x = new int[nElem];

        for (int k = 0, i = 0; i < n; i++) {
            for (int j = 0; j < w[i]; j++, k++) {
                x[k] = v[i];
            }

        }

        Arrays.sort(x);

        int[] l = Arrays.copyOfRange(x, 0, x.length >> 1);
        int[] r = Arrays.copyOfRange(x,
                (x.length % 2 == 0)
                        ? x.length >> 1
                        : (x.length >> 1) + 1,
                x.length);

        double Q1 = calcQ(l);
        double Q3 = calcQ(r);
        System.out.printf("%.1f", Q3 - Q1);
    }

    static double calcQ(int[] num) {
        int n = (int) Arrays.stream(num).count();
        int c = n >> 1;
        return (n % 2 == 0) ? (num[c - 1] + num[c]) / 2.0 : num[c];
    }

}
