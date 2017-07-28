/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10DaysOfStatistics;

/**
 *
 * @author code36u4r60
 */
public class Day4_GeometricDistributionII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p = 1 / 3;
        double q = 1 - p;
        double prob = 0.0;
        for (int i = 0; i < 5; i++) {
            prob += Math.pow(q, i) * p;
        }
        System.out.printf("%.3f", prob);
    }
}
