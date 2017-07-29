/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10DaysOfStatistics;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day6_TheCentralLimitTheoremIII {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double mean = s.nextDouble();
        double std = s.nextDouble();
        double pab = s.nextDouble();
        double zScore = s.nextDouble();// equivalent to 95% confidence interval

        /* Formula (found online) for confidence interval +/- */
        double marginOfError = zScore * std / Math.sqrt(n);

        System.out.format("%.2f%n", mean - marginOfError);
        System.out.format("%.2f%n", mean + marginOfError);
    }

}
