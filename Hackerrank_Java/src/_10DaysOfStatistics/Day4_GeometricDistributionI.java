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
public class Day4_GeometricDistributionI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p = 0.33;
        double q = 1 - p;
        double n = 5;

        double distGeo = Math.pow(q, n - 1) * p;
        System.out.printf("%.3f", (distGeo * 1000) / 1000.0);
    }

}
